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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"6", "<sample:0>", "-2147483648", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-131130", "<sample:0>", "40", "-1073741824"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "255", "256"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "255", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"a b", "<null>", "-1073741824", "40"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-148", "<empty>", "2147483647", "0"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-148", "<null>", "2147483599", "22"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"6", "<empty>", "10", "-1073741824"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"6", "<empty>", "10", "1073741824"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"1", "<null>", "-2147483648", "40"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8", "<empty>", "-2147483648", "40"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8", "<sample:8>", "-2147483648", "-40"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-2147483648", "2147221503"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2147483648", "-2147221503"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "255", "7"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "255", "7"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "255", "-48"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-1024", "-3"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "512", "45"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "14"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483583", "10"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"254", "<null>", "8", "1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"508", "<null>", "8", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"508", "<sample:2>", "14", "1073741824"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"9223372036854775807", "<sample:0>", "254", "255"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"9223372036854775807", "<sample:0>", "254", "-255"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"9223367638808264703", "<sample:2>", "234", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"9223367638808264703", "<sample:2>", "234", "-2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"7", "<null>", "256", "1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("132", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:8>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("24", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:9>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("132", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"105", "<sample:1>", "-2147483648", "33554687"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:2>", "2147483647", "-1073741824"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-3", "<sample:0>", "-1", "-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "12"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"-1", "<null>", "10", "14"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"-2", "<sample:1>", "-2147483648", "28"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"-2", "<sample:1>", "-2147483648", "-28"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483620", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1.25", "<sample:1>", "-2147483648", "-28"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483620", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1.25", "<sample:1>", "-2147483648", "536870884"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"254", "<sample:0>", "254", "256"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-127", "<null>", "254", "256"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"128", "<null>", "252", "-219"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "179"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "2139095039", "89"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"/a/b", "<sample:1>", "2147483647", "-1073741824"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"a/b", "<sample:1>", "2147483595", "-1073741824"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741771", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"aa/b", "<sample:1>", "2147483595", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-53", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"aa/b", "<null>", "2147483604", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-44", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "2147483609"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"6", "<null>", "4194318", "-2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"6", "<null>", "-2147483648", "254"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"34", "<null>", "2147483647", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-8388608", "<sample:1>", "2147483647", "-2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-8388608", "<sample:1>", "2147483647", "0"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"2020-01-01", "<sample:0>", "-1073741824", "-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741825", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"2020-01-01", "<sample:0>", "-1073741824", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741824", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"2020-01-01", "<sample:0>", "-1073741824", "-56"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741880", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"2020-01-01", "<sample:5>", "-1073741824", "-15"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741839", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"2020-01-01", "<sample:7>", "-1073741824", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741824", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"2020-01-01", "<sample:1>", "-1342177280", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("805306368", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2147483648", "-52"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483609", "-52"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-131130", "<sample:2>", "1073741824", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-2147483648", "108"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"0x123456789", "<empty>", "14", "256"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"0x123456789", "<empty>", "14", "-256"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-242", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "2084", "-653"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-4611686018427387904", "<empty>", "-1073741835", "-262398"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "8", "256"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-8388648", "-3942"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"9223372036854775807", "<null>", "2147483647", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"12", "<null>", "-24", "2147483612"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"277", "<sample:0>", "-2147483648", "-33"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "19"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:7>", "0", "41"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2", "<sample:1>", "-1073741824", "1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"1", "<null>", "-939524096", "266240"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"16777214", "<sample:6>", "2147483647", "-1073741824"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"32767", "<sample:0>", "14", "8"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"7", "<null>", "-14", "8"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"1", "<sample:0>", "-168", "-313"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"2/55", "<sample:0>", "2147483647", "-28"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483619", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"2/555", "<sample:2>", "2147483647", "-26"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483621", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("132", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "-82", "0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("132", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"=", "<sample:2>", "7", "19"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"0xFEFFFFFF2020-01-01", "<empty>", "7", "-28"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-21", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-131130", "<sample:1>", "41", "14"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-131130", "<sample:1>", "41", "-14"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-4503599627501626", "<null>", "125", "536870655"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"1", "<sample:13>", "105", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "168"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "2147483647", "-294"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "1073741823", "294"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1073741823", "294"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"Title", "<sample:2>", "0", "256"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"0", "<sample:1>", "0", "256"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "40"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:7>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "7", "1073741819"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"0o10", "<sample:4>", "19", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483629", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-4503600164241414", "<sample:0>", "2147483647", "-28"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<null>", "-21", "-2147483648"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"262145", "<null>", "-1072693286", "256"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1.25", "<null>", "19", "256"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-9223372036854775808", "<sample:2>", "14", "8"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-9223372036854775808", "<sample:2>", "14", "-1"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"4575657221408423936", "<null>", "-2147483592", "128"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "14", "3"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "40", "1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"-1.5", "<sample:7>", "2147483647", "-98074"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147385573", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"2020-02-30T25:61:61", "<sample:1>", "0", "-28"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"*1", "<sample:2>", "-2147483648", "-1073741824"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741824", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"*1", "<sample:2>", "-2147483648", "-1073741783"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741865", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"*1", "<sample:0>", "2147483647", "-1073741783"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741864", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"+1", "<sample:0>", "2147483647", "-536870891"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1610612756", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"+1", "<sample:0>", "2147483647", "-536870926"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1610612721", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:9>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"256", "<sample:1>", "1", "3"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1.1F345678", "<sample:1>", "-55", "-254"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-309", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1.1F345678", "<sample:1>", "-55", "-4193997"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4194052", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1.1F34567", "<sample:7>", "-55", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-55", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:7>", "0", "1073741823"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:7>", "3", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"1", "<sample:2>", "1", "3"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:8>", "1", "2147483591"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:11>", "1", "1073741823"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:2>", "41", "-38"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:7>", "0", "1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:7>", "0", "1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:6>", "1", "0"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:7>", "1", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\007", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "0", "2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\003\004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:7>", "3", "-1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:6>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\005", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "0", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\004\005", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"1", "<sample:2>", "0", "3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:2>", "40", "-38"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "1", "1"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:2>", "40", "-38"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:2>", "0", "3"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"1", "<sample:2>", "0", "3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "1", "1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
}
