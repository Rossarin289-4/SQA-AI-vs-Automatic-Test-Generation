package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"10065052"}, false, 13, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", "int", "-3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4895917", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"144282780"}, false, 13, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", "int", "-3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("85211917", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"-1073741824"}, false, 8, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", "int", "2147483646"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"40260208"}, false, 8, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("14465890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"40260208"}, false, 7, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", "int", "1073741823"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextFloat", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9660578", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "clear", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int[]", "<sample:0>"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4464109568825303", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int[]", "<sample:1>"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.38285386281043676", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int[]", "<sample:1>"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7774708328076281", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int[]", "<sample:0>"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9029488183023178", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int[]", "<sample:0>"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4464109568825303", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6538577244938164", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "clear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3743189455355178", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "clear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7774708328076281", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "clear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6579649694838781", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.34681592316050613", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9214463212165593", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextBytes", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "20130105"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextBytes", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextDouble", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextBytes", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextDouble", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "long", "-2"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"long"}, new String[]{"20130103"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"int[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "clear", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"int[]"}, new String[]{"<sample:2>"}, false, 12, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "-3"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"int[]"}, new String[]{"<empty>"}, false, 13, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextLong", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextBoolean", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "clear", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "clear", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextDouble", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int[]", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"int"}, new String[]{"-2147483589"}, false, 13, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"int"}, new String[]{"1073741822"}, false, 3, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "long", "4294967294"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "long", "4160749568"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBoolean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("895786224", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBoolean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("167260190", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBoolean", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("167260190", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.37431884", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextFloat", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.20856643", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.37431884", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.7774708", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.29978466", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextFloat", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.34297156", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.8459227", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextFloat", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.047039747", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextFloat", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.77162445", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextBoolean", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextBoolean", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextBoolean", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextBoolean", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "-2"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextBoolean", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.6759988", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "-2"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextBoolean", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.52004683", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "-2147483589"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1561335152", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"40260208"}, false, 3, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "-2147483589"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11276", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"40262256"}, false, 3, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "-2147483589"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("47648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"20131128"}, false, 3, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "-2147483589"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12197930", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"-20131128"}, false, 3, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "-2147483589"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("186", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"-20131128"}, false, 3, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("50", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"20131128"}, false, 3, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3302088", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.7003658229714762", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.11109773715010061", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"int"}, new String[]{"40260116"}, false, 1, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextFloat", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", "int", "10"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6904965970023193840", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4104938631007652395", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-6309432578514143164", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6397624583449698485", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6688018864706957342", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("718377047119353220", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5872511096654263441", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("718377047119353220", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "-1073741823"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-7984009651925537057", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2400550010740285951", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("867730828660270569", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4212783573707251641", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "1"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextDouble", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9023362521133271565", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 31, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "1"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextDouble", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8221747319819079329", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "1"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextDouble", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9185168218626395510", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "1"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextDouble", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1809990352019631585", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "1"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextDouble", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5677371494297823662", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1607687671", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1607687671", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-955755504", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1469029249", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1489563049", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextFloat", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("895786224", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextFloat", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1644344789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextFloat", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-980865112", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBoolean", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextFloat", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-174841785", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBoolean", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextFloat", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-477161454", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "clear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3743189455355178", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "clear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7774708328076281", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "clear", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.049241558556581966", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "clear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6579649694838781", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "clear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.34681592316050613", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2901442190345133", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", "int", "-2147483589"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "1073741823"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.70638561839163", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", "int", "-2147483589"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "1073741823"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.6372508360593064", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"int[]"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "long", "20130104"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5421615606964549", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"20130157"}, false, 14, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "-3"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6378218", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"20130157"}, false, 5, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "-3"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3736128", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"40260314"}, false, 5, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "-3"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23442673", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"20130157"}, false, 5, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "-3"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3312516", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"20130157"}, false, 7, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextFloat", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9659094", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"int[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextLong", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"-20130103"}, false, 1, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextLong", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "-2147483589"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("504", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"-20130103"}, false, 1, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "-2147483589"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("106", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"-20130103"}, false, 1, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextFloat", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "-2147483589"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("312", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("447893112", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextBytes", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "40260208"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.1628973774580278", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextLong", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"long"}, new String[]{"-144115188075855892"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", "int", "20130104"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextLong", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", "int", "1073741823"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", "int", "1"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextLong", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1640912645", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "2147483647"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "-2147483589"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextLong", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2851171752690822918", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3625582164368524", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.25768497111872635", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3786074752686317", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8066010792573404", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"int"}, new String[]{"2147483604"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"long"}, new String[]{"-2305843009213693954"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "long", "9007199254740990"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "clear", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int[]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1669605896", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "long", "161040824"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "0"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8459227390146222", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextBytes", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBoolean", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextLong", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextBytes", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<sample:0>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextBytes", new String[]{"byte[]"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextDouble", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextDouble", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.077638150438646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.8189137341168818", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5914027556198341", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", "int", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.7428038549838165", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.2661910015888347", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.4856915375235498", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextBytes", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextLong", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextBoolean", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextBoolean", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"-2147483648"}, false, 8, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1367300539", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("167260190", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0559346374543552", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", "int", "-2147221504"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-6645644585700181724", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"long"}, new String[]{"4294967295"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "long", "9223372036854775807"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextDouble", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-7199294344201019254", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextDouble", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-3482371512546103119", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBoolean", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5913574988617275", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.65796494", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"-1073741794"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "long", "-144115188075855892"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "clear", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-6999574257777239384", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "clear", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2473043229284746521", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"-2147483589"}, false, 13, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "long", "4294966276"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6550984", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"1073741823"}, false, 13, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "long", "4294966276"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("104815752", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextBoolean", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.9860134", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextBoolean", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.60972536", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextBoolean", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "long", "-9223372036854775808"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "clear", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextBoolean", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "long", "20130104"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextDouble", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.30174863", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "long", "20130104"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextDouble", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.95109534", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "long", "20130139"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextDouble", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.33502054", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "long", "20130139"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "1073741823"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextDouble", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.9338876", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.7003658229714762", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.11109773715010061", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.1522005648932698", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextLong", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", "int", "-1"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "20"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1483383263", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.37431884", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.7774708", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "clear", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int[]", "<sample:1>"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextBoolean", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1644344789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int[]", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1410398631", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int[]", "<empty>"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("678055019", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int[]", "<empty>"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-228646019", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"2147483647"}, false, 12, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<sample:4>"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "20130104"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("744193712", String.valueOf(actual));
 }
}
