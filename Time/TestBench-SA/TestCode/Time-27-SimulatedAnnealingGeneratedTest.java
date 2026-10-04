package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "123456789012345678901234567890"}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}}), new String[][]{{"appendWeeks", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "<null>"}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}}), new String[][]{{"appendWeeks", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"1.21233567890123H567"}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "12:30:45No formatter supplied"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "true", "<null>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "{\"a\":}"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<null>"}}), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "0"}, {"parseMutablePeriod", "java.lang.String", "0"}, {"setDays", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P2D {getDays=2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 2, 0, 0, 0, 0], getW...#227#1461548186", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "+1"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "--1", "1.5f", "<null>"}}), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "0"}, {"parseMutablePeriod", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "--,[", "0w1Fabc", "<sample:3>"}}), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "6"}, {"parseMutablePeriod", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:5>", "<sample:5>"}}), new String[][]{{"getLocale", "", "6"}, {"parseMutablePeriod", "java.lang.String", "6"}, {"setPeriod", "long,org.joda.time.Chronology", "6"}, {"setSeconds", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0.003S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=3, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 3],...#232#176473280", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 34, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "1-212345L67", "a"}}), new String[][]{{"isPrinter", "", "4"}, {"parseMutablePeriod", "java.lang.String", "2"}, {"setPeriod", "long,org.joda.time.Chronology", "6"}, {"addMinutes", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT2147483647M0.003S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=3, getMinutes=2147483647, getMonths=0, getSeconds=0, getValues=[0, 0...#261#1691527789", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "22<D9>8c;/.`>"}}, 3), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "5"}, {"parseMutablePeriod", "java.lang.String", "2"}, {"copy", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\t", "1.25"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:6>", "<sample:0>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "<null>"}}), new String[][]{{"appendMinutes", "", "3"}, {"appendMillis3Digit", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendHours", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "clear", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "5"}}), new String[][]{{"printZeroNever", "", "1"}, {"clear", "", "1"}, {"appendSuffix", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "TIUXeLMD"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "1E-5", "1.5f", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String"}, new String[]{"PT1H/aXb"}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "<null>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"-936"}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "9223372036854775807", "\u00e9", "<null>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "123456789012345678901234567890"}}), new String[][]{{"appendMillis3Digit", "", "7"}, {"toPrinter", "", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String"}, new String[]{"TIUXeLM/"}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{""}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}}, 1), new String[][]{{"toFormatter", "", "2"}, {"parseMutablePeriod", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"z\"a#:}55r"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "2020-01-01"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "--1", "0Ex123456789"}}, 2), new String[][]{{"toFormatter", "", "2"}, {"parseMutablePeriod", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"ieUZeLd/"}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String", "100r0", "3"}}, 3), new String[][]{{"toFormatter", "", "1"}, {"parseMutablePeriod", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"yy7\"\",a#9}"}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "KPT1H.52020-02-30T25:61:61", "<a>b<a>", "<empty>"}}), new String[][]{{"toFormatter", "", "5"}, {"parseMutablePeriod", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"<a?b<a>"}, false, 15, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "", "0"}}), new String[][]{{"toFormatter", "", "3"}, {"parseMutablePeriod", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:8>"}}, 2), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http://example.com/a?b=c", "5."}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:5>", "<null>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "2147483648", "KPT1H.52020-02-30T25:61:61"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "2020-02-30T25:61:61", "ieUZeLd/"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "1e10"}}), new String[][]{{"appendSeparatorIfFieldsAfter", "java.lang.String", "5"}, {"printZeroIfSupported", "", "0"}, {"appendSeparator", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:51:61"}, false, 10, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "/a.1b", "1-21n34aL672147483638"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "5", "2147483647", "<sample:3>"}}, 1), new String[][]{{"appendMillis3Digit", "", "3"}, {"appendSecondsWithMillis", "", "6"}, {"toFormatter", "", "4"}, {"parsePeriod", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"N"}, false, 13, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "", "1-Pi2n34`"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "aca", "a b", "<sample:0>"}}, 1), new String[][]{{"appendDays", "", "3"}, {"appendSecondsWithMillis", "", "6"}, {"toFormatter", "", "5"}, {"parsePeriod", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"O}"}, false, 8, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "sb1022/5300[0x123345678", "1-211n34aM6721474+3638"}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}}), new String[][]{{"appendSecondsWithMillis", "", "5"}, {"appendSeconds", "", "6"}, {"toFormatter", "", "5"}, {"parseMutablePeriod", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String", "1E-5", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{""}, false, 14, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "TIVXdsMC", "]\nt"}, {"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}}, 2), new String[][]{{"appendMinutes", "", "2"}, {"appendSeparatorIfFieldsBefore", "java.lang.String", "1"}, {"toFormatter", "", "2"}, {"parsePeriod", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "-5,[", ""}}, 3), new String[][]{{"appendMinutes", "", "3"}, {"appendSuffix", "java.lang.String", "5"}, {"toFormatter", "", "5"}, {"parsePeriod", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:3>", "<null>"}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "clear", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "P\rHtrte"}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:3>"}}), new String[][]{{"toParser", "", "2"}, {"printZeroIfSupported", "", "3"}, {"printZeroNever", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 36, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "Lteran mtst not!be nulnull.-1"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "1-211n34aM6721474+3638", "1-211n34aM6721474+3638", "<sample:0>"}}), new String[][]{{"printZeroIfSupported", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"sb1022/5300[0x123345678", "1-212345L67"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "<null>"}}, 1), new String[][]{{"maximumParsedDigits", "int", "0"}, {"toPrinter", "", "3"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"[100+,]<m>>/<aa0a>", "PT1H/aXb"}, false, 11, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:3>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "N"}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:8>"}}, 2), new String[][]{{"toPrinter", "", "3"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "6"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2020-01-01", "P5Ue"}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:2>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "2020-02-30T25:1[:61"}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:8>"}}), new String[][]{{"toPrinter", "", "3"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "5"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"--1", "<null>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "\u00e9"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}}, 1), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "4"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "6"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}}, 1), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "4"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "6"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "Title", "2"}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "5"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "2"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "6"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "", "No formatter supplied010"}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "4"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "0220-L02-30T21.5e300"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "Maa\taadaaaaahaaaaaabaabaa-aaaba010", "2147483647-1"}}, 3), new String[][]{{"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "5"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "4"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("55", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{";]\nt", "1030-01i2-30"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "2020-02-30T25:51:61"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"toParser", "", "0"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}}, 1), new String[][]{{"printZeroNever", "", "6"}, {"appendSuffix", "java.lang.String", "4"}, {"toFormatter", "", "7"}, {"parsePeriod", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "No formatter supplied"}}, 1), new String[][]{{"printZeroNever", "", "1"}, {"appendSuffix", "java.lang.String", "4"}, {"toFormatter", "", "1"}, {"parsePeriod", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"2020-02-30T25:1[:61", "0-Oi2n34`", "<sample:0>"}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<null>", "<sample:5>"}, {"org.joda.time.format.PeriodFormatterBuilder", "toPrinter", ""}}, 2), new String[][]{{"toParser", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:0>", "<null>"}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", ""}}), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "4"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", new String[]{}, new String[]{}, false, 33, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "<a>bba>21474F36491.5e300"}}, 1), new String[][]{{"appendMonths", "", "1"}, {"toParser", "", "3"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}}, 1), new String[][]{{"printZeroAlways", "", "4"}, {"appendDays", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"s11"}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}, 1), new String[][]{{"appendSuffix", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"s1111.5e300"}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", "boolean", "true"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "123456789012345678901234567890"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}, 1), new String[][]{{"appendSuffix", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "toPrinter", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "clear", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toPrinter", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"PU1H", "Lteral must not be null", "<sample:2>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"PU1H", "Lteral must not be nullnull", "<null>"}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"1.5f", "Lteral must not be nullnull--1", "<null>"}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}}, 3), new String[][]{{"appendWeeks", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{".0.5f1000", "1", "<null>"}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "s1111.5e300", "5"}, {"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", new String[]{"int"}, new String[]{"1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", new String[]{"int"}, new String[]{"5"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", "boolean", "true"}}, 2), new String[][]{{"appendSeconds", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{}, 2), new String[][]{{"appendSeconds", "", "4"}, {"appendMillis3Digit", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", new String[]{"int"}, new String[]{"1073741823"}, false, 4, new String[][]{}, 2), new String[][]{{"appendSeconds", "", "4"}, {"appendMillis3Digit", "", "4"}, {"appendSeparator", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"null"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", new String[]{"int"}, new String[]{"-67108858"}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}}, 2), new String[][]{{"appendSeconds", "", "4"}, {"appendMillis3Digit", "", "3"}, {"appendSeparator", "java.lang.String", "7"}, {"appendMinutes", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", new String[]{"int"}, new String[]{"-2147483648"}, false, 9, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}}, 2), new String[][]{{"printZeroAlways", "", "4"}, {"appendMillis3Digit", "", "3"}, {"append", "org.joda.time.format.PeriodFormatter", "3"}, {"appendYears", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", ".5", "0x123456789"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Hello, World", "4"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", ""}}, 3), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "0"}, {"parseMutablePeriod", "java.lang.String", "0"}, {"setDays", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P2D {getDays=2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 2, 0, 0, 0, 0], getW...#227#1461548186", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "--1", "1.5f", "<empty>"}}, 1), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "0"}, {"parseMutablePeriod", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "--1", "1.5f", "<null>"}}, 3), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "0"}, {"parseMutablePeriod", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "--1", "1.5fNo formatter supplied", "<null>"}}, 3), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "0"}, {"parseMutablePeriod", "java.lang.String", "0"}, {"addHours", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT3H {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=3, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 3, 0, 0, 0], get...#228#204890603", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "--1", "1.5fNo formatter supplied", "<null>"}}, 3), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "0"}, {"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "-,[1", "1.5fNo for", "<null>"}, {"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}}, 1), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendDays", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toFormatter", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}}, 2), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "6"}, {"parseMutablePeriod", "java.lang.String", "2"}, {"setPeriod", "long,org.joda.time.Chronology", "6"}, {"addMinutes", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0.003S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=3, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 3],...#232#176473280", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:3>", "<sample:3>"}}, 2), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "6"}, {"parseMutablePeriod", "java.lang.String", "2"}, {"setPeriod", "long,org.joda.time.Chronology", "6"}, {"setWeeks", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P-2147483648WT0.003S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=3, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, -21474...#264#1068861647", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"3"}, false, 0, null, 3), new String[][]{{"appendMillis", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<null>", "<sample:5>"}}, 2), new String[][]{{"getLocale", "", "6"}, {"parseMutablePeriod", "java.lang.String", "2"}, {"setPeriod", "long,org.joda.time.Chronology", "6"}, {"setSeconds", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0.003S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=3, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 3],...#232#176473280", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:4>", "<sample:5>"}}, 2), new String[][]{{"getLocale", "", "6"}, {"parseMutablePeriod", "java.lang.String", "2"}, {"setPeriod", "long,org.joda.time.Chronology", "6"}, {"setSeconds", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0.003S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=3, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 3],...#232#176473280", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:5>", "<sample:5>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "s1111.5e300", "123456789012345678901234567890", "<null>"}}, 2), new String[][]{{"getLocale", "", "6"}, {"parseMutablePeriod", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "0", "-0.0"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:5>", "<sample:5>"}}, 2), new String[][]{{"getLocale", "", "6"}, {"parseMutablePeriod", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "clear", ""}}, 1), new String[][]{{"minimumPrintedDigits", "int", "5"}, {"appendWeeks", "", "7"}, {"printZeroNever", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", "int", "-1"}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:0>", "<sample:0>"}}, 2), new String[][]{{"isPrinter", "", "6"}, {"parseMutablePeriod", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 37, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", "int", "-1"}}, 2), new String[][]{{"isPrinter", "", "0"}, {"parseMutablePeriod", "java.lang.String", "2"}, {"setPeriod", "long,org.joda.time.Chronology", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 37, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", "int", "-1"}}, 2), new String[][]{{"isPrinter", "", "0"}, {"parseMutablePeriod", "java.lang.String", "2"}, {"setPeriod", "long,org.joda.time.Chronology", "6"}, {"getFieldTypes", "", "6"}});
  assertNotNull(actual);
  assertEquals("[Lorg.joda.time.DurationFieldType;", actual.getClass().getName());
  assertEquals("[years, months, weeks, days, hours, minutes, seconds, millis]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 37, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", "int", "-1"}}, 2), new String[][]{{"isPrinter", "", "0"}, {"parseMutablePeriod", "java.lang.String", "2"}, {"setPeriod", "long,org.joda.time.Chronology", "6"}, {"addMinutes", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT2M0.003S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=3, getMinutes=2, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 2, 0, 3...#234#-1714015265", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}}, 1), new String[][]{{"isPrinter", "", "0"}, {"parseMutablePeriod", "java.lang.String", "2"}, {"setPeriod", "long,org.joda.time.Chronology", "6"}, {"addMinutes", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT2M0.003S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=3, getMinutes=2, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 2, 0, 3...#234#-1714015265", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"isPrinter", "", "0"}, {"parseMutablePeriod", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}}, 1), new String[][]{{"isPrinter", "", "0"}, {"parseMutablePeriod", "java.lang.String", "2"}, {"setPeriod", "long,org.joda.time.Chronology", "6"}, {"addMinutes", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT-1M0.003S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=3, getMinutes=-1, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, -1, 0...#237#371609333", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}}, 1), new String[][]{{"isPrinter", "", "4"}, {"parseMutablePeriod", "java.lang.String", "2"}, {"setPeriod", "long,org.joda.time.Chronology", "6"}, {"addMinutes", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT-1M0.003S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=3, getMinutes=-1, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, -1, 0...#237#371609333", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}, 1), new String[][]{{"isPrinter", "", "4"}, {"parseMutablePeriod", "java.lang.String", "2"}, {"setPeriod", "long,org.joda.time.Chronology", "1"}, {"addMinutes", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT-1M0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=-1, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, -1, ...#239#-1206453507", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}, 1), new String[][]{{"isPrinter", "", "4"}, {"parseMutablePeriod", "java.lang.String", "2"}, {"setPeriod", "long,org.joda.time.Chronology", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0.003S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=3, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 3],...#232#176473280", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}, 1), new String[][]{{"isPrinter", "", "4"}, {"parseMutablePeriod", "java.lang.String", "2"}, {"setPeriod", "long,org.joda.time.Chronology", "6"}, {"addMinutes", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT2147483647M0.003S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=3, getMinutes=2147483647, getMonths=0, getSeconds=0, getValues=[0, 0...#261#1691527789", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:5>", "<sample:3>"}}, 3), new String[][]{{"isPrinter", "", "4"}, {"parseMutablePeriod", "java.lang.String", "2"}, {"setPeriod", "long,org.joda.time.Chronology", "6"}, {"addMinutes", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT2147483647M0.003S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=3, getMinutes=2147483647, getMonths=0, getSeconds=0, getValues=[0, 0...#261#1691527789", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 34, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "1-212345L67", "atrue"}}, 3), new String[][]{{"isPrinter", "", "5"}, {"parseMutablePeriod", "java.lang.String", "2"}, {"setPeriod", "long,org.joda.time.Chronology", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0.003S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=3, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 3],...#232#176473280", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 36, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "1-212345L67", "atrue"}}, 3), new String[][]{{"isPrinter", "", "5"}, {"parseMutablePeriod", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "Hello, World", "attue\tabc"}}, 2), new String[][]{{"isPrinter", "", "6"}, {"parseMutablePeriod", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 41, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toFormatter", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "Hello, World", "t"}}, 2), new String[][]{{"isPrinter", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:3>", "<sample:4>"}}, 2), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "rue"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "1e10", ""}}, 1), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "5"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "2"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "2<a>b</a>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "5.", ""}}, 3), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, null, 3), new String[][]{{"appendSeconds", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{"3"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMonths", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"attue\tabc", "2147483647", "<sample:3>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", ""}}, 1), new String[][]{{"appendMillis3Digit", "", "7"}, {"maximumParsedDigits", "int", "2"}, {"appendSeparatorIfFieldsAfter", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1e10", "Title"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "2020-02-30T25:61:61", "\u00e9"}}, 2), new String[][]{{"appendSeparator", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", new String[]{"int"}, new String[]{"7"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", " 3mull", "1020-012-30S25:6:E61-1"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "PT1H"}}, 2), new String[][]{{"getParser", "", "0"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", "int", "5"}}, 3), new String[][]{{"appendSecondsWithOptionalMillis", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String", "Literal must not be null", " 3mull"}, {"org.joda.time.format.PeriodFormatterBuilder", "clear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 1), new String[][]{{"appendSeconds", "", "3"}, {"appendMillis", "", "1"}, {"appendWeeks", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5e300", "12:30:45No formatter supplied"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "1E-5", "a,b,c"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"9"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"appendLiteral", "java.lang.String", "2"}, {"appendPrefix", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}}, 2), new String[][]{{"appendSeparator", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", "int", "9"}, {"org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", "int", "3"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}}), new String[][]{{"printZeroNever", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}}), new String[][]{{"printZeroAlways", "", "4"}, {"appendDays", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", new String[]{"boolean"}, new String[]{"true"}, false), new String[][]{{"appendWeeks", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "{\"a\":1}"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"2147483647"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"+0\t"}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "rue", "<null>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "{\"a\":}5"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"4"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}), new String[][]{{"appendMillis", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"s11"}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}), new String[][]{{"appendSuffix", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a,b,c", "rue"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "toPrinter", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"PT1H", "Literal must not be null", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x123456789", "4"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", new String[]{"int"}, new String[]{"2"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}}), new String[][]{{"getLocale", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{"I"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", "int", "-67108858"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}}), new String[][]{{"getLocale", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"4"}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", ""}}), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "0"}, {"parseMutablePeriod", "java.lang.String", "0"}, {"setDays", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P2D {getDays=2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 2, 0, 0, 0, 0], getW...#227#1461548186", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", ""}}), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "0"}, {"parseMutablePeriod", "java.lang.String", "0"}, {"setDays", "int", "5"}, {"getMinutes", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "0"}}), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "0"}, {"parseMutablePeriod", "java.lang.String", "0"}, {"setDays", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P2D {getDays=2, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 2, 0, 0, 0, 0], getW...#227#1461548186", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"3", "\u00e9", "<sample:0>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toFormatter", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", "int", "-1"}}), new String[][]{{"appendMillis3Digit", "", "7"}, {"appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", ""}}), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "0"}, {"parseMutablePeriod", "java.lang.String", "0"}, {"setDays", "int", "5"}, {"getPeriodType", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Standard] {getName=Standard, size=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", ""}}), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "0"}, {"parseMutablePeriod", "java.lang.String", "0"}, {"setMonths", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P2M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=2, getSeconds=0, getValues=[0, 2, 0, 0, 0, 0, 0, 0], getW...#227#508815011", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "0"}, {"parseMutablePeriod", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "0"}, {"parseMutablePeriod", "java.lang.String", "0"}, {"add", "org.joda.time.ReadablePeriod", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P1D {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1, 0, 0, 0, 0], getW...#227#-469983333", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}}), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "0"}, {"parseMutablePeriod", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "--1", "1.5f", "<null>"}}), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "0"}, {"parseMutablePeriod", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "--1", "1.5f", "<null>"}}), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "0"}, {"parseMutablePeriod", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}}), new String[][]{{"appendSeparator", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendDays", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "--[1", "1.5fNo formatter supplied", "<null>"}}), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "0"}, {"getPrinter", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "-,[1", "1.5fNo formatter supplied", "<null>"}}), new String[][]{{"getParser", "", "0"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "-,[1", "1.5fNo formatter supplied", "<null>"}, {"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}}), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "0"}, {"parseMutablePeriod", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "-,[1", "1.5fNo formatter supplied", "<null>"}, {"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}}), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "0"}, {"parseMutablePeriod", "java.lang.String", "0"}, {"add", "long,org.joda.time.Chronology", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "-,[1", "1.5fNo formatter supplied", "<null>"}, {"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}}), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "4"}, {"parseMutablePeriod", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", "boolean", "true"}}), new String[][]{{"printZeroIfSupported", "", "4"}, {"rejectSignedValues", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "-,[", "i", "<sample:0>"}}), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "0"}, {"parseMutablePeriod", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "-,[", "12:30:45No formatter supplied", "<sample:0>"}}), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "0"}, {"print", "org.joda.time.ReadablePeriod", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "{\"a\":}", "1.12345678901234567"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "-,[", "12:30:45No formatter supplied", "<empty>"}}), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "0"}, {"parseMutablePeriod", "java.lang.String", "4"}, {"clear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PU1H", "1.5e300"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendHours", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toFormatter", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "-,[", "12:30:45No formatter supplied", "<sample:0>"}}), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "6"}, {"parseMutablePeriod", "java.lang.String", "4"}, {"add", "long,org.joda.time.Chronology", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0.003S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=3, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 3],...#232#176473280", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:6>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"rue"}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "toFormatter", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"rue", "Title"}, false), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String"}, new String[]{"--1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", "int", "2147483647"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendHours", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String", "i", "1.12345678901234567"}}), new String[][]{{"appendDays", "", "2"}, {"toPrinter", "", "4"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "Hello, World", "attue\tabc"}}), new String[][]{{"isPrinter", "", "6"}, {"parseMutablePeriod", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMonths", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toFormatter", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMonths", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}), new String[][]{{"toPrinter", "", "4"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"[1,2]", "Lteral must not be nullnull", "<null>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}}), new String[][]{{"maximumParsedDigits", "int", "5"}, {"appendSuffix", "java.lang.String,java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5f", "1.1234567890123456"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendDays", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "PU1H"}}), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "5"}, {"appendSuffix", "java.lang.String,java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"i"}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "1-212345L67"}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-,[", "Title"}, false), new String[][]{{"appendLiteral", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", new String[]{}, new String[]{}, false), new String[][]{{"appendSeconds", "", "2"}, {"toParser", "", "0"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}}), new String[][]{{"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "<null>", "attue\tabc", "<empty>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", new String[]{"int"}, new String[]{"999"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"1000"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "1.1234567890123456"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "0", "1000", "<sample:0>"}}), new String[][]{{"appendMonths", "", "3"}, {"toPrinter", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "clear", ""}}, 2), new String[][]{{"appendLiteral", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"attue\tabc"}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "1.5fNo formatter supplied", "+1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 12, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "-,[1", "2020-02-30T25:61:61\t", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "clear", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", "boolean", "false"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "1", "010"}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:5>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"1E-"}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "l;", "010"}, {"org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", "boolean", "false"}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:4>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"1E-T"}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", "boolean", "false"}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:6>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}}), new String[][]{{"appendPrefix", "java.lang.String,java.lang.String", "0"}, {"toParser", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "5"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"-67108858"}, false), new String[][]{{"toParser", "", "0"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"-33554429"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}}), new String[][]{{"toParser", "", "0"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"-33554429"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}}, 3), new String[][]{{"toParser", "", "0"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"-503316454"}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 3), new String[][]{{"toParser", "", "0"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "1"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"1000"}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"toParser", "", "0"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "1"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"-2147483648"}, false, 9, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "toFormatter", ""}}), new String[][]{{"toParser", "", "0"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "1"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"-536903659"}, false, 10, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "toFormatter", ""}}, 2), new String[][]{{"toParser", "", "0"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "1"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"33556432"}, false, 11, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 2), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String", "5"}, {"printZeroRarelyLast", "", "6"}, {"maximumParsedDigits", "int", "1"}, {"appendSeparator", "java.lang.String,java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"-2190"}, false, 11, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"toParser", "", "5"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "6"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String"}, new String[]{"--,["}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", new String[]{}, new String[]{}, false), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "5"}, {"appendSeparator", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "5"}, {"appendSeparator", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "s11", "0"}}, 2), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "5"}, {"appendSeparator", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "s11No formatter supplied", "h70abc"}, {"org.joda.time.format.PeriodFormatterBuilder", "toFormatter", ""}}, 3), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMonths", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "{\"a\":}5", "No formatter supplied", "<sample:1>"}, {"org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", "boolean", "true"}}), new String[][]{{"toParser", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:2>", "<sample:6>"}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "2020-01-01"}}), new String[][]{{"append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "3"}, {"toFormatter", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMonths", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "Lteram mtst not be nulnull.-1"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMonths", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "Lteran mtst not!be nulnull.-1"}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:3>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMonths", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "Lteran mtst not!be nulnull.-1"}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:3>", "<null>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "2147483648", "\u00e9", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMonths", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "Lteran mtst not!be nulnull.-1"}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:3>", "<null>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "2147483648", "\u00e9", "<sample:3>"}}, 1), new String[][]{{"appendHours", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMonths", new String[]{}, new String[]{}, false, 21, new String[][]{}, 3), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String", "6"}, {"printZeroNever", "", "0"}, {"appendSeparator", "java.lang.String,java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"u205"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "aIaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<"}}), new String[][]{{"appendSuffix", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"3Lsera utt not bt nullnull3"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "2/"}, {"org.joda.time.format.PeriodFormatterBuilder", "toFormatter", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}}, 2), new String[][]{{"appendSuffix", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"Lueram musi noot be!n/ mlnulla1"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "0xFFFFFFFF", " 3mu\tll"}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}}, 1), new String[][]{{"appendSuffix", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "1.25", "9223372036854775807", "<sample:1>"}}, 1), new String[][]{{"appendSeparatorIfFieldsAfter", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"appendSeparatorIfFieldsAfter", "java.lang.String", "1"}, {"appendSeparatorIfFieldsAfter", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "aaaaaaaaaaaaaxaaaaaaaaaaaaaaaa"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "1"}, {"appendHours", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{"<a>b<+a"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendHours", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "6PT1H"}}, 1), new String[][]{{"appendMillis", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"maximumParsedDigits", "int", "1"}, {"printZeroIfSupported", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aaaa", "TIUXdLM|D"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "1E-5", "1.5f", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aca", "TIVXdLM|D"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"aca", "TIVXdsM|C"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "abc", "1000"}, {"org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", "int", "9"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", new String[]{"boolean"}, new String[]{"false"}, false), new String[][]{{"appendSuffix", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String"}, new String[]{"Lteral must not be numlnullhttp;//Aexample.com/a?b=c"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}}, 2), new String[][]{{"printZeroAlways", "", "0"}, {"appendMillis3Digit", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, null, 3), new String[][]{{"appendLiteral", "java.lang.String", "0"}, {"appendSuffix", "java.lang.String,java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{"020"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", "int", "8"}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toPrinter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String"}, new String[]{"12:30:45No formatter supplied"}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "PU1H"}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String"}, new String[]{"TIUXeLM/"}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:3>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a b", "PT1H"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "Lteral must not be nullnull"}}), new String[][]{{"appendSeparatorIfFieldsAfter", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", "boolean", "false"}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:6>", "<sample:6>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}}, 2), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "4"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 2, new String[][]{}, 1), new String[][]{{"appendPrefix", "java.lang.String,java.lang.String", "0"}, {"toPrinter", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"1d.5"}, false, 2, new String[][]{}), new String[][]{{"appendPrefix", "java.lang.String,java.lang.String", "0"}, {"toPrinter", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"{\"a\":}"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"appendPrefix", "java.lang.String,java.lang.String", "0"}, {"toPrinter", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}}), new String[][]{{"toFormatter", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}}, 1), new String[][]{{"toFormatter", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}}), new String[][]{{"appendPrefix", "java.lang.String", "6"}, {"append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", "boolean", "true"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "I"}}, 3), new String[][]{{"appendPrefix", "java.lang.String", "6"}, {"append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "rue", "[1T2]"}, {"org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", "boolean", "true"}}, 3), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "2"}, {"appendSecondsWithMillis", "", "3"}, {"appendSecondsWithMillis", "", "3"}, {"appendSeconds", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1010-012.30S25:P:E61-1", "teran mtst not!be nulnuml--1Hello, Worldnull"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:10>"}, {"org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", "int", "2147483639"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "Hello, World", "i"}}), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"1.1234577890\"2345612:30:45", ".1.m6e1l00.5", "<sample:0>"}, false, 13, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "\""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toFormatter", ""}}, 1), new String[][]{{"appendWeeks", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"appendMinutes", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"appendMinutes", "", "1"}, {"appendMillis3Digit", "", "0"}, {"appendSeconds", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{"iii"}, false, 15, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "-,[", "0x123456789", "<sample:3>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}}, 1), new String[][]{{"appendSeparatorIfFieldsBefore", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}}), new String[][]{{"appendLiteral", "java.lang.String", "3"}, {"printZeroRarelyFirst", "", "7"}, {"toFormatter", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"4"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}}, 2), new String[][]{{"appendLiteral", "java.lang.String", "3"}, {"printZeroRarelyFirst", "", "7"}, {"toFormatter", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"3123456789012345678901234467890"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "TIVX"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendDays", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String", "0xFFFFFFFF", "22<D9>8c;/.`>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", new String[]{}, new String[]{}, false), new String[][]{{"appendSuffix", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "clear", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", ""}}), new String[][]{{"printZeroIfSupported", "", "1"}, {"toPrinter", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:7>", "<sample:5>"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "s11"}}, 1), new String[][]{{"appendPrefix", "java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:2>", "<null>"}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "a,b,c"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"--,[", "PT1H/aXb"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", " 3mull"}}, 3), new String[][]{{"appendSecondsWithOptionalMillis", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:7>", "<sample:0>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "Lteran mtst not!be nulnull.-1", "a2", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:5>", "<sample:2>"}, false, 14, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:7>", "<sample:0>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}}, 2), new String[][]{{"appendSeparator", "java.lang.String", "4"}, {"appendSeparator", "java.lang.String,java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "0"}, {"appendSuffix", "java.lang.String,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis", new String[]{}, new String[]{}, false), new String[][]{{"appendPrefix", "java.lang.String,java.lang.String", "0"}, {"appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "TITP"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "1020-012-30S25:6:E61-15", "<sample:3>"}}, 3), new String[][]{{"appendPrefix", "java.lang.String", "1"}, {"appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
}
