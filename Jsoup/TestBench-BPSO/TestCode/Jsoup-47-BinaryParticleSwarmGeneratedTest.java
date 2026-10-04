package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"&fuot;", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&fuot;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"123456789012345678901234567890", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123456789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"bas&quot;"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bas\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"UTF-"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"12h::30:45"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12h::30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<null>", "1", "<sample:3>", "true", "true", "false"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<sample:1>", "ascii", "<sample:3>", "false", "true", "true"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"urue"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("urue", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"&fuot;2147483648", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&amp;fuot;2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"extended", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("extended", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isNamedEntity", new String[]{"java.lang.String"}, new String[]{"1.123<5678"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isNamedEntity", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"ascii", "<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ascii", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"22020-02-30T25:61:61", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"utf"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("utf", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"uuf"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("uuf", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"qupt", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("qupt", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"&quot;", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"[1,2]UTF-"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]UTF-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"lF"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isBaseNamedEntity", new String[]{"java.lang.String"}, new String[]{"I.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1.5e3000", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e3000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1.12345772020-01-01", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345772020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"amp"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("&", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isNamedEntity", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c&gt;"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"anp", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("anp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<sample:3>", "&#xa0;&lt;", "<sample:5>", "true", "false", "true"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"-F.5", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-F.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"i", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"US-A8{SCII", "<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("US-A8{SCII", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"&1t;"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<null>", "1.12345678901234567", "<sample:0>", "true", "true", "false"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1.5e300", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"Entities&quot;", "<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Entities&amp;quot;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"-1UTF-", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1UTF-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"<a>b<0a>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>b<0a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{" "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"1.5fHello, World1.5e300"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5fHello, World1.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"2020-01-01", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"S.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("S.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"123456789012345678901234567890", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123456789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"bas&quot;Hello, World"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bas\"Hello, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"12345678901234567890123456790", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12345678901234567890123456790", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"urue", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("urue", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"-0.0", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa12:30:45"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa12:30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"1", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"-0.0", "<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1.123456782020-01-01", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.123456782020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<sample:0>", "+&gt;", "<sample:0>", "false", "false", "true"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"xhhtml"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("xhhtml", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&fuUot;"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&fuUot;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"010", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"US-ASCII", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("US-ASCII", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"1.25llt", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.25llt", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"&lt;", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&amp;lt;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<sample:3>", "0x 1F", "<sample:2>", "true", "false", "true"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isNamedEntity", new String[]{"java.lang.String"}, new String[]{"utf"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"extended"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"&lt;010", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<sample:3>", "a B", "<sample:5>", "true", "true", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<sample:0>", "5", "<null>", "true", "false", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"{\"a#:}", "<sample:10>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a#:}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<sample:0>", "<a>b</a>", "<sample:3>", "true", "false", "false"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"{\"a\":m}", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":m}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isNamedEntity", new String[]{"java.lang.String"}, new String[]{"quot"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&ap;"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u2248", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"a,,c", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"&ht;1.1234567890123456", "<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&amp;ht;1.1234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"0xFFFFFFFF", "<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"<a>b</a>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&lt;a&gt;b&lt;/a&gt;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1.", "<sample:10>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"amp", "<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("amp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<sample:0>", "{\"a\"1}0x123456789", "<sample:10>", "true", "false", "true"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isBaseNamedEntity", new String[]{"java.lang.String"}, new String[]{"UTF-I"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"[1,2]Title", "<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]Title", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"2", "<sample:8>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"+r1null", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+r1null", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isNamedEntity", new String[]{"java.lang.String"}, new String[]{"quot"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"ut", "<sample:8>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ut", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"&#x", "<sample:11>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&amp;#x", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"&#xa0;0xFFFFFFFF", "<sample:9>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&amp;#xa0;0xFFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"12:30:55", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:55", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"\u00e9", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isNamedEntity", new String[]{"java.lang.String"}, new String[]{"amp"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1.1234567890123456", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"1.5300", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<sample:2>", "\r-1", "<sample:11>", "true", "true", "true"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"b.", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"F0.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("F0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&#xb0;"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00b0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}1E-5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}1E-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"/a/b", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a/b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<sample:0>", ": b65536", "<sample:0>", "false", "true", "true"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<null>", "&f>ot;2147483648", "<sample:4>", "false", "true", "true"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isBaseNamedEntity", new String[]{"java.lang.String"}, new String[]{"&anp;"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"D&nbtp;", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("D&nbtp;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"Situe"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Situe", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"a b"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"gt"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"3020-01-01", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"quot"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"1.51.12345678901234567"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.51.12345678901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"12345678901t3456789012345678901.1234567890123456", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12345678901t3456789012345678901.1234567890123456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"utf", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("utf", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isBaseNamedEntity", new String[]{"java.lang.String"}, new String[]{"{\"a\"1}0x123456789"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{".65", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".65", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"2020-01-11", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"-1.5", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"1.1234567", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"amp"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("&", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"\n"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"bas&ruot;-1.5", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("bas&ruot;-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{".51.5e300", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".51.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"0010", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"1.1234567", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"&n>sp;", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&n>sp;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"1.123456789012345671.1234567", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.123456789012345671.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isBaseNamedEntity", new String[]{"java.lang.String"}, new String[]{"amp"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"falbadk", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("falbadk", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"{\"a\":1}", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"1.25"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"{\"a#:}"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a#:}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"ii"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\u2148", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String", "boolean"}, new String[]{"lt", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("lt", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.StringBuilder", "java.lang.String", "org.jsoup.nodes.Document$OutputSettings", "boolean", "boolean", "boolean"}, new String[]{"<sample:3>", "  ", "<sample:2>", "false", "true", "false"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"lt"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("<", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"a"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"base"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("base", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{">"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isNamedEntity", new String[]{"java.lang.String"}, new String[]{"quot"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isBaseNamedEntity", new String[]{"java.lang.String"}, new String[]{"lt"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"quot"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\"", String.valueOf(actual));
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
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isBaseNamedEntity", new String[]{"java.lang.String"}, new String[]{"quot"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"lt"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("<", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"quot"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "isBaseNamedEntity", new String[]{"java.lang.String"}, new String[]{"quot"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"gt"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"amp"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("&", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"mu"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\u03bc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"lt"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("<", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"lt"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("<", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"amp"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("&", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"gt"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"gt"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
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
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"ii"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\u2148", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"ii"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\u2148", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "getCharacterByName", new String[]{"java.lang.String"}, new String[]{"nu"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\u03bd", String.valueOf(actual));
 }
}
