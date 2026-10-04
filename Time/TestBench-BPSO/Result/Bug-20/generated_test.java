package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFraction", new String[]{"org.joda.time.DateTimeFieldType", "int", "int"}, new String[]{"<sample:4>", "-1047577", "2147483647"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendMonthOfYearShortText", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFixedDecimal", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "-2147483588"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendSignedDecimal", "org.joda.time.DateTimeFieldType,int,int", "<sample:0>", "100000026", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneId", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendMonthOfYear", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimeParser"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendSignedDecimal", "org.joda.time.DateTimeFieldType,int,int", "<null>", "-2147483648", "4934464"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFixedSignedDecimal", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<null>", "1093741824"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "canBuildParser", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendClockhourOfHalfday", new String[]{"int"}, new String[]{"11025"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimePrinter", "org.joda.time.format.DateTimeParser[]"}, new String[]{"<sample:3>", "<null>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendEraText", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "append", "org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser[]", "<null>", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimePrinter", "org.joda.time.format.DateTimeParser[]"}, new String[]{"<sample:2>", "<sample:3>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "toFormatter", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneOffset", new String[]{"java.lang.String", "boolean", "int", "int"}, new String[]{"No printer", "false", "-1000021", "-2147483648"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendWeekOfWeekyear", "int", "200000000"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendYearOfEra", "int,int", "2147483647", "20000"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendShortText", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfSecond", "int,int", "-1047577", "-49"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFixedSignedDecimal", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:0>", "4934454"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "append", "org.joda.time.format.DateTimeFormatter", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneOffset", new String[]{"java.lang.String", "boolean", "int", "int"}, new String[]{"0x133456789", "false", "134222727", "2147483647"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendMillisOfSecond", "int", "999"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendLiteral", "char", "\r"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendSecondOfDay", new String[]{"int"}, new String[]{"480"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfDay", "int,int", "1922", "100000026"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfSecond", "int,int", "134222727", "-1073741823"}}, 2), new String[][]{{"appendWeekyear", "int,int", "4"}, {"canBuildFormatter", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfYear", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendSignedDecimal", "org.joda.time.DateTimeFieldType,int,int", "<sample:5>", "2147483591", "2095154"}}, 2), new String[][]{{"appendDayOfYear", "int", "4"}, {"appendMillisOfDay", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendShortText", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFixedDecimal", "org.joda.time.DateTimeFieldType,int", "<null>", "0"}}, 1), new String[][]{{"appendMonthOfYear", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfYear", new String[]{"int"}, new String[]{"65532"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfSecond", "int,int", "1000000001", "1999975"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendWeekyear", "int,int", "0", "-2147483648"}}), new String[][]{{"toParser", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder$Composite", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendText", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "append", "org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser", "<null>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "canBuildParser", ""}, {"org.joda.time.format.DateTimeFormatterBuilder", "append", "org.joda.time.format.DateTimeFormatter", "<sample:6>"}}), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormat$StyleFormatter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendMinuteOfDay", new String[]{"int"}, new String[]{"1000010"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendHourOfHalfday", "int", "50"}}, 1), new String[][]{{"appendTwoDigitWeekyear", "int,boolean", "4"}, {"appendSignedDecimal", "org.joda.time.DateTimeFieldType,int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneShortName", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneOffset", "java.lang.String,boolean,int,int", "", "true", "4934516", "99999"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendFixedSignedDecimal", "org.joda.time.DateTimeFieldType,int", "<sample:1>", "-2147483648"}}, 1), new String[][]{{"append", "org.joda.time.format.DateTimePrinter", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendPattern", "java.lang.String", "1100"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneOffset", "java.lang.String,java.lang.String,boolean,int,int", "1000100", "-:", "true", "-2147483594", "2147483647"}}), new String[][]{{"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitWeekyear", "int", "10001"}}), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFixedSignedDecimal", "org.joda.time.DateTimeFieldType,int", "<sample:4>", "9999"}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePartial,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder$FixedNumber", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendText", "org.joda.time.DateTimeFieldType", "<sample:6>"}}, 2), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePartial,java.util.Locale", "5"}, {"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfMonth", new String[]{"int"}, new String[]{"5000000"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFraction", "org.joda.time.DateTimeFieldType,int,int", "<null>", "11", "-917522"}}), new String[][]{{"appendLiteral", "java.lang.String", "4"}, {"appendEraText", "", "5"}, {"appendTwoDigitYear", "int,boolean", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendEraText", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendMonthOfYearText", ""}}), new String[][]{{"toFormatter", "", "5"}, {"parseLocalDate", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfWeekShortText", ""}}, 1), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePartial,java.util.Locale", "0"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePartial,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder$TextField", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneOffset", "java.lang.String,java.lang.String,boolean,int,int", "\nPINSTANCE", "\037", "false", "10000", "1093741825"}}, 3), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePartial,java.util.Locale", "5"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePartial,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendMinuteOfHour", new String[]{"int"}, new String[]{"2147483647"}, false), new String[][]{{"toFormatter", "", "1"}, {"parseLocalDate", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimePrinter", "org.joda.time.format.DateTimeParser"}, new String[]{"<sample:4>", "<sample:0>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "append", "org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser[]", "<sample:1>", "<sample:1>"}}), new String[][]{{"toFormatter", "", "4"}, {"parseLocalDateTime", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneShortName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendSecondOfDay", "int", "4934544"}}, 2), new String[][]{{"toFormatter", "", "6"}, {"print", "org.joda.time.ReadableInstant", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000...#4934550#-293589905", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendMinuteOfHour", new String[]{"int"}, new String[]{"100000000"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "canBuildPrinter", ""}}), new String[][]{{"toFormatter", "", "5"}, {"parseMutableDateTime", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.MutableDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000-08:00 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getHourOfDay=0, getMillis=28800000, getMillisOfDay=0, getMillisOfSecond=0, getMinuteOfDay=...#318#1614265780", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitYear", new String[]{"int"}, new String[]{"10000000"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfHour", "int,int", "400000104", "5000028"}}), new String[][]{{"toFormatter", "", "5"}, {"parseMillis", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendText", "org.joda.time.DateTimeFieldType", "<sample:7>"}}), new String[][]{{"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitYear", new String[]{"int", "boolean"}, new String[]{"163839", "true"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendOptional", "org.joda.time.format.DateTimeParser", "<sample:1>"}, {"org.joda.time.format.DateTimeFormatterBuilder", "append", "org.joda.time.format.DateTimeParser", "<null>"}}), new String[][]{{"toFormatter", "", "4"}, {"parseMillis", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-62167190822000", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneShortName", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}, 3), new String[][]{{"toFormatter", "", "3"}, {"parseMutableDateTime", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendPattern", new String[]{"java.lang.String"}, new String[]{"de"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "toPrinter", ""}, {"org.joda.time.format.DateTimeFormatterBuilder", "canBuildFormatter", ""}}, 3), new String[][]{{"append", "org.joda.time.format.DateTimeParser", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimeFormatter"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfWeekText", ""}}), new String[][]{{"toPrinter", "", "6"}, {"estimateParsedLength", "", "2"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePartial,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder$Composite", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfHour", new String[]{"int", "int"}, new String[]{"134222727", "19967230"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFixedSignedDecimal", "org.joda.time.DateTimeFieldType,int", "<sample:7>", "50"}}, 3), new String[][]{{"toFormatter", "", "7"}, {"parseDateTime", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitYear", "int,boolean", "4934443", "true"}}), new String[][]{{"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneShortName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneId", ""}}), new String[][]{{"toFormatter", "", "1"}, {"parseMillis", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitWeekyear", new String[]{"int", "boolean"}, new String[]{"-50000", "false"}, false, 2, new String[][]{}), new String[][]{{"toPrinter", "", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePartial,java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimePrinter"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendDecimal", "org.joda.time.DateTimeFieldType,int,int", "<null>", "-54096", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=false, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=false, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendHalfdayOfDayText", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfWeekText", ""}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneId", ""}}, 2), new String[][]{{"toFormatter", "", "6"}, {"printTo", "java.io.Writer,long", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendMonthOfYearText", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "append", "org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser", "<sample:2>", "<sample:12>"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneId", ""}}), new String[][]{{"toFormatter", "", "4"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFixedSignedDecimal", "org.joda.time.DateTimeFieldType,int", "<sample:4>", "-100058"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFraction", new String[]{"org.joda.time.DateTimeFieldType", "int", "int"}, new String[]{"<sample:5>", "2147483647", "-32891103"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendDecimal", "org.joda.time.DateTimeFieldType,int,int", "<sample:0>", "9868929", "99999994"}}), new String[][]{{"toPrinter", "", "1"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePartial,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder$Composite", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimePrinter"}, new String[]{"<sample:9>"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendYearOfEra", "int,int", "2008", "4967312"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitYear", "int,boolean", "-5000010", "true"}}), new String[][]{{"toFormatter", "", "5"}, {"printTo", "java.io.Writer,org.joda.time.ReadableInstant", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimePrinter"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendEraText", ""}}, 1), new String[][]{{"toPrinter", "", "5"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial,java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder$Composite", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendLiteral", "char", "1"}}), new String[][]{{"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "6"}, {"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFraction", new String[]{"org.joda.time.DateTimeFieldType", "int", "int"}, new String[]{"<sample:4>", "523768", "-393234"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendYearOfCentury", "int,int", "25000006", "-199999937"}}), new String[][]{{"toPrinter", "", "2"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial,java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder$Composite", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendCenturyOfEra", new String[]{"int", "int"}, new String[]{"50", "-101"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfHour", "int,int", "9868945", "999"}}), new String[][]{{"toFormatter", "", "4"}, {"parseMillis", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitYear", "int,boolean", "108", "true"}}), new String[][]{{"estimatePrintedLength", "", "5"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial,java.util.Locale", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneId", ""}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfDay", "int,int", "5194352", "134747015"}}, 2), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial,java.util.Locale", "0"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePartial,java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder$Composite", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "clear", ""}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitWeekyear", "int,boolean", "40000", "false"}}), new String[][]{{"printTo", "java.lang.StringBuffer,org.joda.time.ReadablePartial,java.util.Locale", "5"}, {"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneId", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitYear", "int,boolean", "1073741823", "false"}}), new String[][]{{"toFormatter", "", "1"}, {"parseDateTime", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneName", new String[]{}, new String[]{}, false), new String[][]{{"toFormatter", "", "1"}, {"printTo", "java.io.Writer,long", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendOptional", "org.joda.time.format.DateTimeParser", "<sample:6>"}}), new String[][]{{"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneName", "java.util.Map", "<sample:0>"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitWeekyear", "int,boolean", "-10019", "false"}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePartial,java.util.Locale", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder$Composite", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendPattern", new String[]{"java.lang.String"}, new String[]{"I"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendYearOfCentury", "int,int", "0", "-32891103"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendOptional", new String[]{"org.joda.time.format.DateTimeParser"}, new String[]{"<sample:15>"}, false, 5, new String[][]{}), new String[][]{{"appendLiteral", "java.lang.String", "5"}, {"toPrinter", "", "5"}, {"parseInto", "org.joda.time.format.DateTimeParserBucket,java.lang.String,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-13", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendMonthOfYearShortText", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"toFormatter", "", "2"}, {"parseMutableDateTime", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfWeekShortText", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitYear", "int,boolean", "1869", "true"}}), new String[][]{{"toFormatter", "", "5"}, {"printTo", "java.lang.StringBuffer,org.joda.time.ReadableInstant", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendHourOfHalfday", new String[]{"int"}, new String[]{"2000"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendPattern", "java.lang.String", "1.5f"}}), new String[][]{{"toFormatter", "", "7"}, {"print", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.500000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000...#2003#1032158652", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendMinuteOfHour", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfSecond", "int,int", "4194439", "524293"}}), new String[][]{{"toFormatter", "", "4"}, {"printTo", "java.io.Writer,org.joda.time.ReadablePartial", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendOptional", new String[]{"org.joda.time.format.DateTimeParser"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFixedDecimal", "org.joda.time.DateTimeFieldType,int", "<sample:3>", "5000046"}}), new String[][]{{"toFormatter", "", "5"}, {"parseLocalDateTime", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimePrinter", "org.joda.time.format.DateTimeParser[]"}, new String[]{"<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneOffset", "java.lang.String,java.lang.String,boolean,int,int", "aaa", "Tit6d", "true", "100001", "5194352"}}), new String[][]{{"toFormatter", "", "7"}, {"printTo", "java.io.Writer,org.joda.time.ReadableInstant", "4"}, {"parseLocalDate", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendSecondOfDay", new String[]{"int"}, new String[]{"4934400"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "append", "org.joda.time.format.DateTimePrinter", "<sample:3>"}}), new String[][]{{"toFormatter", "", "2"}, {"parseLocalDateTime", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.LocalDateTime", actual.getClass().getName());
  assertEquals("1970-01-01T00:00:00.000 {getCenturyOfEra=19, getDayOfMonth=1, getDayOfWeek=4, getDayOfYear=1, getEra=1, getFieldTypes=[year, monthOfYear, dayOfMonth, millisOfDay], getFields=[DateTimeField[year], Date...#416#-562249996", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendClockhourOfDay", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "append", "org.joda.time.format.DateTimeFormatter", "<sample:2>"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfHour", "int,int", "-5000035", "961"}}), new String[][]{{"toFormatter", "", "0"}, {"print", "org.joda.time.ReadableInstant", "7"}, {"print", "org.joda.time.ReadableInstant", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("24", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendSecondOfMinute", "int", "32872"}}), new String[][]{{"toFormatter", "", "5"}, {"print", "org.joda.time.ReadablePartial", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd...#32872#346504320", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfMinute", new String[]{"int", "int"}, new String[]{"2147483647", "400000103"}, false, 3, new String[][]{}), new String[][]{{"toFormatter", "", "5"}, {"printTo", "java.lang.Appendable,org.joda.time.ReadableInstant", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendOptional", new String[]{"org.joda.time.format.DateTimeParser"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}), new String[][]{{"toFormatter", "", "7"}, {"parseDateTime", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfMinute", new String[]{"int", "int"}, new String[]{"134746959", "267435455"}, false), new String[][]{{"toFormatter", "", "0"}, {"printTo", "java.io.Writer,long", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "append", "org.joda.time.format.DateTimeFormatter", "<sample:4>"}}), new String[][]{{"printTo", "java.io.Writer,org.joda.time.ReadablePartial,java.util.Locale", "6"}, {"estimateParsedLength", "", "7"}, {"estimatePrintedLength", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendLiteral", new String[]{"char"}, new String[]{"\000"}, false, 2, new String[][]{}), new String[][]{{"toFormatter", "", "7"}, {"printTo", "java.io.Writer,long", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfSecond", new String[]{"int", "int"}, new String[]{"0", "-12"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendSecondOfMinute", "int", "-511870906"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneShortName", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendHalfdayOfDayText", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "canBuildPrinter", ""}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendHalfdayOfDayText", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendMonthOfYear", new String[]{"int"}, new String[]{"50000000"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitWeekyear", "int", "961"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimePrinter", "org.joda.time.format.DateTimeParser[]"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "append", "org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser", "<sample:0>", "<sample:6>"}}, 2), new String[][]{{"append", "org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser[]", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "canBuildFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "toPrinter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=false, canBuildParser=false, canBuildPrinter=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendMonthOfYearText", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendHourOfDay", new String[]{"int"}, new String[]{"524337"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneName", "java.util.Map", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendShortText", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFixedSignedDecimal", "org.joda.time.DateTimeFieldType,int", "<sample:5>", "48"}}, 3), new String[][]{{"canBuildPrinter", "", "7"}, {"appendHalfdayOfDayText", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendCenturyOfEra", new String[]{"int", "int"}, new String[]{"-2147483648", "1000000"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendOptional", "org.joda.time.format.DateTimeParser", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendWeekyear", new String[]{"int", "int"}, new String[]{"11006", "589821"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfWeekShortText", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneShortName", "java.util.Map", "<sample:0>"}}, 1), new String[][]{{"appendHalfdayOfDayText", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendClockhourOfHalfday", new String[]{"int"}, new String[]{"1073741823"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfSecond", "int,int", "999", "-10000059"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendCenturyOfEra", new String[]{"int", "int"}, new String[]{"-1047577", "983138"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfMinute", new String[]{"int", "int"}, new String[]{"-99", "-2147483648"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfHour", "int,int", "999", "2147483647"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendPattern", "java.lang.String", "PT1H1.5f"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendSignedDecimal", new String[]{"org.joda.time.DateTimeFieldType", "int", "int"}, new String[]{"<sample:6>", "1999892", "5"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneShortName", "java.util.Map", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfDay", new String[]{"int", "int"}, new String[]{"200", "20008"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFraction", "org.joda.time.DateTimeFieldType,int,int", "<sample:4>", "-54", "135217749"}}, 1), new String[][]{{"appendFraction", "org.joda.time.DateTimeFieldType,int,int", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneOffset", new String[]{"java.lang.String", "java.lang.String", "boolean", "int", "int"}, new String[]{"0xFFFFFFFF", "Titld", "false", "1922", "1000000001"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendLiteral", "java.lang.String", "1000000"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendDecimal", "org.joda.time.DateTimeFieldType,int,int", "<sample:2>", "10000000", "9868908"}}, 3), new String[][]{{"appendFixedSignedDecimal", "org.joda.time.DateTimeFieldType,int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendCenturyOfEra", new String[]{"int", "int"}, new String[]{"-10000", "10001028"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneName", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendLiteral", new String[]{"char"}, new String[]{"\000"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "canBuildParser", ""}}, 1), new String[][]{{"appendTwoDigitYear", "int", "2"}, {"appendYear", "int,int", "7"}, {"appendTwoDigitYear", "int,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendClockhourOfHalfday", new String[]{"int"}, new String[]{"-9999999"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneShortName", "java.util.Map", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfMinute", new String[]{"int", "int"}, new String[]{"1000001", "500000000"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimePrinter", "org.joda.time.format.DateTimeParser[]"}, new String[]{"<sample:8>", "<sample:0>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendYearOfCentury", "int,int", "-14", "-65533"}}, 2), new String[][]{{"appendTimeZoneShortName", "java.util.Map", "6"}, {"appendFractionOfMinute", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitYear", new String[]{"int"}, new String[]{"8388508"}, false, 0, null, 2), new String[][]{{"appendTimeZoneShortName", "java.util.Map", "4"}, {"appendDayOfMonth", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendDecimal", new String[]{"org.joda.time.DateTimeFieldType", "int", "int"}, new String[]{"<sample:4>", "68", "2147483647"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendHourOfHalfday", "int", "198"}}, 1), new String[][]{{"canBuildFormatter", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneId", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"appendTimeZoneName", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfMinute", new String[]{"int", "int"}, new String[]{"19737816", "952"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendMinuteOfDay", "int", "-95805695"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneShortName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfMinute", new String[]{"int", "int"}, new String[]{"1093741832", "400000104"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendHourOfDay", "int", "525289"}, {"org.joda.time.format.DateTimeFormatterBuilder", "toParser", ""}}, 3), new String[][]{{"append", "org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "canBuildParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "append", "org.joda.time.format.DateTimeFormatter", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfDay", new String[]{"int", "int"}, new String[]{"2147483647", "-1000021"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitYear", "int,boolean", "0", "false"}}, 2), new String[][]{{"appendFractionOfMinute", "int,int", "4"}, {"appendFixedSignedDecimal", "org.joda.time.DateTimeFieldType,int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfWeekText", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendMinuteOfHour", "int", "9999989"}}, 3), new String[][]{{"appendMonthOfYearText", "", "5"}, {"appendLiteral", "char", "0"}, {"appendFractionOfMinute", "int,int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendMillisOfSecond", new String[]{"int"}, new String[]{"100"}, false, 0, null, 3), new String[][]{{"appendFractionOfMinute", "int,int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfYear", new String[]{"int"}, new String[]{"200000052"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "append", "org.joda.time.format.DateTimePrinter", "<null>"}}, 1), new String[][]{{"appendSignedDecimal", "org.joda.time.DateTimeFieldType,int,int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendWeekyear", new String[]{"int", "int"}, new String[]{"2000002", "131054"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendEraText", ""}}, 2), new String[][]{{"appendFixedSignedDecimal", "org.joda.time.DateTimeFieldType,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendDecimal", new String[]{"org.joda.time.DateTimeFieldType", "int", "int"}, new String[]{"<sample:9>", "5063", "1004"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendMinuteOfDay", "int", "-9868908"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendHalfdayOfDayText", ""}}, 2), new String[][]{{"appendTimeZoneShortName", "java.util.Map", "6"}, {"appendTwoDigitYear", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendHalfdayOfDayText", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"appendTimeZoneId", "", "0"}, {"appendClockhourOfDay", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "canBuildPrinter", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=false, canBuildParser=false, canBuildPrinter=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfSecond", new String[]{"int", "int"}, new String[]{"9999999", "100016410"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFixedSignedDecimal", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:5>", "216"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneShortName", ""}}, 3), new String[][]{{"appendMonthOfYearText", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendHourOfDay", new String[]{"int"}, new String[]{"198"}, false, 6, new String[][]{}, 2), new String[][]{{"canBuildFormatter", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendLiteral", new String[]{"char"}, new String[]{"7"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitYear", "int", "101048575"}, {"org.joda.time.format.DateTimeFormatterBuilder", "clear", ""}}, 2), new String[][]{{"canBuildParser", "", "3"}, {"append", "org.joda.time.format.DateTimeParser", "0"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendMillisOfDay", new String[]{"int"}, new String[]{"488"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendPattern", "java.lang.String", "true"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneShortName", "java.util.Map", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneOffset", new String[]{"java.lang.String", "boolean", "int", "int"}, new String[]{"100000200", "true", "2147483647", "5009"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneOffset", "java.lang.String,java.lang.String,boolean,int,int", "1LNo parsers supplied", "{\"a\"H1}", "false", "-118", "334217728"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "printUnknownString", new String[]{"java.io.Writer", "int"}, new String[]{"<sample:0>", "4934512"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimePrinter"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendEraText", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"[1,23]"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfDay", "int,int", "1000021", "318435468"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfMonth", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "canBuildFormatter", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneName", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "canBuildParser", ""}}, 2), new String[][]{{"appendFixedSignedDecimal", "org.joda.time.DateTimeFieldType,int", "5"}, {"appendMillisOfSecond", "int", "6"}, {"appendFixedDecimal", "org.joda.time.DateTimeFieldType,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendClockhourOfDay", new String[]{"int"}, new String[]{"1000015"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitWeekyear", "int,boolean", "99958", "true"}}, 2), new String[][]{{"append", "org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser[]", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendDecimal", new String[]{"org.joda.time.DateTimeFieldType", "int", "int"}, new String[]{"<sample:5>", "200000052", "-5"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfSecond", "int,int", "131054", "100000000"}, {"org.joda.time.format.DateTimeFormatterBuilder", "toPrinter", ""}}, 1), new String[][]{{"appendDecimal", "org.joda.time.DateTimeFieldType,int,int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimePrinter", "org.joda.time.format.DateTimeParser[]"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfSecond", "int,int", "-2147483588", "-11025"}}, 3), new String[][]{{"appendTwoDigitYear", "int,boolean", "7"}, {"appendDayOfWeek", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendClockhourOfDay", new String[]{"int"}, new String[]{"99999985"}, false, 4, new String[][]{}, 1), new String[][]{{"append", "org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendShortText", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendMinuteOfDay", "int", "0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendWeekOfWeekyear", new String[]{"int"}, new String[]{"1261647"}, false, 0, null, 2), new String[][]{{"appendTimeZoneShortName", "", "2"}, {"appendShortText", "org.joda.time.DateTimeFieldType", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitYear", new String[]{"int", "boolean"}, new String[]{"4934464", "false"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendMillisOfDay", "int", "5512"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneShortName", "java.util.Map", "<sample:5>"}}, 2), new String[][]{{"appendHourOfHalfday", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitYear", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendClockhourOfDay", new String[]{"int"}, new String[]{"267108916"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendYear", "int,int", "4934408", "-10000004"}}, 3), new String[][]{{"appendTimeZoneShortName", "java.util.Map", "4"}, {"appendTwoDigitWeekyear", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneId", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"appendHourOfHalfday", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimePrinter", "org.joda.time.format.DateTimeParser[]"}, new String[]{"<sample:6>", "<sample:0>"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFixedSignedDecimal", "org.joda.time.DateTimeFieldType,int", "<sample:5>", "-327678"}}, 3), new String[][]{{"appendClockhourOfHalfday", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfWeek", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendMillisOfDay", "int", "-523788"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneName", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"appendClockhourOfHalfday", "int", "4"}, {"appendFixedSignedDecimal", "org.joda.time.DateTimeFieldType,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneShortName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfSecond", "int,int", "-100000026", "2147483647"}, {"org.joda.time.format.DateTimeFormatterBuilder", "toParser", ""}}, 2), new String[][]{{"appendDayOfYear", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendSignedDecimal", new String[]{"org.joda.time.DateTimeFieldType", "int", "int"}, new String[]{"<sample:7>", "-32767", "1000000263"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneName", ""}, {"org.joda.time.format.DateTimeFormatterBuilder", "append", "org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser", "<sample:7>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneName", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 0, null, 2), new String[][]{{"appendTimeZoneShortName", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimePrinter", "org.joda.time.format.DateTimeParser[]"}, new String[]{"<sample:0>", "<sample:5>"}, false, 0, null, 1), new String[][]{{"appendFixedSignedDecimal", "org.joda.time.DateTimeFieldType,int", "5"}, {"appendTwoDigitWeekyear", "int,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitWeekyear", new String[]{"int"}, new String[]{"65736"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneOffset", new String[]{"java.lang.String", "java.lang.String", "boolean", "int", "int"}, new String[]{"1.6", "Literal mus not be\037null", "true", "524337", "902"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendMillisOfDay", "int", "2147483646"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneShortName", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"append", "org.joda.time.format.DateTimeParser", "7"}, {"appendTimeZoneShortName", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimePrinter", "org.joda.time.format.DateTimeParser"}, new String[]{"<sample:6>", "<sample:7>"}, false, 0, null, 1), new String[][]{{"appendClockhourOfDay", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendDecimal", new String[]{"org.joda.time.DateTimeFieldType", "int", "int"}, new String[]{"<sample:6>", "-2147483648", "2147483647"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"CE"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFixedDecimal", "org.joda.time.DateTimeFieldType,int", "<sample:5>", "100000076"}}, 2), new String[][]{{"appendFractionOfHour", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendUnknownString", new String[]{"java.lang.StringBuffer", "int"}, new String[]{"<sample:3>", "-4193399"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendText", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfWeek", "int", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendDecimal", new String[]{"org.joda.time.DateTimeFieldType", "int", "int"}, new String[]{"<sample:8>", "904", "1020"}, false, 0, null, 3), new String[][]{{"appendDayOfYear", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendYearOfEra", new String[]{"int", "int"}, new String[]{"1073741823", "49999"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendWeekOfWeekyear", "int", "100000000"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFraction", new String[]{"org.joda.time.DateTimeFieldType", "int", "int"}, new String[]{"<sample:2>", "9", "999999"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendClockhourOfHalfday", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendMinuteOfDay", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendYearOfCentury", "int,int", "0", "101"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendCenturyOfEra", new String[]{"int", "int"}, new String[]{"-2147483648", "5000000"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendMonthOfYear", new String[]{"int"}, new String[]{"10000001"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfWeek", "int", "65533"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendWeekyear", new String[]{"int", "int"}, new String[]{"1001", "142"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendWeekOfWeekyear", "int", "1073741823"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneOffset", new String[]{"java.lang.String", "boolean", "int", "int"}, new String[]{"Incomplete parser array", "true", "9", "2147483646"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimePrinter", "org.joda.time.format.DateTimeParser[]"}, new String[]{"<sample:10>", "<sample:1>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "canBuildPrinter", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendMillisOfSecond", new String[]{"int"}, new String[]{"327678"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendShortText", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfDay", "int,int", "999999", "546870912"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendCenturyOfEra", new String[]{"int", "int"}, new String[]{"131054", "99"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendSecondOfMinute", "int", "1047577"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfHour", new String[]{"int", "int"}, new String[]{"131054", "49"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "append", "org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser", "<null>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneName", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitYear", new String[]{"int"}, new String[]{"10000004"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendMonthOfYearText", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendClockhourOfHalfday", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendYearOfCentury", "int,int", "49999", "69108866"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendMillisOfSecond", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "clear", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendYearOfCentury", "int,int", "100", "-9999999"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneShortName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canBuildFormatter=false, canBuildParser=false, canBuildPrinter=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimePrinter", "org.joda.time.format.DateTimeParser"}, new String[]{"<sample:4>", "<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendHourOfHalfday", new String[]{"int"}, new String[]{"400000104"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendYearOfEra", "int,int", "2147483647", "1000000030"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneShortName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimePrinter"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=false, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=false, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneOffset", new String[]{"java.lang.String", "boolean", "int", "int"}, new String[]{"0x2345678:", "false", "499999999", "1047577"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFixedSignedDecimal", "org.joda.time.DateTimeFieldType,int", "<sample:1>", "10001"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendCenturyOfEra", new String[]{"int", "int"}, new String[]{"0", "2147483647"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendLiteral", new String[]{"char"}, new String[]{" "}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfMinute", "int,int", "-2147483648", "108"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendSignedDecimal", new String[]{"org.joda.time.DateTimeFieldType", "int", "int"}, new String[]{"<sample:3>", "99999999", "1002"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "canBuildPrinter", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFraction", "org.joda.time.DateTimeFieldType,int,int", "<sample:1>", "-546870912", "2147483647"}, {"org.joda.time.format.DateTimeFormatterBuilder", "toPrinter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=false, canBuildParser=false, canBuildPrinter=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfWeek", new String[]{"int"}, new String[]{"100000026"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "canBuildParser", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendYearOfCentury", "int,int", "44", "613979717"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendHourOfHalfday", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitWeekyear", "int,boolean", "99", "false"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitYear", "int", "-9999999"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendMonthOfYearShortText", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfWeekShortText", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendMinuteOfDay", "int", "1000000001"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfSecond", new String[]{"int", "int"}, new String[]{"1000015", "1000021"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendSecondOfDay", "int", "1000000000"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendMonthOfYearText", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitWeekyear", new String[]{"int", "boolean"}, new String[]{"50", "false"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "clear", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitYear", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneName", "java.util.Map", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "toParser", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendHalfdayOfDayText", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"appendText", "org.joda.time.DateTimeFieldType", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfDay", new String[]{"int", "int"}, new String[]{"536870875", "999999987"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendWeekyear", "int,int", "-2147483648", "500000000"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimeParser"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendWeekyear", "int,int", "1073741823", "20000"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfDay", new String[]{"int", "int"}, new String[]{"-1000021", "10001"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfMinute", new String[]{"int", "int"}, new String[]{"999999999", "-1000021"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendYearOfEra", new String[]{"int", "int"}, new String[]{"-25", "77108863"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitYear", new String[]{"int"}, new String[]{"4934454"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendSignedDecimal", "org.joda.time.DateTimeFieldType,int,int", "<sample:7>", "1047635", "2147483647"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitYear", "int,boolean", "65532", "true"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendOptional", new String[]{"org.joda.time.format.DateTimeParser"}, new String[]{"<sample:5>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneShortName", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfYear", "int", "25000006"}, {"org.joda.time.format.DateTimeFormatterBuilder", "toPrinter", ""}}), new String[][]{{"appendCenturyOfEra", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendMillisOfDay", new String[]{"int"}, new String[]{"-2147483648"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "toParser", ""}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitWeekyear", "int", "-10001"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendMillisOfSecond", new String[]{"int"}, new String[]{"5000027"}, false), new String[][]{{"appendClockhourOfDay", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendText", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendHourOfHalfday", "int", "20"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendSecondOfMinute", new String[]{"int"}, new String[]{"-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendClockhourOfDay", new String[]{"int"}, new String[]{"108"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendMillisOfDay", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendMillisOfDay", new String[]{"int"}, new String[]{"-1048565"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfWeekText", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendDecimal", new String[]{"org.joda.time.DateTimeFieldType", "int", "int"}, new String[]{"<sample:0>", "1000000057", "50"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimeFormatter"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFixedSignedDecimal", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:2>", "65482"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "clear", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendMinuteOfHour", new String[]{"int"}, new String[]{"-2147483588"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendMillisOfDay", "int", "531"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimePrinter", "org.joda.time.format.DateTimeParser[]"}, new String[]{"<sample:10>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimeParser"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitWeekyear", "int,boolean", "-99999999", "true"}}), new String[][]{{"appendFixedSignedDecimal", "org.joda.time.DateTimeFieldType,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneOffset", new String[]{"java.lang.String", "java.lang.String", "boolean", "int", "int"}, new String[]{"\n", "5,..", "false", "65532", "100000"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfSecond", new String[]{"int", "int"}, new String[]{"2147483647", "130812"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendOptional", "org.joda.time.format.DateTimeParser", "<sample:7>"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitWeekyear", "int,boolean", "503", "false"}}), new String[][]{{"append", "org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser", "0"}, {"appendTwoDigitYear", "int,boolean", "0"}, {"appendYearOfEra", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfYear", new String[]{"int"}, new String[]{"1999999953"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendMinuteOfDay", new String[]{"int"}, new String[]{"-28"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendMillisOfDay", "int", "1000149"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendMillisOfSecond", new String[]{"int"}, new String[]{"131075"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "toParser", ""}, {"org.joda.time.format.DateTimeFormatterBuilder", "canBuildFormatter", ""}}), new String[][]{{"canBuildParser", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendWeekOfWeekyear", new String[]{"int"}, new String[]{"43"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfWeekText", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneShortName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFraction", "org.joda.time.DateTimeFieldType,int,int", "<sample:7>", "1000015", "-100000026"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendMillisOfDay", "int", "-95805695"}}), new String[][]{{"appendFraction", "org.joda.time.DateTimeFieldType,int,int", "6"}, {"canBuildPrinter", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimePrinter"}, new String[]{"<sample:4>"}, false), new String[][]{{"appendFraction", "org.joda.time.DateTimeFieldType,int,int", "5"}, {"appendClockhourOfDay", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendSecondOfMinute", new String[]{"int"}, new String[]{"1091644672"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitWeekyear", "int,boolean", "1073741823", "true"}, {"org.joda.time.format.DateTimeFormatterBuilder", "canBuildFormatter", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendSecondOfDay", new String[]{"int"}, new String[]{"-1121644671"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFraction", new String[]{"org.joda.time.DateTimeFieldType", "int", "int"}, new String[]{"<sample:6>", "1047635", "-49"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfYear", "int", "-24"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfWeekShortText", ""}}), new String[][]{{"toFormatter", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "canBuildPrinter", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneShortName", "java.util.Map", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfWeek", new String[]{"int"}, new String[]{"65542"}, false, 6, new String[][]{}), new String[][]{{"appendLiteral", "java.lang.String", "3"}, {"appendYearOfEra", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendOptional", new String[]{"org.joda.time.format.DateTimeParser"}, new String[]{"<sample:9>"}, false), new String[][]{{"appendOptional", "org.joda.time.format.DateTimeParser", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendEraText", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"appendTimeZoneShortName", "", "0"}, {"appendFractionOfDay", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendShortText", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "append", "org.joda.time.format.DateTimePrinter", "<sample:5>"}, {"org.joda.time.format.DateTimeFormatterBuilder", "append", "org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser[]", "<sample:3>", "<sample:3>"}}), new String[][]{{"appendTimeZoneId", "", "6"}, {"append", "org.joda.time.format.DateTimeParser", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfMinute", new String[]{"int", "int"}, new String[]{"32868", "-2147483648"}, false), new String[][]{{"appendMonthOfYear", "int", "6"}, {"toParser", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder$Composite", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendHourOfDay", new String[]{"int"}, new String[]{"9999989"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneName", ""}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfMonth", "int", "49979"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendEraText", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendClockhourOfHalfday", "int", "2147483647"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfWeekText", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendMillisOfSecond", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfWeekText", ""}}), new String[][]{{"appendMinuteOfHour", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimeParser"}, new String[]{"<sample:6>"}, false), new String[][]{{"appendFractionOfHour", "int,int", "7"}, {"appendMonthOfYearShortText", "", "4"}, {"toFormatter", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"null"}, false), new String[][]{{"appendFractionOfSecond", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "canBuildFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "toPrinter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=false, canBuildParser=false, canBuildPrinter=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfMinute", new String[]{"int", "int"}, new String[]{"-24", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "canBuildFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendOptional", "org.joda.time.format.DateTimeParser", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitWeekyear", new String[]{"int"}, new String[]{"10000001"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneShortName", "java.util.Map", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendSignedDecimal", new String[]{"org.joda.time.DateTimeFieldType", "int", "int"}, new String[]{"<sample:2>", "-100000000", "2147483646"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfWeekText", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfMinute", "int,int", "365782272", "-100000001"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendMillisOfSecond", new String[]{"int"}, new String[]{"-11"}, false, 2, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfMonth", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimePrinter"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendEraText", ""}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfWeekShortText", ""}}), new String[][]{{"append", "org.joda.time.format.DateTimeFormatter", "4"}, {"appendSecondOfDay", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendUnknownString", new String[]{"java.lang.StringBuffer", "int"}, new String[]{"<sample:3>", "-2147483594"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendMinuteOfHour", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendText", "org.joda.time.DateTimeFieldType", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendYearOfCentury", new String[]{"int", "int"}, new String[]{"-99999999", "-1048565"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneShortName", ""}, {"org.joda.time.format.DateTimeFormatterBuilder", "toFormatter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneName", new String[]{}, new String[]{}, false), new String[][]{{"appendCenturyOfEra", "int,int", "7"}, {"toParser", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder$Composite", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "canBuildParser", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=false, canBuildParser=false, canBuildPrinter=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendClockhourOfDay", new String[]{"int"}, new String[]{"-2146983648"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitWeekyear", "int", "16"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendPattern", new String[]{"java.lang.String"}, new String[]{"0x23a5688:"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendMonthOfYearText", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneOffset", "java.lang.String,java.lang.String,boolean,int,int", "10000", "HNSTCNCE", "false", "-5000027", "-2147483648"}}), new String[][]{{"appendDayOfWeekShortText", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendLiteral", new String[]{"java.lang.String"}, new String[]{"2147483648BCE"}, false), new String[][]{{"canBuildParser", "", "0"}, {"appendFixedSignedDecimal", "org.joda.time.DateTimeFieldType,int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitYear", new String[]{"int"}, new String[]{"8388709"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendMinuteOfHour", "int", "73"}}), new String[][]{{"appendHourOfHalfday", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimePrinter", "org.joda.time.format.DateTimeParser"}, new String[]{"<null>", "<sample:7>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitWeekyear", "int", "-99958"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFixedDecimal", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:6>", "66061287"}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendSecondOfDay", new String[]{"int"}, new String[]{"49979"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendHalfdayOfDayText", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFixedSignedDecimal", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:3>", "-262135"}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFraction", "org.joda.time.DateTimeFieldType,int,int", "<sample:0>", "2147483647", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfYear", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "append", "org.joda.time.format.DateTimeParser", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfWeekText", new String[]{}, new String[]{}, false), new String[][]{{"appendClockhourOfDay", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimePrinter", "org.joda.time.format.DateTimeParser[]"}, new String[]{"<sample:3>", "<empty>"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfMinute", "int,int", "-2147483648", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendPattern", new String[]{"java.lang.String"}, new String[]{"Hello, World-0.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitYear", new String[]{"int", "boolean"}, new String[]{"2147483647", "true"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfWeekText", ""}, {"org.joda.time.format.DateTimeFormatterBuilder", "toPrinter", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "append", "org.joda.time.format.DateTimePrinter", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=false, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "append", "org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser", "<sample:10>", "<sample:0>"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendPattern", "java.lang.String", "--1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatter", actual.getClass().getName());
  assertEquals("{getDefaultYear=2000, getPivotYear=null, isOffsetParsed=false, isParser=true, isPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneShortName", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneShortName", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfSecond", new String[]{"int", "int"}, new String[]{"4999992", "-1048089"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneOffset", "java.lang.String,boolean,int,int", "0x123456789", "false", "-78", "1001"}}), new String[][]{{"canBuildFormatter", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneOffset", new String[]{"java.lang.String", "boolean", "int", "int"}, new String[]{"", "true", "9999", "5000091"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendOptional", "org.joda.time.format.DateTimeParser", "<sample:3>"}}), new String[][]{{"appendLiteral", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "toPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneShortName", ""}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendLiteral", "java.lang.String", "1.5f"}}), new String[][]{{"estimateParsedLength", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendSecondOfDay", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitYear", "int,boolean", "131054", "true"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendClockhourOfHalfday", "int", "10000018"}}), new String[][]{{"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=false, canBuildParser=false, canBuildPrinter=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=false, canBuildParser=false, canBuildPrinter=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfMonth", new String[]{"int"}, new String[]{"54"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendHourOfHalfday", "int", "961"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneShortName", "java.util.Map", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendDecimal", new String[]{"org.joda.time.DateTimeFieldType", "int", "int"}, new String[]{"<sample:3>", "-24", "-1000021"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfWeek", "int", "268445454"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFixedDecimal", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:6>", "4934516"}, false, 7, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfWeekShortText", ""}}), new String[][]{{"appendLiteral", "java.lang.String", "0"}, {"appendMillisOfDay", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneName", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendClockhourOfHalfday", "int", "1047577"}}), new String[][]{{"appendFixedSignedDecimal", "org.joda.time.DateTimeFieldType,int", "4"}, {"appendFractionOfDay", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfYear", new String[]{"int"}, new String[]{"-30"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendMonthOfYear", "int", "50000035"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneOffset", new String[]{"java.lang.String", "boolean", "int", "int"}, new String[]{"10000000", "false", "4135", "50000000"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "append", "org.joda.time.format.DateTimeFormatter", "<sample:5>"}}, 1), new String[][]{{"clear", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=false, canBuildParser=false, canBuildPrinter=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=false, canBuildParser=false, canBuildPrinter=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendLiteral", new String[]{"char"}, new String[]{"A"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFraction", "org.joda.time.DateTimeFieldType,int,int", "<sample:9>", "50", "-2147418057"}}, 2), new String[][]{{"appendClockhourOfDay", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimePrinter", "org.joda.time.format.DateTimeParser"}, new String[]{"<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendHalfdayOfDayText", ""}}, 3), new String[][]{{"append", "org.joda.time.format.DateTimeFormatter", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendWeekOfWeekyear", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3), new String[][]{{"appendFractionOfDay", "int,int", "5"}, {"appendText", "org.joda.time.DateTimeFieldType", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendClockhourOfHalfday", new String[]{"int"}, new String[]{"65527"}, false, 0, null, 3), new String[][]{{"appendHourOfHalfday", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "toFormatter", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "canBuildFormatter", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendCenturyOfEra", "int,int", "25000006", "-11081"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfWeekShortText", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendClockhourOfHalfday", "int", "1000"}}, 2), new String[][]{{"appendSignedDecimal", "org.joda.time.DateTimeFieldType,int,int", "5"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimeParser"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendHourOfDay", "int", "1000001"}, {"org.joda.time.format.DateTimeFormatterBuilder", "toPrinter", ""}}, 2), new String[][]{{"append", "org.joda.time.format.DateTimeParser", "2"}, {"appendTwoDigitWeekyear", "int,boolean", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendSecondOfMinute", new String[]{"int"}, new String[]{"1073741819"}, false, 3, new String[][]{}, 1), new String[][]{{"append", "org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser[]", "0"}, {"appendEraText", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneOffset", new String[]{"java.lang.String", "java.lang.String", "boolean", "int", "int"}, new String[]{"1.5e300", "1000123456789012345678901234567890", "false", "2147483647", "9"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfWeekText", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimeFormatter"}, new String[]{"<sample:0>"}, false), new String[][]{{"appendFixedDecimal", "org.joda.time.DateTimeFieldType,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "toParser", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTwoDigitYear", "int,boolean", "2000000060", "true"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimePrinter"}, new String[]{"<sample:6>"}, false, 0, null, 3), new String[][]{{"append", "org.joda.time.format.DateTimeParser", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfSecond", new String[]{"int", "int"}, new String[]{"-95805695", "-2147483648"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "append", "org.joda.time.format.DateTimeParser", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendHalfdayOfDayText", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendClockhourOfDay", "int", "9999999"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneOffset", "java.lang.String,boolean,int,int", "\t", "true", "-9999999", "-65532"}}, 3), new String[][]{{"appendMinuteOfHour", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendText", new String[]{"org.joda.time.DateTimeFieldType"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfYear", "int", "999999"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneOffset", new String[]{"java.lang.String", "boolean", "int", "int"}, new String[]{"1.5", "true", "-31066", "73"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "append", "org.joda.time.format.DateTimeFormatter", "<sample:9>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimeFormatter"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "toFormatter", ""}}, 1), new String[][]{{"append", "org.joda.time.format.DateTimePrinter,org.joda.time.format.DateTimeParser[]", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendYearOfCentury", new String[]{"int", "int"}, new String[]{"100000003", "1047577"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "append", "org.joda.time.format.DateTimePrinter", "<sample:2>"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfMonth", "int", "10000000"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFixedSignedDecimal", new String[]{"org.joda.time.DateTimeFieldType", "int"}, new String[]{"<sample:4>", "1048674"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendLiteral", new String[]{"char"}, new String[]{","}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "canBuildParser", ""}}), new String[][]{{"appendSecondOfDay", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendMinuteOfHour", new String[]{"int"}, new String[]{"1999998"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendTimeZoneName", ""}}), new String[][]{{"toParser", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder$Composite", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "append", new String[]{"org.joda.time.format.DateTimePrinter", "org.joda.time.format.DateTimeParser[]"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "appendFraction", "org.joda.time.DateTimeFieldType,int,int", "<sample:5>", "-9999951", "-2147483648"}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendCenturyOfEra", "int,int", "132994", "2147483647"}}), new String[][]{{"canBuildFormatter", "", "6"}, {"appendMillisOfSecond", "int", "5"}, {"canBuildParser", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendDayOfYear", new String[]{"int"}, new String[]{"10104"}, false, 4, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "canBuildPrinter", ""}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendEraText", ""}}), new String[][]{{"canBuildParser", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendHalfdayOfDayText", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"appendDecimal", "org.joda.time.DateTimeFieldType,int,int", "7"}, {"canBuildParser", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendFractionOfHour", new String[]{"int", "int"}, new String[]{"99999", "2013265918"}, false, 0, new String[][]{{"org.joda.time.format.DateTimeFormatterBuilder", "canBuildFormatter", ""}, {"org.joda.time.format.DateTimeFormatterBuilder", "appendText", "org.joda.time.DateTimeFieldType", "<null>"}}, 2), new String[][]{{"append", "org.joda.time.format.DateTimeFormatter", "7"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendHourOfDay", new String[]{"int"}, new String[]{"5000027"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.format.DateTimeFormatterBuilder", actual.getClass().getName());
  assertEquals("{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canBuildFormatter=true, canBuildParser=true, canBuildPrinter=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.format.DateTimeFormatterBuilder", "org.joda.time.format.DateTimeFormatterBuilder", "appendHourOfDay", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
}
