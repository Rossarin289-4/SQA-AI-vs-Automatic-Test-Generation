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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-1", "<sample:2>", "-1", "1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"1099511627775", "<sample:0>", "-1074", "1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "1", "-1074"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "1", "-1074"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<null>", "256"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<empty>", "6"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1L", "<empty>", "7", "-1074"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1067", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"7", "<empty>", "7", "-1074"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1067", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2097152", "255"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"1", "<sample:1>", "8", "-1074"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"1", "<sample:1>", "8", "-1074"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "255", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"9223372036854775807", "<sample:2>", "1", "2097152"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2147483648", "7"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2097151", "<sample:0>", "256", "254"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<null>", "1074"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "6"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"254", "<null>", "8", "2097151"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"254", "<null>", "16", "2097151"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"36028797018963968", "<sample:0>", "-1073741824", "2097151"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("132", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "254", "2097151"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "254", "2097151"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"' len=", "<sample:0>", "-1074", "256"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"' len>", "<null>", "1073741823", "192"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "255", "2097151"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"' len>", "<sample:0>", "1073872895", "192"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1.5d", "<sample:0>", "-50", "-2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483599", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1.6d", "<empty>", "-50", "-1073741823"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741873", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{".6d", "<empty>", "2097151", "-1073741823"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1071644672", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{".6d", "<sample:2>", "2097151", "-1073741839"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1071644688", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"6d", "<sample:1>", "2097106", "-1073741839"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1071644733", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1.1234567890123456", "<null>", "-1074", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147482574", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"1.123456789012345", "<sample:1>", "-2147483648", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8", "<empty>", "2097151", "8"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8", "<empty>", "2097151", "-1074"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "7", "6"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "7", "-1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"254", "<sample:1>", "255", "49"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"558345748478", "<sample:0>", "-2080374784", "-49"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"557808885758", "<null>", "2147483647", "84"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"25769803776", "<sample:2>", "6", "-2097151"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:4>", "-2147483648", "-2097151"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-36028247271538804", "<null>", "-537", "2147483577"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"154", "<sample:1>", "273", "256"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"154", "<null>", "273", "256"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"255", "<sample:1>", "10", "8"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"4398046244343", "<sample:4>", "-2162698", "0"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"At offset ", "<null>", "2097183", "12"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-16777166", "<null>", "2097151", "2097150"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{", ", "<sample:2>", "7", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2097152", "<null>", "254", "-1074"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2097151", "<sample:0>", "-2147483648", "1130"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"288230384741646287", "<null>", "11", "2215"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"288230384741646287", "<null>", "11", "-1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"1099511627775", "<empty>", "232", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2097151", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2097151", "<sample:4>", "-3", "6"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2097151", "<sample:4>", "-2147483648", "-34"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-1", "<sample:0>", "2147483647", "-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-2", "<null>", "2147483647", "-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-6", "1048537"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("132", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-1", "<null>", "1", "254"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "8"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "-64"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:5>", "16"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "10", "-64"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-1074", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8589934592", "<null>", "-13", "2097179"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"4294967296", "<empty>", "-54", "1048589"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "2147483647", "-2147483648"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "255", "2097151"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-254", "254"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-1152921367165796313", "<sample:0>", "-2147483647", "2097150"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"1099511627775", "<null>", "-2147483647", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"255", "<null>", "2097140", "-1073741697"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1071644557", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"255", "<null>", "2097140", "-536870848"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-534773708", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"255", "<null>", "2097150", "-536870848"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-534773698", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"<a>b</a>", "<null>", "2097150", "-268435424"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-266338274", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"<a>b<0a>2E-6", "<empty>", "-2097207", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"<a><0a>2E-6", "<empty>", "-1048603", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2146435045", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"<a><0a>2E-6", "<empty>", "2147483647", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"<a><0a>2E-6", "<sample:1>", "2147483588", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-60", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"<a>b</a>{NUL}", "<sample:2>", "-2147483648", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"<a>bb</a>", "<sample:5>", "255", "-2147483605"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483350", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("132", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"36028797018963969", "<sample:2>", "6", "1"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"36028797018963969", "<sample:4>", "3", "268435452"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"1099511627775", "<sample:0>", "6", "2097152"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"1099511627775", "<sample:1>", "-6", "-2097152"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8", "<sample:0>", "-3", "-64"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"562949953421320", "<sample:0>", "-3", "-128"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"\n", "<null>", "1130", "2147483609"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"null", "<sample:2>", "2147483647", "254"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"1", "<sample:0>", "0", "-110"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-64", "8"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-64", "-504"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:6>", "-2147483648", "256"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "6", "254"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "6"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<null>", "524295"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8", "<null>", "-2097151", "255"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("132", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8589934590", "<sample:1>", "-64", "-2147483628"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"36028797018963967", "<empty>", "0", "2097152"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-18014398509482072", "<null>", "-46", "4195328"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"254", "<null>", "2097150", "-3"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"290", "<sample:2>", "-64", "49"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"<a>b</a>", "<null>", "-128", "-128"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-256", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"<a>b</a>5.", "<null>", "-128", "-108"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-236", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8", "<sample:2>", "-3", "-2097151"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"256", "<null>", "254", "10"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:8>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("24", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2097151", "8"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "2097151", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2147483648", "402653223"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-4503599627370236", "<sample:2>", "7", "-47"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-9007199254740472", "<sample:5>", "1073741823", "2"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "15"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-137438953424", "<sample:1>", "15", "1"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "2097151"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"16", "<empty>", "-2097212", "12"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "15", "-268434435"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "15", "-268434435"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"254", "<null>", "2097151", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"17179869443", "<sample:4>", "-31457225", "40"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"17179869443", "<null>", "-31457225", "40"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"2097151", "<null>", "14", "126"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<null>", "256"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"", "<sample:1>", "15", "2097152"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"-9007130535264383", "<null>", "2147483647", "69206065"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<null>", "10", "15"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2097129", "2097151"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "1", "2097151"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "11"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"", "<sample:2>", "-2147483648", "-2097164"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2145386484", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "-1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:6>", "2097150", "-7"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "6", "-3"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"17179867976", "<sample:1>", "-2147483648", "-16"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "268435520", "-2147483648"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2147483639", "255"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"254", "<sample:2>", "2097152", "8"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-1073741824", "23"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:4>", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2", "-5"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "4194754"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"0\tV", "<sample:0>", "2", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"a{UL}_", "<sample:2>", "0", "8"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"86899346918589934591", "<sample:6>", "-2009071654", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("138411994", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"86899346918589934591", "<sample:6>", "2009071654", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-138411994", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:6>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "computeCheckSum", new String[]{"byte[]"}, new String[]{"<sample:9>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"\037irea", "<sample:2>", "2147483647", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"\037irea", "<sample:2>", "-2147483648", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatNameBytes", new String[]{"java.lang.String", "byte[]", "int", "int"}, new String[]{"a", "<sample:2>", "1", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:2>", "2", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "255"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "-6"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "1", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "1", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"1099511627775", "<sample:2>", "-8", "10"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalOrBinaryBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"255", "<sample:2>", "-3", "7"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "1", "2"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"36028797018963967", "<null>", "-116", "-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"8", "<sample:2>", "-1", "6"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "2147483647", "256"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "2", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseBoolean", new String[]{"byte[]", "int"}, new String[]{"<sample:2>", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctal", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "2097151"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:2>", "6", "-3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "0", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "-1048566"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:2>", "2", "0"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseOctalOrBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "0", "2097082"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "0", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:2>", "2", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:1>", "10", "-8"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatCheckSumOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:2>", "6", "-3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "0", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\003\004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatLongOctalBytes", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:4>", "6", "-4"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "1", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "0", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "formatUnsignedOctalString", new String[]{"long", "byte[]", "int", "int"}, new String[]{"0", "<sample:2>", "1", "2"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "0", "2"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:4>", "0", "2"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\003\004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.compress.archivers.tar.TarUtils", "org.apache.commons.compress.archivers.tar.TarUtils", "parseName", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00ff", String.valueOf(actual));
 }
}
