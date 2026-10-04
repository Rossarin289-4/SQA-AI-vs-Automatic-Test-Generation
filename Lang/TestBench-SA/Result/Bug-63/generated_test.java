package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"1000"}, true);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[1000]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"3599999", "true", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("59 minutes 59 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"3599999", "false", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 days 0 hours 59 minutes 59 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"86399999"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT23H59M59.999S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "format", new String[]{"org.apache.commons.lang.time.DurationFormatUtils$Token[]", "int", "int", "int", "int", "int", "int", "int", "boolean"}, new String[]{"<sample:2>", "999", "1", "1000", "0", "86400001", "1", "1", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"2419200001", "0xFFFFFFSFa", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFF-1875767295Fa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"4611686020846587905", "0xFFFFFFSFa", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFF-1875767295Fa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"86400001", "true", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 day", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-60001", "2419200001"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M28DT0H1M0.002S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"3600001", "true", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 hour", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"1800000", "true", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("30 minutes", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"60000"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:01:00.000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"2419200001", "144115188075856872", " 1 hourM"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 1 hour54801941", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"522470916", "1209598976", " 1 day", "true", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 1 7a0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"-1099511626776", "-764288", "\t1.12345678901234567"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t1.12345678901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[-1.5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{",1.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[,1.5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"-4611686018427386873"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M-1836388031DT-15H-36M-26.27S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"1031"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M1.031S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"2062"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M2.062S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"-67107833"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT-18H-38M-27.67S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"67107833"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT18H38M27.833S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"-33553916"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT-9H-19M-13.4S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"60000"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H1M0.000S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"-30000"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M-30.000S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"86400000"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[86400000]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"8400000"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[8400000]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"8400000m"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[8400000, m]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"H:mm:ss.SSS"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[H, :, mm, :, ss, ., SSS]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"H:mm:s.SSS-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[H, :, mm, :, s, ., SSS, -1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"H:mms.SSS-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[H, :, mm, s, ., SSS, -1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"HH:mms.SSS-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[HH, :, mm, s, ., SSS, -1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"HH:]mms.SSS-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[HH, :], mm, s, ., SSS, -1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"3599999", "Htrne", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0trne", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"3599999", "Htrne3600000", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0trne3600000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"3599999", "5.", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"3599999", "5y.", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("50.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"3599999", "5y.", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("50.", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"-137431753574", " 0 minutes", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 0 -2290529inute-13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"-137431753638", "  minutes", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("  -2290529inute-13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"-137431753601", "  m\u00e9nutes", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("  -2290529\u00e9nute-13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"-137431753609", "  m\u00e9nttes", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("  -2290529\u00e9ntte-13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"2419200000", "http://example.com/a?b=c", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://exa40320ple.co/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "format", new String[]{"org.apache.commons.lang.time.DurationFormatUtils$Token[]", "int", "int", "int", "int", "int", "int", "int", "boolean"}, new String[]{"<null>", "3600000", "-2147483648", "-60026", "134277728", "1000", "-2147483648", "2147483647", "false"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"-43198967", " 0  seconds"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 0  -43198econ0-43198", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"-43198909", " 0  reconds"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 0  recon0-43198", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"999", " 0  reconds"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 0  recon00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"999", " 0  qeconds"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 0  qecon00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"9223372036854775807", "-281474962310660", "86410000", "false", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("86410000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"59999"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M59.999S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"119998"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H1M59.998S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"-29999"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M-29.S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"-59998"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M-59.S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"7199998"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT1H59M59.998S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"281474983910654"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M3257812DT7H31M50.654S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"272678890888446"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M3156005DT16H21M28.446S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"86399999"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT23H59M59.999S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-240004", "1209599968"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M14DT0H3M59.972S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-239986", "1209600032"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M14DT0H4M0.018S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"172800002", "1209600032"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M12DT0H0M0.030S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-281474962310660", "1209600032"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P-4982Y5M21DT1H31M50.692S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-281474962310637", "-273668306912"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P-4991Y9M5DT15H33M23.725S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"1800000", "true", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("30 minutes", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"1800000", "true", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("30 minutes 0 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"1800000", "false", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 days 0 hours 30 minutes 0 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"86400000", "true", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 day 0 hours 0 minutes 0 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"172800000", "true", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2 days 0 hours 0 minutes 0 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"-172800000", "false", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2 days", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-1", "1001"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M1.002S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"-67197086"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-18:-39:-57.14", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"-67197096"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-18:-39:-57.04", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"-134918480"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-37:-28:-38.20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"-134918492"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-37:-28:-38.08", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"-67459246"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-18:-44:-19.54", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"67459246"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("18:44:19.246", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"552175013889", "1000", "86400000"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("86400000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"552175013889", "1000", "8640000:"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8640000:", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"0", "994", "86401\u00e900:"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("86401\u00e900:", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"-1928432", "true", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-32 minutes -8 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[1.5f]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"1.4f"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[1.4f]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"1.f"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[1.f]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"1.e"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[1.e]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"-1", "9223372036854775792", "m", "true", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1586601296", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"-1", "9223372036854775792", "n", "true", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"-1", "9223372036854775792", "<", "true", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"-1", "9223372036854775792", "<", "true", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"-1", "9223372036854775807", "<\r", "true", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<\r", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "format", new String[]{"org.apache.commons.lang.time.DurationFormatUtils$Token[]", "int", "int", "int", "int", "int", "int", "int", "boolean"}, new String[]{"<sample:0>", "29", "-43199999", "3600001", "-32768", "2147483591", "51", "2147483647", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"3599999", "true", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("59 minutes 59 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"7199998", "true", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 hour 59 minutes 59 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"1", "true", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"3600048", "false", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 days 1 hour 0 minutes 0 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"1", "86400000", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("86400000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"172799998"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M1DT23H59M59.998S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"-86399999"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT-23H-59M-59.S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"-9007199341140991"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M-104249992DT-8H-59M0.S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"999"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M0.999S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"1031"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M1.031S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"-4611686018427386873"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M-1836388031DT-15H-36M-26.27S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"1000", "2020-02-30T25:61:61", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"14399996", "true", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3 hours 59 minutes 59 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"-281474962310660", "true", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-3257812 days -1 hours -31 minutes -50 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{" 1 minute"}, true);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[ 1 , m, inute]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"2419200001", "0xFFFFFFFF", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"2419200001", "0xFFFFFFFFa", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFFFFa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"4611686020846587905", "0xFFFFFF", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFF", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"4611686020846587905", " 0 hours", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 0 hour-753495045", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"4647714817865551873", " 0 hours", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 0 hour1857845071", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"-4647714817865551873", " 0 hours", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 0 hour-1857845071", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"-4647714817865551873", " 0 hovrs", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 0 hovr-1857845071", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"2419199999", "0", "\u00e9"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u00e9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"78011393", "true", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21 hours 40 minutes 11 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"78011393", "false", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 days 21 hours 40 minutes 11 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"2419200001", "false", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("28 days", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"2419199972", "false", "true"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("27 days 23 hours 59 minutes 59 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"2419200001", "true", "false"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("28 days 0 hours 0 minutes 0 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"60001", " "}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"60001", "M"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"-0.0"}, true);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[-0.0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"/a/b"}, true);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[/a/b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"//b"}, true);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[//b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"-,"}, true);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[-,]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"TITLE"}, true);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[TITLE]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"-281474962310660", "86400000", "\t", "true", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"-281474962310660", "86399744", "\t\t", "true", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "format", new String[]{"org.apache.commons.lang.time.DurationFormatUtils$Token[]", "int", "int", "int", "int", "int", "int", "int", "boolean"}, new String[]{"<null>", "3600000", "86400000", "60000", "60000", "86399999", "-1", "2147483647", "false"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"86399999", "/a/b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/a/b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"86399999", "/Fa/b"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/Fa/b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"86397951", "/Fa/a"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/Fa/a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"43198975", " 0  seconds"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 0  43198econ043198", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"-43198967", " 0  seconds"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 0  -43198econ0-43198", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"999", " 0  qeconds"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 0  qecon00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"999", " 0 2qeconds"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 0 2qecon00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"4611686020846587905", "-281474962310660", "86400000", "false", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("86400000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"9223372036854775807", "-281474962310660", "86400000", "false", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"9223372036854775807", "-281474962310660", "86410000", "false", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("86410000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"59999"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M59.999S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"-1", "86399999", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"-1", "172799998", "1.12345678901234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"60000", "-43199999", "1.123456789112345567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.123456789112345567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"60000", "-43199999", "1.133456789112345567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.133456789112345567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"7199998", "2419199999", "H", "false", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("670", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"7199998", "604799999", "H", "false", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("166", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"7199998", "604799999", "{", "false", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"7199998", "604799999", "12:30:45", "false", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12:30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"60001", "3600001"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H59M0.000S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"30000", "3600001"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H59M30.001S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"60001", "2419200001"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M27DT23H59M0.000S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-120002", "2419200001"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M28DT0H2M0.003S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-240004", "2419200017"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M28DT0H4M0.021S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-240004", "1209600000"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M14DT0H4M0.004S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-240004", "2419199936"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M28DT0H3M59.940S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-240004", "1209599968"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M14DT0H3M59.972S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"2419200000"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M28DT0H0M0.000S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"60016"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:01:00.016", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"43632"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:00:43.632", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"-33598064"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-9:-19:-58.36", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"-33598031"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-9:-19:-58.69", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"-33598543"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-9:-19:-58.57", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"-67197086"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-18:-39:-57.14", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"2419200001", "1000", "1E-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1E-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"2419200001", "1000", "1E-512:30:45"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1E-512:30:45", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"2419200001", "1000", "86400000"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("86400000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"60001", "0", "PT1H"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"-134277729", "true", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1 days -13 hours -17 minutes -57 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"86399999", "false", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 days 23 hours 59 minutes 59 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"1800013"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H30M0.013S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M0.001S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"-35"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M0.65S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"59999"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M59.999S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"-59991"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M-59.S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"9007199254681001"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M104249991DT8H58M1.001S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"1001"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:00:01.001", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"2002"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:00:02.002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"1966"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:00:01.966", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"2011"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:00:02.011", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"2004"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:00:02.004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"1977"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:00:01.977", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"988"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:00:00.988", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"-988"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:00:00.12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"584220"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:09:44.220", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"-66524644"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-18:-28:-44.56", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "format", new String[]{"org.apache.commons.lang.time.DurationFormatUtils$Token[]", "int", "int", "int", "int", "int", "int", "int", "boolean"}, new String[]{"<sample:2>", "3600001", "86400000", "2147483647", "60006", "4107", "0", "3599999", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "format", new String[]{"org.apache.commons.lang.time.DurationFormatUtils$Token[]", "int", "int", "int", "int", "int", "int", "int", "boolean"}, new String[]{"<sample:1>", "3600001", "33554431", "-2147483648", "120012", "-2147483648", "0", "-3599999", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"2419199999", "-281476036052484", "2020-01-01", "true", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"3764658174", "-281476036052484", "2020-<1-01", "true", "<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-<1-01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"-4611686018427387953", "3599939", "", "false", "<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"1", "59999"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M59.998S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"134802109", "false", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 day 13 hours 26 minutes 42 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"67401054", "false", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0 days 18 hours 43 minutes 21 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"2199090656606", "false", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("25452 days 10 hours 30 minutes 56 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"2199090656606", "false", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("25452 days 10 hours 30 minutes 56 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"4398181313212", "false", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("50904 days 21 hours 1 minute 53 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"4611690416608701116", "false", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1836438936 days 12 hours 38 minutes 21 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"-4611690416608701116", "false", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1836438936 days -12 hours -38 minutes -21 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"0", "1.12345678", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"0", "1.12445678", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12445678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"2305843009210093952", "T1.5R300M"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("T1.5R3000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"-2305843009210093952", "11.5R300M"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11.5R3000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"-2305843009210093952", "11.5R30r0M"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11.5R30r00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"288230376158911742", "1", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"1001", "0", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"ha/b"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[ha/b]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"-522470916", "1209598976", "--1", "true", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"522470916", "-1209598976", "---1", "true", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("---1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"522470916", "-1209598976", "--,1", "true", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--,1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"522470916", "-1209598976", "--,1d", "true", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--,1-20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"522470916", "-1209598976", "--,1d 0 seconds", "true", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--,1-20 0 -4069econ-20-4069", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"522470950", "1209598976", "--,1d 0 seconds", "false", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--,17 0 82328econ782328", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"522470950", "1209598976", "m", "false", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11452", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"999", "i"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"999", "si"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"-1099511626776", "764288", "m"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("18318006", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"\n"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[\n]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"{"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[{]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-36283876516608", "468"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P1149Y9M18DT6H35M17.076S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-72567753033216", "468"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P1638Y6M24DT13H10M33.684S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-9079767007774208", "468"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P-283783Y5M25DT22H9M34.676S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"9079767007774265", "32534"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M-105089895DT-22H-9M-1.69S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"18159534015548530", "32534"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M-210179791DT-20H-18M-35.S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-1", "32534"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H0M32.535S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"3600000", "true", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 hour 0 minutes 0 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"86399999", "1000"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT-23H-59M-58.S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"1906", "4611686020846587905", "0x12,4566789", "false", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x12,4566789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"59999", "60001", "http://example.com/a?b=c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://exa00ple.co/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"59999", "60001", "http://examole.com/a?b=c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://exa00ole.co/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"4295027295", "60001", "http://examole.com/a?b=c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://exa-71582ole.co/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"4295027295", "60001", "http://exPmole.com/a?b=c"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://exP-71582ole.co/a?b=c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"2419199999", "86399999", "a"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"59999", "9223372036854775790", "1.5e300"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"999", "-60001"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT0H-1M-1.000S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"1125899906843623", "-57953"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M-13031248DT-22H-8M-21.24S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"562949953421811", "-57991"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M-6515624DT-11H-4M-39.98S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-562949953421811", "58046"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P-13901Y10M4DT11H4M39.857S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"86400001", "7199998"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT-22H0M0.97S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"43200014", "7199998"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M0DT-10H0M0.84S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-164", "134217740"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M1DT13H16M57.904S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"36028797018964980", "PT1H1.12345678901234567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT114180645791.12345678901234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"144115190194539637", "144537400548376796"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P13379Y3M21DT20H50M37.159S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"-144115190194541685", "144537400548376796"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P17411Y8M19DT22H21M58.481S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"72057595097270842", "144537400548376796"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P2296793Y7M6DT2H58M25.954S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriodISO", new String[]{"long", "long"}, new String[]{"86400000", "144537400548376796"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P4580207Y10M19DT10H6M16.796S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"3600001", "-1", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"3600001", "-0", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"3600001", "-", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"288230376151713744", "13.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("13.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"60001", "60001", " "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"1001", "2419199999", "PT1H"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT1671", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"1001", "2419199999", "PT1H1.12345678"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT16711.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"34360188368", "n"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"-35150011900524", "null"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"-35150011900524", "nu"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nu", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"1800013", " l"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" l", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"-281474890310136", "false", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-3257811 days -5 hours -31 minutes -50 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationISO", new String[]{"long"}, new String[]{"-2161800388905211333"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("P0Y0M748965942DT-13H-13M-31.67S", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String"}, new String[]{"-2419200001", "1799999", " 1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" 1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"9223372036854775807", "123456789012345678901234567890"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123456789012345678901234567890", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"3600000"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1:00:00.000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"3600033"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1:00:00.033", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"-72057594038250204", "abc2147483648Helko, World1000"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abc2147483648-23elko, Worl-8339999301000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"-2419200000", "abc2147483648Helko, World1000"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("abc21474836480elko, Worl-281000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"3599999", "1e10", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"3599999", "1e1b0", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e1b0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"-7200002", "true", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2 hours", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"-14400004", "true", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-4 hours", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"14400004", "true", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4 hours 0 minutes 0 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"14400004", "true", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4 hours", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"9223372036854775807", "true", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-622191233 days -199591895 hours -12 minutes -55 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationWords", new String[]{"long", "boolean", "boolean"}, new String[]{"4611686018427387903", "false", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1836388031 days 15 hours 36 minutes 27 seconds", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"86399999", "[1,2]"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"86399999", "[1,2]86400000"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]86400000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"86399999", "[1,2]8640000"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[1,2]8640000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"86399999", "Z1,3]8640000"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Z1,3]8640000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"86399999", "Z1,3]8640000abc"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Z1,3]8640000abc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String"}, new String[]{"86399999", "Z1,]8640000abc"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Z1,]8640000abc", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[-1.5]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"M"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[M]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"PT1H"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[PT1, H]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[{\"a\":1}]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"{\"a\":1|"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[{\"a\":1|]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "lexx", new String[]{"java.lang.String"}, new String[]{"{5a\":1|"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang.time.DurationFormatUtils$Token;", actual.getClass().getName());
  assertEquals("[{5a\":1|]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"-281474962310660", "281474962310660", "--1", "true", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"-281474962310660", "281474962310660", "-1", "false", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"-281474962310660", "140737481155330", ".1", "false", "<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"-281474962310714", "-140737481155330", "D1", "false", "<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("D1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"3458764513827741040"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1304753797:42:21.040", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"3458763414316113273"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1305059217:48:33.273", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"6917526828632226546"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1684848863:37:06.546", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"-3458763414316113273"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1305059217:-48:-33.27", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"-3458763415389855097"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1305058918:-4:-15.03", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"3599999"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:59:59.999", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"1799999"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:29:59.999", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDurationHMS", new String[]{"long"}, new String[]{"-144115188075856872"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1377291023:-44:-16.28", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"4611686020846587905", "010", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatDuration", new String[]{"long", "java.lang.String", "boolean"}, new String[]{"9223372036854775807", "110", "false"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("110", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.time.DurationFormatUtils", "formatPeriod", new String[]{"long", "long", "java.lang.String", "boolean", "java.util.TimeZone"}, new String[]{"-4611686018427387927", "-7204080", "224748", "true", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("224748", String.valueOf(actual));
 }
}
