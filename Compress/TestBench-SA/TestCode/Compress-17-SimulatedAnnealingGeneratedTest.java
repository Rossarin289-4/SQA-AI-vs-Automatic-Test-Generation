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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:2>", "-1", "49", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:0>", "3", "44", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"7", "<sample:1>", "-2147483648", "8"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"7", "<sample:1>", "-2147483648", "4"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"[1,2]", "<sample:1>", "1", "47"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"[1", "<sample:1>", "1", "-47"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-46", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"\\1", "<null>", "1", "-47"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"[1,2]", "<sample:2>", "-2", "255", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "1", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-4", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-4", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"256", "<sample:0>", "-2147483648", "47"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"256", "<sample:3>", "-2147483648", "1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:2>", "61", "2097150", "<sample:2>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:1>", "573", "-40", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<null>", "573", "40", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"-1.5", "<sample:1>", "2097141", "10", "<sample:0>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "7", "-4"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("132", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("24", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"1E-5", "<sample:0>", "49", "10", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"/a/", "<sample:5>", "1146", "255", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"I", "<sample:0>", "0", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"", "<sample:3>", "6", "-9"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{" at offset ", "<null>", "2147483647", "66"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "7", "254"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "-1065355318", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-16", "-2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"256", "<null>", "0", "573"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:0>", "6"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8589934592", "<null>", "-1", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"4294967296", "<sample:0>", "0", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"4294967278", "<null>", "-4", "10"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"4294967278", "<sample:2>", "508", "-47"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-2147483648", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-2147483648", "3"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-2147483648", "-54"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"6", "<sample:1>", "-40", "3"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"12", "<sample:1>", "48", "-1048573"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "8", "254"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"3", "<sample:2>", "2", "10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-4", "3"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-8", "12"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "2097152", "2097152"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-124", "98"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"7", "<sample:2>", "1", "10"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:3>", "8", "-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8", "<sample:0>", "49", "-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8", "<sample:0>", "24", "49"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<null>", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-180", "<sample:0>", "-2147483648", "-573"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-180", "<sample:0>", "-2147483648", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"", "<sample:3>", "0", "48"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"255", "<sample:3>", "49", "-47"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"1048550", "<null>", "10", "-262146"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-137436872756", "<sample:5>", "20", "-524402"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-137436872756", "<sample:5>", "10", "-1048804"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-68718436379", "<sample:4>", "436207682", "-524402"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-68718436379", "<sample:4>", "-436207682", "-524343"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-68718436379", "<sample:4>", "-436207682", "1073741823"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"34359218221", "<sample:6>", "218038305", "-1073741846"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:2>", "-2147483648", "-132", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-49", "<sample:0>", "2147483647", "2097152"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-30", "16"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-30", "-4194288"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"-0.0", "<sample:6>", "-2097133", "263", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8589934654", "<sample:4>", "-1073741824", "256"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2097151", "<sample:1>", "2147483647", "-67108860"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "198"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:2>", "-1048740", "-2147483648", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"1125899906840579", "<sample:6>", "-4510", "-16"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-545259577", "1073741824"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"47", "<sample:0>", "-1073741824", "-4194114"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"32505950", "<sample:5>", "436207682", "2097033"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<null>", "2", "198", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "1", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "8388601", "44"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:1>", "-40"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"", "<sample:1>", "-2147483648", "573"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-9223372036854775791", "<sample:7>", "-1073741766", "-16"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"3", "<sample:2>", "-47", "218038305"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<null>", "127", "218038258", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:3>", "95", "255", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:2>", "95", "-2147483648", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"8589934591", "<sample:2>", "1", "-49", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-48", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "524281", "655415"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "-2147483648", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"4194326", "<sample:8>", "-2147483618", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-4194326", "<sample:8>", "-2147483618", "-2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8589934592", "<null>", "-40", "2097150"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"1125899906840579", "<null>", "-2", "7"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2097150", "<sample:5>", "-2", "3"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-436207682", "1048575"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"\t0x12345I6789", "<sample:0>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-576456354256916514", "<sample:0>", "-8", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-576456354256916514", "<sample:0>", "-8", "-2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:5>", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:8>", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-2147483648", "1073742335"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-17179869440", "<sample:5>", "8", "-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-2", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "0", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"255", "<sample:3>", "2097151", "-436207682"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"255", "<sample:1>", "2097215", "1073741823"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"9223372036854775807", "<null>", "-2097151", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-9007199254740984", "<null>", "2147483647", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2314850208468434936", "<sample:6>", "2097151", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"Hello, World", "<sample:2>", "47", "0"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"281", "<sample:2>", "106", "-255"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"219", "<sample:3>", "573", "-160"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:10>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("132", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:3>", "-1048804"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"48", "<sample:6>", "-1048804", "-2147483593"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8589934592", "<null>", "-524402", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2", "<sample:4>", "2147483647", "0"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"0/5d", "<sample:0>", "2147483646", "-1073741846", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<null>", "7"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"255", "<sample:5>", "1", "-4"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "-40", "2097151"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<null>", "33816600", "2", "<sample:4>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"512", "<null>", "-536870912", "1073741808"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"", "<sample:6>", "0", "-8"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "1048691", "-6"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "1", "198"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-9", "<sample:2>", "2097152", "3"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2097152", "<sample:2>", "6", "0"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "0", "0"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<null>", "2", "-436207682"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2", "<null>", "218038305", "3"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-4510", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"a,b,c", "<sample:5>", "2", "-2147483647", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483645", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"a,b,c", "<sample:5>", "2", "-2147483648", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:6>", "-1073741824"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"256", "<sample:6>", "-436207682", "49"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"9214364837600034815", "<sample:3>", "4161534", "-436207682"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"Length ", "<sample:5>", "2", "-255"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-253", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "verifyCheckSum", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"1", "<sample:2>", "-1", "-1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"123456789012345678901234567890", "<sample:4>", "10", "3", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"123456789012345678901234567890", "<sample:4>", "10", "3", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "298", "23"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{" at offsett ", "<null>", "-13", "-1073741846"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "29", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "-2147483586"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2097152", "<null>", "6", "254"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"1", "<null>", "218038322", "8"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"34359218183", "<null>", "198", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"{i\"a\":1}Au offset ", "<null>", "-65500", "-1073741760"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"48", "<sample:2>", "0", "3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"0x1F", "<sample:4>", "2", "-4510"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4508", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"0x1F", "<sample:4>", "2", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"0x", "<sample:4>", "2", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"0wx", "<sample:4>", "2", "-2147483615"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483613", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "6"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"17179869155", "<null>", "-36", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "7", "128"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"48", "<null>", "-47", "256"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"536872053", "<null>", "302", "128"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:6>", "0", "1", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:1>", "-7", "9"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<null>", "-8519689"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "-2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "-2147483640"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("72057594037927936", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "573"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-29", "<sample:5>", "-2", "3"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"2020-01-01", "<sample:5>", "0", "-3145729", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3145729", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"2020-01-01Value ", "<sample:5>", "0", "-2147483648", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"/", "<sample:5>", "2", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"\t", "<sample:0>", "0", "-1", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<null>", "22"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-2147483646", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"-0.07", "<sample:2>", "1", "-10", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"48", "<sample:0>", "1", "-3"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"48", "<sample:8>", "2", "-3"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-1", "<null>", "-4", "2097150"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2097150", "<null>", "49", "256"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"1", "<sample:2>", "0", "4"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"Ats }ffset+Hell,2 Wosld0x1134567=9", "<sample:8>", "2", "-2147483623"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483621", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"7", "<sample:5>", "0", "-47", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-47", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"af55", "<sample:0>", "0", "-4"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"<a>b7/a>", "<sample:4>", "0", "-573"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-573", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"[1", "<sample:4>", "0", "-127"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"[1", "<sample:5>", "0", "-254"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-254", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "1", "-1048804"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{" in '", "<sample:1>", "0", "-8", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2031616", "<null>", "-42", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1.12345678", "<sample:5>", "0", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "2"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"a,b,c", "<sample:1>", "1", "-1048804", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1048803", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:6>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\005", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"i", "<sample:5>", "3", "-436207682"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-436207679", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"", "<sample:0>", "1", "-1048912"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1048911", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"Lxenngth ", "<sample:0>", "0", "-2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "0", "2"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:7>", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"1d205/", "<sample:2>", "0", "1", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"1d205/", "<sample:2>", "0", "2", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"{\"a\":1}", "<sample:6>", "0", "0", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"1/5e300", "<sample:3>", "0", "-16097", "<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-16097", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"http://example.com/a?b=c", "<sample:7>", "1", "-2147483648", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "-2147483646"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("256", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"Value ", "<sample:5>", "0", "-15", "<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-61", "<sample:2>", "3", "-1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"1e10", "<sample:5>", "1", "2", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"0x123456789", "<sample:2>", "1", "-47"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-46", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"11..5", "<sample:4>", "1", "-2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:5>", "0", "3", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:5>", "0", "3", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1.12345778", "<sample:5>", "1", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1.12345778", "<sample:1>", "1", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"7", "<sample:5>", "0", "3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"http:/Texample.com/a?b=c3", "<sample:2>", "1", "-2", "<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"byte fied.", "<sample:5>", "1", "-16", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{" at o/fset ", "<sample:1>", "0", "-9", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:5>", "7", "-4"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"I", "<sample:4>", "0", "-2", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"6", "<sample:2>", "1", "2"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-9", "<sample:2>", "0", "3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"12345678901234567890", "<sample:3>", "0", "-2", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"0x1F", "<sample:5>", "0", "-1", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:1>", "0", "2", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"", "<sample:5>", "1", "-4510", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4509", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "-2147483520"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "1073741823"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:8>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\007", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:7>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\006", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "134217853"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2", "<sample:5>", "2", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:14>", "0", "2"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-14", "<sample:1>", "1", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:14>", "1", "256"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-115", "<sample:1>", "0", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-14", "<sample:7>", "1", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:6>", "0", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\005", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:7>", "0", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\006", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:9>", "0", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:2>", "0", "3", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:3>", "0", "1", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int", "org.apache.commons.compress.archivers.zip.ZipEncoding"}, new String[]{"<sample:14>", "0", "2", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:1>", "49", "-47"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2", "<sample:14>", "0", "3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
}
