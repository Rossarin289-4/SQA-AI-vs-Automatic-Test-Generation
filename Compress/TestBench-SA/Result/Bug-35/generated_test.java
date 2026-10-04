package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2147483648", "<empty>", "0", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-132120577", "-43"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"<a>b</a>", "<sample:2>", "3", "-2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"3", "<sample:1>", "2", "-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"", "<sample:2>", "1", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"144115188080181182", "<empty>", "1", "8"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"281473902968831", "<null>", "2147483647", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "2"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "-9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "2147483646"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"3", "<sample:2>", "-1", "3"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "1", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"7", "<sample:5>", "0", "3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "514"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "3"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-16", "<sample:5>", "0", "3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"6", "<sample:2>", "0", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:2>", "2147483647", "-2147483644"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2097151", "<sample:2>", "-2147483648", "2097151"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2097151", "<sample:2>", "-1073741824", "-132120577"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "7", "256"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "524354", "536870941"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "514", "1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"6", "<sample:1>", "2", "-1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"6", "<sample:0>", "2097151", "-9"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8589934591", "<sample:0>", "3", "8"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-4294967295", "<sample:0>", "-49", "-16371"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "10", "254"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-2038", "-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:0>", "65578", "-43", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:2>", "1048563", "15", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"1", "<sample:0>", "-1073741824", "1073741823"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:4>", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"144115188075855823", "<sample:0>", "-9", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"144115188075855799", "<empty>", "-9", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"\u00e9", "<sample:0>", "-1073741824", "-1073741824", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"\u00e9", "<sample:0>", "-1073741824", "-1073741824", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-9223336852482686976", "<empty>", "1", "-1"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8589934575", "<null>", "-1073741824", "-2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<null>", "<empty>", "1", "-1073741824", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"1.12345678", "<empty>", "1", "-1073741824", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "3", "-2147483646"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "2147483613", "2097128"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "2147483613", "-534773784"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<null>", "-2147483647", "10", "<sample:7>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"At offset ", "<sample:1>", "-20", "-524312", "<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "8"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8589934529", "<sample:1>", "2147483647", "-43"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-4611686018427387904", "<sample:1>", "45", "-2097152"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-4611686018427392256", "<sample:2>", "2097152", "-524288"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-4611686018427392256", "<sample:2>", "2097152", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-4611686018427392243", "<null>", "1048576", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"128", "<sample:1>", "34", "-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:1>", "2"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "3", "2147221504"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2097150", "<sample:2>", "-132120606", "7"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:2>", "1", "254", "<sample:6>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:2>", "1", "-1073741570", "<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("132", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "1073741802", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:2>", "10", "-1073741824", "<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<null>", "524288"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"255", "<sample:3>", "2", "-536870912"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"255+1", "<sample:1>", "2", "-536870912"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-536870910", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"25+1", "<sample:1>", "1", "-536870912"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-536870911", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"25+1", "<sample:1>", "0", "-536870912"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-536870912", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"t5+1", "<empty>", "0", "-536870904"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-536870904", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<empty>", "32"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("132", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-27", "256"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-38", "<sample:0>", "7", "1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"vE", "<sample:1>", "-7", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-43", "255"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"\t0x123456789", "<sample:1>", "1", "-4", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2147483648", "512"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2147483593", "-2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2", "<sample:2>", "2097151", "3"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"6", "<sample:1>", "255", "2"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("132", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "0", "256"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<empty>", "0", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2147483648", "<empty>", "0", "-20"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2147483648", "<empty>", "0", "-9"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"9223372036854775807", "<sample:1>", "-524312", "-9"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<empty>", "7", "-20", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"-1.5", "<sample:0>", "2097152", "-20"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"-1.5", "<sample:0>", "2097152", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"3", "<sample:0>", "-2", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<null>", "256"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-450", "-1074790400"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-132120577", "7"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "2097150"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "2097152", "-132120577"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"<a>b</a>", "<null>", "3", "-2"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"<a>b</a/>", "<sample:2>", "1", "-2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"6", "<sample:0>", "2097151", "-9"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"' len=", "<sample:1>", "-2147483648", "2097151", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"' l1n=1.5f", "<null>", "1073741799", "-1835007", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"1", "<sample:1>", "-2147483646", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-44", "<sample:1>", "-2147483646", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"7", "<empty>", "254", "-524312"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-44", "<sample:1>", "-2147483646", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"3", "<null>", "2147483647", "7"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"3", "<sample:0>", "2147483647", "7"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"7", "<null>", "254", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"35", "<null>", "308", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"1", "<null>", "0", "4"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:2>", "-9", "254", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-2147483646", "254"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2", "2147483617"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<null>", "-43", "2", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8589934590", "<null>", "-2147483648", "254"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2", "<null>", "3", "-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"", "<sample:3>", "1", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("24", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"null", "<sample:1>", "0", "-35", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-35", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "32"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"209151", "<sample:2>", "3", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"At offset ", "<sample:2>", "1", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "1", "-2"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "8", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-1073741824", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"144115188080181182", "<null>", "-20", "2097150"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"3145710", "<sample:2>", "2097276", "32"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("132", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"At offset ", "<null>", "8", "-524312"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-12", "<sample:2>", "-127", "-32"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"17179869180", "<sample:5>", "-61", "-43"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"TITLE", "<sample:3>", "2097150", "2097151"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"' len=", "<sample:0>", "0", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2", "<sample:1>", "254", "2097151"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<null>", "-2147483635", "21"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-22", "<sample:0>", "32", "-8"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<null>", "-2147483639", "1", "<sample:6>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "33", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<null>", "2147483647", "-2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1", "<sample:2>", "3", "-1073741824"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741821", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1", "<sample:2>", "3", "-1073741794"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741791", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-128", "<sample:1>", "8388606", "-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-48", "<null>", "60", "3"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-48", "<sample:2>", "60", "3"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2097151", "<sample:1>", "-524312", "8"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-9223372036854775808", "<sample:3>", "0", "2"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"1.12345678901234567", "<sample:1>", "0", "-43", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-43", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"null", "<sample:0>", "1", "-20"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-19", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8589934591", "<null>", "-3982", "1048575"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"17179869182", "<empty>", "-3982", "-9"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"1.5e300", "<empty>", "-1073741824", "-2", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-33", "<sample:0>", "2097152", "-39"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "2147483647", "-2"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8", "<sample:2>", "-2147483648", "-134217722"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"i", "<sample:0>", "0", "-2147483648", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-524276", "524288"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"iy&", "<sample:2>", "0", "-506", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-506", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2", "<null>", "514", "2097150"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"\t", "<sample:1>", "0", "-9"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"\t", "<sample:1>", "0", "-18"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-18", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"Hello, World", "<sample:0>", "0", "-4194048"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4194048", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "6", "2097152"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1.5e3.0I", "<null>", "-1073741888", "127"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<null>", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:0>", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"13", "<sample:2>", "-1572863", "7"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"0", "<sample:0>", "0", "-2147483646", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2", "<null>", "2097150", "-2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2", "<null>", "2097150", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:1>", "-2147483646", "255", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-554050781228", "<null>", "-21", "1073741783"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "-41", "-20"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"5n99345911", "<sample:1>", "0", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"512", "<null>", "-1", "-2147483648"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "-9"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "0", "-22"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1EE-5-1.N.5123456789011345678901234567890", "<null>", "2147483597", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "2"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<null>", "-262156"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:0>", "0", "1", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:0>", "0", "1", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<null>", "46", "3", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2097151", "<null>", "-66060222", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "536870878", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1.5", "<sample:1>", "0", "-38"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-38", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2", "<null>", "-2147483648", "2097216"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"-1.5", "<sample:2>", "1", "-2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"1.12", "<sample:2>", "2", "-2147483648", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-1", "<null>", "10", "7"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"At offset ", "<sample:2>", "2", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2", "-1073741824"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"1L", "<sample:2>", "1", "0", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "-536870912"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"{\"a\":11}", "<sample:2>", "0", "-33", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-33", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"{\"a\":11}", "<sample:2>", "0", "-8", "<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"{\"a\":1", "<sample:2>", "0", "0", "<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"{\"a\":1", "<sample:1>", "0", "-56", "<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-56", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"7", "<sample:1>", "0", "-2147483646", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:5>", "2", "2"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"At offset ", "<sample:1>", "0", "-1", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-32", "<sample:1>", "57", "-56"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "-512"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"0", "<sample:5>", "1", "-2147483648", "<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"-0.0", "<sample:4>", "1", "-2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "14"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"17>/5", "<sample:2>", "1", "-2147483641"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483640", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"0xFFFFFF9F", "<sample:1>", "1", "-12"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"0xFFFFFF9H", "<sample:2>", "1", "-3"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"0xFFFFFF9H", "<sample:0>", "1", "-6"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:2>", "2097152", "-2097151"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"`bbb", "<sample:5>", "1", "-82", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-81", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"`bbb", "<sample:5>", "1", "-108", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-107", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "-2147483646"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("256", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "-2147483596"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"HHello, Worle", "<sample:0>", "0", "-4194081"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4194081", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"HHello, Worle", "<sample:5>", "0", "-20971297"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-20971297", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{" byte field.", "<sample:0>", "0", "-132120577", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-132120577", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{" byte field.", "<sample:0>", "0", "-132120577", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-132120577", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{", ", "<sample:0>", "0", "-264241154", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-264241154", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "3"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"1.5e300", "<sample:5>", "2", "1", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"true", "<sample:5>", "2", "-1073741824", "<sample:9>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741822", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "2", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\006", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "-20"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "1", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:2>", "0", "2", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "8"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"b1.12234567", "<sample:2>", "1", "-4", "<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-16", "<sample:5>", "1", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-48", "<sample:5>", "2", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:0>", "0", "1", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:5>", "1", "2", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2", "<sample:5>", "2", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"7", "<sample:5>", "0", "2"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "3"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "0", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:7>", "0", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\006", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"/a/b", "<sample:2>", "1", "-2", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-32", "<sample:1>", "1", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "8"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "0", "2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\004\005", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:2>", "2097152", "-2097151"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:3>", "0", "1", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"3", "<sample:2>", "0", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:5>", "0", "3", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:5>", "2147483647", "-2147483644"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:5>", "2147483647", "-2147483644"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-44", "<sample:5>", "1", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "2", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\006", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:0>", "0", "1", "<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
}
