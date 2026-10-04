package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "available", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("77", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", "byte[],int,int", "<sample:4>", "10", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "33554431", "-2147483647"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "markSupported", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "markSupported", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "markSupported", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775806"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "available", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "markSupported", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", "byte[],int,int", "<null>", "2147483647", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", "byte[],int,int", "<sample:2>", "-2147483648", "-2080374783"}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", "byte[],int,int", "<sample:0>", "-2147483643", "2147479551"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("105", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"533"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", "byte[],int,int", "<null>", "0", "-2147483648"}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "markSupported", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "available", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"2147483629"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("69", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"-2147483632"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "available", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "markSupported", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", "byte[],int,int", "<sample:0>", "0", "2147483586"}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", "long", "4503603922337788"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "markSupported", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "available", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "available", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("70", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"4611686018427387903"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "available", ""}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("69", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", "byte[],int,int", "<sample:1>", "-2147483648", "-2147483647"}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", "byte[],int,int", "<sample:1>", "2147483647", "-2080378879"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("77", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "markSupported", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", "long", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"-2147483632"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", "byte[],int,int", "<sample:2>", "-2147483648", "-2147483624"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("105", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("67", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"2147483648"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", "byte[],int,int", "<sample:8>", "-1", "-33554431"}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", "byte[],int,int", "<sample:2>", "10", "-536870911"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "markSupported", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("77", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"272730423312"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "available", ""}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", "long", "2147483646"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", "byte[],int,int", "<empty>", "2147483647", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("105", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", "byte[],int,int", "<empty>", "-2147483596", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("187", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-1610612731", "2147483603"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"-1"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", "byte[],int,int", "<sample:2>", "-2147483596", "-1073741823"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", "long", "-63"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("77", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("69", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775743"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "available", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "2147483647", "-2080440319"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "65", "-1073741824"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-2147483648", "134217724"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", "byte[],int,int", "<null>", "-2147483648", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("69", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "available", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", "byte[],int,int", "<sample:0>", "-2147483648", "-1040187391"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("105", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", "byte[],int,int", "<sample:4>", "27", "0"}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "available", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("70", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"4503603922337788"}, false, 1, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "available", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "markSupported", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("199", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"2147483596"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", "long", "-9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", "long", "1025"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("70", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "available", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", "long", "9218868437227405311"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "available", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("199", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", "long", "-1073741816"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("70", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "1", "2147483647"}, false, 3, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "markSupported", ""}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "markSupported", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:7>", "1", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "available", ""}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "available", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("87", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"0"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "1074266111", "-2147483647"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"3"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "available", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "markSupported", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", "byte[],int,int", "<sample:0>", "0", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "0", "0"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "available", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"4503604459208700"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "markSupported", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "available", ""}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", "long", "14"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", "long", "2"}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "available", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "available", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("199", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"-1"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", "byte[],int,int", "<sample:2>", "-112", "-2147483646"}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "available", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"4503603922337788"}, false, 7, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", "byte[],int,int", "<sample:0>", "2147483647", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"2143289343"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"2147483639"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 2, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "available", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "available", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("69", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", "long", "2147483629"}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", "long", "-2147500030"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"31"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", "long", "9223371899415822334"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"262144"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("187", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("67", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"4294967294"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "available", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"8"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "markSupported", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", new String[]{"long"}, new String[]{"15"}, false, 6, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", "byte[],int,int", "<empty>", "2147483647", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", "byte[],int,int", "<sample:2>", "-2080374783", "2147479551"}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", "byte[],int,int", "<null>", "2147483592", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("199", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "available", ""}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("187", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("72", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "42", "1"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", "long", "-1"}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2147483648", "65571"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "0", "1"}, false, 5, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", "long", "4503603922338097"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "1", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "available", ""}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "markSupported", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "2"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "markSupported", ""}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "available", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "0", "0"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "available", ""}, {"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "1", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", "long", "-2147483637"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "2147483647"}, false, 4, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "skip", "long", "562949953421313"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "1"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "markSupported", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.codec.binary.BaseNCodecInputStream", "org.apache.commons.codec.binary.BaseNCodecInputStream", "read", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.codec.binary.BaseNCodecInputStream", "read", "byte[],int,int", "<sample:0>", "2147483647", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
}
