package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"a b"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"aA b"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aA b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"#b"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("#b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"a bull"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a bull", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"a buull"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a buull", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TITLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"T0ITLE"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T0ITLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{" "}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"apos"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("apos", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "1.5d"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"a"}, false, 4, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:0>", "12:30:45"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "iexcl"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "iexcl"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<empty>", ""}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "\t", "2147483647"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<empty>", ""}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "65536"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "\t", "2147483647"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", ""}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:2>"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "2047483648", "2147483647"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:2>", ""}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:0>"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "2047483648", "2147483647"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"163"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "163", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("163", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"063"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "163", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("063", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntity", new String[]{"java.lang.String", "int"}, new String[]{"gt", "10"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:3>", "1.25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"0x123456789162"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:3>", "1.25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789162", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"0x1"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:3>", "1.25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:3>", "1.25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Title", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"Tisle"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:3>", "1.25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Tisle", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<null>", "\u00e9"}, {"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:3>", "1.25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Title", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 1, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:0>", "\u00e9"}, {"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:3>", "1.25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Title", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"Fitle"}, false, 1, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:1>", "\u00e9"}, {"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:1>", "1.25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Fitle", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"Sitle"}, false, 1, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:1>", "\u00e9"}, {"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:1>", "1.25"}, {"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Sitle", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"Sitm"}, false, 1, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:1>", "\u00e9"}, {"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:1>", "1.25"}, {"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Sitm", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "2020-01-01"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "65534"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<empty>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:2>", "12:30:45"}, {"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:1>", "2260"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:0>"}, false, 11, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:2>", "12:30:45"}, {"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:1>", "2260"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<null>"}, false, 11, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"0"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"-48"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"-1"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "a b"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "PT1H", "65536"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "a", "65535"}, {"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<empty>"}, {"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:2>", "iexcl"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", "1E-5"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "0", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "0", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", "0x123456789"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<empty>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntity", new String[]{"java.lang.String", "int"}, new String[]{"", "-1"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "fillWithHtml40Entities", new String[]{"org.apache.commons.lang.Entities"}, new String[]{"<sample:3>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"a 0-01.123356780023456"}, false, 4, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:1>", "-1"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "+1", "65535"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", "1.1234567"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "-1"}, {"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "1L"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "0xFFFFFFFF"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "fillWithHtml40Entities", new String[]{"org.apache.commons.lang.Entities"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "fillWithHtml40Entities", new String[]{"org.apache.commons.lang.Entities"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<empty>"}, false, 12, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "-1"}, {"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<empty>", "1.55f"}, {"org.apache.commons.lang.Entities", "unescape", "java.lang.String", ".-1"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:2>"}, false, 12, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "1048575"}, {"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<empty>", "1.55f"}, {"org.apache.commons.lang.Entities", "unescape", "java.lang.String", ".-a"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntity", new String[]{"java.lang.String", "int"}, new String[]{" ", "32790"}, false, 13, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "a b"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"abc"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"a"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "&#"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<empty>", "nbsp"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"-28"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<empty>", "nbsp"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "fillWithHtml40Entities", new String[]{"org.apache.commons.lang.Entities"}, new String[]{"<sample:14>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:2>", "1.5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:2>", "1.5"}, {"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"7"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "2020-02-30T25:61:61", "0"}, {"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:3>", "1.25"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "2020-01f"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"71.5"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "2020-02-30T25:61:61", "0"}, {"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:3>", "1.25"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "2020-01f"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("71.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "-0./"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "0"}, {"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:0>"}, {"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:4>", ".5"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"iexcl"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "1.12345678", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("iexcl", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"-10u.x1F"}, false, 1, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "o1.5"}, {"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:2>", "null"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-10u.x1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<empty>", "1F-50xFFFFFFFF"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<empty>", "1F-50xFFFFFFFF"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"65536"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "1.12345678901234567", "-1"}, {"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<null>"}, false, 10, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "32767"}, {"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<empty>", "1.5d"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&A"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&A", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"%A"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("%A", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "fillWithHtml40Entities", new String[]{"org.apache.commons.lang.Entities"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "lt"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"xFDFFFF"}, false, 6, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:1>", "1e10"}, {"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("xFDFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"xFEFFFF"}, false, 3, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:1>", "1e10"}, {"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("xFEFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:1>", "1e10"}, {"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"/&EFFGFFF009&#,"}, false, 6, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "131070"}, {"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "123456789012345678901234567890"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "11"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/&EFFGFFF009&#,", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "1.224m56789012345<712345678901234678901234567890"}, false, 4, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"-\u00e9-1"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "65535"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "a b"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-&#233;-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"632"}, false, 2, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "-65535"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "nbsp1.1234567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("632", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"63"}, false, 2, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "-65535"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "nbsp1.1234567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("63", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"6d"}, false, 2, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "-65535"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "nbsp1.1234567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("6d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:6>", "&#"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "fillWithHtml40Entities", new String[]{"org.apache.commons.lang.Entities"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "T-tle"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "0"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "I"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<empty>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"162"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("162", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"102346{"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("102346{", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{",102346{"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",102346{", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"65535"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("65535", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"65545"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("65545", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"11.25"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:2>", "-1.5"}, {"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "0x1234556789"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "1"}, {"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "0x1234556789"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntity", new String[]{"java.lang.String", "int"}, new String[]{"/1E5", "2147483647"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"iexcl"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("iexcl", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"iexcl160"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("iexcl160", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"jexcl160"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("jexcl160", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"-2147482623"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"b33+"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b33+", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "1.5f"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaa`aaaaaaaaaaaaaaapound"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaa`aaaaaaaaaaaaaaapound", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"lt"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "abc"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "-\u00e9-1", "65534"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("lt", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"llt"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "abc"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "-\u00e9-1", "65534"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("llt", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"ll"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ll", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "1E-5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Title", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "-\u00e9-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>b</a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"<b>b</a>"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "-\u00e9-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<b>b</a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "fillWithHtml40Entities", new String[]{"org.apache.commons.lang.Entities"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "fillWithHtml40Entities", new String[]{"org.apache.commons.lang.Entities"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"65535"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("65535", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"q"}, false, 5, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "25"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("q", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"C23556789012345678901244567890aamp"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "<null>"}, {"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "ac"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("C23556789012345678901244567890aamp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"C23556779012345678901244567890aampcent"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "<null>"}, {"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "ac"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("C23556779012345678901244567890aampcent", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"C23556779001234567890114456789L0aampcent"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "<null>"}, {"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "ab"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("C23556779001234567890114456789L0aampcent", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "/"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:1>", "0xFFFFFFFF"}, {"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:1>"}, {"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:2>", "&#"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "curden260"}, false, 9, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "0x123356789"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "--1", "-1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "/a/b"}, false, 1, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "a"}, {"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "lt"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "*1\"", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*1\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<empty>", "\tnbsp"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "12:30:45160", "9"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "1"}, false, 6, new String[][]{{"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:2>"}, {"org.apache.commons.lang.Entities", "entityName", "int", "65536"}, {"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:0>", "{\"a\":1}"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"it&s\nd9//f7xample.cpl2020-02-30T25:61:61"}, false, 5, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<null>", "gu"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "iexcl", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("it&s&iexcl;d9//f7xample.cpl2020-02-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&gssp;0/exapldscom/a?=c62"}, false, 2, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "2147483481C-51.1234567"}, {"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:2>", "<a>b</a>"}, {"org.apache.commons.lang.Entities", "unescape", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&gssp;0/exapldscom/a?=c62", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"H&&Eq61p3-;r-x04]1/1244567"}, false, 12, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "2E-5"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "60", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H&&Eq61p3-;r-x04]1/1244567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"5%iX&!Gr\t\"!bB\t2oL;r+-F0B]/brI1161.&12123456789012345678901234567890"}, false, 9, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "-55"}, {"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5%iX&!Gr\t\"!bB\t2oL;r+-F0B]/brI1161.&12123456789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:2>", "H&&Eq61p3-;r-x04]1/1244567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "/a/b"}, false, 6, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:6>", "5%iX&!Gr\t\"!bB\t2oL;r+-F0B]/brI1161.&12123456789012345678901234567890"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"0"}, false, 12, new String[][]{{"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"65536"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "5.", "65536"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"160"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "160", "-55"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-55", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"65536"}, false, 15, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "2020-01-01", "65536"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"65536"}, false, 10, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "2020-01-1", "65536"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"0"}, false, 8, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "161", "0"}, {"org.apache.commons.lang.Entities", "entityName", "int", "-2113504"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("161", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "-\u00e9-1", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-\u00e9-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"62"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "62", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 15, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "pound", "2147483647"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "65535"}, {"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("pound", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "2047483648", "2147483647"}, {"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:3>", "/a/b"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2047483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "12:30:45160", "2147483647"}, {"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:3>", "/a/b"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:45160", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "cent", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("cent", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"34"}, false, 4, new String[][]{{"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:0>"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "34", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 11, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "1.51.123456", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.51.123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 11, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "iL"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "1.51.123456", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.51.123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "10"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "\u00e9", "9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"2047483648"}, false, 7, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:6>", "39"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "2047483648", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"\tnbsp"}, false, 7, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "1.1234567890123456 ", "9"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "\tnbsp", "9"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "apos"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "nbsp", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nbsp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"65534"}, false, 7, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "-1.5", "65534"}, {"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<null>", "apos"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"quot"}, false, 1, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "quot", "-2147483646"}, {"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"quot"}, false, 1, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "quot", "-2130706430"}, {"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2130706430", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 15, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:1>", "12:30:45160"}, {"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:3>", "0xFFFFFFFF"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "1E-6", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1E-6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "5%iX&!Gr\t\"!bB\t2oL;r+-F0B]/brI1161.&12123456789012345678901234567890", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5%iX&!Gr\t\"!bB\t2oL;r+-F0B]/brI1161.&12123456789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 10, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "1.12345678", "2147483647"}, {"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:2>", "2147483481C-51.1234567"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "0", "2147483647"}, {"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "a9s"}, {"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<null>", "[1,2]"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 2, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "\n", "-27"}, {"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:1>"}, {"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<null>", "pound"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-27", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&#;"}, false, 1, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:0>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:3>", "&#;"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&#0;"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&##0;"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&##0;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"-86"}, false, 6, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:3>", "&##0;"}, {"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<empty>", "1.1234567"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "39"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:2>", "&#0;"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "&gssp;0/exapldscom/a?=c62"}, {"org.apache.commons.lang.Entities", "entityName", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 10, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "1.12345678901234567", "-2147483588"}, {"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "http://example.com/a?b=c"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "123456789012345678901234567890", "-55"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483588", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&;"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<empty>", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "&;"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "gu"}, {"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "0W"}, {"org.apache.commons.lang.Entities", "entityName", "int", "9"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:3>"}, {"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "1234567890123456789012345678902147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 11, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "2.51.123456", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2.51.123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 11, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "2.51.1233456", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2.51.1233456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"65536"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "-0.0", "65536"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"163"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "163", "-55"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-55", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "1..1234567890123456", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1..1234567890123456", String.valueOf(actual));
 }
}
