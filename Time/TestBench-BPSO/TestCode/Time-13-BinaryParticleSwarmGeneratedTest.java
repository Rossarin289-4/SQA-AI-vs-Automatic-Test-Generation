package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "C"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "1E-5", "92nf3372036854775807", "<empty>"}}), new String[][]{{"appendHours", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", "int", "988"}}), new String[][]{{"appendYears", "", "4"}, {"appendSeparator", "java.lang.String,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendHours", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "clear", ""}}), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "6"}, {"maximumParsedDigits", "int", "5"}, {"appendSecondsWithOptionalMillis", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"TITLELiteral must not be null", "-000x1F", "<empty>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "<null>"}}, 1), new String[][]{{"appendHours", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", new String[]{}, new String[]{}, false), new String[][]{{"appendSeparatorIfFieldsAfter", "java.lang.String", "6"}, {"appendSeparator", "java.lang.String,java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}}), new String[][]{{"appendSuffix", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:1>", "<sample:1>"}, false, 4, new String[][]{}), new String[][]{{"appendSuffix", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<null>"}}, 3), new String[][]{{"appendYears", "", "1"}, {"appendMillis3Digit", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"010P", "2020-02-30T25:61:613"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", ".-1", ".5"}}), new String[][]{{"appendPrefix", "java.lang.String", "5"}, {"appendSeparatorIfFieldsAfter", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<null>", "<sample:7>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "{b\":2}abc"}}, 3), new String[][]{{"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<null>", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "Literal must not bN null"}}), new String[][]{{"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:6>"}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"withParseType", "org.joda.time.PeriodType", "6"}, {"parsePeriod", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P0D {getDays=0, getFieldTypes=[days], getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0], getWeeks=0, getYears=0, size=1}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:8>"}}), new String[][]{{"getParser", "", "5"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "Hello, Woorld"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "-000x1F"}}), new String[][]{{"getLocale", "", "5"}, {"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}}), new String[][]{{"getLocale", "", "6"}, {"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}}), new String[][]{{"parseMutablePeriod", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "clear", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"parsePeriod", "java.lang.String", "2"}, {"minusMinutes", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT-4M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=-4, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, -4, 0, 0], ...#231#1918163950", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:7>", "<null>"}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "4"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "010O"}}), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:5>", "<null>"}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:2>", "<sample:2>"}}), new String[][]{{"appendSuffix", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String", "[1,2]12:30:45", "TITLE"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "D", "<null>", "<null>"}}), new String[][]{{"printZeroAlways", "", "7"}, {"printZeroRarelyFirst", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}}, 1), new String[][]{{"parsePeriod", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", "int", "2147483647"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}}), new String[][]{{"parseMutablePeriod", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}}), new String[][]{{"toFormatter", "", "0"}, {"parseMutablePeriod", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}}, 1), new String[][]{{"toPrinter", "", "5"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}}), new String[][]{{"toParser", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}}), new String[][]{{"parseMutablePeriod", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:8>", "<sample:11>"}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "<a>b</a>a b", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "2", "--0"}}, 1), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "2"}, {"parseMutablePeriod", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:8>"}}, 1), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"010", "010", "<sample:3>"}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", "boolean", "true"}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:6>", "<sample:2>"}}), new String[][]{{"appendSecondsWithMillis", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}), new String[][]{{"parseMutablePeriod", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "10"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "-1000", "5."}}), new String[][]{{"parsePeriod", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "<null>", "i"}}), new String[][]{{"appendSeconds", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"m\t", "<null>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "PT1H"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "010PP"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "9223372036854775807", "[1,3]3"}}, 1), new String[][]{{"toFormatter", "", "0"}, {"parsePeriod", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}), new String[][]{{"parseMutablePeriod", "java.lang.String", "2"}, {"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:10>"}}), new String[][]{{"print", "org.joda.time.ReadablePeriod", "1"}, {"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "Literal must nou bN null"}}, 1), new String[][]{{"toPrinter", "", "7"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-0.01E-5", "0xFFEFFFFF"}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}}, 2), new String[][]{{"appendSuffix", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "Literal must no be null12:30:45", "...5"}}), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\n\u00e9", "01070PP"}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}}, 1), new String[][]{{"toFormatter", "", "2"}, {"print", "org.joda.time.ReadablePeriod", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<null>", "<sample:4>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", "boolean", "true"}}, 3), new String[][]{{"minimumPrintedDigits", "int", "1"}, {"toPrinter", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendHours", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "<a>b</a>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}}, 2), new String[][]{{"parseMutablePeriod", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}}), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String", "2"}, {"toParser", "", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "10"}}, 3), new String[][]{{"parsePeriod", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "+", "[1,2]12:30:451", "<sample:3>"}}, 1), new String[][]{{"parseMutablePeriod", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1 ", "PT1H"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 2), new String[][]{{"appendWeeks", "", "3"}, {"toPrinter", "", "4"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendDays", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "Fx1F1.25", "11"}}, 2), new String[][]{{"toFormatter", "", "4"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}}, 2), new String[][]{{"toPrinter", "", "3"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("24", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toPrinter", ""}}), new String[][]{{"parseMutablePeriod", "java.lang.String", "0"}, {"add", "org.joda.time.ReadableDuration", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT-0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -...#235#1109147925", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "1.2L0x1F"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}}), new String[][]{{"parsePeriod", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "1.12-44678901234567", "1E-51.25"}}, 1), new String[][]{{"withParseType", "org.joda.time.PeriodType", "3"}, {"parseMutablePeriod", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String"}, new String[]{"922f3372036854775807"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:4>", "<sample:3>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "1.12345678901234567"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "clear", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:3>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "<a>b</a>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2", "OT1H"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}}, 2), new String[][]{{"appendSeparator", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String", "1.123456,7", "b b"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"", "1.12345678\u00e9", "<sample:3>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<null>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"c5.", "{\"+a!:2}abc"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}}, 2), new String[][]{{"printZeroNever", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:2>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}}, 2), new String[][]{{"clear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{".25"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}}, 3), new String[][]{{"appendSeconds", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMonths", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"appendYears", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"-1073741823"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 2), new String[][]{{"appendWeeks", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendHours", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "OAH"}}, 1), new String[][]{{"appendHours", "", "1"}, {"appendMillis3Digit", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"printZeroIfSupported", "", "5"}, {"printZeroNever", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:3>"}}, 3), new String[][]{{"toPrinter", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}, 2), new String[][]{{"appendYears", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{" Titlle"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}}, 2), new String[][]{{"appendMinutes", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendDays", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "-1000[12]"}}, 1), new String[][]{{"withParseType", "org.joda.time.PeriodType", "3"}, {"parseMutablePeriod", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"null"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}}, 3), new String[][]{{"appendMonths", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"1.123456781.12364567"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}}, 2), new String[][]{{"appendMinutes", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"printZeroRarelyLast", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}}, 2), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String", "7"}, {"maximumParsedDigits", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}, 1), new String[][]{{"printZeroAlways", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:2>"}, false, 0, null, 1), new String[][]{{"appendLiteral", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:4>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "1..25"}}, 3), new String[][]{{"appendSecondsWithMillis", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}}, 2), new String[][]{{"appendMinutes", "", "1"}, {"appendMonths", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}}, 1), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "1.12-456789012234567"}}, 3), new String[][]{{"getParseType", "", "3"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}}, 3), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}}, 1), new String[][]{{"appendWeeks", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:7>", "<sample:3>"}}, 3), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "2"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"L\n"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", "boolean", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", new String[]{"int"}, new String[]{"-1001"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}}, 2), new String[][]{{"appendSeparatorIfFieldsAfter", "java.lang.String", "1"}, {"appendMillis3Digit", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"/a/b", "-000x1G"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "92nf3372036854775807null"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}}, 2), new String[][]{{"printZeroAlways", "", "0"}, {"toPrinter", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<null>", "<sample:3>"}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 3), new String[][]{{"appendSeconds", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toFormatter", ""}}, 1), new String[][]{{"minimumPrintedDigits", "int", "7"}, {"appendSeparator", "java.lang.String,java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"1.e300"}, false, 0, null, 2), new String[][]{{"appendHours", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toFormatter", ""}}, 2), new String[][]{{"maximumParsedDigits", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toPrinter", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}}, 1), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String"}, new String[]{"-1-51.123/a/b"}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}}, 2), new String[][]{{"appendSeparatorIfFieldsBefore", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}}, 3), new String[][]{{"appendPrefix", "java.lang.String", "2"}, {"appendSeparator", "java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:2>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "3"}}, 2), new String[][]{{"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMonths", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "6"}, {"clear", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"a4", "http://1L", "<null>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "toFormatter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}}, 2), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "4"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", ""}}, 2), new String[][]{{"append", "org.joda.time.format.PeriodFormatter", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", new String[]{"int"}, new String[]{"250"}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"5"}, false, 5, new String[][]{}, 1), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "I3147483648"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "{\"a\":2}abd"}}, 1), new String[][]{{"printZeroRarelyLast", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"1.123456c7"}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:1>", "<sample:1>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}}, 3), new String[][]{{"appendSecondsWithMillis", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"=--1", "21470"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "/a0b"}}, 2), new String[][]{{"printZeroIfSupported", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendDays", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendDays", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}}, 1), new String[][]{{"appendMillis3Digit", "", "1"}, {"appendHours", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"CHel>o, World"}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}}, 3), new String[][]{{"rejectSignedValues", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"0xN1F"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "11.25"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1.51.12345678901234567", "9223372036854775807"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "HITLF", "-1-51.123", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", new String[]{"int"}, new String[]{"500"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendDays", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String"}, new String[]{"1.4f"}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendHours", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "http://example.com/a?b=c"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1-51.123/a/b", ".-1"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toFormatter", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "1E-5", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"1e10", "1.12-45678901234567", "<sample:3>"}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "\t"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"I2147483648"}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "http://example.com/a?b=c1.5f", "+1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "clear", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"true"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "{\"a\":2}abc"}}), new String[][]{{"appendPrefix", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"-1"}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"-1073741824"}, false, 4, new String[][]{}), new String[][]{{"appendMonths", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:615."}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "http://example.com/a?b=c"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "clear", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"2147483l647"}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:6>", "<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"1.12345678/a/b"}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toPrinter", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{"nul-1"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendHours", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", ".1"}}), new String[][]{{"printZeroRarelyFirst", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"appendDays", "", "3"}, {"appendPrefix", "java.lang.String,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"92nf3372036854775807", "C"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "\010", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMonths", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"2020-01-01Literal must not be null", "C=", "<sample:0>"}, false, 7, new String[][]{}), new String[][]{{"appendDays", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "e101.5f", "-1null"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "0"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "0"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getPrinter", "", "0"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"126:30:35"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"123456789012345678901234567890", "{\"a\":1}2020-02-30T25:61:61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "4"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "4"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getParser", "", "0"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"nuldl"}, false), new String[][]{{"appendMonths", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false), new String[][]{{"isPrinter", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"appendWeeks", "", "5"}, {"append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "Hello, World12:30:45"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "http:///example.com/a?bb=c1.5f"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"6.", "1.5e300.5"}, false, 3, new String[][]{}), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "toPrinter", ""}}), new String[][]{{"getParser", "", "0"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"print", "org.joda.time.ReadablePeriod", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}}), new String[][]{{"toPrinter", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"1.12348678901234567"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String", "0x1234567891E-5", "922f337037854775807"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "Iabc"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "o020-01-01"}}), new String[][]{{"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "2"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{"o020-01-01"}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "{\"a", "1.6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}}), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "clear", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "null", "1ep10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<null>", "<sample:1>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}}), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "0"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", "int", "6"}}), new String[][]{{"appendDays", "", "3"}, {"appendSeparatorIfFieldsBefore", "java.lang.String", "5"}, {"appendSuffix", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"L", "1.55d"}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", ".-1"}}), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "1.5"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "2147483648"}}), new String[][]{{"getLocale", "", "5"}, {"getParseType", "", "5"}, {"parsePeriod", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMonths", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}), new String[][]{{"appendMinutes", "", "5"}, {"toPrinter", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "1"}, {"withParseType", "org.joda.time.PeriodType", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendHours", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:5>", "<sample:3>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "http://example.com/a?b=c1.12345678"}}, 2), new String[][]{{"append", "org.joda.time.format.PeriodFormatter", "4"}, {"printZeroNever", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}}), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "5"}, {"maximumParsedDigits", "int", "6"}, {"appendSeparator", "java.lang.String,java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"appendPrefix", "java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5dtrue", "-,1"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", "int", "-268435443"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}}, 3), new String[][]{{"appendSeparatorIfFieldsAfter", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Hell3, World", ".-1"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "2020-01-01"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", new String[]{"int"}, new String[]{"1013"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "2020-01-01", "/Xa/b"}}, 2), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"1000", "PTH0", "<sample:2>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}}, 2), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "clear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "21474583648"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", "int", "-246"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"print", "org.joda.time.ReadablePeriod", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:5>"}}), new String[][]{{"getParser", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "TITLELjteral must not be null"}}, 2), new String[][]{{"printZeroIfSupported", "", "0"}, {"appendSecondsWithMillis", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}}, 3), new String[][]{{"appendSecondsWithOptionalMillis", "", "4"}, {"appendDays", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "Io2147483648", "I214748b6483"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String", "1.25", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendHours", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", ""}}, 3), new String[][]{{"appendSeparatorIfFieldsBefore", "java.lang.String", "0"}, {"appendLiteral", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "-000 1F"}}, 3), new String[][]{{"printZeroAlways", "", "2"}, {"appendSeparatorIfFieldsBefore", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}}), new String[][]{{"appendSecondsWithMillis", "", "1"}, {"toParser", "", "5"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:2>"}}, 3), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}}), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:4>", "<sample:1>"}, false), new String[][]{{"toFormatter", "", "0"}, {"parseMutablePeriod", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"10"}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "i"}}, 2), new String[][]{{"appendSuffix", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMonths", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}}, 3), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "1.12-1.1234567"}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:3>"}}), new String[][]{{"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "e "}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "6"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", ""}}), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "4"}, {"toPrinter", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}}, 2), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", "int", "990"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}}), new String[][]{{"appendSeparator", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}}), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", "int", "-2147483648"}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:0>"}}), new String[][]{{"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toFormatter", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}}, 1), new String[][]{{"getParser", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}}, 2), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "2"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}}), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod", "7"}, {"isPrinter", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:7>", "<sample:1>"}}), new String[][]{{"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}}, 1), new String[][]{{"appendMinutes", "", "7"}, {"printZeroNever", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "t"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}}, 3), new String[][]{{"print", "org.joda.time.ReadablePeriod", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", "int", "0"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}}), new String[][]{{"parsePeriod", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}}), new String[][]{{"withLocale", "java.util.Locale", "3"}, {"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "100", "", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"m"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "I2147483648"}}, 1), new String[][]{{"printZeroAlways", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "``"}}), new String[][]{{"toFormatter", "", "0"}, {"getParseType", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"getParseType", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:6>", "<sample:10>"}}, 1), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "6"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", "int", "2147483647"}}, 2), new String[][]{{"appendSeparatorIfFieldsBefore", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toFormatter", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:6>"}}), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}}), new String[][]{{"parsePeriod", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "D"}}), new String[][]{{"parseMutablePeriod", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false), new String[][]{{"getLocale", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", ""}}), new String[][]{{"toFormatter", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "", "0x123X56789"}}, 2), new String[][]{{"getPrinter", "", "0"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:1>", "<null>"}, false, 3, new String[][]{}), new String[][]{{"appendSecondsWithOptionalMillis", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "4"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "4"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Tle", "Uitle"}, false, 2, new String[][]{}), new String[][]{{"appendMonths", "", "1"}, {"toFormatter", "", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "I21474836480"}}, 1), new String[][]{{"getParseType", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}), new String[][]{{"toFormatter", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}}), new String[][]{{"appendSecondsWithOptionalMillis", "", "4"}, {"toPrinter", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:3>", "<sample:4>"}, false, 0, null, 2), new String[][]{{"appendMonths", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}}), new String[][]{{"appendSeparatorIfFieldsAfter", "java.lang.String", "0"}, {"appendSeparatorIfFieldsBefore", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:1>", "<sample:10>"}, false, 0, null, 1), new String[][]{{"printZeroIfSupported", "", "3"}, {"minimumPrintedDigits", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "1.12345678901234567"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}}), new String[][]{{"parseMutablePeriod", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "<a>b</a>"}}), new String[][]{{"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "Title5."}, false, 0, null, 3), new String[][]{{"appendSeconds", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendDays", new String[]{}, new String[]{}, false), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String", "0"}, {"appendSuffix", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}}), new String[][]{{"parseMutablePeriod", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendHours", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}}), new String[][]{{"appendSecondsWithMillis", "", "5"}, {"toParser", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "C"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "No formatter supplied"}}), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}}, 2), new String[][]{{"appendSuffix", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"3"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}}), new String[][]{{"appendPrefix", "java.lang.String,java.lang.String", "1"}, {"appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}}, 2), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "5"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"isParser", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false), new String[][]{{"appendPrefix", "java.lang.String,java.lang.String", "0"}, {"appendSuffix", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "{b\":2}abc", "No formatter suppBied", "<sample:0>"}}), new String[][]{{"toParser", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}}, 2), new String[][]{{"getParseType", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"[1,3]"}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:0>", "<null>"}}), new String[][]{{"appendHours", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"-2100"}, false, 0, null, 2), new String[][]{{"appendSuffix", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", ""}}), new String[][]{{"toPrinter", "", "1"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getPrinter", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", new String[]{}, new String[]{}, false), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false), new String[][]{{"toParser", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http://example.com/a?b=c1.5fTITLE", "-1"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "2020-03-30T25:61:61"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}), new String[][]{{"printZeroIfSupported", "", "1"}, {"toFormatter", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c1.5f1.5f"}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "1.25E", ".51.5f"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "922f3372036854775807", "5F", "<sample:0>"}}, 3), new String[][]{{"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "0"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "{\"a\":1"}}, 2), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{"Literal must not be numl"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "1.25"}}, 1), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:7>", "<sample:0>"}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toFormatter", ""}}), new String[][]{{"toParser", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
}
