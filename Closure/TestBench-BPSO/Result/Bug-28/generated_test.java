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
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:2>", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:6>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:3>", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:6>", "-1073741824"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:0>", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:7>", "-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:0>", "1073741823"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<null>", "-36"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<null>", "131062"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:5>", "37"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:0>", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<null>", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:4>", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:12>", "-1073741824"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:6>", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:6>", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:12>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:0>", "1073741823"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<null>", "-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.Error", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:10>", "4"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:10>", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:12>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineCostEstimator", "com.google.javascript.jscomp.InlineCostEstimator", "getCost", new String[]{"com.google.javascript.rhino.Node", "int"}, new String[]{"<sample:12>", "1073741823"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
 }
}
