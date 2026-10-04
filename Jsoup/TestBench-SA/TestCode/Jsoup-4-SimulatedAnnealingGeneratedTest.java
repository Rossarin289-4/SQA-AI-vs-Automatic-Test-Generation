package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"ETH", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ETH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"TH", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"\n", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1.5e300", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1.5e300", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"1.12345678901234567", "<sample:0>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"Auml"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Auml", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"Aull"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Aull", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"Atll"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Atll", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"At_ll"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("At_ll", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"At_lltrue"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("At_lltrue", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"Ecirc"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Ecirc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"Eciq\t"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Eciq\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"Dciq\t"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dciq\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"Dciq"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dciq", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"\u00e9", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&eacute;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"+1", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"+a1", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+a1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"+a1", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+a1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"*a1", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*a1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"*a0", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*a0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{")a0", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(")a0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"ETH", "<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ETH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"5.", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1.5", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"1.51L", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.51L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"ETH", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ETH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"Aacute", "<sample:8>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Aacute", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"Bacute", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Bacute", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"X0F0-02-30T25961:61.5", "<sample:3>", "<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"1.1", "<sample:2>", "<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"/", "<sample:2>", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&sol;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"", "<sample:5>", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"--1", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"Atilde120120", "<empty>", "<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{",", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"4", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{" b", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{" a", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{" a--1", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" a--1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{" a--1", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"115"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("115", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"1.5d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5d", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"1."}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"E`cute"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E`cute", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"E`Bute"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E`Bute", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"E`But"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E`But", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"<>b</a.5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<>b</a.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"<"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"="}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"=="}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("==", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"==Aacute"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("==Aacute", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"==Aa\"c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("==Aa\"c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"==Atc"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("==Atc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"==Atc4"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("==Atc4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"I"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"H"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"&t"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"Egra4e655v35", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Egra4e655v35", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"Egra4d655v35", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Egra4d655v35", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"\u00e9", "<sample:3>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&eacute;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"", "<null>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"i", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"h", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("h", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"ha", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ha", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"hr", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("hr", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "org.jsoup.nodes.Document$OutputSettings"}, new String[]{"hs", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("hs", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"&", "<null>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&amp;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"%", "<sample:1>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&percnt;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"\n", "<empty>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&NewLine;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"\n", "<sample:0>", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&NewLine;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"", "<empty>", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"\t", "<sample:0>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&Tab;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"!", "<empty>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&excl;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"\"", "<empty>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&quot;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"1/12l3456"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/12l3456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"1/12l456"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/12l456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"1/12l356"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/12l356", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"1/12k356"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/12k356", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"1/12k56"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/12k56", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"11/12k5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11/12k5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"11/13k5120120"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11/13k5120120", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"11/135120120"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11/135120120", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"\u00e9", "<empty>", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&eacute;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"\u00ea", "<sample:2>", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&ecirc;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"\u00eb", "<sample:2>", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&euml;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"&", "<sample:2>", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&amp;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"", "<sample:2>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"&#", "<sample:3>", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&amp;&num;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"10120xFFEFFFFE2e10&#base"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("10120xFFEFFFFE2e10&#base", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"410fx:\rxGPP7DP$bFY0xADE2/1&#72020-11-0ALP0x12335678n9Acirc"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("410fx:\rxGPP7DP$bFY0xADE2/1\u1954-11-0ALP0x12335678n9Acirc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"_0/>>&55wYYYOP{{>BGbs+3vNN$bf053xCFE/W0/%%&#1/1COQY,-1grbB .\"Fffcc&#&Aacute"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("_0/>>&55wYYYOP{{>BGbs+3vNN$bf053xCFE/W0/%%\001/1COQY,-1grbB .\"Fffcc&#\u00c1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"&", "<null>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&amp;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"%", "<sample:3>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&percnt;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"\t", "<sample:0>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&Tab;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{">", "<sample:1>", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&gt;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"\"", "<sample:3>", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&quot;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"&", "<sample:1>", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&amp;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"\n", "<sample:2>", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&NewLine;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{".", "<sample:0>", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&period;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"\".", "<sample:1>", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&quot;&period;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"\"\".", "<empty>", "<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&quot;&quot;&period;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "escape", new String[]{"java.lang.String", "java.nio.charset.CharsetEncoder", "org.jsoup.nodes.Entities$EscapeMode"}, new String[]{"\u00e9", "<sample:0>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("&eacute;", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jsoup.nodes.Entities", "org.jsoup.nodes.Entities", "unescape", new String[]{"java.lang.String"}, new String[]{"FgF1U&#xe10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FgF1U\u0e10", String.valueOf(actual));
 }
}
