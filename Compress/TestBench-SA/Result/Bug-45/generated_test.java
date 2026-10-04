package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2097151", "<sample:1>", "1048575", "-2"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2101247", "<sample:0>", "253919", "-2"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2101172", "<sample:0>", "507948", "-38"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "6", "-2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"7", "<sample:0>", "1", "-25"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-24", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2097152", "1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:0>", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"i", "<sample:2>", "0", "7", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-9223372036854775808", "<sample:1>", "-6", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-1", "<sample:2>", "-2", "3"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-1", "<sample:0>", "507948", "8"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-2147483646", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8589934592", "<sample:2>", "0", "-25"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"7", "<sample:1>", "-3", "6"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:2>", "6", "-3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "2"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "2"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-4202344", "<sample:2>", "-6", "9"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:2>", "0", "3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"3", "<sample:2>", "0", "3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2097150", "<null>", "254", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "3", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2097151", "<empty>", "2097150", "2"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2101172", "<null>", "507948", "-42"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-66058307", "<sample:2>", "253984", "13"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"3", "<sample:3>", "-60", "-1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:6>", "89"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"{NUM}1.25", "<null>", "-2097145", "-16384", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"[1,2]", "<sample:1>", "-536870911", "8"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"[1,2]", "<null>", "-536870911", "8"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"0xFFFFFFFF", "<sample:0>", "-2147483622", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-6", "-2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "-2147483648"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("132", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<null>", "1073741823"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"Length ", "<sample:2>", "254", "-2", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<null>", "-16", "-1073217594", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<null>", "-2147483648", "2147483647", "<sample:7>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"17179869440", "<sample:0>", "254", "54"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "254", "-2097150"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2097151", "<sample:2>", "255", "-2"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<null>", "507948", "2097152", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:1>", "-507948", "1048585", "<sample:8>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-9223372036854775808", "<sample:0>", "8", "253984"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-13", "-256"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "52", "256"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"256", "<null>", "507948", "10"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"256", "<empty>", "-507948", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<empty>", "-507948", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"66058307", "<null>", "2097150", "-507948"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:0>", "-38", "-25", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8", "<sample:0>", "-1", "8"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-72057594037927928", "<sample:0>", "2147483647", "-8"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"ntll", "<sample:0>", "253919", "-2147483648", "<sample:6>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"", "<sample:0>", "2147483647", "-52", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:0>", "1073741823", "-25", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"4294967312", "<sample:2>", "-33554703", "253984"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<empty>", "35", "253929", "<sample:4>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-4202344", "<sample:2>", "-38", "254"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("132", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"256", "<sample:1>", "-536870911", "1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"267", "<null>", "-536870911", "1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"267", "<null>", "-536870911", "-1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"5", "<null>", "10", "72"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"5", "<null>", "10", "-72"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"5", "<sample:1>", "2147483647", "36"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "255", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-8", "2147482547"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-2", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-253984", "253919"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2147483648", "-4"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8589934590", "<sample:2>", "-2097152", "-2147352575"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("132", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:1>", "-2147483648", "2147483647", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:1>", "-2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-141", "<sample:1>", "-2147483643", "41"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<null>", "-2147483647", "3", "<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-38", "-6"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "7", "7"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "3", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8", "<sample:1>", "2", "2097150"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8", "<sample:1>", "2", "-2097150"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<null>", "-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2114454511", "<sample:0>", "126856", "-262157"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2114454511", "<sample:1>", "2147483647", "-2"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-4202344", "<sample:0>", "-536870911", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"123456789012345678901234567890", "<sample:1>", "-2097150", "-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("132", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:1>", "-2097150"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"", "<null>", "2097150", "255"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2", "<sample:1>", "-38", "13"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"{NUL}", "<null>", "7", "0", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"{NUM}1.25", "<sample:1>", "-2097145", "-16384", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-1", "<null>", "507948", "254"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"\u00e9", "<sample:2>", "2", "2", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"\u00e8", "<sample:2>", "2", "-2147483647", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483645", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-6", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"1", "<sample:1>", "-2", "6"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:2>", "2097151", "13", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-66058307", "<sample:0>", "2", "-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2097125", "<null>", "-2097151", "510"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<null>", "8", "-2097150", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-1", "<empty>", "13", "-38"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"9223372036854775807", "<null>", "256", "2097150"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2097151", "<empty>", "255", "2"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"1048583", "<empty>", "8", "4"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "8", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<null>", "0", "2097152", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"256", "<null>", "507948", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"i", "<sample:2>", "0", "-52", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-52", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "253984", "3"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "253919", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2097151", "<null>", "8", "256"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8589934602", "<sample:1>", "-2097152", "-536870911"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-66058307", "<sample:1>", "507948", "6"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-33", "25"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2", "<empty>", "-1073741809", "507880"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-288230376151711488", "<sample:1>", "2129920", "-1073741823"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"9223372036854775807", "<sample:1>", "-38", "-507948"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-132116742", "<sample:5>", "2147483647", "-2147483648"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"275144240193", "<null>", "2097130", "23"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2097152", "-2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-4194184", "-2"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-1", "<sample:2>", "8", "0"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "1073741811", "507948"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2101172", "<empty>", "-65", "2147483606"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"0", "<sample:1>", "-507948", "9", "<sample:6>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"a,b,c", "<sample:1>", "0", "1", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"a,b,c", "<null>", "0", "1", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"a,b,c", "<sample:0>", "0", "1", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"b,b-c", "<sample:3>", "0", "-26", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-26", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:2>", "1", "1", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"70368744177663", "<sample:0>", "2097150", "-129"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "253919", "256"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2097151", "<sample:3>", "3", "2013265920"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2097012", "<null>", "8253", "-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2097012", "<null>", "8253", "-2147483622"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"HlkB- :orPlc", "<sample:2>", "3", "-9"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"HlkB- :orPlc", "<sample:2>", "3", "-4"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-576460769484341187", "<null>", "536870947", "254"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2097150", "<null>", "-2097150", "-2147483648"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"0x1F", "<null>", "2097151", "253974"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"254", "<null>", "0", "2097150"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-3", "7"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"281474976710402", "<empty>", "-4046", "-2146435072"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2097151", "<sample:0>", "2", "-2146435072"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2147483648", "536870926"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "10", "-2147483648"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2", "1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "1073741848", "1073807342"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2117556", "<sample:2>", "104", "-1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:2>", "0", "-507948", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-507948", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"8.0", "<sample:1>", "0", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2", "<sample:0>", "-6", "8"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-9222809086901354524", "<null>", "-1966080", "255051"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"true", "<null>", "2147483647", "26"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "255", "254"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<null>", "-2097150"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1", "<sample:2>", "3", "-76"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-73", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-9223372036854775808", "<null>", "-48", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-9223372036854775808", "<sample:1>", "-48", "-2146435072"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1", "<sample:1>", "0", "-38"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-38", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2147483647", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "2"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "2"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "1"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-35253095769179", "<null>", "-2147483648", "8"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<null>", "253984"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:1>", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"u23456789012345678901234567890", "<sample:2>", "0", "-2097152", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2097152", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"7", "<sample:2>", "1", "2", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-6", "-2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "2"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "254", "7"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"12590952", "<null>", "-2147483640", "254005"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1.22345678", "<sample:2>", "2", "-6"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1.22345678", "<sample:1>", "2", "-13"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1.22345678", "<sample:1>", "2", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"0xFFFFFFFF", "<sample:2>", "1", "-4047", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4046", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2101247", "<null>", "255", "3"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1e", "<sample:2>", "2", "-7"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1e", "<sample:2>", "2", "-18"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1E-5", "<sample:4>", "2", "-36"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-34", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"a", "<sample:1>", "0", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"a", "<sample:1>", "0", "-23"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-23", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "0"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "-2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"2.1e", "<sample:1>", "0", "-512"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-512", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "-2359310"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "253919"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"\u00e8", "<sample:1>", "0", "-2146435072"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2146435072", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"\u00e9", "<sample:4>", "2", "-2146435072"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2146435070", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"2147483648", "<sample:0>", "0", "-6", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:2>", "0", "3", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:0>", "0", "1"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:0>", "0", "1"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"20", "<sample:1>", "0", "-2097124"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2097124", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"20", "<sample:0>", "0", "-2096612"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2096612", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"[1,2]", "<sample:2>", "1", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"v1,2]", "<sample:1>", "0", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"0xFFFGFFFF", "<sample:4>", "0", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "507973"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-4194282", "<sample:1>", "0", "-2147450880"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147450880", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "65530"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{" mus: be atleast 21", "<sample:1>", "1", "-1073741718"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741717", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-4202344", "<sample:2>", "2", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"nuxll", "<sample:2>", "2", "-2097151"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2097149", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:1>", "3", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"\u00e9", "<sample:2>", "0", "-13", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{" i '", "<sample:1>", "0", "-1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "507968"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "254"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2", "<sample:2>", "2", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "1", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8589934602", "<sample:1>", "1", "-268435416"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-268435415", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:2>", "1", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"http://{example.com/a?b=c", "<sample:2>", "0", "-2147483647", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-541165879296", "<sample:1>", "0", "-2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:2>", "3", "-1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"1/12345678", "<sample:2>", "0", "-1", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"Length ", "<sample:2>", "0", "-3", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"Length ", "<sample:2>", "0", "-536870911", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-536870911", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"i", "<sample:1>", "0", "-262220"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-262220", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"i", "<sample:1>", "0", "-262189"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-262189", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"f", "<sample:1>", "1", "-2351643", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2351642", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"[1,2]", "<sample:1>", "1", "-536870911", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-536870910", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"[1,2]", "<sample:1>", "0", "-536870911", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-536870911", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"123456789012345678901234567890", "<sample:1>", "1", "-2", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"17179869262", "<sample:1>", "1", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:2>", "2", "1", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:2>", "1", "1", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:2>", "1", "1", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"-1", "<sample:1>", "1", "-2097152", "<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2097151", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-1125891316908032", "<sample:2>", "0", "-16"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2101247", "<sample:0>", "0", "-1073725440"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073725440", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2101247", "<sample:0>", "0", "-1073725457"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073725457", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-536862489", "<sample:0>", "0", "-1073741824"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741824", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:3>", "0", "-254063", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-254063", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<a1b</a1.12345678", "<sample:6>", "0", "-2146435072", "<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2146435072", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<a1b</a1.12345678", "<sample:8>", "1", "-2146435072", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2146435071", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<a1b</a1.12345678", "<sample:8>", "1", "-2147483648", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<a1b</a1.12345678", "<sample:8>", "2", "-2147483648", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:2>", "1", "2"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:1>", "1", "1", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "2"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "2", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\006", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-4202344", "<sample:1>", "0", "-507948"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-507948", String.valueOf(actual));
 }
}
