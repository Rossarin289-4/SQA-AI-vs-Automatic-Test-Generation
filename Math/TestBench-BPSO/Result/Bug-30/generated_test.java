package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:0>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", "double[],double[]", "<empty>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<null>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:1>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<empty>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", "double[],double[]", "<null>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<empty>"}, false, 2, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", "double[],double[]", "<sample:0>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", "double[],double[]", "<sample:1>", "<sample:5>"}, {"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:2>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5637028616507731", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:10>", "<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", "double[],double[]", "<empty>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.54029137460742", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.22067136191984704", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:6>", "<sample:1>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:5>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.31731050786291404", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:0>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2482130789899235", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6547208460185768", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", "double[],double[]", "<sample:1>", "<sample:1>"}, {"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:0>", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.22067136191984704", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", "double[],double[]", "<sample:4>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7728299926844475", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:0>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<sample:3>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.37109336952269745", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<null>", "<sample:0>"}, {"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:0>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", "double[],double[]", "<sample:5>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.37109336952269745", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", "double[],double[]", "<sample:0>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<empty>"}, false, 3, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", "double[],double[]", "<sample:0>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:7>", "<null>"}, false, 3, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", "double[],double[]", "<sample:0>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<sample:5>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", "double[],double[]", "<sample:5>", "<empty>"}, {"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:3>", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:2>", "<null>"}, {"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:7>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<empty>", "<sample:4>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", "double[],double[]", "<sample:5>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<empty>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:2>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<null>", "<sample:1>"}, {"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", "double[],double[]", "<sample:0>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<empty>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", "double[],double[]", "<sample:1>", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:0>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.37109336952269745", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", "double[],double[]", "<sample:1>", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7728299926844475", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:0>", "<sample:8>"}, {"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", "double[],double[]", "<sample:5>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<empty>", "<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:5>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:5>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:6>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:2>", "<sample:7>"}, {"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", "double[],double[]", "<sample:0>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<empty>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:1>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:8>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6625205835400575", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:6>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<null>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:2>", "<sample:0>"}, {"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:4>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<sample:1>", "<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:3>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<empty>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2482130789899235", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3864762307712325", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:3>", "<sample:6>"}, {"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:5>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:1>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5126907602619235", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", "double[],double[]", "<sample:1>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:6>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", "double[],double[]", "<empty>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.22067136191984704", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:2>", "<sample:5>"}, {"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", "double[],double[]", "<sample:5>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.22067136191984704", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<null>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6547208460185768", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<sample:8>", "<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.37109336952269745", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", new String[]{"double[]", "double[]"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:0>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3864762307712325", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:7>", "<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:3>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyUTest", "double[],double[]", "<sample:3>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<empty>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.stat.inference.MannWhitneyUTest", "org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", new String[]{"double[]", "double[]"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.stat.inference.MannWhitneyUTest", "mannWhitneyU", "double[],double[]", "<sample:1>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
}
