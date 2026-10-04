package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:2>", ""}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:0>"}, {"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:2>", "1.25"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<empty>", "+1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "4."}, false, 7, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<empty>", "2."}, {"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "iexcl"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "&#"}, false, 6, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<empty>", "2."}, {"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "ixcl"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "&#"}, false, 6, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<empty>", "2."}, {"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "\rixcl"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"65534"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"-65534"}, false, 13, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntity", new String[]{"java.lang.String", "int"}, new String[]{"apos", "65536"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", ".5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntity", new String[]{"java.lang.String", "int"}, new String[]{"pond", "65536"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<empty>"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "Tjtle"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:3>", "1e10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:3>", "38"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:3>", "38"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:3>", "D"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "5.", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:3>", "D"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "5.", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<empty>"}, false, 5, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:3>", "D"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "5.", "-2147483648"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"39"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("39", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"391.1234567"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("391.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"392.1234667"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "1.1234567890123456"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("392.1234667", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"&#"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "1.1234567890123456"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"&u"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "0x1F"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&u", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"nulk"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "0x1F"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nulk", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"1Lp"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "ixcl"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1Lp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"1Lp"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "2020-02-30T25:61:61"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1Lp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"51Lp"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "2020-02-30T25:61:61"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("51Lp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:3>", "1.5e300"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", "2020-01-01"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:1>"}, {"org.apache.commons.lang.Entities", "unescape", "java.lang.String", " "}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"65536"}, false, 5, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "gt"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "TITLE"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("65536", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"655361.25"}, false, 13, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "gt"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "TITLE"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("655361.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"34"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "fillWithHtml40Entities", new String[]{"org.apache.commons.lang.Entities"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "fillWithHtml40Entities", new String[]{"org.apache.commons.lang.Entities"}, new String[]{"<sample:7>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"i"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"c"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"s"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("s", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"39"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("39", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"{9"}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"{9"}, false, 12, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"62"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("62", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"2."}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{";"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(";", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"r"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("r", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"rrm"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("rrm", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"esm"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("esm", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntity", new String[]{"java.lang.String", "int"}, new String[]{",2", "43"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "1e10"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "39"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"8x1E1.1234567890123456"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "1.123g4567"}, {"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "161"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8x1E1.1234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"cent"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "1.123g4567"}, {"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "161"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("cent", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "fillWithHtml40Entities", new String[]{"org.apache.commons.lang.Entities"}, new String[]{"<sample:7>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "TITLE"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "12:30:45"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"Hello, Woorld"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "TITLE"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "12:30:45"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, Woorld", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"0xFFFEFFFF"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "TITL"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "12:30:45"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFEFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"32767"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"-65537"}, false, 15, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntity", new String[]{"java.lang.String", "int"}, new String[]{"Ex12r345678965536", "0"}, false, 7, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "1.12345678901234567"}, {"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:1>", "163"}, {"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "6"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "fillWithHtml40Entities", new String[]{"org.apache.commons.lang.Entities"}, new String[]{"<sample:7>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"apns"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("apns", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"apns2020-01-01"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("apns2020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"apnCs2020-01-01"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("apnCs2020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{".2"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{":2"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{":26"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":26", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{":26&#"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":26&#", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{":2:6&r"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":2:6&r", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{":296&r"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":296&r", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&296&r"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&296&r", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&2\n6&r"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&2\n6&r", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "1.25"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<null>"}, {"org.apache.commons.lang.Entities", "entityName", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:1>"}, false, 8, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<empty>"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "[1,2]"}, {"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:1>", "\u00e9"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"amp"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"[p1,2]"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[p1,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"160"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("160", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"1;0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1;0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"f1;0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("f1;0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"f1;02020-02-30T25:61:61"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("f1;02020-02-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"f1;02020-/2-30T25:61:61"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("f1;02020-/2-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"38"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("38", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"lt"}, false, 3, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<empty>", "34"}, {"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "0.1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("lt", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"kt"}, false, 3, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<empty>", "34"}, {"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "0.1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kt", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"ku"}, false, 3, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<empty>", "34"}, {"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "0.1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ku", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"k"}, false, 3, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<empty>", "34"}, {"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "0.1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("k", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "-0.0", "65536"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "fillWithHtml40Entities", new String[]{"org.apache.commons.lang.Entities"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "12:30:45"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "1.5f", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"1.1234"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "1.5f", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"1.1234pound"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "1.5f", "-2147483648"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "a,b,c", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234pound", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"L.1234pound"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "1.5f", "-2147483648"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "a,bd,c", "2147483647"}, {"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("L.1234pound", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"curren"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "1.5f", "-2147483648"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "a,bd,c", "2147483647"}, {"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("curren", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"currem"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "1.5f", "-2147483648"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "a,bd,c", "2147483647"}, {"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("currem", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "I"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "I"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"0"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"i341.5a"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "pound", "2147483647"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "-115"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", "aaaaa`aabaaaaaaD{a/aaaaaaaaaaaaa-1.51.25-0.0"}, false, 1, new String[][]{{"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<null>"}, {"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "1E-5"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "aaaaa`aabaaaaaaD{a/aaaaaaaaaaaaa-1.51.25-0.0"}, false, 13, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "fillWithHtml40Entities", new String[]{"org.apache.commons.lang.Entities"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "aaaaaaaeaaaaaaaaaaaaaaa"}, false, 3, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:0>", "1L"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"1..5"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "65535"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<empty>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntity", new String[]{"java.lang.String", "int"}, new String[]{"35", "10"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "Title", "-2147483648"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"http://yample.com/a?b=c"}, false, 9, new String[][]{{"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<null>"}, {"org.apache.commons.lang.Entities", "entityName", "int", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://yample.com/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "a"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "fillWithHtml40Entities", new String[]{"org.apache.commons.lang.Entities"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "I"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<empty>", "160"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "fillWithHtml40Entities", new String[]{"org.apache.commons.lang.Entities"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:2>", "null"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"amp"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:0>", "12:30:45"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("amp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"amsp"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:1>", "12:30:45"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("amsp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"ams"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ams", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"amb"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("amb", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"a/b"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a/b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "-2147483648"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:1>"}, {"org.apache.commons.lang.Entities", "entityName", "int", "-2147483648"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "4."}, false, 6, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "", "10"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", "iycl"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "Title"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"s1\u00e972"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "4."}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("s1&#233;72", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"Hello, Woqkd2.12345678"}, false, 2, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "", "65535"}, {"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, Woqkd2.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"65537"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "-268369936"}, {"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:3>", "http://example.com/a?b=c"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "0xFFFFFFFF", "65537"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "12345678911234567890123456790"}, false, 9, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "l+s"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"2."}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "2.", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "Title"}, false, 15, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "-1.5"}, {"org.apache.commons.lang.Entities", "entityName", "int", "65535"}, {"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:6>", "0.2"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "010", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"65537"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "2020-02-30T25:61:61", "65537"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "+1", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&+1;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"10"}, false, 13, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "Tjtle", "10"}, {"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "gt"}, {"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Tjtle", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"lt"}, false, 4, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "lt", "10"}, {"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{""}, false, 4, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 10, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "TI_LE"}, {"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "amp"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "1L", "65535"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("65535", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"1"}, false, 10, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "4.", "2147483647"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "0x123456789", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 10, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "4.", "2147483647"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "0x123456789", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"65534"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:0>", "123456789012345678901234567890"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "1.12345678", "65534"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "12:30:45"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "lL", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("lL", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 11, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "12:30"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "\u00e9"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "lL", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("lL", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"32767"}, false, 3, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "-0.0", "32767"}, {"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:2>", "i"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "{\"a\":1}", "2097181"}, {"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"65534"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "--1", "65534"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "1L"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "123456789012345678901234567F90", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123456789012345678901234567F90", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"10"}, false, 1, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<empty>", "&#"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "lt", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("lt", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "0", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "pod", "2147483647"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "4."}, {"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("pod", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "a,b,c", "65534"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("65534", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "4."}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "0xFFFFFFFF", "0"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "i"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:3>"}, {"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:3>", "iexcl"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", ":26&#", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":26&#", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:6>", "62"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "", "65535"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("65535", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:6>", "62"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "", "65590"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("65590", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "Title"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "", "10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "Title"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "", "27"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("27", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "ixcl"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "65536", "0"}, {"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "1E-5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("65536", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "0", "2147483647"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "a,b,c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"65535"}, false, 2, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "", "65535"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"0"}, false, 9, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "65536"}, {"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:3>"}, {"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "pon7"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "&V"}, false, 7, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "2&;"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:2>", "cfBn_"}, false, 11, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:4>", "<a>+b</aH="}, {"org.apache.commons.lang.Entities", "entityName", "int", "65537"}, {"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:6>", "2&&;"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"1\t&&\t;"}, false, 2, new String[][]{{"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:2>"}, {"org.apache.commons.lang.Entities", "entityName", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1\t&&\t;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"16389"}, false, 7, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "2&;&#"}, {"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "ixcl"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{""}, false, 6, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", " ", "65534"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("65534", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", " ", "-65534"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-65534", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "[1,2]"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "<a>+b</aH=", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>+b</aH=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "[1,2]1E-5"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "<a>+b</aH=1", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>+b</aH=1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"9x%&#d[;;d22:30:46"}, false, 5, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "iex"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "65535"}, {"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:2>", "0.1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9x%&#d[;;d22:30:46", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "3&&H", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3&&H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "", "262140"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("262140", String.valueOf(actual));
 }
}
