package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"1L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"0L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"0L2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0L2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"[1,2]", "<sample:2>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"[1,2]", "<sample:2>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"", "<sample:1>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"gt", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("gt", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"g", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("g", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"-0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"-0.0-0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"-0.0-0.0true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0-0.0true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"&", "<sample:0>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&amp;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"/a/b", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a/b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"/a0b", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a0b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"/a0b", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a0b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"2020-02-30T25:61:61", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"Pa0b", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Pa0b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"P", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"O", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("O", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"E", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"F", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"FAgrave", "<sample:11>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FAgrave", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"true", "<sample:10>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"11L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"21L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"21_L"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21_L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"65535"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("65535", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"6553v4"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("6553v4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"6553v\u00e94"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("6553v\u00e94", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&&"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&&", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&&quot"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&&quos"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&&quos", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"Hull20220-02-30T5:61:61"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hull20220-02-30T5:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFFCcedil"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFFFFCcedil", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFFCdedil"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFFFFCdedil", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFFgCdedil"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFFFFgCdedil", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"0xFFFFGFFFgCdedil"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFGFFFgCdedil", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"lt"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("lt", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"Hello, World", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"xhtml", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("xhtml", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"xhtmlgt", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("xhtmlgt", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"xht", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("xht", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"Atml1.5d+", "<sample:4>", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"120068"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("120068", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"null", "<sample:8>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"numl", "<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("numl", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&&quot"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&\"", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&&quotextended"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&&quotextended", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&&quos"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&&quos", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&'quos"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&'quos", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"\u00e9", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&eacute;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"\u00e9", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"\u00ea", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&ecirc;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"E", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"Ebase", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ebase", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"Cceeil", "<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Cceeil", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"Cceil", "<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Cceil", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"C", "<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("C", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&#AExig"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&#AExig", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"A", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{".5", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"true", "<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"tue", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("tue", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"amp", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("amp", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"&#", "<null>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&amp;&num;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"e3&H#$W"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("e3&H#$W", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"e3H"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("e3H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"120071"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("120071", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"12071"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12071", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"m12071"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("m12071", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"Fm12071"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Fm12071", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"Fm02071"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Fm02071", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"F02071"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("F02071", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"PT1HH", "<sample:2>", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"i", "<sample:1>", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"", "<sample:1>", "<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"\t", "<sample:2>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&Tab;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"&&", "<sample:2>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&amp;&amp;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"&", "<sample:0>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&amp;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"\"", "<sample:0>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&quot;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"\"", "<sample:0>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&quot;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"&", "<null>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&amp;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"/", "<sample:4>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&sol;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"'", "<sample:0>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&apos;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"\u00e9", "<empty>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&eacute;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"\u00e9", "<empty>", "<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&eacute;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"", "<sample:1>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"\n", "<sample:2>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&NewLine;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"'", "<sample:3>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&apos;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"", "<sample:3>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"29m641.1234567&#1.5f"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("29m641.1234567\001.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"\u00e9", "<sample:0>", "<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&eacute;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{",", "<empty>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&comma;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"&&", "<sample:4>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&amp;&amp;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"<", "<sample:7>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&lt;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{">", "<sample:3>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&gt;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"&&", "<sample:3>", "<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&amp;&amp;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{",", "<sample:3>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&comma;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{",,", "<sample:1>", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&comma;&comma;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"&&", "<empty>", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&amp;&amp;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"\t", "<sample:2>", "<sample:11>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&Tab;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"_@", "<sample:3>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&lowbar;&commat;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"\n", "<null>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&NewLine;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"'&", "<sample:1>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&apos;&amp;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"29m641.1234567&#X1.5s"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("29m641.1234567\001.5s", String.valueOf(actual));
 }
}
