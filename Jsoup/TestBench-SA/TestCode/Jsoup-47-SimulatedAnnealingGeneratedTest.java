package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isBaseNamedEntity", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isBaseNamedEntity", new String[]{"java.lang.String"}, new String[]{"TJTCE"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"lt", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("lt", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"lh", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("lh", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1E-5", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1E-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1E", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1E", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"pE-5", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("pE-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1.5f", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1.5f", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"15f", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("15f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"UTF-", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTF-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"UTTF-", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTTF-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"65536", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("65536", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"US-ASCII", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("US-ASCII", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"US-AS\nCII", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("US-AS\nCII", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"US-AS\nCII", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("US-AS\nCII", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"US-AS\nCIITitle", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("US-AS\nCIITitle", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"US-AS\nCIIThttle", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("US-AS\nCIIThttle", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"U-AS\nCIIThttle", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("U-AS\nCIIThttle", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"U--AS\nCIIThttle", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("U--AS\nCIIThttle", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"U--AS\nIIThttle", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("U--AS\nIIThttle", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"-1+5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1+5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"1.12345678true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"1.12345678trveamp"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678trveamp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"1.123 5678trveamp"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.123 5678trveamp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1L", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"\n", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"ascii", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ascii", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"aascii", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aascii", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"p_s.jpU", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("p_s.jpU", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"ps.jpU", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ps.jpU", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"--1", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"--11", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"--11extended", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--11extended", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"65536"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"lt"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("lt", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<sample:2>", "{\"a\":1}", "<sample:7>", "false", "false", "false"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&gt;"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<empty>", "{\"a\":1}xhtml", "<sample:7>", "true", "false", "false"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<empty>", "{\"a\":1}xhtml", "<sample:7>", "true", "true", "false"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<empty>", "{\"a\":1}xhtml", "<sample:5>", "true", "true", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<sample:0>", "-1&amp;", "<sample:2>", "true", "false", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<null>", "-1&amp;", "<sample:4>", "true", "true", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"&l#t;&Elbsp;", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&amp;l#t;&amp;Elbsp;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"&+#t;;&Elbsp;", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&amp;+#t;;&amp;Elbsp;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"'+#t;;&Elbsp;", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'+#t;;&amp;Elbsp;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"0", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"amp"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("&", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"amp"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("&", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"anpTitle"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{".5W"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"-1&amp;"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1&", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"-1&amo;"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1&amo;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"-1&amo;"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1&amo;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"1123456789112356"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1123456789112356", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"1.12395678901234567", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12395678901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"a,b,c", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"a,bc", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,bc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"abc", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"Entitiet"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isBaseNamedEntity", new String[]{"java.lang.String"}, new String[]{"1L"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isBaseNamedEntity", new String[]{"java.lang.String"}, new String[]{"lt"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<sample:0>", "0f044\n", "<sample:3>", "false", "true", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<null>", "1-5", "<sample:0>", "false", "false", "false"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isNamedEntity", new String[]{"java.lang.String"}, new String[]{"1e10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isNamedEntity", new String[]{"java.lang.String"}, new String[]{"1o0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isBaseNamedEntity", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<sample:1>", "uhf1.5d", "<sample:5>", "true", "true", "false"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<sample:1>", "\t", "<sample:7>", "false", "true", "true"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<a>b</a>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&lt;a&gt;b&lt;/a&gt;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"0x123456789", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"---1", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("---1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&#xa0;"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00a0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"'#xa0;"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'#xa0;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"abc", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"bc", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"bc1L", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bc1L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"--1", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"n-1", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("n-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"n-1", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"n-2", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("n-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"n--2", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("n--2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"lt"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("<", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<sample:3>", "UTF-", "<sample:7>", "false", "true", "false"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<sample:3>", "UF-Hello, Wodrld", "<sample:3>", "false", "true", "true"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isNamedEntity", new String[]{"java.lang.String"}, new String[]{"it"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"&lt;", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"Ge", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ge", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"Ge", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ge", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"G", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("G", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"0x1F"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{","}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&#xa0;"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00a0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"base"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("base", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"0utf"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0utf", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"\t"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"\tPT1H"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\tPT1H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isNamedEntity", new String[]{"java.lang.String"}, new String[]{"UF-Hello, Wodrld"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isNamedEntity", new String[]{"java.lang.String"}, new String[]{"amp"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<sample:0>", "<<</>b</a\r>", "<sample:3>", "true", "false", "false"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"0.4f"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.4f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"0.4fa"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.4fa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"\u00e9", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"d\u00e9", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("d\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"t202h-s1-01"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("t202h-s1-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"S202h-s1-01"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("S202h-s1-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"R202h-s1-01null"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("R202h-s1-01null", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"R202h-s1-01nul"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("R202h-s1-01nul", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isNamedEntity", new String[]{"java.lang.String"}, new String[]{"?"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"ascii", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ascii", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"--1", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"-.1", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-.1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"-.1base", "<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-.1base", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"P1E{O", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P1E{O", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"Hello, World", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"-1&am<", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1&amp;am&lt;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"\u00e9ltt:&#xsa0;", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9ltt:&amp;#xsa0;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"\u00e9ltu:&#xsa0;", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9ltu:&amp;#xsa0;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isBaseNamedEntity", new String[]{"java.lang.String"}, new String[]{"quot"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"quot"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isNamedEntity", new String[]{"java.lang.String"}, new String[]{"amp"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"lt"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("<", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<null>", "2020-01-01", "<sample:0>", "false", "true", "true"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<null>", "base", "<sample:3>", "true", "true", "true"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"gt"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"amp"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("&", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isBaseNamedEntity", new String[]{"java.lang.String"}, new String[]{"amp"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"ac"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\u223e", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"ee"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\u2147", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"nu"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\u03bd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<empty>", "\t\t", "<sample:4>", "false", "true", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isBaseNamedEntity", new String[]{"java.lang.String"}, new String[]{"lt"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"lt"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("<", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"mp"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\u2213", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"quot"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"quot"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"ap"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\u2248", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"gt"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"num"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("#", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"mu"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\u03bc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"quot"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isNamedEntity", new String[]{"java.lang.String"}, new String[]{"gt"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"lt"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("<", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"gt"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"gt"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"it"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\u2062", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"ll"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\u226a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"amp"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("&", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"ii"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\u2148", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"ll"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\u226a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"ii"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\u2148", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"ap"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\u2248", String.valueOf(actual));
 }
}
