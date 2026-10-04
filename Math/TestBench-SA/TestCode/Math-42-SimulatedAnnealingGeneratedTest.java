package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumSlackVariables", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "equals", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumSlackVariables", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "isOptimal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "createTableau", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", "java.util.Collection", "<sample:3>"}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getSolution", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getArtificialVariableOffset", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getSolution", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getArtificialVariableOffset", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "isOptimal", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getRhsOffset", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "createTableau", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "createTableau", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getOriginalNumDecisionVariables", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "createTableau", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getSolution", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "createTableau", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "initializeColumnLabels", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "createTableau", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "initializeColumnLabels", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumDecisionVariables", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "divideRow", new String[]{"int", "double"}, new String[]{"11", "10"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getEntry", "int,int", "-2147483648", "11"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getSlackVariableOffset", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "createTableau", "boolean", "true"}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getData", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getBasicRow", new String[]{"int"}, new String[]{"1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "divideRow", new String[]{"int", "double"}, new String[]{"9", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "hashCode", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", "java.util.Collection", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getRhsOffset", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getRhsOffset", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumArtificialVariables", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getBasicRow", "int", "46"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getRhsOffset", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "dropPhase1Objective", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumArtificialVariables", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getRhsOffset", new String[]{}, new String[]{}, false, 31, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "dropPhase1Objective", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumArtificialVariables", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getRhsOffset", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "hashCode", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getRhsOffset", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getSlackVariableOffset", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getBasicRow", "int", "46"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getSlackVariableOffset", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getEntry", new String[]{"int", "int"}, new String[]{"9", "10"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getOriginalNumDecisionVariables", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getSlackVariableOffset", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumSlackVariables", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getSolution", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getData", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", "java.util.Collection", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getWidth", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "subtractRow", new String[]{"int", "int", "double"}, new String[]{"10", "2147483647", "-1.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "subtractRow", new String[]{"int", "int", "double"}, new String[]{"11", "-13", "99.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "initializeColumnLabels", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getEntry", "int,int", "2147483647", "11"}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "initializeColumnLabels", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "dropPhase1Objective", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "dropPhase1Objective", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "isOptimal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "setEntry", "int,int,double", "-2147483648", "9", "10"}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "isOptimal", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getHeight", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "setEntry", new String[]{"int", "int", "double"}, new String[]{"1", "-1", "-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumArtificialVariables", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "setEntry", "int,int,double", "1", "-2", "1.7976931348623157E308"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumObjectiveFunctions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getWidth", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", "java.util.Collection", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumObjectiveFunctions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getWidth", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", "java.util.Collection", "<sample:2>"}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getData", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "setEntry", new String[]{"int", "int", "double"}, new String[]{"10", "9", "-1.0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getSolution", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getHeight", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumObjectiveFunctions", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "subtractRow", "int,int,double", "-1", "-4", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getBasicRow", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "setEntry", "int,int,double", "46", "2147483647", "-1.7976931348623157E308"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getOriginalNumDecisionVariables", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getHeight", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "divideRow", "int,double", "11", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getOriginalNumDecisionVariables", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "createTableau", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumDecisionVariables", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumObjectiveFunctions", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getOriginalNumDecisionVariables", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumArtificialVariables", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "divideRow", "int,double", "1", "1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumArtificialVariables", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getData", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "equals", "java.lang.Object", "<s:\u00e9a>"}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "createTableau", "boolean", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getSlackVariableOffset", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getBasicRow", "int", "-154"}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "setEntry", "int,int,double", "-1", "1", "20.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "initializeColumnLabels", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "initializeColumnLabels", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "hashCode", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumObjectiveFunctions", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "initializeColumnLabels", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "hashCode", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getHeight", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "isOptimal", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumDecisionVariables", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumArtificialVariables", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "dropPhase1Objective", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getData", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "initializeColumnLabels", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getData", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getData", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "hashCode", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getSolution", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoefficientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoefficientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoefficientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoefficientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoefficientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:7>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoefficientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:7>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoefficientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:8>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoefficientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:10>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getRhsOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "initializeColumnLabels", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getRhsOffset", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getEntry", new String[]{"int", "int"}, new String[]{"56", "-2147483646"}, false, 10, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getSlackVariableOffset", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getData", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getOriginalNumDecisionVariables", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getRhsOffset", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumSlackVariables", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "hashCode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "subtractRow", "int,int,double", "0", "-1", "-1.0"}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumDecisionVariables", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "setEntry", "int,int,double", "0", "46", "-1369660067587938365"}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getSolution", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "isOptimal", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumArtificialVariables", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getHeight", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getHeight", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumSlackVariables", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumSlackVariables", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", "java.util.Collection", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "dropPhase1Objective", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumDecisionVariables", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getOriginalNumDecisionVariables", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getOriginalNumDecisionVariables", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumSlackVariables", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getBasicRow", "int", "20"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getOriginalNumDecisionVariables", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumSlackVariables", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "subtractRow", new String[]{"int", "int", "double"}, new String[]{"-2", "-1", "-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "equals", "java.lang.Object", "<s:>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getArtificialVariableOffset", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumDecisionVariables", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "setEntry", new String[]{"int", "int", "double"}, new String[]{"2147483643", "-2147483648", "-1.7976931348623157E308"}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getSlackVariableOffset", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "setEntry", new String[]{"int", "int", "double"}, new String[]{"2147483647", "-247", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "isOptimal", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getWidth", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getSlackVariableOffset", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "setEntry", "int,int,double", "-1", "46", "0.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "divideRow", new String[]{"int", "double"}, new String[]{"132", "10"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", "java.util.Collection", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getArtificialVariableOffset", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getArtificialVariableOffset", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumDecisionVariables", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getBasicRow", new String[]{"int"}, new String[]{"16777286"}, false, 9, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "isOptimal", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumArtificialVariables", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoefficientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumArtificialVariables", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "equals", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "dropPhase1Objective", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "initializeColumnLabels", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getBasicRow", new String[]{"int"}, new String[]{"1073741823"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "createTableau", "boolean", "true"}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", "java.util.Collection", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoefficientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:10>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoefficientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getRhsOffset", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "initializeColumnLabels", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getRhsOffset", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "initializeColumnLabels", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getOriginalNumDecisionVariables", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumSlackVariables", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getData", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getArtificialVariableOffset", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "subtractRow", new String[]{"int", "int", "double"}, new String[]{"46", "2147483647", "NaN"}, false, 7, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "hashCode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "divideRow", new String[]{"int", "double"}, new String[]{"1", "Infinity"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getHeight", ""}}, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "4"}, {"add", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getHeight", ""}}, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "divideRow", "int,double", "-1", "2.2720000000000002"}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "setEntry", "int,int,double", "11", "2147483647", "0.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getHeight", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getWidth", new String[]{}, new String[]{}, false, 17, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getWidth", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "createTableau", "boolean", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getSolution", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getOriginalNumDecisionVariables", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "initializeColumnLabels", ""}}), new String[][]{{"get", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getHeight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getData", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getOriginalNumDecisionVariables", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getSolution", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "initializeColumnLabels", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getOriginalNumDecisionVariables", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "createTableau", "boolean", "true"}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "dropPhase1Objective", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumSlackVariables", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumSlackVariables", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getSolution", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getEntry", new String[]{"int", "int"}, new String[]{"1", "46"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "hashCode", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumArtificialVariables", ""}}), new String[][]{{"addAll", "int,java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "divideRow", new String[]{"int", "double"}, new String[]{"-2", "Infinity"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getEntry", new String[]{"int", "int"}, new String[]{"-1", "-1"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoefficientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:10>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getRhsOffset", ""}}, 1), new String[][]{{"add", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumArtificialVariables", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getSlackVariableOffset", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumArtificialVariables", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "hashCode", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "isOptimal", ""}}), new String[][]{{"listIterator", "", "3"}, {"set", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 13, new String[][]{}, 1), new String[][]{{"retainAll", "java.util.Collection", "5"}, {"addAll", "int,java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 0, null, 3), new String[][]{{"removeAll", "java.util.Collection", "5"}, {"listIterator", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getSlackVariableOffset", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumArtificialVariables", ""}}, 2), new String[][]{{"get", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "setEntry", "int,int,double", "9", "1", "-1369660067587938365"}}), new String[][]{{"indexOf", "java.lang.Object", "5"}, {"listIterator", "", "1"}, {"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "setEntry", "int,int,double", "9", "1", "-1369660067587938365"}}, 2), new String[][]{{"indexOf", "java.lang.Object", "5"}, {"listIterator", "", "1"}, {"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getData", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumSlackVariables", ""}}, 2), new String[][]{{"indexOf", "java.lang.Object", "7"}, {"add", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getHeight", ""}}), new String[][]{{"lastIndexOf", "java.lang.Object", "0"}, {"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", "java.util.Collection", "<sample:2>"}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getSlackVariableOffset", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getHeight", ""}}, 1), new String[][]{{"retainAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 14, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", "java.util.Collection", "<sample:2>"}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getSlackVariableOffset", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getHeight", ""}}, 1), new String[][]{{"retainAll", "java.util.Collection", "1"}, {"lastIndexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getEntry", "int,int", "0", "11"}}, 2), new String[][]{{"listIterator", "", "1"}, {"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getSolution", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "isOptimal", ""}}, 2), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumDecisionVariables", ""}}, 3), new String[][]{{"containsAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 8, new String[][]{}, 1), new String[][]{{"listIterator", "", "5"}, {"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "normalizeConstraints", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "hashCode", ""}}, 3), new String[][]{{"addAll", "java.util.Collection", "6"}, {"subList", "int,int", "2"}, {"remove", "java.lang.Object", "5"}, {"listIterator", "int", "3"}});
  assertNotNull(actual);
 }
}
