package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "close", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "clearBitCache", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "close", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "close", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "clearBitCache", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"62"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "clearBitCache", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"124"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "clearBitCache", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "clearBitCache", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "clearBitCache", ""}, {"org.apache.commons.compress.utils.BitInputStream", "clearBitCache", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"-2147483648"}, false, 9, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "readBits", "int", "1073741823"}, {"org.apache.commons.compress.utils.BitInputStream", "close", ""}, {"org.apache.commons.compress.utils.BitInputStream", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"10"}, false, 9, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "readBits", "int", "-1073741567"}, {"org.apache.commons.compress.utils.BitInputStream", "close", ""}, {"org.apache.commons.compress.utils.BitInputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"-1073741815"}, false, 14, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "clearBitCache", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"26"}, false, 14, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "clearBitCache", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("34213217", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"13"}, false, 14, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "clearBitCache", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3425", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "close", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "close", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "clearBitCache", ""}, {"org.apache.commons.compress.utils.BitInputStream", "readBits", "int", "124"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"63"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "clearBitCache", ""}, {"org.apache.commons.compress.utils.BitInputStream", "readBits", "int", "124"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "clearBitCache", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"6"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "readBits", "int", "0"}, {"org.apache.commons.compress.utils.BitInputStream", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("33", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"62"}, false, 5, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "readBits", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4356175331212550460", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"2147483647"}, false, 12, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"2"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "clearBitCache", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"41"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "clearBitCache", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"5"}, false, 0, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "clearBitCache", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"31"}, false, 14, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "clearBitCache", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1644825953", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"31"}, false, 14, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "readBits", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("822412976", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"12"}, false, 1, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "readBits", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2657", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"12"}, false, 1, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "readBits", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2657", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"10"}, false, 15, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("353", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"7"}, false, 10, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "close", ""}, {"org.apache.commons.compress.utils.BitInputStream", "clearBitCache", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"7"}, false, 5, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "close", ""}, {"org.apache.commons.compress.utils.BitInputStream", "clearBitCache", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"7"}, false, 2, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "close", ""}, {"org.apache.commons.compress.utils.BitInputStream", "clearBitCache", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "readBits", "int", "10"}, {"org.apache.commons.compress.utils.BitInputStream", "readBits", "int", "63"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"10"}, false, 3, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "readBits", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("353", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"10"}, false, 15, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "close", ""}, {"org.apache.commons.compress.utils.BitInputStream", "readBits", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("688", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "clearBitCache", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "readBits", "int", "0"}, {"org.apache.commons.compress.utils.BitInputStream", "clearBitCache", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"13"}, false, 3, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "clearBitCache", ""}, {"org.apache.commons.compress.utils.BitInputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3425", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"10"}, false, 3, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "clearBitCache", ""}, {"org.apache.commons.compress.utils.BitInputStream", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("353", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"32"}, false, 6, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "close", ""}, {"org.apache.commons.compress.utils.BitInputStream", "readBits", "int", "10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1317574728", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"32"}, false, 6, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("576791163", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"63"}, false, 5, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "close", ""}, {"org.apache.commons.compress.utils.BitInputStream", "clearBitCache", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4356175331212550460", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "readBits", new String[]{"int"}, new String[]{"31"}, false, 7, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "close", ""}, {"org.apache.commons.compress.utils.BitInputStream", "clearBitCache", ""}, {"org.apache.commons.compress.utils.BitInputStream", "clearBitCache", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("153122848", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.utils.BitInputStream", "org.apache.commons.compress.utils.BitInputStream", "close", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.compress.utils.BitInputStream", "readBits", "int", "1048586"}, {"org.apache.commons.compress.utils.BitInputStream", "readBits", "int", "62"}, {"org.apache.commons.compress.utils.BitInputStream", "readBits", "int", "63"}}, 1);
  assertNull(actual);
 }
}
