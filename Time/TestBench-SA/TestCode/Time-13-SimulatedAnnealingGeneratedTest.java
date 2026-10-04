package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "{\"a\":1}"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "{#a:1}"}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<null>", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "+2"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "1.1234567890123456"}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "2"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "2"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "4"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "No formatter supplied"}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:2>"}}), new String[][]{{"toFormatter", "", "6"}, {"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "5"}, {"parsePeriod", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "No formatter supplied"}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:4>"}}), new String[][]{{"toFormatter", "", "6"}, {"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "5"}, {"parsePeriod", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "", "2020-01-01-1", "<sample:2>"}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", ""}}, 3), new String[][]{{"toFormatter", "", "6"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "7"}, {"parsePeriod", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "5.", "b13\u00e9"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "tb03\u00e9", "2010-/1-0[-1", "<sample:4>"}}), new String[][]{{"toFormatter", "", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "5"}, {"parsePeriod", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "1.5d"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "3nnla\n", "r:+c"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "bcib0", ".5", "<sample:3>"}}), new String[][]{{"toFormatter", "", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "1"}, {"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "6"}, {"print", "org.joda.time.ReadablePeriod", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3nnla\n1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "3nnla\n", "r:+c"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "bcib0", ".5", "<sample:3>"}}), new String[][]{{"toFormatter", "", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "2"}, {"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "6"}, {"print", "org.joda.time.ReadablePeriod", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("r:+c0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "<null>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "2157483B47", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "[++\nr", "", "<sample:4>"}}), new String[][]{{"toFormatter", "", "5"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "6"}, {"parseMutablePeriod", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}}, 1), new String[][]{{"appendSuffix", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "Ib"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "0/"}}, 2), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", "int", "0"}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "}5/P"}}), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "7"}, {"toParser", "", "4"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 43, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "}5/P1.5fa b"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "~51P", "bcib0"}}), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "7"}, {"toParser", "", "4"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("21", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "h>tt"}}, 3), new String[][]{{"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "5"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "<null>"}}, 2), new String[][]{{"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "t-100"}}), new String[][]{{"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "0"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "\rc2>b/", "<null>", "<empty>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "12:30:45"}}, 3), new String[][]{{"toFormatter", "", "5"}, {"parsePeriod", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "\rc2>b/", "5.", "<empty>"}}, 3), new String[][]{{"toFormatter", "", "5"}, {"parsePeriod", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"cb1\t", "Literal must not be null"}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}}), new String[][]{{"appendPrefix", "java.lang.String", "6"}, {"toFormatter", "", "1"}, {"parsePeriod", "java.lang.String", "6"}, {"plusSeconds", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT1S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=1, getValues=[0, 0, 0, 0, 0, 0, 1, 0], get...#228#2049899708", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2010-01-0I-1", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}}, 2), new String[][]{{"toPrinter", "", "7"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "4"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "7"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:7>", "<null>"}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "clear", ""}}), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "abc"}, {"org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", "int", "4"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}}), new String[][]{{"parsePeriod", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "http://exaample.com/a?b=c12:30:45a b--1"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}}, 3), new String[][]{{"parsePeriod", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 93, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "4nnrlAa"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"parsePeriod", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "3nrrlAa"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 2), new String[][]{{"parsePeriod", "java.lang.String", "2"}, {"minus", "org.joda.time.ReadablePeriod", "0"}, {"minusYears", "int", "2"}, {"withMillis", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-2147483648Y-2147483648M-2147483648W-2147483648DT-2147483648H-2147483648M-2147483647.996S {getDays=-2147483648, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=...#422#-389637338", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 70, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "<null>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"parsePeriod", "java.lang.String", "6"}, {"minusMillis", "int", "7"}, {"toPeriod", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT-0.004S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-4, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -...#235#-1308463342", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "6"}, {"isPrinter", "", "5"}, {"withLocale", "java.util.Locale", "0"}, {"getParser", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", ""}}), new String[][]{{"toFormatter", "", "7"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod", "0"}, {"parsePeriod", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "cdT1\t"}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "0xm34456789"}}, 3), new String[][]{{"toFormatter", "", "7"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod", "0"}, {"getParseType", "", "6"}, {"parseMutablePeriod", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<null>", "<sample:3>"}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "1.9234567"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "htttp:./example.com/a?b=c", "H{\"a\":1}"}, {"org.joda.time.format.PeriodFormatterBuilder", "toPrinter", ""}}, 3), new String[][]{{"appendSeparatorIfFieldsBefore", "java.lang.String", "2"}, {"appendYears", "", "6"}, {"toParser", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String", "Drr::c", "true"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "{a1}", "b!ib1"}}, 2), new String[][]{{"appendSeparatorIfFieldsBefore", "java.lang.String", "2"}, {"toParser", "", "5"}, {"appendSeparator", "java.lang.String,java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-0.0", "<null>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{"{D2bWWp}"}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "LCteralmust notb mull", "cb1\t1.1234567890123456"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "[++\nor", "r],cu"}}, 2), new String[][]{{"appendMonths", "", "5"}, {"toFormatter", "", "5"}, {"parseMutablePeriod", "java.lang.String", "2"}, {"setPeriod", "org.joda.time.ReadablePeriod", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P3D {getDays=3, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 3, 0, 0, 0, 0], getW...#227#-901887591", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{"1.d"}, false, 9, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "{b1F}", ""}}, 1), new String[][]{{"appendSecondsWithOptionalMillis", "", "6"}, {"toFormatter", "", "5"}, {"parseMutablePeriod", "java.lang.String", "6"}, {"add", "org.joda.time.ReadableInterval", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 1],...#232#1776767102", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "\0101.12445678No formatter supplied"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "{a1}"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:4>", "<null>"}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "{#a1}1e10/-1F00Helmo, aorld1L"}}, 3), new String[][]{{"toPrinter", "", "2"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("76", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "PT1H"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "1.1234578-0.0"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "Drr::c", "r],cu1.5e300-1.5", "<sample:0>"}}, 1), new String[][]{{"toParser", "", "0"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "0"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "4"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("28", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2.25", "2020-01-01+1"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}}, 2), new String[][]{{"appendPrefix", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "{#a:1}"}}, 2), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", "boolean", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "a"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "{a1}"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 3), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "a\u00e9"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 3), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 33, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "b\u00e8"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "{rb1F}"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 1), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 53, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaa`aaaaaa"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "No for2m\n"}}, 1), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 53, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaa`aaaaaa"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "Nn for2m\n"}}, 1), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "4"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "\0101.12345678"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "1.1234567890123456"}}, 3), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "2"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "2"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "4"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "No formatter supplied"}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:2>"}}, 1), new String[][]{{"toFormatter", "", "6"}, {"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "5"}, {"parsePeriod", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "No formatter supplhed"}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:2>"}}, 3), new String[][]{{"toFormatter", "", "6"}, {"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "5"}, {"parsePeriod", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "No formatter supplhedd"}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:2>"}}, 3), new String[][]{{"toFormatter", "", "6"}, {"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "5"}, {"parsePeriod", "java.lang.String", "6"}, {"getPeriodType", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.PeriodType", actual.getClass().getName());
  assertEquals("PeriodType[Standard] {getName=Standard, size=8}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "No formatter supplhedd"}}, 3), new String[][]{{"toFormatter", "", "6"}, {"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "5"}, {"parsePeriod", "java.lang.String", "6"}, {"isSupported", "org.joda.time.DurationFieldType", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"123456789012345678901234567890", "<a>b</a>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "No formatter supplhedd"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "3", "2020-01-01", "<sample:2>"}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", ""}}, 2), new String[][]{{"toFormatter", "", "6"}, {"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "5"}, {"parsePeriod", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "", "2020-01-01-1", "<sample:2>"}}, 3), new String[][]{{"toFormatter", "", "6"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "7"}, {"parsePeriod", "java.lang.String", "6"}, {"withFields", "org.joda.time.ReadablePeriod", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", "int", "-3"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "", "2020-01-0[-1", "<sample:2>"}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", ""}}, 3), new String[][]{{"toFormatter", "", "6"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "7"}, {"parsePeriod", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", "int", "32772"}, {"org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", "int", "-1"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "", "2020-01-0[-1", "<sample:2>"}}, 1), new String[][]{{"toFormatter", "", "6"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "7"}, {"parsePeriod", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "", "2020-01-0[-1", "<sample:2>"}}, 1), new String[][]{{"appendMillis3Digit", "", "6"}, {"appendPrefix", "java.lang.String", "7"}, {"appendMonths", "", "6"}, {"appendSeparatorIfFieldsAfter", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "", "2020-01-0[-1", "<empty>"}}, 1), new String[][]{{"toFormatter", "", "6"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "1e10", "2020-01-0[-1", "<empty>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 1), new String[][]{{"toFormatter", "", "6"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "7"}, {"parsePeriod", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "1e10", "2020-01-0[-1", "<empty>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 1), new String[][]{{"toFormatter", "", "6"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "7"}, {"parsePeriod", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "1e10", "2020-/1-0[-1", "<empty>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 1), new String[][]{{"toFormatter", "", "6"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "1"}, {"parsePeriod", "java.lang.String", "6"}, {"getFieldType", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "1f10", "2020-/1-0[-1", "<empty>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 1), new String[][]{{"toFormatter", "", "6"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "1"}, {"parsePeriod", "java.lang.String", "6"}, {"toMutablePeriod", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<null>", "<sample:1>"}}, 1), new String[][]{{"printZeroIfSupported", "", "0"}, {"appendMinutes", "", "3"}, {"appendPrefix", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "1_ff10", "2020-/1-0[-1", "<empty>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 2), new String[][]{{"toFormatter", "", "6"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toFormatter", ""}}, 3), new String[][]{{"appendHours", "", "2"}, {"appendYears", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 34, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "b1b\u00e93", "2020-/1-0[-1", "<sample:0>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 2), new String[][]{{"toFormatter", "", "1"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "3"}, {"parsePeriod", "java.lang.String", "2"}, {"toMutablePeriod", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{".5", "Hello, World", "<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "", "2020-/1-0[-1", "<sample:0>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 1), new String[][]{{"toFormatter", "", "1"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "5"}, {"parsePeriod", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "b1b\u00e93", "2020-/1-0[-1", "<sample:0>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 1), new String[][]{{"toFormatter", "", "1"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "5"}, {"parsePeriod", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "b1b\u00e93", "2020-/1-0[-1", "<sample:0>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 1), new String[][]{{"toFormatter", "", "1"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "5"}, {"parsePeriod", "java.lang.String", "2"}, {"toDurationFrom", "org.joda.time.ReadableInstant", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Duration", actual.getClass().getName());
  assertEquals("PT0S {getMillis=0, getStandardDays=0, getStandardHours=0, getStandardMinutes=0, getStandardSeconds=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "b1b\u00e9", "2020-/1-0[-1", "<sample:0>"}}, 1), new String[][]{{"toFormatter", "", "1"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "5"}, {"parsePeriod", "java.lang.String", "2"}, {"getValues", "", "1"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "b13\u00e9", "2020-/1-0[-1", "<sample:0>"}}, 1), new String[][]{{"toFormatter", "", "1"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "5"}, {"parsePeriod", "java.lang.String", "2"}, {"withMillis", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT-0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -...#235#1109147925", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 34, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "b13\u00e9", "2010-/1-0[-1", "<sample:0>"}}, 1), new String[][]{{"toFormatter", "", "1"}, {"print", "org.joda.time.ReadablePeriod", "5"}, {"parsePeriod", "java.lang.String", "2"}, {"withMillis", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT-0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -...#235#1109147925", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 40, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "/a/b"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "b13\u00e9", "2010-/1-0[-1", "<sample:0>"}}, 2), new String[][]{{"toFormatter", "", "1"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "5"}, {"parsePeriod", "java.lang.String", "2"}, {"withMillis", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT-0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -...#235#1109147925", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendHours", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "/a//b"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "b03\u00e9", "2010-/1-0[-1", "<sample:4>"}}, 3), new String[][]{{"toFormatter", "", "1"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "5/", "Lb3\u00ea"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "tb03\u00e9", "2010-01-0I-1", "<null>"}}, 3), new String[][]{{"toFormatter", "", "1"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "4"}, {"parsePeriod", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "5/", "LbD\u00ea"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "tb03\u00e9", "2010-01-0I-1", "<null>"}}, 3), new String[][]{{"toFormatter", "", "1"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "4"}, {"parsePeriod", "java.lang.String", "6"}, {"plusMinutes", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT1M {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=1, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 1, 0, 0], get...#228#319719034", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", new String[]{"int"}, new String[]{"-3"}, false, 0, null, 3), new String[][]{{"appendPrefix", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "}5/P", "Lb\u00ea"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "b03\u00e9", "1.d", "<null>"}}, 3), new String[][]{{"toFormatter", "", "5"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "4"}, {"parsePeriod", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"i", "abc", "<sample:1>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "a"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "}52P", "Lb\u00ea"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "b03\u00e9", "1/e", "<null>"}}, 2), new String[][]{{"toFormatter", "", "5"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "4"}, {"parsePeriod", "java.lang.String", "6"}, {"plusSeconds", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT2S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=2, getValues=[0, 0, 0, 0, 0, 0, 2, 0], get...#228#787502617", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 35, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "~51P", "{#a:1}"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "bb0", "1/e", "<sample:1>"}}, 1), new String[][]{{"toFormatter", "", "5"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "4"}, {"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "6"}, {"print", "org.joda.time.ReadablePeriod", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{#a:1}4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "~", "{#a1}"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "", "1.12345678", "<sample:4>"}}, 3), new String[][]{{"toFormatter", "", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "5"}, {"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "6"}, {"print", "org.joda.time.ReadablePeriod", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{#a1}0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "~2020-02-330T25:61:62", "Title"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "", "1.13345678", "<sample:7>"}}, 2), new String[][]{{"toFormatter", "", "4"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "7"}, {"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "6"}, {"print", "org.joda.time.ReadablePeriod", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Title0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "~2020-02-330T25:61:62", "itld"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "bb0", "1.13345678", "<sample:6>"}}, 3), new String[][]{{"toFormatter", "", "4"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "5"}, {"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "6"}, {"print", "org.joda.time.ReadablePeriod", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("itld0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "clear", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "nnll", ",a+b,c"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "cci\u00e9b0", "11.X333456678", "<sample:2>"}}, 2), new String[][]{{"toFormatter", "", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "1"}, {"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "6"}, {"print", "org.joda.time.ReadablePeriod", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(",a+b,c0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", new String[]{"int"}, new String[]{"2"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 52, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "3nnla", "ra+c"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "bci\u00e9b0", "01.X333456678", "<sample:1>"}}, 1), new String[][]{{"minimumPrintedDigits", "int", "2"}, {"appendSeparatorIfFieldsAfter", "java.lang.String", "1"}, {"appendSuffix", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, null, 2), new String[][]{{"appendMillis", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"printZeroIfSupported", "", "7"}, {"appendPrefix", "java.lang.String,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", ""}}, 1), new String[][]{{"clear", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}}, 3), new String[][]{{"appendMillis", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}}, 3), new String[][]{{"appendMonths", "", "5"}, {"appendDays", "", "3"}, {"appendSeparator", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"-999"}, false, 0, null, 1), new String[][]{{"appendPrefix", "java.lang.String,java.lang.String", "0"}, {"appendSecondsWithMillis", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", new String[]{"int"}, new String[]{"5"}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{"{#a:1}"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "", "[1,2]"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".5", "1"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\u00e9", "2020-01-01"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0", "2020-01-01"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "2020-01-01"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0", "2020-01-01"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "2020-01-01"}}), new String[][]{{"appendMillis3Digit", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0", "2020-01-01"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}}), new String[][]{{"appendMillis3Digit", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "{\"a\":1}"}}), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "{#a:1}"}}), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "{#a:1}"}, {"org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", "int", "9"}}), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "{#a1}"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0", "{\"a\":1}"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "a"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "{a1}"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toPrinter", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 31, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "b\u00e8"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "{rb1p}"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendHours", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "/a/b"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 33, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "{rb1F}"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 33, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "{rb1F}"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}}), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 33, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "-1.5"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "{rb1F}"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "clear", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 33, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "{rb1F}"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 41, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "No formatter supplied"}}), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "4"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 45, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "No for2matter supplid"}}), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "4"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", new String[]{"int"}, new String[]{"-1000"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false), new String[][]{{"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "1"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", "int", "-1001"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}}), new String[][]{{"appendWeeks", "", "3"}, {"appendSeparator", "java.lang.String,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"", "--1", "<empty>"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toFormatter", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "1", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String"}, new String[]{"1000"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TITLE", "-1000"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:3>"}}), new String[][]{{"toFormatter", "", "6"}, {"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "5"}, {"parsePeriod", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:3>"}}), new String[][]{{"toFormatter", "", "6"}, {"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:6>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String", "No formatter supplied", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"2147483646"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "No formatter supplhedd"}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", ""}}), new String[][]{{"toFormatter", "", "6"}, {"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "No formatter supplhedd"}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "0x1F", "12:30:45"}}), new String[][]{{"toFormatter", "", "6"}, {"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "5"}, {"parsePeriod", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "1.12345678"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1e10", "-1.5"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String", "--1", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMonths", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "clear", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "1ff10", "2020-/1-0[-1", "<empty>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"toFormatter", "", "6"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "1ff10", "2020-/1-0[-1", "<empty>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"toFormatter", "", "6"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "1"}, {"parsePeriod", "java.lang.String", "2"}, {"indexOf", "org.joda.time.DurationFieldType", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "1ff10", "2020-/1-0[-1", "<empty>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"toFormatter", "", "6"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "1"}, {"parsePeriod", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false), new String[][]{{"appendMinutes", "", "0"}, {"appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "4"}, {"appendYears", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "2147483648"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}}), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "4"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "4"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"I"}, false), new String[][]{{"append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "4"}, {"printZeroRarelyFirst", "", "7"}, {"appendMillis", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}}), new String[][]{{"clear", "", "7"}, {"rejectSignedValues", "boolean", "0"}, {"appendSuffix", "java.lang.String,java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toPrinter", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 38, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "/a/b"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "b13\u00e9", "2010-/1-0[-1", "<sample:0>"}}), new String[][]{{"toFormatter", "", "1"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "5"}, {"parsePeriod", "java.lang.String", "2"}, {"withMillis", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT-0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -...#235#1109147925", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 40, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "/a/b"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "b13\u00e9", "2010-/1-0[-1", "<sample:0>"}}), new String[][]{{"toFormatter", "", "1"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "5"}, {"getParser", "", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "/a/b"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "b13\u00e9", "2010-/1-0[-1", "<sample:4>"}}), new String[][]{{"toFormatter", "", "1"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "5"}, {"parsePeriod", "java.lang.String", "2"}, {"withMillis", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT2147483.647S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=2147483647, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, ...#256#-159297269", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"1ff10"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "2020-01-01"}, {"org.joda.time.format.PeriodFormatterBuilder", "clear", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "tb03\u00e9", "2010-/1-0[-1", "<sample:4>"}}), new String[][]{{"toFormatter", "", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "5"}, {"parsePeriod", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "tb03\u00e9", "2010-/1-0[-1", "<sample:4>"}}), new String[][]{{"toFormatter", "", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "5"}, {"parsePeriod", "java.lang.String", "2"}, {"getValues", "", "2"}});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 33, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "5.", "b13\u00e9"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "tb03\u00e9", "2010-/1-0[-1", "<sample:4>"}}), new String[][]{{"toFormatter", "", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "5"}, {"parsePeriod", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "2020-/1-0[-1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", "int", "0"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}}), new String[][]{{"appendSeparator", "java.lang.String", "5"}, {"appendMillis3Digit", "", "1"}, {"toPrinter", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{"1L"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendDays", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "2020-01-01-1", "1.d"}}), new String[][]{{"appendPrefix", "java.lang.String,java.lang.String", "0"}, {"appendSeparator", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "1.5f"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "5/"}}), new String[][]{{"appendSuffix", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}}), new String[][]{{"appendSeparator", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "0x1F", " ", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}}), new String[][]{{"maximumParsedDigits", "int", "0"}, {"appendSuffix", "java.lang.String,java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendHours", new String[]{}, new String[]{}, false), new String[][]{{"printZeroIfSupported", "", "6"}, {"toPrinter", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"3"}, false), new String[][]{{"toParser", "", "0"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "2"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"--1", "2010-/1-0[-1"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "{rb1p}"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", new String[]{}, new String[]{}, false), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "3"}, {"appendSeparatorIfFieldsBefore", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendDays", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", ""}}), new String[][]{{"clear", "", "1"}, {"toFormatter", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"appendSecondsWithOptionalMillis", "", "5"}, {"toParser", "", "1"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"2010-/1-0[-1"}, false), new String[][]{{"toParser", "", "7"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", new String[]{"int"}, new String[]{"8"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}}), new String[][]{{"toFormatter", "", "1"}, {"parsePeriod", "java.lang.String", "2"}, {"minusYears", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-4Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-4, 0, 0, 0, 0, 0, 0, 0], ge...#230#653480138", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", new String[]{}, new String[]{}, false), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "6"}, {"appendSeparator", "java.lang.String,java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}}), new String[][]{{"appendPrefix", "java.lang.String", "1"}, {"clear", "", "0"}, {"toPrinter", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}}), new String[][]{{"appendPrefix", "java.lang.String", "1"}, {"clear", "", "0"}, {"toPrinter", "", "1"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"Title", "-1", "<sample:0>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "010"}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "5/", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1/e", "}}"}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "HJ"}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}}, 1), new String[][]{{"appendSuffix", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1/e", "}}"}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "HJ"}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}}), new String[][]{{"appendSuffix", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, null, 1), new String[][]{{"appendSeconds", "", "3"}, {"append", "org.joda.time.format.PeriodFormatter", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendDays", new String[]{}, new String[]{}, false), new String[][]{{"appendPrefix", "java.lang.String", "0"}, {"toParser", "", "6"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendDays", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"appendPrefix", "java.lang.String", "6"}, {"toParser", "", "6"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendDays", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 1), new String[][]{{"appendPrefix", "java.lang.String", "6"}, {"toParser", "", "6"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "6"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendDays", new String[]{}, new String[]{}, false, 15, new String[][]{}, 1), new String[][]{{"appendPrefix", "java.lang.String", "6"}, {"toParser", "", "6"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "6"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendDays", new String[]{}, new String[]{}, false, 20, new String[][]{}), new String[][]{{"appendPrefix", "java.lang.String", "6"}, {"toParser", "", "6"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "6"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x1F", "\n1.5"}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}}), new String[][]{{"toParser", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"_x2FLiteral must not be ull", "2}"}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"9223372036854775807", "Literal must not be null"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "2020-02-30T25:61:61"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toFormatter", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{"2010-01-0I-1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:6>", "<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 2), new String[][]{{"appendSeparatorIfFieldsBefore", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "3", "1.5d"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "-1000"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"11"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "33", "11.5d"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "-2000"}}, 1), new String[][]{{"rejectSignedValues", "boolean", "0"}, {"appendSeparator", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "2020-01-01-1", "-0.0"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "2020-01-01-1", "-0.0"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String", "1000", "2020-/1-0[-1"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 2), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "2020-01-01-1", "-0.0Literal must not be null"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String", "10", "2020-/1-0[-1"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 3), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String", "10", "2020-/1-0[-1"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 3), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String", "10", "2020-/1-0[-1"}}, 3), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}}, 2), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"._1100i"}, false, 13, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"appendSeparator", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "b13\u00e9"}}), new String[][]{{"parseMutablePeriod", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"b25TIT?ME"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", "boolean", "true"}}, 1), new String[][]{{"appendSeparatorIfFieldsAfter", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false), new String[][]{{"getPrinter", "", "1"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "6"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"getPrinter", "", "1"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "6"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 15, new String[][]{}, 1), new String[][]{{"getPrinter", "", "1"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", "boolean", "true"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "2010-01-0I-1"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", " "}}, 1), new String[][]{{"getPrinter", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", "boolean", "true"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "2010-01-0I-1"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", " "}}), new String[][]{{"getPrinter", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "nulla"}}, 2), new String[][]{{"getPrinter", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "nulla"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "nulla"}}, 2), new String[][]{{"parsePeriod", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "Title", "2020-01-01-1", "<sample:3>"}, {"org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "Title", "2020-01-01-1", "<sample:3>"}, {"org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", "int", "2"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "Title", "{#a1}"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "Title", "2020-01-01-1", "<sample:3>"}, {"org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", "int", "2"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1000", "1ff10"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "2047483648C"}}, 3), new String[][]{{"rejectSignedValues", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "Ib"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "0"}}), new String[][]{{"appendLiteral", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "1.1234567"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "1ff101000"}}, 2), new String[][]{{"appendYears", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}}, 2), new String[][]{{"appendSeparator", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMonths", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", "int", "7"}}, 2), new String[][]{{"appendHours", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"-33554290"}, false, 11, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}}, 3), new String[][]{{"appendHours", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"-2036"}, false, 9, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}}, 1), new String[][]{{"minimumPrintedDigits", "int", "7"}, {"appendSeparatorIfFieldsAfter", "java.lang.String", "0"}, {"appendSuffix", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"536868854"}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}}), new String[][]{{"minimumPrintedDigits", "int", "7"}, {"appendSeparatorIfFieldsAfter", "java.lang.String", "4"}, {"appendSuffix", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "1.12345678"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", "int", "1001"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}}, 3), new String[][]{{"getPrinter", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "p[++\nr"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "/tru\te"}, {"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}}, 3), new String[][]{{"appendPrefix", "java.lang.String", "3"}, {"toFormatter", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "p[++\nr"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "/tru\te"}, {"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}}), new String[][]{{"appendPrefix", "java.lang.String", "3"}, {"toFormatter", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "p[++\nr"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "/tru\te"}}, 2), new String[][]{{"appendPrefix", "java.lang.String", "3"}, {"toFormatter", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "\037"}}), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "3"}, {"toParser", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 37, new String[][]{}), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "3"}, {"toParser", "", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "2"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 37, new String[][]{}, 1), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "3"}, {"toParser", "", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "2"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 38, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "/a/b"}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}}, 1), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "3"}, {"toParser", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}}), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "3"}, {"toParser", "", "4"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}}), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "3"}, {"toParser", "", "4"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendHours", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}}, 2), new String[][]{{"appendSuffix", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}}, 3), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "7"}, {"toParser", "", "5"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "1e10"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "Dr:+c"}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}}, 3), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "7"}, {"toParser", "", "5"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 34, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "1e10"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "Dr::+c"}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}}, 3), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "7"}, {"toParser", "", "5"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "0"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 51, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "DDr::+cabc"}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}}, 3), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "7"}, {"toParser", "", "5"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "6"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "DDr::+cabc"}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}}), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "7"}, {"appendSeconds", "", "5"}, {"append", "org.joda.time.format.PeriodFormatter", "6"}, {"appendSeparator", "java.lang.String,java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "DDr::+cabc"}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}}, 1), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "7"}, {"toParser", "", "5"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "6"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "DDr::i+caabc"}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}}, 1), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "7"}, {"toParser", "", "7"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "5"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "DDr::i+caabc"}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}}, 2), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "7"}, {"toParser", "", "7"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "5"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}}, 2), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "7"}, {"toParser", "", "7"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "5"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "OT1H"}}, 2), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "4"}, {"clear", "", "6"}, {"append", "org.joda.time.format.PeriodFormatter", "5"}, {"appendSeparator", "java.lang.String,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 38, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}}, 2), new String[][]{{"appendPrefix", "java.lang.String", "3"}, {"printZeroRarelyFirst", "", "6"}, {"append", "org.joda.time.format.PeriodFormatter", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 1), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "11A02"}}, 2), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 32, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "1000"}}, 2), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 33, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 2), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{"1000"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "b13\u00e9", "-1"}}), new String[][]{{"toParser", "", "1"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 2), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendDays", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "7"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"No formatter supplhedd"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "No formatter supplhedd"}}), new String[][]{{"toParser", "", "7"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:7>", "<sample:2>"}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "Title"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
}
