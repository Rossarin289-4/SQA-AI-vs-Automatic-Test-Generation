package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"59999"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M59.999S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"M"}, true);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[M]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "format", new String[]{"org.apache.commons.lang.time.DurationFormatUtils$Token[]", "int", "int", "int", "int", "int", "int", "int", "boolean"}, new String[]{"<sample:2>", "3600001", "0", "972", "60001", "-1", "1800000", "3600000", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"1209599991"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("335:59:59.991", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"35186791288814", "true", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("407254 days 12 hours 41 minutes 28 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"86400001", " 2 day", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 2 1a0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"1800001", "true", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("30 minutes", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"-17179809237", "60056", "-1.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"0", "false", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 days", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"60056", "1.S6e3\t00", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.600566e3\t00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"4254304", "true", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 hour 10 minutes 54 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-1001", "35186791288767"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P1115Y0M8DT12H41M29.768S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"-4611686018427387904", "-50", "mM"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("29736-1753578882", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"-3600045", "false", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 days -1 hours", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"-2", "4254304", "S148483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4254306148483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"0", "apb,c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("apb,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"86399984", "[1,2", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"120002", "a,,b,c"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,,b,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "format", new String[]{"org.apache.commons.lang.time.DurationFormatUtils$Token[]", "int", "int", "int", "int", "int", "int", "int", "boolean"}, new String[]{"<empty>", "3599744", "59999", "60031", "-1073741824", "1800000", "954", "3599941", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"3599973", "12:30:55"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:55", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"-60", "apb,c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("apb,c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "format", new String[]{"org.apache.commons.lang.time.DurationFormatUtils$Token[]", "int", "int", "int", "int", "int", "int", "int", "boolean"}, new String[]{"<null>", "2147483647", "1800058", "86924289", "67138864", "1000", "2147483647", "86400001", "false"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"-17179809188", "false", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-198 days -20 hours -10 minutes -9 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"0", "/h"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/h", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"apb,,c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[apb,,c]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"-60000", "-0.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"-8", "1.5Hello, World", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.50ello, Worl0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"172799998", "60000", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("60000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-2143883628", "35186791288814"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P1115Y1M2DT8H12M52.442S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"60001", "H:m:ss.SSS", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:1:0.001", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "format", new String[]{"org.apache.commons.lang.time.DurationFormatUtils$Token[]", "int", "int", "int", "int", "int", "int", "int", "boolean"}, new String[]{"<sample:3>", "3600001", "1040", "86399999", "86137984", "3600001", "-999", "2147483647", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{" 0 hours"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[ 0 hour, s]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"3600001", "-15", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"172800000"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M2DT0H0M0.000S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"2305843009213693953", " 1 miute"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 1 -650544380iute", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{" 0 hours1.12345678"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[ 0 hour, s, 1.12345678]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"12:30:41.5d"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[12:30:41.5, d]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"-17179809237"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M-198DT-20H-10M-9.63S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"60001"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H1M0.001S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"2419199999", "552175013887"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P17Y5M2DT22H56M53.888S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"2419200019", "2000"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M-27DT-23H-59M-58.81S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"2419199982", "2419200001"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M0.019S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-1209599991", "86400000"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M14DT23H59M59.991S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"-17179809210", "i", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"9223372036854775807", " 1 hours", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 1 hour-1511828489", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"977", "", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"60000", "2419200000", "a b", "true", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"1209599991", "http://exampld.com/a?b=c", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://exa1439pl13.co1439/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"1799999"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:29:59.999", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:00:00.000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"-9223372002495037440"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2047697242:-909387793:14.176", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"1800000"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H30M0.000S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"29971"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M29.971S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"-72057591618727937", "30000", "0L"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"-17213363620"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-4781:-29:-23.80", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"3600000", "d L", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 L", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"-86399999", "  minutes", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("  -1439inute-59", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"900000", "0x<F"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x<F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"86400001", "a b", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"<00"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[<00]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"1125899993242623", "3600001"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M-13031249DT-21H-7M-22.78S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"-1", "1.12345E7890123467", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345E7890123467", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{" 1 second 1 minutes"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[ 1 , s, econ, d,  1 , m, inute, s]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"0x11F"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[0x11F]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"9223372036854775807", "1-1234567", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1-1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"1209599991", "true", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("13 days 23 hours 59 minutes 59 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"1209600503", "86399999"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M-13DT0H0M0.96S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[<a>b</a>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"-16106067364"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-4473:-54:-27.36", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "format", new String[]{"org.apache.commons.lang.time.DurationFormatUtils$Token[]", "int", "int", "int", "int", "int", "int", "int", "boolean"}, new String[]{"<sample:0>", "120002", "-4194262", "86399957", "43200000", "67168865", "59997", "0", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"35186790764526", "288230376155313791"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P9132541Y11M29DT11H55M49.265S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"86416385", "true", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 day 0 hours 0 minutes 16 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-16139621796", "59945"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y6M3DT18H14M41.741S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"9223372036854775807", "4838399964"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M622191289DT199591895H12M55.773S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"88497152", "TitlWe", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TitlWe", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"-17179809237", "<E-5", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<E-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"2486308846", "< 1 minutes", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("< 1 41438inute28", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"3600001", "345600004", "j"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("j", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"1", "1-52"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1-52", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"mm"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[mm]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"1209599999", "119928"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M-13DT-23H-58M0.29S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"-4611686018340987905", "-1", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-9223372036854775808", "939"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M622191233DT199591895H12M56.747S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"36028797018963966"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M416999965DT11H56M3.966S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"2150764464", "a1E5", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a1E5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"2199026855552", "/", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-34426727240", "1099511628775"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P35Y11M6DT6H52M36.015S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"1", "I"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"60000", "", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"y "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[y,  ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"-9223372036854775789", "\u00ea.", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00ea.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"3599999", "0x1F_"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1F_", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"16383", " 0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"8503534593", "5\u00e9", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"119928", "-1001", "PT1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"2419200000", "2419199982"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M0.82S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-17179809188", "-1001"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y6M15DT19H10M8.187S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"-48", "1209599991", "600F0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("600F0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"3599999"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:59:59.999", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"1", "214"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("214", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"60000", "false", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 days 0 hours 1 minute 0 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-17213363620", "86400001"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y6M17DT4H29M23.621S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"43200000"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT12H0M0.000S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"1209599996"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M13DT23H59M59.996S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"61024"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H1M1.024S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "format", new String[]{"org.apache.commons.lang.time.DurationFormatUtils$Token[]", "int", "int", "int", "int", "int", "int", "int", "boolean"}, new String[]{"<null>", "1000", "1800000", "86399999", "60001", "1912", "3599999", "4195305", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"-68719476735", "2147483648", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"-2687635455", "1x123456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1x123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"70373582577629"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M814509DT1H22M57.629S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"-17179809156", ""}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"37154431", "a [ 0 seconds"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a [ 0 37154econ037154", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"1001", "a b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"86398976", "false", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 days 23 hours 59 minutes 58 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-1", "-17213363620"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M-199DT-5H-29M-23.81S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"1", "0.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"2419200001"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("672:00:00.001", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"3075712"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:51:15.712", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"86400001", "1800031"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT-23H-29M-59.0S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"2247483648"}, true);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[2247483648]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"-60001", "b b", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"119998"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:01:59.998", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M0.001S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"33794288", "2419199990"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M27DT14H36M45.702S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"-86399487"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT-23H-59M-59.13S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"999", "PT1H", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"5537"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M5.537S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-536869911", "3600001"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M6DT6H7M49.912S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"67109363", "84302848"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT4H46M33.485S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-4503599623770497", "4611686018427387903"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P145999739Y9M20DT8H5M58.400S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"-1255777281"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-348:-49:-37.19", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"3600000", "36000002020-01-01", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("36000002020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"1", "35186791288814"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P1115Y0M8DT12H41M28.813S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"3600002", "z\"a\":1}1000", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("z\"a\":1}1000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"4294967795"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M49DT17H2M47.795S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"36028797020763969", "true", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("416999965 days 12 hours 26 minutes 3 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"9223372036854775807"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2047687697:909387756:-55.91", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"60001"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:01:00.001", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"119968", "1746470903"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M20DT5H5M50.935S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"119954433", "true", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 day 9 hours 19 minutes 14 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"1800061", "12345678901234567890123456H890", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123456789012345678901234560890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"\u00e9abc"}, true);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[\u00e9abc]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"37154432", "1209599991", "112345678"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("112345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"-4398046511104"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1221679:-35:-11.96", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"3600001", "-9221120237041090560", "0x123\t456789"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123\t456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{" 1 hour"}, true);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[ 1 hour]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"12:30:450"}, true);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[12:30:450]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{" 0 days"}, true);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[ 0 , d, a, y, s]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"3492941850", "false", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("40 days 10 hours 15 minutes 41 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"2305843009213693951", "-17179809188", "Hello, World", "false", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-15ello, Worl-918194214", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"-127", "false", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 days 0 hours 0 minutes 0 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{" 1 days"}, true);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[ 1 , d, a, y, s]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"0", "true", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"9223372036854775807", "true", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-622191233 days -199591895 hours -12 minutes -55 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"2419199999", "1023", "trup", "false", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("trup", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"0", "61080", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"-140737484755327", "35", "9\t{"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9\t{", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"1", "120002", " ", "false", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"72057594124327937", "35186791288814", "H:mm:ss.SSS"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1468612221:-10:-39.77", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"1", "3600052", "0w1F"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0w1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"2419200000", "0", ";0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(";0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"1209599959"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M13DT23H59M59.959S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"1000", "119928"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H1M58.928S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"-17213363620", "1.S6e300", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.-334944366e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"9223372036854775807", "1997"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M622191233DT199591895H12M57.806S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"-9223372036854775808"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M622191233DT199591895H12M55.808S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"4314232", "1023"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT-1H-11M-53.91S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"0", "999"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M0.999S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"-1152921504603246975", "n.5e00"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("n.5e00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"3600001", "-8589904618"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M-99DT-11H-5M-4.81S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"2419199999", "43199944"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M-27DT-12H0M0.45S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"1800001", "2419200050"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M27DT23H30M0.049S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-15385", "65537"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H1M20.922S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"281474976770656", "false", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3257812 days 5 hours 32 minutes 50 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"59959", "1974", "<a>b</a>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>b</a>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"-17179809172", "1.S6e300123456789012345678901234567890", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.600126e300123456789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"70368744176663", "1.5", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"2419199999", "false", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("27 days 23 hours 59 minutes 59 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:00:00.001", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaabaaaaaaaaa`aaaaaa"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[aaaaaaaaaaaaabaaaaaaaaa`aaaaaa]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"-1799999", "-17179809237", "3700001", "false", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3700001", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"709670914", "1800005", ">x1F", "true", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">x1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"3600002", "Hello, World"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1ello, Worl0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"-8589904618", "-17179809188", "a,b,ic", "false", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,ic", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"30000", "17179809237", " 1 minute", "true", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 1 310809inute", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"2420248575", "2419200001", "4.1000", "false", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4.1000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"0", " 1 second1.5e300"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 1 0econ01.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"1799921"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:29:59.921", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"1050", "9223372036854513663", "-X--1", "false", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-X--1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"2419200022", "4254304", "t", "true", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"172800002"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("48:00:00.002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"60056", "-3600045", "mM"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-610", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"-142146"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H-2M-22.54S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"1209599991"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M13DT23H59M59.991S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"3600035"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1:00:00.035", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"322143"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:05:22.143", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"2127152", "-9223372036854775808", "2020-02-30T25:61:61", "true", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"-1", "false", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 days", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"-9223372036854775800", "true", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("622191233 days 199591895 hours 12 minutes 55 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"172800002", "true", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2 days 0 hours 0 minutes 0 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"59964", "-114", ".51e10", "true", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".51e10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"3600000"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[3600000]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"172800000", "false", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2 days", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"999", "true", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"0", "false", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 days 0 hours 0 minutes 0 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"144115188083055872", "1001", "1.12345678", "false", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"0L"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[0L]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"http//example.comm/a?b=c"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[http//exa, mmm, ple.co, /a?b=c]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"2419201023", "false", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("28 days 0 hours 0 minutes 1 second", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"500", "true", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"-17179809237", "true", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-198 days -20 hours -10 minutes -9 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"-4611686018427387905", "false", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1836388031 days -15 hours -36 minutes -27 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"60000", "true", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 minute 0 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"59944", "9223372019674906623", "H:mm:ss.SSS1.12345678"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("546214491:00:46.6791.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"3601023", "1001", "1.251.1234567", "false", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.251.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"60024", "4838399998", "2e10", "true", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"3599999", "3599999", "-0.0 "}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0 ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"1209599991", "35186791288787", "N"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("N", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{" 1 minues"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[ 1 , m, inue, s]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"-17213363620", " 1 hmurs", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 1 h-286889ur-23", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"60000"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:01:00.000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"35186791288863", "false", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("407254 days 12 hours 41 minutes 28 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"3600002", "false", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 days 1 hour 0 minutes 0 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"3599999"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:59:59.999", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"86400060"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("24:00:00.060", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"4838400002", "-1", "\n:"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n:", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"1099508027775", "false", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12725 days 18 hours 53 minutes 47 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"-1800001", "59964", "", "false", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"4254245"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1:10:54.245", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"59999", "true", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("59 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"-549752213873", "true", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-6362 days -20 hours -56 minutes -53 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"16777176", "13177683", " ; hour", "false", "<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ; hour", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{" 0 seconds"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[ 0 , s, econ, d, s]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"60056"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:01:00.056", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"-17317308077416", "true", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-200431 days -19 hours -21 minutes -17 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"70373582577628"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("19548217:22:57.628", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"18014400928681984"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("709032961:58:01.984", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"36028797018965966"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1418064579:56:05.966", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"86399941", "86400024", "21920000", "true", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21920000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"86400001", "-34087279661038", "s"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("272372307", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"899999", "86399966", "", "true", "<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"144396663056166527", " 0 minutes"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 0 1429365176inute6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"H:mmLss.SSS"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[H, :, mm, L, ss, ., SSS]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"-35", "1800001", " 0 seonds1.5e300"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 0 1800eon018001.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"-549755813889", "3601023", "1.25", "false", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"2004", "-1152921513196751570", "d", "true", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-459097107", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"50", "1001", " 2 day", "true", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 2 0a0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"-72057596457127936", "2127152", " 2 ay", "true", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 2 a-2279430", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"-9223372036854775808", "0", " ", "false", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"86416348"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M1DT0H0M16.348S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"70373582577628", "1209599968", "b 1 minute"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b 1 -1172872882inute", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"7200000", "-17179809237", "aaaaaaaaaaaaaaaaaaaaaaaayaaaaa", "true", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaa0aaaaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"86367232", "35186791288814", "0x1F"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x1F", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"274879706979", "2419199982", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0x123456789", "false", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0x123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"1125899906842574", "-17179809188", "6M", "false", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("60", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"34359618376"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9544:20:18.376", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"-274875779792", "-17179809237", "1.5f"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"1001"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M1.001S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"_1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[_1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"-29"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M0.71S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"86400001.1234567"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[86400001.1234567]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"172799998", "n{ll"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("n{ll", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"1003", "1001", ""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"1209599999", "36028795809363977", "k", "true", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("k", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"70373583101916"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("19548217:31:41.916", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"-499"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M0.01S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"86400001", "4611686019636987915", "3600001", "true", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3600001", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"-17213362596", "0x0G"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x0G", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"1002"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:00:01.002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"1/25"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[1/25]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"8778913213052", "false", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("101607 days 19 hours 0 minutes 13 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaa"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[aaaaaaaaaaaaaaa]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"172800002", "true", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2 days", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"4838400022", "true", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("56 days 0 hours 0 minutes 0 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"010"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[010]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"-8589933591", "5.010"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"7199998"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1:59:59.998", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"34359739405"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M397DT16H22M19.405S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[<a>b</a>]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"144115188075855822", "-23", "S1i", "true", "<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("271i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"-2095152"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H-34M-55.48S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "format", new String[]{"org.apache.commons.lang.time.DurationFormatUtils$Token[]", "int", "int", "int", "int", "int", "int", "int", "boolean"}, new String[]{"<null>", "46", "60001", "-1073741823", "1", "-16717215", "2147483614", "2147483647", "false"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"172799998", "60/"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("60/", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"1800001"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H30M0.001S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"-8588134591", "-9223372036854775808", " ", "true", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"3600002"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1:00:00.002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"172800000", " 1 hoursr"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 1 hour172800r", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"172800002"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M2DT0H0M0.002S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"43199999", "-3458764513820540928", "01m0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("019758158500", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"86400053", "apb5,c1.12345678"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("apb5,c1.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"1800001", "1.5d 1 second2020-02-30T25:61:61"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.50 1 1800econ02020-02-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"-8206"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M-8.94S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"2002"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M2.002S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"8508608", " 1 days"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 1 0a08508", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"4838399964"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M55DT23H59M59.964S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"562932773612124"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M6515425DT14H53M32.124S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"2419200000", "34", "--1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"-1125899906782568"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-312749974:-6:-22.32", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"-33553433"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT-9H-19M-13.67S", String.valueOf(actual));
 }
}
