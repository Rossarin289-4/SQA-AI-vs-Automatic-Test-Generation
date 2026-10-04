package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", ""}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "1XC5"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", "mbsp"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "0x1234567891.1234567890123456lt"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"161"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "-131072"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("161", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"32767"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntity", new String[]{"java.lang.String", "int"}, new String[]{"-1.", "-17"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<null>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", "abc"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 3, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:3>", "iexclgt"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "iexclgt"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "fillWithHtml40Entities", new String[]{"org.apache.commons.lang.Entities"}, new String[]{"<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "fillWithHtml40Entities", new String[]{"org.apache.commons.lang.Entities"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"nbso8"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:4>", "msp"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nbso8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:3>", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"cemt"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "16"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("cemt", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"PT1.H"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT1.H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"I"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "6535"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"htp:"}, false, 6, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "nbp"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("htp:", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<empty>", "+2"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntity", new String[]{"java.lang.String", "int"}, new String[]{"1.5", "37"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:3>", "00x[1F"}, {"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"21.5010"}, false, 7, new String[][]{{"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:2>"}, {"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "amp"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21.5010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "Title"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"F3163"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:2>", "mul:"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("F3163", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 7, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "[1,2]"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "fillWithHtml40Entities", new String[]{"org.apache.commons.lang.Entities"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"3-1.o"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3-1.o", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"&#pound"}, false, 1, new String[][]{{"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#pound", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"-10"}, false, 4, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "gEt", "-46"}, {"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:2>", "+"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"quot0.1"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("quot0.1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "Titl_e"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:2>", "null"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "065535"}, false, 4, new String[][]{{"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntity", new String[]{"java.lang.String", "int"}, new String[]{"1514", "2147483647"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"12345678901234567891234567890"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:1>", "ab6c"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12345678901234567891234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "-2147483648"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<empty>", "#"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "ltPT1H"}, false, 6, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "{\"a\":1}"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"0.1"}, false, 6, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"214748364834"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "|\"a\":8}"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("214748364834", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:2>", "163"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"-0.00.1"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "1e30"}, {"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "nasp"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.00.1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&$"}, false, 7, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:0>", "E-X"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"65533"}, false, 6, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "2147483647"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{".52147483648.5"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:2>", "1-0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"-23"}, false, 5, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:0>", "nbsp"}, {"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "[1,1]"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"22147583648"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("22147583648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", ".5d"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 3, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "131074"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"1XC5"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1XC5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"d "}, false, 3, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:2>", "c0xFFFFFFF"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"0y123456789"}, false, 7, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0y123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", "1"}, false, 3, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "-33554449"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"-2"}, false, 5, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "1XCc5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:1>", "&\t"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:1>", "1.123456789012345670x1F"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "fillWithHtml40Entities", new String[]{"org.apache.commons.lang.Entities"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntity", new String[]{"java.lang.String", "int"}, new String[]{"2020-01-01", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "010"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"11"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"56553"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("56553", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"centamp"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("centamp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "iexc"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "65536"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "fillWithHtml40Entities", new String[]{"org.apache.commons.lang.Entities"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"mp"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("mp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:3>", "\u00e9\u00e9"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:5>", "-1"}, {"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:3>", "60"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=cgt"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a?b=cgt", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "1e\r0"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"true63"}, false, 2, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "h"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "5", "65593"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true63", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"a,b,cnulll"}, false, 3, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "Hello, Woqld"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,cnulll", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "65518"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"-1."}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:2>", "http://example.com/a?a=c"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"d"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"num#l"}, false, 7, new String[][]{{"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("num#l", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "fillWithHtml40Entities", new String[]{"org.apache.commons.lang.Entities"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"iexclgt162"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("iexclgt162", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:6>", "1-12345678901234567"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "quot"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "fillWithHtml40Entities", new String[]{"org.apache.commons.lang.Entities"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 1, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "HellP, Wor{ld"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"65536"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "1axFFFFFFFF"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("65536", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"gtt"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "3010"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("gtt", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"H"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "9"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "{0"}, false, 1, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<null>", ".5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"0TISLE"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0TISLE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"ceemt"}, false, 2, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", "n+ll"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ceemt", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "0xFFFFFF"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "Title"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "0."}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "0"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"Tile"}, false, 1, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "21"}, {"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Tile", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"-1."}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"0xF"}, false, 7, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:6>", "null"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{".50x123456789"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".50x123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&c"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "1.123456789012344567"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"apos"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("apos", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"170160"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", ":[1,2]&#"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("170160", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"mbsp1.1234567890123456"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("mbsp1.1234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "5//"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "11l.", "32785"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"curren"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "\u00e9"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("curren", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"apot1.12345678901234567"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "i1.25", "10"}, {"org.apache.commons.lang.Entities", "entityName", "int", "32768"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("apot1.12345678901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "PT1Hlt"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"0x1234567891.1234567890123456lt"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1234567891.1234567890123456lt", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"2020-02-30U25:61:61"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30U25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "a b1.25abc"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"0xFFGFF"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFGFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:2>", "cemtW"}, false, 4, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "]iexcl", "65537"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "1WXC5"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"[1,2]34"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "E-Xmm"}, {"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<empty>", "160"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]34", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{".5"}, false, 3, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "ftquot"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "01.12345678901234567", "1"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "iexcl", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("01.12345678901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "-65537"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Title", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"1621.5f"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1621.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "bc161", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bc161", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"173"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("173", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.lang.String", "PT9H"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.lang.String"}, new String[]{"12345678901234567890234567891"}, false, 7, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "-65536"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12345678901234567890234567891", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "1E5"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "+12020-01-0"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "iexcl", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"0.1"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:5>", "1e00"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "0.1", "294888"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("294888", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<null>", "<a>b</a>--1"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "1L"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "65,35", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("65,35", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "\u00e9n", "2147483647"}, {"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<empty>", "abbc"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "addEntities", new String[]{"java.lang.String[][]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "\"+1", "45"}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "1.5d1E-4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "5.X", "2147483647"}, {"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:1>", "a,b,c341.25"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.X", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"16383"}, false, 3, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "Hello, Wnrld160", "16383"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, Wnrld160", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"32767"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "", "32767"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "2020-P01-01Hello, World", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-P01-01Hello, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "pound123456789012345678901234566890", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("pound123456789012345678901234566890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "fillWithHtml40Entities", new String[]{"org.apache.commons.lang.Entities"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", " 5.1.1234567890123456", "2147483647"}, {"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:0>", "1.25"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 5.1.1234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "Pabc", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Pabc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityName", "int", "2147483647"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&;$"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "entityValue", "java.lang.String", ""}, {"org.apache.commons.lang.Entities", "escape", "java.lang.String", "&\t062"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&;$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"-4194294"}, false, 2, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", ".5", "-124"}, {"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "&;$&#"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&&;$"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntities", "java.lang.String[][]", "<sample:2>"}, {"org.apache.commons.lang.Entities", "entityName", "int", "131072"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&&;$", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<empty>", "1234567890"}, false, 1, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "&X;$&\""}, {"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:2>", "-.0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "163Title", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("163Title", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"65536"}, false, 3, new String[][]{{"org.apache.commons.lang.Entities", "escape", "java.io.Writer,java.lang.String", "<sample:2>", "162quot"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "65536", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityValue", new String[]{"java.lang.String"}, new String[]{"`"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:1>", "&&#;$"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "escape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<empty>", "1.262"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", "&&##;$"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:1>", ""}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", ".5lt60", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".5lt60", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.io.Writer,java.lang.String", "<sample:3>", "1.5d163"}, {"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "curren", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("curren", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "entityName", new String[]{"int"}, new String[]{"32767"}, false, 2, new String[][]{{"org.apache.commons.lang.Entities", "addEntity", "java.lang.String,int", "62", "32767"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("62", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.Entities", "org.apache.commons.lang.Entities", "unescape", new String[]{"java.io.Writer", "java.lang.String"}, new String[]{"<sample:0>", ""}, false, 3, new String[][]{{"org.apache.commons.lang.Entities", "unescape", "java.lang.String", ":&&#6;$"}});
  assertNull(actual);
 }
}
