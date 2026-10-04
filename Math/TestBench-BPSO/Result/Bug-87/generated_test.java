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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getHeight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumVariables", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "createTableau", new String[]{"boolean"}, new String[]{"true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:ley>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getEntry", new String[]{"int", "int"}, new String[]{"2147483647", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumVariables", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumArtificialVariables", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getRhsOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumDecisionVariables", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getOriginalNumDecisionVariables", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumObjectiveFunctions", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumSlackVariables", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getEntry", "int,int", "-10", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getArtificialVariableOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumDecisionVariables", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumDecisionVariables", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getOriginalNumDecisionVariables", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getRhsOffset", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "discardArtificialVariables", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getHeight", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNormalizedConstraints", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:hley>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "setEntry", new String[]{"int", "int", "double"}, new String[]{"2147483647", "-2147483648", "-Infinity"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "divideRow", new String[]{"int", "double"}, new String[]{"57", "23.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getOriginalNumDecisionVariables", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getRhsOffset", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumArtificialVariables", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "setEntry", new String[]{"int", "int", "double"}, new String[]{"0", "0", "Infinity"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumDecisionVariables", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getHeight", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "subtractRow", new String[]{"int", "int", "double"}, new String[]{"0", "2147483647", "0.1"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getRhsOffset", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getHeight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getSolution", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumArtificialVariables", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumVariables", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getSlackVariableOffset", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getSolution", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "divideRow", "int,double", "2147483647", "-1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumArtificialVariables", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getSlackVariableOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:`>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumSlackVariables", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getWidth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "createTableau", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getRhsOffset", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoeffiecientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoeffiecientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumVariables", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoeffiecientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getSlackVariableOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "equals", "java.lang.Object", "<i:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getSolution", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getOriginalNumDecisionVariables", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "subtractRow", "int,int,double", "-2147483648", "524260", "Infinity"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoeffiecientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getEntry", new String[]{"int", "int"}, new String[]{"57", "2147483647"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getEntry", "int,int", "-1", "2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoeffiecientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getData", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoeffiecientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "subtractRow", new String[]{"int", "int", "double"}, new String[]{"-10", "2147483647", "-45.0"}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "divideRow", "int,double", "-2147483648", "1.7976931348623157E308"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getSlackVariableOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getSlackVariableOffset", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getArtificialVariableOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getWidth", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumObjectiveFunctions", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumVariables", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getSolution", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getSlackVariableOffset", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "hashCode", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumVariables", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumObjectiveFunctions", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getArtificialVariableOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "divideRow", "int,double", "57", "NaN"}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getEntry", "int,int", "-44", "9"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getWidth", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:ley>"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumDecisionVariables", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getSlackVariableOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumSlackVariables", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumDecisionVariables", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "discardArtificialVariables", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumObjectiveFunctions", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "discardArtificialVariables", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoeffiecientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getSolution", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumVariables", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumVariables", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getSlackVariableOffset", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getData", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getArtificialVariableOffset", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getEntry", new String[]{"int", "int"}, new String[]{"-2147483648", "-2048"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "subtractRow", "int,int,double", "46", "-55", "1.7976931348623157E308"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "subtractRow", new String[]{"int", "int", "double"}, new String[]{"-2147483648", "2147483647", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getArtificialVariableOffset", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "equals", "java.lang.Object", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getRhsOffset", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getOriginalNumDecisionVariables", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getWidth", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getSlackVariableOffset", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getData", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "discardArtificialVariables", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getData", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "divideRow", new String[]{"int", "double"}, new String[]{"2147483647", "0.19999999999999998"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumObjectiveFunctions", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getArtificialVariableOffset", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getHeight", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "divideRow", new String[]{"int", "double"}, new String[]{"1", "-6.8483003379396915E17"}, false, 4, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumDecisionVariables", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumSlackVariables", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getSlackVariableOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "subtractRow", "int,int,double", "-2", "2147483647", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNormalizedConstraints", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getArtificialVariableOffset", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumObjectiveFunctions", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "setEntry", new String[]{"int", "int", "double"}, new String[]{"-20", "-5", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "hashCode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "discardArtificialVariables", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoeffiecientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNormalizedConstraints", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumSlackVariables", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumSlackVariables", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNormalizedConstraints", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getSolution", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getEntry", new String[]{"int", "int"}, new String[]{"-2147483648", "-14"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumVariables", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumArtificialVariables", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoeffiecientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getHeight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "createTableau", "boolean", "true"}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "discardArtificialVariables", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "divideRow", new String[]{"int", "double"}, new String[]{"2", "-23.0"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumArtificialVariables", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "setEntry", new String[]{"int", "int", "double"}, new String[]{"1073741823", "-23", "0.02"}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "discardArtificialVariables", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoeffiecientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoeffiecientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumObjectiveFunctions", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "createTableau", "boolean", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getOriginalNumDecisionVariables", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNormalizedConstraints", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getSlackVariableOffset", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "createTableau", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumObjectiveFunctions", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getData", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "divideRow", "int,double", "0", "0.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoeffiecientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumArtificialVariables", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "hashCode", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoeffiecientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "createTableau", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getNumArtificialVariables", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getHeight", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumSlackVariables", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getHeight", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoeffiecientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoeffiecientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoeffiecientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:9>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "createTableau", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoeffiecientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "subtractRow", new String[]{"int", "int", "double"}, new String[]{"-2147483648", "0", "-0.1"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "subtractRow", new String[]{"int", "int", "double"}, new String[]{"114", "2147483647", "-1.3696600675879383E19"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoeffiecientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoeffiecientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getOriginalNumDecisionVariables", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getSolution", ""}, {"org.apache.commons.math.optimization.linear.SimplexTableau", "getNormalizedConstraints", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoeffiecientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoeffiecientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumObjectiveFunctions", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.optimization.linear.SimplexTableau", "getOriginalNumDecisionVariables", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoeffiecientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoeffiecientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getInvertedCoeffiecientSum", new String[]{"org.apache.commons.math.linear.RealVector"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.optimization.linear.SimplexTableau", "org.apache.commons.math.optimization.linear.SimplexTableau", "getNumSlackVariables", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getNumVariables=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
}
