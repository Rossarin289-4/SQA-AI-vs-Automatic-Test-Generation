package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"2147483647", "60000"}, false, 11, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", ""}}, 1), new String[][]{{"estimateLength", "", "4"}, {"appendTo", "java.lang.StringBuffer,int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[,sample__a,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-6", "-4"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:a>", "<sample:3>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<null>", "<sample:1>", "<sample:3>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "6", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"1", "38"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long", "60001"}, {"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}}), new String[][]{{"appendTo", "java.lang.StringBuffer,java.util.Calendar", "3"}, {"appendTo", "java.lang.StringBuffer,int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"`\u00e9aaasaaaaaaaaaa", "<sample:2>"}, false, 13, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date,java.lang.StringBuffer", "<sample:1>", "<sample:3>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<null>", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'\u00e9", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:1>", "false", "1", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Greenwich Mean Time", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:1>", "true", "1", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Greenwich Mean Time", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "2020-02-30T25:61:61", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0_sample {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0, sample), getDisplayScript=, getDisplayVariant=sample, getISO3Country=!MissingResourceException, getISO3Languag...#295#545310035", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"PaTT1", "<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "4", "<null>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TT", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"6", "30006"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date", "<null>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date", "<sample:3>"}}, 1), new String[][]{{"estimateLength", "", "3"}, {"appendTo", "java.lang.StringBuffer,int", "3"}, {"estimateLength", "", "3"}, {"appendTo", "java.lang.StringBuffer,java.util.Calendar", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"2", "1"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "9223372036854775807", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<s:ccv>"}}), new String[][]{{"estimateLength", "", "0"}, {"appendTo", "java.lang.StringBuffer,int", "3"}, {"estimateLength", "", "7"}, {"appendTo", "java.lang.StringBuffer,java.util.Calendar", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDatePrinter$UnpaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"2", "2"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "9223372036854775807", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<s:ccv>"}}, 1), new String[][]{{"estimateLength", "", "0"}, {"appendTo", "java.lang.StringBuffer,int", "3"}, {"estimateLength", "", "7"}, {"appendTo", "java.lang.StringBuffer,java.util.Calendar", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDatePrinter$TwoDigitNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:0>", "true", "-47", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-1057", "27"}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "1-d", "<sample:1>"}}, 3), new String[][]{{"appendTo", "java.lang.StringBuffer,int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A_0,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "3600000", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("AM {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:2>", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date", "<sample:2>"}}, 2), new String[][]{{"charAt", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<null>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<sample:4>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PM {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<sample:4>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[,sample,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[a,_A,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[0,a_0_sample,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[a,_A_0,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A_0,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[0,a,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:0>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"3600043", "0"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date,java.lang.StringBuffer", "<sample:2>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "-2147483648", "<null>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "-2147483648", "<null>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("488615383", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "-2147483648", "<null>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "-2147483648", "<null>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-896364410", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "-2147483648", "<null>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("340632", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "-2147483648", "<null>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1372347153", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "-2147483648", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("348744", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A_0,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "-2147483648", "<empty>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("488363911", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-1", "<empty>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "-2147483648", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-1", "<empty>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "-2147483648", "<sample:7>"}}, 3), new String[][]{{"indexOf", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"60000", "<sample:7>"}, false, 14, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"4", "-1"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", "int,int", "3600000", "0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-6", "4"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:a>", "<sample:3>", "<sample:3>"}}, 3), new String[][]{{"estimateLength", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"2147483647", "4"}, false, 15, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:a>", "<sample:3>", "<sample:2>"}}, 3), new String[][]{{"estimateLength", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"2147483647", "2"}, false, 15, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:a>", "<sample:3>", "<sample:2>"}}, 3), new String[][]{{"estimateLength", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "PT1H", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"-3731073"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"-3731073"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "6", "<sample:0>"}}, 3), new String[][]{{"getID", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GMT", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "6", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<null>", "<sample:1>", "<sample:3>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "6", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<null>", "<sample:1>", "<sample:3>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "6", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<null>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<null>", "<sample:3>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<null>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", "int,int", "3600043", "-16"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:2>", "<sample:0>"}}, 1), new String[][]{{"append", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("03 {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:0>"}, false, 13, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", "int,int", "3600043", "60000"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:0>", "<sample:0>"}}, 1), new String[][]{{"append", "char[],int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"900005"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"-900027"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:0>", "<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<null>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:-65>", "<sample:0>", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long", "6"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:3>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[a,_A,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[0,a_0_sample,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<sample:1>"}}, 1), new String[][]{{"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<empty>", "<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", "int,int", "-2147483647", "60001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<empty>", "<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", "int,int", "-2147483647", "60001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<null>", "<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}}, 3), new String[][]{{"append", "java.lang.CharSequence,int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<sample:7>"}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}}, 2), new String[][]{{"append", "float", "0"}, {"indexOf", "java.lang.String,int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<s:b>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}}, 1), new String[][]{{"append", "char", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PM\000 {length=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<sample:0>"}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<s:b>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"3", "<sample:7>"}, false, 0, null, 2), new String[][]{{"replace", "int,int,java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<s:key>", "<sample:7>", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("488615383", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<sample:3>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:-1>", "<sample:1>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-896364410", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<sample:3>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:-1>", "<sample:1>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("340632", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:-2>", "<sample:1>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1372347153", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0 {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=!MissingResourceExc...#268#-877192394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguag...#255#-1492904948", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}}), new String[][]{{"getScript", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "3600000", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("AM {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "3600000", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:2>", "<null>"}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "3600000", "<empty>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:2>", "<null>"}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "3600000", "<empty>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<sample:1>"}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "3600000", "<empty>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PM {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A_0,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "3600000", "<empty>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "3600000", "<empty>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:3>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "3600000", "<empty>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:3>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "3600000", "<empty>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:3>", "<sample:1>"}}), new String[][]{{"charAt", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "\t", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"60001", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("AM {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-142142", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PM {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-71036", "<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getLocale", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:2>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[a,,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[0,a_0,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[,sample,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[a,_A,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[0,a_0_sample,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[a,_A_0,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A_0,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A_0,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("488615383", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-896364410", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("340632", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1372347153", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long", "-2147483649"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1372347153", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "-1.5", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "-1.5", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "-1.5", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "-1.5", "<sample:1>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "-1.5", "<sample:1>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date,java.lang.StringBuffer", "<sample:3>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"3599999", "3600000"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"3599999", "1"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDatePrinter$UnpaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"3599999", "1"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}}), new String[][]{{"estimateLength", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"3600043", "-16383"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"59999", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:2>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sampleAM {length=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"59999", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:3>", "<sample:2>"}}), new String[][]{{"insert", "int,float", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("AM-1.0 {length=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"576460752303483487", "<sample:1>"}, false), new String[][]{{"insert", "int,float", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PM-1.0 {length=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-2147483648", "<sample:5>"}, false, 1, new String[][]{}), new String[][]{{"insert", "int,float", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<i:1>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "9223372036854775807", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<i:1>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "9223372036854775807", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:3>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("samplePM {length=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"1.12345678", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-1", "<empty>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "-2147483648", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false), new String[][]{{"getDisplayName", "", "6"}, {"clone", "", "3"}, {"getUnicodeLocaleKeys", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getDisplayName", "", "6"}, {"clone", "", "3"}, {"getUnicodeLocaleKeys", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getDisplayName", "", "6"}, {"clone", "", "3"}, {"getUnicodeLocaleKeys", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-6", "4"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:a>", "<sample:3>", "<sample:3>"}}), new String[][]{{"estimateLength", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"2146959359", "2"}, false, 15, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:a>", "<sample:3>", "<sample:2>"}}), new String[][]{{"estimateLength", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("samplePM {length=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "PT1H", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "PT1H", "<empty>"}}), new String[][]{{"indexOf", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "PT1H", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"3600001"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "6", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "6", "<sample:0>"}}), new String[][]{{"getID", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GMT", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:0>"}, false, 13, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", "int,int", "3600043", "60000"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:0>", "<sample:0>"}}), new String[][]{{"append", "char[],int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<sample:7>"}, false, 11, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "3", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample__a,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<sample:7>"}, false, 11, new String[][]{}), new String[][]{{"codePointAt", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"3600000"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date,java.lang.StringBuffer", "<null>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:0>", "<sample:7>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483638>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false), new String[][]{{"addAll", "int,java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:3>", "<empty>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:3>", "<empty>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<null>"}}), new String[][]{{"remove", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:3>", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<null>"}}), new String[][]{{"remove", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:3>", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<null>"}}), new String[][]{{"remove", "java.lang.Object", "6"}, {"add", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<null>", "<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", "int,int", "-2147483647", "60001"}}), new String[][]{{"append", "java.lang.CharSequence,int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false), new String[][]{{"getDisplayName", "boolean,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"2", "6"}, false), new String[][]{{"appendTo", "java.lang.StringBuffer,java.util.Calendar", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-4194302", "3"}, false), new String[][]{{"appendTo", "java.lang.StringBuffer,java.util.Calendar", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "-1", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PM {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:2>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PM {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<empty>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getPattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<empty>", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getPattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample0 {length=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<empty>", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getPattern", ""}}), new String[][]{{"append", "float", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample0-Infinity {length=16}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:0>"}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date", "<null>"}}), new String[][]{{"append", "float", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0-Infinity {length=10}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<null>", "<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", "int,int", "6", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<null>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"60000", "<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"-6"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "3600001", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:-1>", "<empty>", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<sample:0>", "<sample:1>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("348744", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A_0,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:-1>", "<empty>", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<sample:0>", "<sample:2>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("488363911", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:-1>", "<empty>", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<sample:0>", "<sample:7>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-896348017", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample__a,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-9223372036854775807", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:b>", "<sample:2>", "<sample:0>"}}, 1), new String[][]{{"compareTo", "java.lang.StringBuffer", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-2287828610704211967", "<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getPattern", ""}}, 1), new String[][]{{"compareTo", "java.lang.StringBuffer", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-2287828610704211967", "<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getPattern", ""}}, 1), new String[][]{{"setCharAt", "int,char", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("saaplePM {length=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-2287828610704211967", "<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getPattern", ""}}, 1), new String[][]{{"setCharAt", "int,char", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-4575657204295663571", "<sample:10>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long", "6"}}, 1), new String[][]{{"setCharAt", "int,char", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("saaple0 {length=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"1", "<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sampleAM {length=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"1", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("AM {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-262143", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PM {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:16>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"131067", "38"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getLocale", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "long", "60001"}, {"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}}, 2), new String[][]{{"appendTo", "java.lang.StringBuffer,java.util.Calendar", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"1", "76"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getLocale", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "long", "60001"}, {"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}}, 2), new String[][]{{"appendTo", "java.lang.StringBuffer,java.util.Calendar", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:2>", "<sample:2>"}, false, 1, new String[][]{}, 1), new String[][]{{"appendCodePoint", "int", "5"}, {"insert", "int,char[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:0>"}, false, 1, new String[][]{}, 2), new String[][]{{"appendCodePoint", "int", "3"}, {"insert", "int,char[]", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getLocale", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample0 {length=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[a,,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sampleAM {length=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:kkfT5y>"}, false, 15, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long", "-68719476737"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A_0,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "long", "59"}}), new String[][]{{"getDisplayScript", "java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A_0,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long", "-10"}}), new String[][]{{"getDisplayScript", "java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<null>", "<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "59999", "<empty>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<s:b->"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "long", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "59999", "<empty>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<s:bb-r>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample {length=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:2>", "<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "59999", "<empty>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<s:bb-r>"}}, 2), new String[][]{{"append", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sampletrue {length=10}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<sample:3>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "1.5", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}}), new String[][]{{"isDirty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"3"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"-524470"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "long", "9223372036854775807"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"-105"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "long", "9223372036854775807"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getLocale", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getLocale", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getLocale", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getLocale", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A_0,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:3>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("488615383", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:2>"}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"+1", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<s:a>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<s:a>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-9223372035781033984", "<sample:2>"}, false, 1, new String[][]{}, 2), new String[][]{{"trimToSize", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample0 {length=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-9223372035781033984", "<sample:5>"}, false, 1, new String[][]{}, 2), new String[][]{{"trimToSize", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-9223372035781033984", "<sample:5>"}, false, 11, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "", "<empty>"}}, 2), new String[][]{{"trimToSize", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample__a,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-9223372036854775800", "<sample:4>"}, false, 11, new String[][]{}, 2), new String[][]{{"append", "char[]", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("\000 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample__a,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"9223372036854775807", "<sample:3>"}, false, 11, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample__a,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"2147483648", "<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}}, 2), new String[][]{{"replace", "int,int,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"2147483648", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}}, 2), new String[][]{{"replace", "int,int,java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("ample0 {length=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"2147483648", "<null>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"2147483648", "<empty>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}}, 2), new String[][]{{"append", "java.lang.CharSequence,int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:0>", "<sample:7>"}}), new String[][]{{"insert", "int,float", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("1.0PM {length=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<empty>", "false", "3600043", "<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:0>", "false", "3599995", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:0>", "true", "1077341864", "<sample:2>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<empty>", "true", "1077341864", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("340632", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<empty>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample__a,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "6", "<null>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}}), new String[][]{{"getOffsetsByStandard", "long,int[]", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample__a,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}}), new String[][]{{"getOffsetsByStandard", "long,int[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"1.5", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long", "4"}, {"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "--1", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"0f.5", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long", "4"}, {"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "--1", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("f", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"0f.5", "<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long", "4"}, {"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "--1", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("f", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"f.5", "<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long", "4"}, {"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "--1", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{" ", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("' ", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"listIterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"listIterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"listIterator", "", "3"}, {"hasPrevious", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"http://example.com/a?b=c", "<empty>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long", "-281474974910656"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A_0,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long", "-281474974910656"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long", "-281474974910656"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample__a,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "-2147483649", "<sample:2>"}}, 3), new String[][]{{"insert", "int,char[]", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("P aM {length=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "-2147483649", "<sample:2>"}}, 3), new String[][]{{"insert", "int,char[]", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("s aamplePM {length=10}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "3599999", "<sample:7>"}}, 3), new String[][]{{"insert", "int,char[]", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("s aample0 {length=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "3599942", "<sample:7>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}}, 3), new String[][]{{"insert", "int,char[]", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 a {length=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<empty>", "false", "-16383", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<sample:0>"}}), new String[][]{{"listIterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<sample:0>"}}), new String[][]{{"listIterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("_A {getCountry=A, getDisplayCountry=A, getDisplayLanguage=, getDisplayName=A, getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=, getLanguage=, getScript...#236#-232682629", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0_sample {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0, sample), getDisplayScript=, getDisplayVariant=sample, getISO3Country=!MissingResourceException, getISO3Languag...#295#545310035", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("_A_0 {getCountry=A, getDisplayCountry=A, getDisplayLanguage=, getDisplayName=A (0), getDisplayScript=, getDisplayVariant=0, getISO3Country=!MissingResourceException, getISO3Language=, getLanguage=, ge...#244#-1938314541", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A_0,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:2>", "false", "3599980", "<sample:2>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:1>", "<empty>", "<sample:1>"}}, 3), new String[][]{{"getDisplayCountry", "", "2"}, {"getDisplayVariant", "java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:1>", "<empty>", "<sample:1>"}}, 3), new String[][]{{"getDisplayCountry", "", "2"}, {"getDisplayVariant", "java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:1>", "<empty>", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:1>", "<empty>", "<sample:2>"}}, 3), new String[][]{{"getDisplayCountry", "", "2"}, {"getDisplayVariant", "java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:1>", "<sample:0>", "<sample:2>"}}, 3), new String[][]{{"getDisplayCountry", "", "2"}, {"getDisplayVariant", "java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:1>", "<sample:0>", "<sample:2>"}}, 3), new String[][]{{"getDisplayCountry", "", "2"}, {"getDisplayVariant", "java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:1>", "<sample:0>", "<sample:2>"}}, 3), new String[][]{{"getDisplayCountry", "", "2"}, {"getDisplayVariant", "java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A_0,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:1>", "<sample:0>", "<sample:2>"}}, 3), new String[][]{{"getDisplayCountry", "", "2"}, {"getDisplayVariant", "java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:1>", "<sample:0>", "<sample:2>"}}, 3), new String[][]{{"getDisplayCountry", "", "2"}, {"getDisplayVariant", "java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample__a,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
}
