package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getDimension", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getMeans=!NullPointerException, getStandardDeviations=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getStandardDeviations", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getCovariances", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "sample", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getStandardDeviations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getMeans", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "sample", "int", "268435441"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "density", new String[]{"double[]"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "sample", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getStandardDeviations", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getDimension", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "density", "double[]", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getMeans=!NullPointerException, getStandardDeviations=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "density", new String[]{"double[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "density", "double[]", "<null>"}, {"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "reseedRandomGenerator", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "density", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "density", new String[]{"double[]"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "reseedRandomGenerator", "long", "9223372036854775807"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "density", new String[]{"double[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "density", "double[]", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getStandardDeviations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getStandardDeviations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "density", new String[]{"double[]"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "sample", "int", "10"}, {"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "sample", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getCovariances", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "sample", new String[]{"int"}, new String[]{"-1"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "sample", new String[]{"int"}, new String[]{"112"}, false, 3, new String[][]{{"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "reseedRandomGenerator", "long", "-58"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "sample", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getCovariances", ""}, {"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getDimension", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "density", new String[]{"double[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "sample", "int", "-1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getStandardDeviations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getCovariances", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getCovariances", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "reseedRandomGenerator", "long", "1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getDimension", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "sample", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getMeans=!NullPointerException, getStandardDeviations=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getMeans", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getDimension", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getDimension", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getDimension=0, getMeans=!NullPointerException, getStandardDeviations=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getMeans", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getCovariances", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "density", new String[]{"double[]"}, new String[]{"<null>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"16384"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "reseedRandomGenerator", "long", "-8388607"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "density", new String[]{"double[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getCovariances", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getCovariances", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getCovariances", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "sample", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "sample", new String[]{"int"}, new String[]{"2"}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getDimension", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "reseedRandomGenerator", new String[]{"long"}, new String[]{"-8935141660703064064"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getStandardDeviations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "sample", new String[]{"int"}, new String[]{"2053"}, false, 6, new String[][]{{"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "sample", "int", "0"}, {"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "reseedRandomGenerator", "long", "-4611686018427387904"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "sample", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getDimension", ""}, {"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getStandardDeviations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getMeans", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "reseedRandomGenerator", "long", "-9223372032559808516"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "sample", new String[]{"int"}, new String[]{"2"}, false, 2, new String[][]{{"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "density", "double[]", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "sample", new String[]{"int"}, new String[]{"-2147483609"}, false, 0, new String[][]{{"org.apache.commons.math3.distribution.MultivariateNormalDistribution", "getCovariances", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.distribution.MultivariateNormalDistribution", "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "sample", new String[]{"int"}, new String[]{"-45"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
}
