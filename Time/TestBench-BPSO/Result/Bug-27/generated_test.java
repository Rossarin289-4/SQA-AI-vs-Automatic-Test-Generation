package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{"1.12345678990123456"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"aLiteral musF not be null"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<null>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:7>", "<null>"}, false, 0, null, 1), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toPrinter", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false), new String[][]{{"appendSeparatorIfFieldsAfter", "java.lang.String", "0"}, {"appendSeparatorIfFieldsAfter", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}}, 3), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "2"}, {"appendSuffix", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{" "}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "<null>", "Ti7t5le"}}), new String[][]{{"appendSuffix", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.55f", "<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", "boolean", "true"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}}, 3), new String[][]{{"getLocale", "", "2"}, {"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:6>"}}), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "1.12345678901]34567?Title"}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}}), new String[][]{{"withParseType", "org.joda.time.PeriodType", "0"}, {"parsePeriod", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toFormatter", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", "boolean", "true"}}, 3), new String[][]{{"isParser", "", "1"}, {"parsePeriod", "java.lang.String", "0"}, {"minusYears", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("P-1Y {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[-1, 0, 0, 0, 0, 0, 0, 0], ge...#230#-937201331", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "12:30:452.1 34567"}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:5>", "<sample:5>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "-1.51.12345678"}}), new String[][]{{"parseMutablePeriod", "java.lang.String", "5"}, {"setPeriod", "org.joda.time.ReadableDuration,org.joda.time.Chronology", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0.001S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=-1, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, -1...#234#1296717168", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:6>"}, false, 2, new String[][]{}), new String[][]{{"toPrinter", "", "5"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"parsePeriod", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"<null>", "1.123456789012345671.12345678901234567"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "anull", "abc"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}}), new String[][]{{"toFormatter", "", "6"}, {"parsePeriod", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{"1.4"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "clear", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "02:30:45"}}), new String[][]{{"toParser", "", "0"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"1.53", "\u00e9", "<sample:0>"}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "\n010", "-5"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}}), new String[][]{{"toFormatter", "", "5"}, {"parsePeriod", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}}), new String[][]{{"parseMutablePeriod", "java.lang.String", "2"}, {"getMillis", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-15", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String", "1.12345678010", "A1.5f"}}), new String[][]{{"toFormatter", "", "4"}, {"getParseType", "", "5"}, {"parsePeriod", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"T  formatter supplied"}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "", "{#l\":1}"}}, 3), new String[][]{{"toPrinter", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:4>", "<null>"}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}}, 2), new String[][]{{"toFormatter", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=false, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:3>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "http://example.com/a?b=c"}}, 3), new String[][]{{"parseMutablePeriod", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"i"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "<null>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "", "1.1234567890122345671.12345678901234567"}}), new String[][]{{"toParser", "", "7"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "http://example.com/a?b=c"}}), new String[][]{{"isPrinter", "", "6"}, {"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"1.123456789012F4567", "\u00e9", "<empty>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"toPrinter", "", "3"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}), new String[][]{{"parseMutablePeriod", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "11234567", "HL"}}), new String[][]{{"toParser", "", "7"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}}), new String[][]{{"withParseType", "org.joda.time.PeriodType", "2"}, {"print", "org.joda.time.ReadablePeriod", "7"}, {"parseMutablePeriod", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P0D {getDays=!ArrayIndexOutOfBoundsException, getFieldTypes=[days, days], getHours=!ArrayIndexOutOfBoundsException, getMillis=!ArrayIndexOutOfBoundsException, getMinutes=!ArrayIndexOutOfBoundsExceptio...#399#-1284081337", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}}), new String[][]{{"appendSeparatorIfFieldsBefore", "java.lang.String", "3"}, {"toPrinter", "", "7"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"+H--1"}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:0>", "<null>"}}), new String[][]{{"toParser", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}}, 2), new String[][]{{"maximumParsedDigits", "int", "5"}, {"appendPrefix", "java.lang.String", "2"}, {"appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "anull"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"parseMutablePeriod", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "21474836481.12345678", "010"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendHours", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", ""}}), new String[][]{{"toPrinter", "", "2"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "<null>"}}, 3), new String[][]{{"appendDays", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", "boolean", "false"}, {"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}}), new String[][]{{"toParser", "", "2"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("24", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"", "PT1H010", "<sample:1>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"appendDays", "", "6"}, {"toParser", "", "0"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "1e20", "P\u00e9TH"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}}), new String[][]{{"parseMutablePeriod", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String", "Ti7tt5le"}}, 1), new String[][]{{"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "6"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "0"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1.5[1,2]", "<null>"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"", "", "<sample:1>"}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:8>"}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "12:30:453.1 34567", "-1.5"}}), new String[][]{{"print", "org.joda.time.ReadablePeriod", "4"}, {"isParser", "", "6"}, {"parseMutablePeriod", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"-0.0", "D", "<sample:2>"}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}}), new String[][]{{"toParser", "", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}}), new String[][]{{"parseMutablePeriod", "java.lang.String", "6"}, {"add", "org.joda.time.ReadablePeriod", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("P1D {getDays=1, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 1, 0, 0, 0, 0], getW...#227#-469983333", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<null>", "<sample:0>"}, {"org.joda.time.format.PeriodFormatterBuilder", "toPrinter", ""}}, 1), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "1.12345679901234567?a2147483648", "null"}}), new String[][]{{"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "010", "02147483647"}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String", "", "1.5e"}}), new String[][]{{"parseMutablePeriod", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "P", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"parseMutablePeriod", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "T]itme", "9ah"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"toParser", "", "5"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:2>"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "1.12345678901234667", " b", "<sample:4>"}}, 3), new String[][]{{"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "2020-02-30T25:61:61"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}}, 1), new String[][]{{"parsePeriod", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", ""}}, 1), new String[][]{{"toFormatter", "", "5"}, {"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}), new String[][]{{"parseMutablePeriod", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "", "9223372c036854775807"}}), new String[][]{{"parseMutablePeriod", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{"dP"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}}, 3), new String[][]{{"toFormatter", "", "5"}, {"parsePeriod", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}}), new String[][]{{"toParser", "", "4"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", "int", "2147483646"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "12:30:451.1 34567"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"itle", "\t"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", "boolean", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0", "!"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "-0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"P1e10"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"Titcle1"}, false, 0, null, 2), new String[][]{{"maximumParsedDigits", "int", "5"}, {"appendLiteral", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String", "2"}, {"printZeroNever", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}, 1), new String[][]{{"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendDays", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", "int", "58"}}, 2), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "0"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"3", "247483647"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", "boolean", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMonths", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"minimumPrintedDigits", "int", "6"}, {"appendSeparatorIfFieldsBefore", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"appendMillis", "", "5"}, {"printZeroRarelyFirst", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String"}, new String[]{"i;tle"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toPrinter", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}}, 2), new String[][]{{"appendHours", "", "7"}, {"appendMillis3Digit", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendHours", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"printZeroNever", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}}, 3), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendHours", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"appendLiteral", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"0x2234567899", "-0.0", "<null>"}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:6>", "<sample:0>"}}, 2), new String[][]{{"appendPrefix", "java.lang.String", "3"}, {"appendSuffix", "java.lang.String,java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "123456789012345678901234567890"}}, 1), new String[][]{{"appendSeparatorIfFieldsBefore", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}}, 3), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "2"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "-1.5"}}, 1), new String[][]{{"parseMutablePeriod", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", new String[]{"int"}, new String[]{"1028"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}, 3), new String[][]{{"appendYears", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678010", "aaaaaaaFaaaaaaaaaaaaaaaaaaaaaa"}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}}, 3), new String[][]{{"appendMillis", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"-1.51.5f", "20020-02-30T25:61:61", "<empty>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "2147483648"}}, 3), new String[][]{{"printZeroAlways", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", ""}}, 3), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendDays", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "{\"\"a\":1}", "aaaaaaaaaaaaaaaaaaaaaaaaaaa`aa1.5d"}}, 1), new String[][]{{"minimumPrintedDigits", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"printZeroRarelyFirst", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1}.124567890123456"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "itle"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"54", "010", "<empty>"}, false, 2, new String[][]{}, 1), new String[][]{{"appendMonths", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"1020-01-01"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendDays", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"appendMinutes", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:2>"}}, 3), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"http://example.com/a?b=c", "aaaaaaaaaaaaaaaaaaaaaaaa"}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String", "1l", "1.12345678"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendHours", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"minimumPrintedDigits", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"214783648"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"01T", "\n"}, false, 3, new String[][]{}, 3), new String[][]{{"appendSuffix", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String", "aLiteral musF not be\037null", "Literal mst nnt be null"}}, 2), new String[][]{{"appendPrefix", "java.lang.String,java.lang.String", "3"}, {"appendSuffix", "java.lang.String,java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"F", "abc"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "4I", "/ab"}, {"org.joda.time.format.PeriodFormatterBuilder", "toPrinter", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"4true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:0>"}, false, 0, null, 3), new String[][]{{"printZeroRarelyFirst", "", "1"}, {"appendLiteral", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"isPrinter", "", "7"}, {"parsePeriod", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:0>", "<sample:7>"}, false, 6, new String[][]{}, 2), new String[][]{{"appendDays", "", "7"}, {"appendSecondsWithMillis", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, null, 3), new String[][]{{"appendSecondsWithMillis", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 3), new String[][]{{"appendPrefix", "java.lang.String,java.lang.String", "0"}, {"append", "org.joda.time.format.PeriodFormatter", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"getParser", "", "0"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"[10"}, false, 0, null, 1), new String[][]{{"appendLiteral", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "aLiteral musFTnot ae null"}, {"org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", "int", "9"}}, 3), new String[][]{{"parseMutablePeriod", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", "int", "2"}}, 3), new String[][]{{"appendSecondsWithMillis", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}}, 2), new String[][]{{"isPrinter", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:3>", "<sample:3>"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", ""}}, 1), new String[][]{{"appendPrefix", "java.lang.String,java.lang.String", "1"}, {"appendMinutes", "", "0"}, {"printZeroIfSupported", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", new String[]{"int"}, new String[]{"8"}, false, 3, new String[][]{}, 3), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"12:30:451.1 3455l7"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"", "-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<empty>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", "int", "-2147483648"}}, 3), new String[][]{{"appendLiteral", "java.lang.String", "3"}, {"appendSuffix", "java.lang.String,java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"withParseType", "org.joda.time.PeriodType", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"minimumPrintedDigits", "int", "1"}, {"appendSuffix", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"P1e10"}, false, 2, new String[][]{}, 1), new String[][]{{"toFormatter", "", "0"}, {"getLocale", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String"}, new String[]{"I"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toPrinter", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"PT1H010Co"}, false, 3, new String[][]{}, 3), new String[][]{{"appendSecondsWithOptionalMillis", "", "6"}, {"appendSeconds", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"printZeroIfSupported", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", new String[]{"int"}, new String[]{"1001"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", new String[]{}, new String[]{}, false), new String[][]{{"appendWeeks", "", "4"}, {"printZeroNever", "", "0"}, {"appendLiteral", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String"}, new String[]{"1l"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"A1.5f"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"appendSecondsWithOptionalMillis", "", "6"}, {"appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMonths", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"PT1H010", "12:30:451.1 34567"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toFormatter", ""}}), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"2"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "clear", ""}}), new String[][]{{"appendSecondsWithOptionalMillis", "", "0"}, {"rejectSignedValues", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"appendSeparator", "java.lang.String", "1"}, {"appendSuffix", "java.lang.String,java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendHours", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Uitle", "1e10"}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}}), new String[][]{{"append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String,java.lang.String", "", "123456789012345678901234567890PT1H"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendDays", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"appendMillis", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"/a/b", "", "<sample:0>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}}), new String[][]{{"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "1.25"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toFormatter", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}}), new String[][]{{"append", "org.joda.time.format.PeriodFormatter", "3"}, {"append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:1>"}, false), new String[][]{{"appendSeparator", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:30:451.11 3456l7", "/a/ba"}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}}), new String[][]{{"appendSeparator", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", "boolean", "false"}}), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}}), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "clear", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"minimumPrintedDigits", "int", "6"}, {"appendSuffix", "java.lang.String,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "1.12345678901234567?"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678010", "http://example.com/a?b=c"}, false, 4, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "No formatter suppli>d"}}), new String[][]{{"printZeroAlways", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", "int", "-268435456"}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendHours", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}}), new String[][]{{"appendSeparator", "java.lang.String", "6"}, {"appendSeparator", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "<sample:8>", "<null>"}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:0>"}}), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false), new String[][]{{"toParser", "", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "12:30:451. 34567"}}), new String[][]{{"getParser", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"abc0x1234=56789"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", ""}}), new String[][]{{"getPrinter", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "itle4", "1.1234567890123456?"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"1a"}, false, 7, new String[][]{}), new String[][]{{"appendLiteral", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendDays", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"appendHours", "", "6"}, {"toPrinter", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"parseMutablePeriod", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutablePeriod", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", "boolean", "true"}}), new String[][]{{"isPrinter", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "/a/"}}), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toPrinter", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"toParser", "", "1"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"}", "12:30:44"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "\tT"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "Lite;al must not be null"}}), new String[][]{{"getParseType", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeconds", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}}), new String[][]{{"rejectSignedValues", "boolean", "1"}, {"toPrinter", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"2"}, false), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"nu-kl"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "12:3:45"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"js", "Literal must not be nullaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"appendSeparatorIfFieldsAfter", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:3>"}, false, 2, new String[][]{}), new String[][]{{"toFormatter", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}}), new String[][]{{"parsePeriod", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.Period", actual.getClass().getName());
  assertEquals("PT0S {getDays=0, getFieldTypes=[years, months, weeks, days, hours, minutes, seconds, millis.., getHours=0, getMillis=0, getMinutes=0, getMonths=0, getSeconds=0, getValues=[0, 0, 0, 0, 0, 0, 0, 0], get...#228#-982670497", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", ""}}), new String[][]{{"toParser", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:5>", "<sample:9>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:2>"}}), new String[][]{{"toParser", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}}), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<null>", "<sample:9>"}, false, 3, new String[][]{}), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendDays", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"toFormatter", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String"}, new String[]{"No formatter suppli>d"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:30:451.1 34567", "12:30:51.11 3456l7"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"parseInto", "org.joda.time.ReadWritablePeriod,java.lang.String,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"--2T"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "", "010.5"}}), new String[][]{{"toPrinter", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", ""}}), new String[][]{{"appendSuffix", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "1"}, {"maximumParsedDigits", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"2020-02-30T25:6P1:61", "", "<null>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}}), new String[][]{{"appendSuffix", "java.lang.String,java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "PT1H010Co"}}), new String[][]{{"getParser", "", "0"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "rejectSignedValues", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", ""}}), new String[][]{{"parsePeriod", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"appendSeparatorIfFieldsAfter", "java.lang.String", "2"}, {"appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"PT1010"}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toPrinter", ""}}), new String[][]{{"toParser", "", "3"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "\t."}, {"org.joda.time.format.PeriodFormatterBuilder", "clear", ""}}), new String[][]{{"printZeroNever", "", "4"}, {"toPrinter", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"toParser", "", "1"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{"15e300"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMonths", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"appendMillis3Digit", "", "6"}, {"appendSuffix", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"toParser", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String,java.lang.String", "a b", "http:/dexample.com/a?b=c"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "aLitera musF not be null"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:0>", "<null>"}, false, 3, new String[][]{}), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:0>"}}, 2), new String[][]{{"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodPrinter", "org.joda.time.format.PeriodParser"}, new String[]{"<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMonths", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "maximumParsedDigits", new String[]{"int"}, new String[]{"999"}, false, 3, new String[][]{}, 1), new String[][]{{"appendSecondsWithMillis", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"1l"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "10"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", "java.lang.String", "3L"}}, 2), new String[][]{{"append", "org.joda.time.format.PeriodFormatter", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendDays", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"appendPrefix", "java.lang.String", "5"}, {"minimumPrintedDigits", "int", "5"}, {"append", "org.joda.time.format.PeriodFormatter", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"getLocale", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, null, 1), new String[][]{{"appendWeeks", "", "5"}, {"appendSecondsWithOptionalMillis", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSuffix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5d", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", "java.lang.String", "15d"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}, 3), new String[][]{{"appendSeparatorIfFieldsAfter", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}), new String[][]{{"appendDays", "", "6"}, {"toParser", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"print", "org.joda.time.ReadablePeriod", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"-7"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}}, 3), new String[][]{{"appendMonths", "", "0"}, {"appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TITLE", "aLiteral musF not be null1.5e300"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", ""}}), new String[][]{{"toPrinter", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{"true"}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}}), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String", "9223372036854775807", "1.25"}}), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendYears", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"appendPrefix", "java.lang.String,java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"h", "PT1H010Co-0.0"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendHours", ""}}), new String[][]{{"toFormatter", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:5>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "", "12:30:451.1 34567", "<null>"}, {"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}}), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String,java.lang.String[]", "0"}, {"toPrinter", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String"}, new String[]{"Pe10"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMonths", ""}}), new String[][]{{"toParser", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMonths", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", "java.lang.String", "a,c,c"}}, 3), new String[][]{{"toPrinter", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"P1e10"}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}, 2), new String[][]{{"appendSuffix", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "append", new String[]{"org.joda.time.format.PeriodFormatter"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}}), new String[][]{{"toParser", "", "0"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("72", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}}, 2), new String[][]{{"appendSeparator", "java.lang.String,java.lang.String", "4"}, {"appendSeparator", "java.lang.String,java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "minimumPrintedDigits", new String[]{"int"}, new String[]{"3"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"toParser", "", "4"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendHours", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"append", "org.joda.time.format.PeriodPrinter,org.joda.time.format.PeriodParser", "0"}, {"toPrinter", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod", "6"}, {"withLocale", "java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendDays", new String[]{}, new String[]{}, false), new String[][]{{"toPrinter", "", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"appendYears", "", "6"}, {"minimumPrintedDigits", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendHours", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}}, 1), new String[][]{{"printZeroRarelyFirst", "", "4"}, {"toFormatter", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "itme"}, {"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsBefore", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendLiteral", "java.lang.String", "//a/ba"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String"}, new String[]{"5e"}, false, 2, new String[][]{}), new String[][]{{"rejectSignedValues", "boolean", "5"}, {"toFormatter", "", "4"}, {"withParseType", "org.joda.time.PeriodType", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendHours", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithMillis", ""}}), new String[][]{{"toPrinter", "", "7"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroAlways", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", new String[]{}, new String[]{}, false), new String[][]{{"toFormatter", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis", new String[]{}, new String[]{}, false), new String[][]{{"toFormatter", "", "3"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendHours", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}}), new String[][]{{"toFormatter", "", "1"}, {"withParseType", "org.joda.time.PeriodType", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendDays", ""}}, 2), new String[][]{{"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "1"}, {"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyFirst", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "appendYears", ""}}, 1), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "2"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:30:451.1 34567", "1.1234567m010"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:4>"}}), new String[][]{{"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toPrinter", ""}}, 2), new String[][]{{"toPrinter", "", "0"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendPrefix", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"Uitl", "1.55f"}, false, 0, null, 2), new String[][]{{"toFormatter", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"appendSeparatorIfFieldsBefore", "java.lang.String", "0"}, {"appendSeparator", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroIfSupported", ""}}, 3), new String[][]{{"appendPrefix", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2147483648", "Hello, World1"}, false, 3, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", ""}, {"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:5>"}}, 3), new String[][]{{"toFormatter", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMillis3Digit", new String[]{}, new String[]{}, false), new String[][]{{"toParser", "", "1"}, {"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "append", "org.joda.time.format.PeriodFormatter", "<sample:7>"}}), new String[][]{{"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"parsePeriod", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"isPrinter", "", "0"}, {"getPrinter", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Literal", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "java.lang.String", "59223372036854775807"}}), new String[][]{{"calculatePrintedLength", "org.joda.time.ReadablePeriod,java.util.Locale", "5"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Separator", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroRarelyLast", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendWeeks", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"toFormatter", "", "3"}, {"isPrinter", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", new String[]{"java.lang.String"}, new String[]{"No formatter suppli>d0x1F"}, false, 3, new String[][]{}), new String[][]{{"toFormatter", "", "0"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePeriod", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendMinutes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "toParser", ""}}), new String[][]{{"toFormatter", "", "5"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePeriod", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatter", actual.getClass().getName());
  assertEquals("{isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSeparator", new String[]{"java.lang.String", "java.lang.String", "java.lang.String[]"}, new String[]{"a ", "10000x1F", "<sample:1>"}, false, 2, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "printZeroNever", ""}}, 2), new String[][]{{"maximumParsedDigits", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"appendPrefix", "java.lang.String", "1"}, {"toPrinter", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.PeriodFormatterBuilder$Composite", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.PeriodFormatterBuilder", "org.joda.time.format.PeriodFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.PeriodFormatterBuilder", "appendMillis", ""}}, 1), new String[][]{{"countFieldsToPrint", "org.joda.time.ReadablePeriod,int,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
}
