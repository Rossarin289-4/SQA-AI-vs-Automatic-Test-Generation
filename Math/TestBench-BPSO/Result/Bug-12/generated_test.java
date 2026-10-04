package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "clear", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"int[]"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int[]", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "2147483647"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"int"}, new String[]{"40260264"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<empty>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int[]", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.32785296", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"20130137"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22077640", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1557175737", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"long"}, new String[]{"0"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<null>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextBytes", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"-3"}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"int[]"}, new String[]{"<empty>"}, false, 4, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"1073741823"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("595864073", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"76"}, false, 1, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3449", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextBoolean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBoolean", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"int[]"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextLong", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "-8191"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "20130099"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.8677332833051888", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.664337328224679", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1669605896", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "long", "-9223301668093820928"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.5982114", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBoolean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.03894329", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBoolean", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "long", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("572568796", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1644344789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "0"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("704059014", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextBytes", new String[]{"byte[]"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextDouble", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "clear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1607687671", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"2097149"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("293629", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"long"}, new String[]{"-281474976710657"}, false, 7, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextLong", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"20130103"}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("18937450", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"int"}, new String[]{"20130104"}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "80520656"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextFloat", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextBytes", new String[]{"byte[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "clear", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextBytes", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 6, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "2"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "long", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3856314343511684", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int[]", "<sample:0>"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1917320482", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"-51"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6369", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-955755504", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"-4"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6204128576205226", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.34681592316050613", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.37431884", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6688018864706957342", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "clear", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "46"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4187418485540072855", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "clear", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.1522005648932698", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextBytes", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "clear", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6397624583449698485", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.11520004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.11109773715010061", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextDouble", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4771593115935934725", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7652750324048234", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextFloat", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.38285386281043676", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"int[]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextLong", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"int[]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", "int", "2147483647"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6204128576205226", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0559346374543552", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"20130105"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26087592", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int[]", "<sample:3>"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8719164187920916", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int[]", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("95971295", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"long"}, new String[]{"10064028"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "-2147483648"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"long"}, new String[]{"4294967351"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<sample:0>"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"80520528"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("43120", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"10065051"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int[]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8872481", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "long", "4303355903"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8740022661099549", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-955755504", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3847372538906081263", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "-10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4537908940479736207", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "clear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1469029249", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-6309432578514143164", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6538577244938164", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-955755504", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextDouble", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.6150838046684057", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int[]", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1939067812", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBoolean", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "-256"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2139284275", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"-8191"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "20130104"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.36908734729924664", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"20130104"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("18937368", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"1"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.11109773715010061", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-7002146664756674382", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"38"}, false, 4, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextFloat", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.8181693494891873", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotStrictlyPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.664337328224679", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextLong", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.08590702106818382", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"80520528"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "long", "10065052"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("68650349", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "setSeed", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextLong", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextBoolean", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-955755504", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int[]", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6904965970023193840", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"-10"}, false, 4, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "clear", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2759705", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "next", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1669605896", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.1522005648932698", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"40260264"}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16967114", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4104938631007652395", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-6309432578514143164", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"26"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextDouble", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-3482371512546103119", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"507906"}, false, 4, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int[]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("118874", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "long", "-34359738370"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0846840393794368", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextBoolean", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "long", "-16777216"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6579649694838781", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"1073741823"}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("822172394", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.65796494", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.38285375", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextLong", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextDouble", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("893216615", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.11109773715010061", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6397624583449698485", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBoolean", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1630314315", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.11109773715010061", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "-524291"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.1628973774580278", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"20130061"}, false, 7, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "long", "576460752303423488"}, {"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "-1073741824"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4192360", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1889285976", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "long", "-20130104"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-829365645", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextLong", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextDouble", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1999719286408551064", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("422667322", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextDouble", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.3743189455355178", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1202840660", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextBytes", new String[]{"byte[]"}, new String[]{"<null>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextBoolean", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1644344789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "next", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.03894329", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextBytes", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "long", "-9223372036854775808"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextGaussian", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.1522005648932698", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.20856643", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextDouble", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "long", "9223372036854775551"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.7807019", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("494780576", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextBytes", "byte[]", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-810802801", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextFloat", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.38285375", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextInt", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "38"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-930593634", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2039641975", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextInt", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "setSeed", "int[]", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2072551672", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.random.BitsStreamGenerator", "org.apache.commons.math3.random.ISAACRandom", "nextBytes", new String[]{"byte[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.random.BitsStreamGenerator", "nextFloat", ""}, {"org.apache.commons.math3.random.BitsStreamGenerator", "nextLong", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
