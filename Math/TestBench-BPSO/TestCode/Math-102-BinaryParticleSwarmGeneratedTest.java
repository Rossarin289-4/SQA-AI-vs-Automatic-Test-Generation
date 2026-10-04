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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]", "double"}, new String[]{"<sample:1>", "<null>", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[],double", "<sample:1>", "<sample:0>", "1.0E-5"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]"}, new String[]{"<sample:2>", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[],double", "<sample:2>", "<sample:2>", "Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"long[][]", "double"}, new String[]{"<sample:2>", "0.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", new String[]{"double[]", "long[]"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[]", "<sample:0>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]", "double"}, new String[]{"<sample:1>", "<empty>", "-0.75"}, false, 4, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", "long[],long[]", "<sample:1>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:0>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "setDistribution", new String[]{"org.apache.commons.math.distribution.ChiSquaredDistribution"}, new String[]{"<sample:6>"}, false, 7, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "setDistribution", new String[]{"org.apache.commons.math.distribution.ChiSquaredDistribution"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "double[],long[]", "<sample:0>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.distribution.DistributionFactoryImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]", "double"}, new String[]{"<sample:1>", "<sample:1>", "0.5000000000000001"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"long[][]", "double"}, new String[]{"<sample:1>", "1.5"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]", "double"}, new String[]{"<sample:1>", "<sample:6>", "NaN"}, false, 2, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[]", "<sample:2>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", new String[]{"long[][]"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[]", "<sample:2>", "<sample:8>"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[]", "<sample:1>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"long[][]", "double"}, new String[]{"<sample:0>", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "double[],long[]", "<sample:3>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]"}, new String[]{"<sample:0>", "<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:5>", "<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "long[][]", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]", "double"}, new String[]{"<sample:2>", "<sample:5>", "1.7976931348623155E308"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]", "double"}, new String[]{"<sample:1>", "<sample:10>", "15.0"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<null>", "<sample:10>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]", "double"}, new String[]{"<sample:1>", "<sample:5>", "-0.375"}, false, 5, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[]", "<sample:3>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:8>", "<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][],double", "<sample:3>", "1.625"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.06043956043956046", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", new String[]{"double[]", "long[]"}, new String[]{"<sample:3>", "<sample:10>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", new String[]{"double[]", "long[]"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[]", "<sample:8>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"long[][]"}, new String[]{"<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"long[][]"}, new String[]{"<empty>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[]", "<null>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]", "double"}, new String[]{"<sample:3>", "<sample:5>", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "setDistribution", "org.apache.commons.math.distribution.ChiSquaredDistribution", "<sample:1>"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[]", "<sample:4>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "double[],long[]", "<empty>", "<sample:5>"}}), new String[][]{{"createPascalDistribution", "int,double", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:8>", "<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", new String[]{"long[][]"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[]", "<sample:3>", "<sample:10>"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][],double", "<sample:0>", "-1.7976931348623157E308"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", new String[]{"long[][]"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[]", "<sample:3>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:2>", "<sample:8>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[],double", "<sample:2>", "<sample:13>", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"long[][]"}, new String[]{"<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[]", "<sample:2>", "<sample:4>"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][]", "<sample:1>"}}, 3), new String[][]{{"createPascalDistribution", "int,double", "7"}, {"cumulativeProbability", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "setDistribution", new String[]{"org.apache.commons.math.distribution.ChiSquaredDistribution"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[],double", "<sample:5>", "<sample:0>", "-Infinity"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", new String[]{"long[][]"}, new String[]{"<empty>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]"}, new String[]{"<sample:6>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "setDistribution", "org.apache.commons.math.distribution.ChiSquaredDistribution", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:12>", "<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", "long[],long[]", "<sample:6>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:4>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:1>", "<sample:10>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8470588235294118", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]", "double"}, new String[]{"<null>", "<sample:12>", "-1.7976931348623157E308"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]", "double"}, new String[]{"<null>", "<null>", "0.25"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:3>", "<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "double[],long[]", "<null>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", new String[]{"long[][]"}, new String[]{"<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]"}, new String[]{"<null>", "<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "long[][]", "<sample:0>"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.distribution.DistributionFactoryImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"long[][]"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "long[][]", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", new String[]{"long[][]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[],double", "<sample:1>", "<sample:10>", "2.0E-5"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[]", "<sample:3>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"long[][]", "double"}, new String[]{"<sample:2>", "0.0"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:10>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.07764705882352944", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:8>", "<sample:8>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:3>", "<empty>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]"}, new String[]{"<sample:6>", "<null>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][],double", "<sample:0>", "1.0000000000000004"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[]", "<sample:1>", "<sample:7>"}}), new String[][]{{"createNormalDistribution", "", "2"}, {"cumulativeProbability", "double,double", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.34134474606854304", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]"}, new String[]{"<sample:0>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", new String[]{"double[]", "long[]"}, new String[]{"<sample:0>", "<sample:7>"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "long[][]", "<empty>"}}, 3), new String[][]{{"createChiSquareDistribution", "double", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:7>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][],double", "<null>", "2.0"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[],double", "<sample:4>", "<sample:2>", "1.625"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0415584415584416", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:5>", "<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "double[],long[]", "<empty>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:4>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4385780260809997", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"long[][]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "setDistribution", "org.apache.commons.math.distribution.ChiSquaredDistribution", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", new String[]{"long[][]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][],double", "<null>", "1.4999999999999998"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][]", "<sample:0>"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "double[],long[]", "<empty>", "<sample:10>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.distribution.DistributionFactoryImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]", "double"}, new String[]{"<sample:7>", "<sample:1>", "0.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"long[][]", "double"}, new String[]{"<sample:2>", "0.9999999999999999"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]"}, new String[]{"<sample:7>", "<sample:4>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:7>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0415584415584416", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:1>", "<sample:1>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", new String[]{"double[]", "long[]"}, new String[]{"<null>", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "double[],long[]", "<sample:2>", "<sample:8>"}}), new String[][]{{"createGammaDistribution", "double,double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.distribution.GammaDistributionImpl", actual.getClass().getName());
  assertEquals("{getAlpha=1.0, getBeta=Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:1>", "<sample:10>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.35738571603752656", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:4>", "<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][],double", "<sample:0>", "-1.7976931348623155E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]", "double"}, new String[]{"<sample:7>", "<sample:10>", "0.1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:11>", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.13125", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:1>", "<sample:10>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.35738571603752656", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", new String[]{"double[]", "long[]"}, new String[]{"<sample:7>", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]"}, new String[]{"<sample:7>", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[]", "<sample:0>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]", "double"}, new String[]{"<sample:6>", "<sample:12>", "-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "double[],long[]", "<sample:2>", "<sample:0>"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][],double", "<sample:2>", "-3.37"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[]", "<sample:1>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:4>", "<sample:10>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7805117347097875", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"long[][]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][]", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "long[][]", "<sample:6>"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[]", "<sample:0>", "<sample:7>"}}, 2), new String[][]{{"createPoissonDistribution", "double", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:11>", "<null>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][]", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"createNormalDistribution", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.distribution.NormalDistributionImpl", actual.getClass().getName());
  assertEquals("{getMean=0.0, getStandardDeviation=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", new String[]{"double[]", "long[]"}, new String[]{"<null>", "<sample:3>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", new String[]{"double[]", "long[]"}, new String[]{"<sample:3>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", "long[],long[]", "<sample:10>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:8>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]"}, new String[]{"<null>", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:8>", "<sample:11>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", "long[],long[]", "<sample:1>", "<sample:5>"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][],double", "<sample:0>", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.015338345864661667", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "setDistribution", new String[]{"org.apache.commons.math.distribution.ChiSquaredDistribution"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][]", "<empty>"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][]", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:5>", "<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9702322722520259", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:1>", "<sample:11>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", "long[],long[]", "<empty>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][]", "<sample:0>"}}, 3), new String[][]{{"createExponentialDistribution", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.distribution.ExponentialDistributionImpl", actual.getClass().getName());
  assertEquals("{getMean=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][],double", "<sample:3>", "-1.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", new String[]{"long[][]"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]"}, new String[]{"<sample:7>", "<sample:10>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "double[],long[]", "<null>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[],double", "<sample:4>", "<sample:5>", "1.7976931348623153E308"}}), new String[][]{{"createNormalDistribution", "double,double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.distribution.NormalDistributionImpl", actual.getClass().getName());
  assertEquals("{getMean=1.0, getStandardDeviation=Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]"}, new String[]{"<null>", "<sample:2>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"long[][]", "double"}, new String[]{"<null>", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][]", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[],double", "<sample:4>", "<sample:2>", "0.0"}}), new String[][]{{"createBinomialDistribution", "int,double", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.distribution.BinomialDistributionImpl", actual.getClass().getName());
  assertEquals("{getNumberOfTrials=3, getProbabilityOfSuccess=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[]", "<sample:0>", "<sample:2>"}}), new String[][]{{"createPascalDistribution", "int,double", "7"}, {"probability", "double", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "long[][]", "<sample:1>"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", "long[],long[]", "<sample:2>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.distribution.DistributionFactoryImpl", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:10>", "<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "double[],long[]", "<sample:2>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"createHypergeometricDistribution", "int,int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"long[][]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "double[],long[]", "<sample:7>", "<sample:1>"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", "long[],long[]", "<sample:4>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]"}, new String[]{"<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "setDistribution", "org.apache.commons.math.distribution.ChiSquaredDistribution", "<sample:7>"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", "long[],long[]", "<sample:7>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:11>", "<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.936481979195658", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", new String[]{"long[][]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[],double", "<sample:12>", "<sample:7>", "2.11"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", new String[]{"double[]", "long[]"}, new String[]{"<null>", "<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][],double", "<empty>", "NaN"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.779220779220779", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:4>", "<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "long[][]", "<sample:5>"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[]", "<null>", "<sample:12>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.07764705882352944", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", ""}}), new String[][]{{"createTDistribution", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.distribution.TDistributionImpl", actual.getClass().getName());
  assertEquals("{getDegreesOfFreedom=Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false), new String[][]{{"createPascalDistribution", "int,double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.distribution.PascalDistributionImpl", actual.getClass().getName());
  assertEquals("{getNumberOfSuccesses=0, getProbabilityOfSuccess=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:7>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[],double", "<sample:10>", "<sample:7>", "0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8384637819224634", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "setDistribution", "org.apache.commons.math.distribution.ChiSquaredDistribution", "<sample:2>"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", "long[],long[]", "<sample:0>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:1>", "<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[]", "<sample:0>", "<sample:4>"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][],double", "<empty>", "4.0E-5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:8>", "<null>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]", "double"}, new String[]{"<sample:10>", "<sample:10>", "0.1875"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[],double", "<sample:10>", "<sample:1>", "0.49999999999999994"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", "long[],long[]", "<sample:10>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<null>", "<sample:3>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[]", "<sample:9>", "<sample:3>"}}, 3), new String[][]{{"createBinomialDistribution", "int,double", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.distribution.BinomialDistributionImpl", actual.getClass().getName());
  assertEquals("{getNumberOfTrials=3, getProbabilityOfSuccess=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[]", "<sample:8>", "<sample:9>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:4>", "<sample:13>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "double[],long[]", "<sample:1>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7504692850316967", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:7>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][]", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8384637819224634", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]", "double"}, new String[]{"<null>", "<empty>", "0.49999999999999994"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[]", "<sample:2>", "<sample:5>"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:8>", "<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", "long[],long[]", "<sample:0>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.06043956043956046", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:8>", "<sample:5>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9702322722520259", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]", "double"}, new String[]{"<sample:10>", "<null>", "0.49999999999999994"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[]", "<sample:2>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"long[][]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][],double", "<null>", "-6.25"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:5>", "<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][],double", "<sample:2>", "-0.75"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9702322722520259", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:2>", "<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][],double", "<sample:6>", "-0.75"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "long[][]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"createGammaDistribution", "double,double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.distribution.GammaDistributionImpl", actual.getClass().getName());
  assertEquals("{getAlpha=1.0, getBeta=Infinity}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][]", "<sample:3>"}}, 3), new String[][]{{"createNormalDistribution", "double,double", "3"}, {"getStandardDeviation", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:8>", "<sample:11>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9923601601397021", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:1>", "<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][],double", "<sample:0>", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.35738571603752656", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[],double", "<sample:5>", "<sample:3>", "-49.375"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[],double", "<empty>", "<sample:8>", "5.0E-6"}}, 3), new String[][]{{"createPascalDistribution", "int,double", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.distribution.PascalDistributionImpl", actual.getClass().getName());
  assertEquals("{getNumberOfSuccesses=3, getProbabilityOfSuccess=0.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]", "double"}, new String[]{"<sample:7>", "<sample:4>", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[],double", "<sample:1>", "<sample:6>", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:1>", "<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:7>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][],double", "<null>", "-1.0E-323"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0415584415584416", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[]", "<sample:4>", "<null>"}}, 2), new String[][]{{"createNormalDistribution", "", "2"}, {"cumulativeProbability", "double", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[],double", "<empty>", "<sample:5>", "-0.6000000000000001"}}, 1), new String[][]{{"createTDistribution", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.distribution.TDistributionImpl", actual.getClass().getName());
  assertEquals("{getDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:10>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[]", "<sample:3>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.35738571603752656", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "double[],long[]", "<sample:2>", "<sample:7>"}}, 2), new String[][]{{"createCauchyDistribution", "double,double", "7"}, {"cumulativeProbability", "double,double", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:2>", "<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][],double", "<empty>", "-0.54"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:8>", "<sample:8>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[],double", "<null>", "<sample:8>", "0.435"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:2>", "<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[]", "<sample:1>", "<sample:10>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]"}, new String[]{"<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[]", "<sample:4>", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"long[][]", "double"}, new String[]{"<null>", "2.0E-5"}, false, 1, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "double[],long[]", "<null>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:8>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[]", "<sample:0>", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]", "double"}, new String[]{"<sample:7>", "<sample:4>", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[]", "<sample:2>", "<sample:4>"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][],double", "<sample:1>", "1.054"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:5>", "<sample:14>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5448648648648649", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:7>", "<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "long[][]", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.00691073632250101", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][]", "<sample:3>"}}, 2), new String[][]{{"createWeibullDistribution", "double,double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.distribution.WeibullDistributionImpl", actual.getClass().getName());
  assertEquals("{getScale=Infinity, getShape=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:1>", "<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[],double", "<null>", "<sample:13>", "0.04999999999999999"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][],double", "<sample:0>", "0.75"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8470588235294118", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]"}, new String[]{"<sample:7>", "<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[],double", "<sample:7>", "<empty>", "-0.7500000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:11>", "<sample:8>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9923601601397021", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[],double", "<sample:0>", "<sample:0>", "-0.37499999999999994"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "long[][]", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]", "double"}, new String[]{"<sample:2>", "<sample:2>", "0.49999999999999994"}, false, 3, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[]", "<null>", "<sample:2>"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[],double", "<sample:7>", "<sample:6>", "0.049999999999999996"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "long[][]", "<empty>"}}, 2), new String[][]{{"createPascalDistribution", "int,double", "6"}, {"cumulativeProbability", "double,double", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][],double", "<empty>", "-0.365"}}, 2), new String[][]{{"createChiSquareDistribution", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.distribution.ChiSquaredDistributionImpl", actual.getClass().getName());
  assertEquals("{getDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]", "double"}, new String[]{"<sample:5>", "<sample:3>", "-Infinity"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]", "double"}, new String[]{"<sample:0>", "<empty>", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "setDistribution", "org.apache.commons.math.distribution.ChiSquaredDistribution", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"createPascalDistribution", "int,double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.distribution.PascalDistributionImpl", actual.getClass().getName());
  assertEquals("{getNumberOfSuccesses=4, getProbabilityOfSuccess=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]", "double"}, new String[]{"<sample:7>", "<sample:7>", "0.05000000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]", "double"}, new String[]{"<null>", "<sample:0>", "0.5"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:10>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[],double", "<null>", "<sample:0>", "0.5000000000000001"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][],double", "<sample:3>", "-4.899990000000001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7805117347097875", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", new String[]{"double[]", "long[]"}, new String[]{"<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[],double", "<sample:4>", "<sample:7>", "0.375"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[],double", "<sample:1>", "<sample:3>", "1.9999999999999998E-4"}}, 1), new String[][]{{"createChiSquareDistribution", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.distribution.ChiSquaredDistributionImpl", actual.getClass().getName());
  assertEquals("{getDegreesOfFreedom=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "double[],long[]", "<null>", "<sample:3>"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][]", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]"}, new String[]{"<sample:7>", "<sample:4>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", "long[],long[]", "<sample:10>", "<sample:3>"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[],double", "<sample:3>", "<null>", "1.0"}}, 1), new String[][]{{"createBinomialDistribution", "int,double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.distribution.BinomialDistributionImpl", actual.getClass().getName());
  assertEquals("{getNumberOfTrials=4, getProbabilityOfSuccess=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "setDistribution", "org.apache.commons.math.distribution.ChiSquaredDistribution", "<sample:2>"}}, 1), new String[][]{{"createCauchyDistribution", "double,double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.distribution.CauchyDistributionImpl", actual.getClass().getName());
  assertEquals("{getMedian=0.0, getScale=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]"}, new String[]{"<sample:7>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[],double", "<sample:7>", "<sample:5>", "1.625"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "long[][]", "<sample:0>"}}, 2), new String[][]{{"createPascalDistribution", "int,double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.distribution.PascalDistributionImpl", actual.getClass().getName());
  assertEquals("{getNumberOfSuccesses=0, getProbabilityOfSuccess=1.0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:5>", "<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[]", "<sample:12>", "<sample:11>"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:10>", "<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[],double", "<sample:5>", "<sample:0>", "-0.10000000000000002"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[]", "<sample:6>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8470588235294118", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]"}, new String[]{"<sample:7>", "<sample:1>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]"}, new String[]{"<sample:7>", "<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][]", "<sample:3>"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[],double", "<sample:6>", "<sample:8>", "0.75"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", new String[]{"double[]", "long[]"}, new String[]{"<sample:7>", "<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", new String[]{"long[]", "long[]"}, new String[]{"<sample:4>", "<sample:10>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "setDistribution", "org.apache.commons.math.distribution.ChiSquaredDistribution", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.07764705882352944", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"long[][]", "double"}, new String[]{"<null>", "4.0E-5"}, false, 5, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", new String[]{"double[]", "long[]"}, new String[]{"<sample:7>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "long[][]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]", "double"}, new String[]{"<sample:7>", "<sample:1>", "4.9E-324"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]", "double"}, new String[]{"<sample:2>", "<sample:2>", "0.5"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"long[][]", "double"}, new String[]{"<null>", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[],double", "<sample:3>", "<sample:0>", "1.0E-5"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]", "double"}, new String[]{"<sample:2>", "<sample:8>", "4.9E-324"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[]", "<sample:6>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]", "double"}, new String[]{"<null>", "<sample:0>", "0.5"}, false, 5, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][]", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]"}, new String[]{"<sample:7>", "<sample:4>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "long[][]", "<sample:1>"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]", "double"}, new String[]{"<sample:7>", "<sample:1>", "4.9E-324"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "setDistribution", "org.apache.commons.math.distribution.ChiSquaredDistribution", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]", "double"}, new String[]{"<sample:2>", "<sample:8>", "0.049999999999999996"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareDataSetsComparison", "long[],long[]", "<sample:11>", "<sample:5>"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquare", "long[][]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]", "double"}, new String[]{"<sample:5>", "<sample:5>", "0.16249999999999998"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "setDistribution", "org.apache.commons.math.distribution.ChiSquaredDistribution", "<sample:7>"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "setDistribution", "org.apache.commons.math.distribution.ChiSquaredDistribution", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", new String[]{"long[]", "long[]", "double"}, new String[]{"<null>", "<sample:1>", "NaN"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]", "double"}, new String[]{"<sample:7>", "<sample:4>", "0.194"}, false, 3, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][],double", "<null>", "-1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]"}, new String[]{"<sample:7>", "<sample:10>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTestDataSetsComparison", "long[],long[],double", "<sample:11>", "<sample:1>", "1.0E-4"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "long[][],double", "<sample:4>", "-6.7"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]"}, new String[]{"<sample:7>", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "getDistributionFactory", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]"}, new String[]{"<sample:7>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", "double[],long[],double", "<sample:3>", "<empty>", "-1.7976931348623155E308"}, {"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "setDistribution", "org.apache.commons.math.distribution.ChiSquaredDistribution", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]"}, new String[]{"<sample:7>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "setDistribution", "org.apache.commons.math.distribution.ChiSquaredDistribution", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]"}, new String[]{"<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "setDistribution", "org.apache.commons.math.distribution.ChiSquaredDistribution", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]"}, new String[]{"<sample:7>", "<sample:1>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.inference.ChiSquareTestImpl", "org.apache.commons.math.stat.inference.ChiSquareTestImpl", "chiSquareTest", new String[]{"double[]", "long[]"}, new String[]{"<sample:7>", "<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.inference.ChiSquareTestImpl", "setDistribution", "org.apache.commons.math.distribution.ChiSquaredDistribution", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
 }
}
