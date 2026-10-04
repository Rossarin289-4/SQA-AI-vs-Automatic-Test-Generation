package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", "int,int", "-2147483648", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-896364410", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<null>", "<sample:0>", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-4", "30000"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "1.5e300", "<sample:0>"}}), new String[][]{{"estimateLength", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"3583589"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "{!a:1}", "<sample:1>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:0>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"3", "2"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}}), new String[][]{{"appendTo", "java.lang.StringBuffer,java.util.Calendar", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDatePrinter$TwoDigitNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"3599999"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "SITLE0xFFFFFFFF", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"1L", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:2>", "<sample:3>", "<sample:4>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "-509", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'1", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"4", "60031"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getLocale", ""}}), new String[][]{{"appendTo", "java.lang.StringBuffer,java.util.Calendar", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"6", "59942"}, false, 1, new String[][]{}), new String[][]{{"appendTo", "java.lang.StringBuffer,java.util.Calendar", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"6", "1"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}}), new String[][]{{"appendTo", "java.lang.StringBuffer,int", "2"}, {"appendTo", "java.lang.StringBuffer,java.util.Calendar", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDatePrinter$UnpaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"1aE-5", "<sample:1>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"23", "2"}, false, 4, new String[][]{}), new String[][]{{"appendTo", "java.lang.StringBuffer,int", "5"}, {"estimateLength", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"60001", "21"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", ""}}, 1), new String[][]{{"appendTo", "java.lang.StringBuffer,int", "3"}, {"appendTo", "java.lang.StringBuffer,int", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"120000", "1"}, false, 1, new String[][]{}, 1), new String[][]{{"estimateLength", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"2147483647", "2"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}}), new String[][]{{"appendTo", "java.lang.StringBuffer,int", "6"}, {"appendTo", "java.lang.StringBuffer,int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDatePrinter$TwoDigitNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:4>", "false", "0", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GMT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:0>", "true", "1", "<sample:1>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Greenwich Mean Time", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<i:0>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "getPattern", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-2147483647", "2"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long", "-2147483647"}}, 1), new String[][]{{"appendTo", "java.lang.StringBuffer,int", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDatePrinter$TwoDigitNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"1073750015", "-2147483647"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("samplePM {length=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-9223372036854775808", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getLocale", ""}}, 2), new String[][]{{"codePointAt", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"0xFFFFFFFF", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "1e101.1234567890123456", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<empty>", "<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}}, 3), new String[][]{{"substring", "int,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("l", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"2", "<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"isDirty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "-63", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[,sample,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"3"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", "int,int", "1", "1073750531"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<sample:0>", "<sample:3>", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:8>", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<sample:6>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<empty>", "<sample:3>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:8>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[,sample,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date", "<sample:1>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}}, 2), new String[][]{{"append", "java.lang.StringBuffer", "1"}, {"insert", "int,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("skeyamplePM {length=11}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<d:-1.5>", "<sample:1>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<empty>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", "int,int", "-2147483647", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<empty>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"getUnicodeLocaleAttributes", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<sample:1>", "<sample:2>", "<sample:1>"}}, 3), new String[][]{{"getScript", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[0,a_0_sample,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<b:true>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<null>", "<empty>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "1099511627780", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", "int,int", "1", "1073750015"}}, 2);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}}, 2), new String[][]{{"setRawOffset", "int", "6"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=3,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=3, isDirty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:3>", "<null>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<i:-43>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-2", "-49"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"9223372036854775807", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "1.5d", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("AM {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<s:kiez>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "9", "<empty>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[a,_A,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"1.1234567890123456", "<sample:1>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'1.1234567890123456", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<s:`>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "2147483647", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:key>", "<null>", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:>", "<sample:2>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"-2147483647"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:2>", "<sample:3>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "-43", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<empty>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PM {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"3599934"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", "int,int", "3600000", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"3600048", "3599984"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}}, 2), new String[][]{{"appendTo", "java.lang.StringBuffer,int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<empty>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:2>", "<sample:4>", "<sample:6>"}}, 2), new String[][]{{"append", "java.lang.CharSequence,int,int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PMe {length=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"2147483647", "4648609"}, false, 5, new String[][]{}, 2), new String[][]{{"estimateLength", "", "3"}, {"appendTo", "java.lang.StringBuffer,java.util.Calendar", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:7>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:5>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-71072", "<sample:3>"}, false, 5, new String[][]{}, 2), new String[][]{{"append", "double", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0-1.0 {length=5}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<i:55>", "<sample:3>", "<sample:4>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<empty>", "<null>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "-2147483656", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<sample:8>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, null, 2), new String[][]{{"capacity", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}}, 1), new String[][]{{"contains", "java.lang.Object", "6"}, {"addAll", "int,java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"addAll", "int,java.util.Collection", "3"}, {"lastIndexOf", "java.lang.Object", "0"}, {"addAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "1125897759359231", "<sample:2>"}}, 2), new String[][]{{"append", "char", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<sample:3>"}, false, 4, new String[][]{}, 1), new String[][]{{"append", "java.lang.CharSequence", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PM0 {length=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date,java.lang.StringBuffer", "<null>", "<empty>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<b:true>", "<sample:3>", "<sample:9>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[0,a_0,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", ""}}, 2), new String[][]{{"append", "char", "2"}, {"insert", "int,java.lang.CharSequence", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-56", "<sample:3>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<null>", "<empty>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:3>", "<sample:1>"}}, 2), new String[][]{{"lastIndexOf", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<empty>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<s:b>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"9223372036854775807", "<sample:0>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[a,,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"37", "10"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getPattern", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[0,a_0_sample,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:6>", "<null>"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:3>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:5>", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<b:false>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<s:key>", "<sample:1>", "<sample:1>"}}), new String[][]{{"append", "java.lang.Object", "2"}, {"subSequence", "int,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("m", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:2>", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:0>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PM {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-2147484671", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("AM {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<null>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "http://exampme.com/a?b=c", "<empty>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:4>", "<sample:5>"}, false, 3, new String[][]{}), new String[][]{{"append", "java.lang.CharSequence", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("a {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:5>", "false", "1073750527", "<empty>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}}), new String[][]{{"replace", "int,int,java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:5>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<sample:4>"}, false), new String[][]{{"append", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PM0 {length=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<empty>", "<empty>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", "int,int", "-2", "-1"}}), new String[][]{{"append", "float", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("01.0 {length=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"9223372036854775807", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", ""}}), new String[][]{{"append", "double", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("AM-1.0 {length=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "60000", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<s:a>", "<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:5>", "<empty>"}, false), new String[][]{{"append", "char[]", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PM a {length=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"0.123456789012A4567", "<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:2>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'0.123456789012", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}}), new String[][]{{"remove", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<i:0>"}}), new String[][]{{"observesDaylightTime", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<empty>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "getPattern", ""}}), new String[][]{{"append", "java.lang.CharSequence,int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"60042", "<sample:2>"}, false), new String[][]{{"append", "double", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sampleAM0.0 {length=11}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-14", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("samplePM {length=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"-4"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"1.1234567", "<sample:2>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'.1234567", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "9223372036854775807", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date,java.lang.StringBuffer", "<sample:4>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:2>", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<empty>", "<sample:1>"}, false), new String[][]{{"append", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PMtrue {length=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}}), new String[][]{{"append", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PM2 {length=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<empty>", "<null>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<null>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-2147483648", "37"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}}), new String[][]{{"appendTo", "java.lang.StringBuffer,int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<empty>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<s:key>"}}), new String[][]{{"getUnicodeLocaleAttributes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "1799999", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:3>", "<null>"}}), new String[][]{{"setRawOffset", "int", "0"}, {"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=-2147483648,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=-214748...#219#278194307", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-70370891661321", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", "int,int", "-30", "3600255"}}), new String[][]{{"lastIndexOf", "java.lang.String,int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "-9223372036854775808", "<sample:2>"}}), new String[][]{{"getDisplayLanguage", "java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"-4611686018427387904"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<sample:5>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "-33", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-1", "<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PM {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"191073"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:2>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-4", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date", "<sample:5>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", "int,int", "7200002", "-2147483648"}}), new String[][]{{"insert", "int,long", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<empty>"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<null>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date", "<empty>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date,java.lang.StringBuffer", "<sample:1>", "<sample:1>"}}), new String[][]{{"subSequence", "int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:keqy>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "0", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date,java.lang.StringBuffer", "<sample:4>", "<sample:5>"}}), new String[][]{{"getOffsets", "long,int[]", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:8>", "<sample:0>"}, false), new String[][]{{"lastIndexOf", "java.lang.String,int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long", "-1"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date,java.lang.StringBuffer", "<sample:3>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[,sample,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"60000", "<sample:2>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample {length=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getRawOffset", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-60001", "<sample:5>"}, false, 5, new String[][]{}), new String[][]{{"append", "java.lang.String", "6"}, {"offsetByCodePoints", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getVariant", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "long", "39"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<null>", "<empty>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date,java.lang.StringBuffer", "<sample:1>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<sample:0>"}}), new String[][]{{"insert", "int,long", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-2052", "0"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:1>", "true", "-1", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"30000", "3600031"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<sample:4>", "<empty>", "<sample:5>"}}), new String[][]{{"appendTo", "java.lang.StringBuffer,java.util.Calendar", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getUnicodeLocaleKeys", "", "1"}, {"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0 {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=!MissingResourceExc...#268#-877192394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date,java.lang.StringBuffer", "<sample:1>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getLocale", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<empty>"}}), new String[][]{{"getLastRuleInstance", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("sample {getCountry=, getDisplayCountry=, getDisplayLanguage=sample, getDisplayName=sample, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguag...#255#-1492904948", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"140737488415329"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:0>", "<sample:1>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", "int,int", "59942", "2"}}), new String[][]{{"append", "java.lang.CharSequence", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("samplePM0 {length=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<empty>", "<sample:0>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "{\"Ca\":1|", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "1.5d1", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[0,a_0,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:5>", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<sample:0>", "<sample:3>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<s:>"}}), new String[][]{{"getDisplayName", "boolean,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:-34>", "<sample:2>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0_sample {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0, sample), getDisplayScript=, getDisplayVariant=sample, getISO3Country=!MissingResourceException, getISO3Languag...#295#545310035", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PM {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<sample:2>"}, false), new String[][]{{"replace", "int,int,java.lang.String", "6"}, {"append", "java.lang.CharSequence", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("samlePMsample {length=13}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"35", "56"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:6>", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "-2147483631", "<sample:1>"}}, 1), new String[][]{{"appendTo", "java.lang.StringBuffer,int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"true", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<sample:4>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:4>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("u", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-1", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date,java.lang.StringBuffer", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample0 {length=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<empty>", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}}, 2), new String[][]{{"delete", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", "int,int", "3599939", "-3599999"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<s:a>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[a,,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-59999", "7199941"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:1>", "<sample:1>"}}), new String[][]{{"estimateLength", "", "1"}, {"estimateLength", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1372347153", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"010P", "<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<null>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", "int,int", "30000", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:0>", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[0,a_0,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:5>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date,java.lang.StringBuffer", "<sample:2>", "<empty>"}}), new String[][]{{"delete", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", "int,int", "-2147483648", "11"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("AM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"33", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}}, 3), new String[][]{{"estimateLength", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getLocale", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:2>", "<null>"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:5>", "<sample:3>"}, false, 7, new String[][]{}), new String[][]{{"append", "java.lang.Object", "7"}, {"append", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("truesample {length=10}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", "int,int", "1800000", "1073750527"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("samplePM {length=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1372347153", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.lang.Object", "java.lang.StringBuffer", "java.text.FieldPosition"}, new String[]{"<s:key>", "<sample:1>", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:3>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "-70368744117664", "<sample:3>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}}, 2), new String[][]{{"trimToSize", "", "2"}, {"append", "float", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PM-1.0 {length=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<sample:7>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date,java.lang.StringBuffer", "<sample:0>", "<sample:1>"}}, 2), new String[][]{{"getDisplayLanguage", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"30000", "0"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:4>", "<sample:3>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:3>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<empty>", "<sample:3>"}, false, 5, new String[][]{}), new String[][]{{"append", "java.lang.CharSequence", "6"}, {"append", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("000 {length=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:6>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<sample:5>"}}, 3), new String[][]{{"insert", "int,boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"5.k", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date,java.lang.StringBuffer", "<empty>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:-30>", "<sample:0>", "<sample:6>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", "int,int", "74", "-30000"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<sample:3>"}, false, 1, new String[][]{}, 2), new String[][]{{"append", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("03 {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"-2", "<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "-9223372036853727232", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "-", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "59939", "<sample:2>"}}, 2), new String[][]{{"append", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PM {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"14:30:45", "<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'4:30:45", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"2", "3600000"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:5>", "<sample:1>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"37154420", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "", "<sample:3>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date", "<sample:0>"}}, 2), new String[][]{{"append", "java.lang.CharSequence", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("00 {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"59983", "<sample:1>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:5>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:9>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<b:true>", "<sample:0>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-28>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"Hello, Worlp", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("e", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", ".5", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", "int,int", "2147483647", "60001"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PM {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "3599999", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("AM {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:5>", "false", "29999", "<empty>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0 {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=!MissingResourceExc...#268#-877192394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"-3600018", "1"}, false, 7, new String[][]{}, 3), new String[][]{{"appendTo", "java.lang.StringBuffer,java.util.Calendar", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<empty>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}}, 2), new String[][]{{"append", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("samplePM1 {length=9}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("samplePM {length=8}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"4", "60047"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"-1", "<empty>"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}}, 2), new String[][]{{"lastIndexOf", "java.lang.String,int", "0"}, {"append", "java.lang.StringBuffer", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "SITLE0xFFFFFFFF", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", ""}}), new String[][]{{"set", "int,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<null>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"68719476740", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}}, 2), new String[][]{{"append", "java.lang.CharSequence,int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:3>", "true", "-122", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:4>", "<sample:1>"}, false, 1, new String[][]{}), new String[][]{{"capacity", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}}, 2), new String[][]{{"useDaylightTime", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", ""}}, 1), new String[][]{{"getExtension", "char", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getPattern", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "-2147418113", "<sample:1>"}}, 3), new String[][]{{"append", "char", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("PM\000 {length=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parseToken", "java.lang.String,int[]", "360000", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[a,,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getPattern", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"3599999", "<sample:3>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "-3599999", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", new String[]{"int", "int"}, new String[]{"536870922", "30000"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "long,java.lang.StringBuffer", "134217727", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0 {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=!MissingResourceExc...#268#-877192394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"TITLE", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:1>", "<sample:1>"}, false, 1, new String[][]{}, 3), new String[][]{{"append", "java.lang.StringBuffer", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0sample {length=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar,java.lang.StringBuffer", "<sample:5>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[0,a_0_sample,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", "int,int", "-2", "46"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PM", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<sample:3>", "<sample:2>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample0 {length=7}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:2>", "<sample:4>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals(" {length=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date", "java.lang.StringBuffer"}, new String[]{"<null>", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:0>", "<empty>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Date"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<sample:4>", "<sample:2>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("sample {length=6}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"-4294967294"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}}), new String[][]{{"getDisplayName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Greenwich Mean Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"SaTLE0xFFFGFFFF", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "getMaxLengthEstimate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("S", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.lang.Object,java.lang.StringBuffer,java.text.FieldPosition", "<i:1>", "<sample:1>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDatePrinter[,sample,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"Hellor, World", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Date", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("e", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long", "java.lang.StringBuffer"}, new String[]{"102", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("0 {length=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZoneDisplay", new String[]{"java.util.TimeZone", "boolean", "int", "java.util.Locale"}, new String[]{"<sample:5>", "false", "2147483647", "<sample:3>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"Title", "<null>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "applyRules", new String[]{"java.util.Calendar", "java.lang.StringBuffer"}, new String[]{"<null>", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<null>"}}, 2), new String[][]{{"append", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuffer", actual.getClass().getName());
  assertEquals("04 {length=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0_sample,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("340632", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[a,_A,GMT] {getMaxLengthEstimate=2, getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parseToken", new String[]{"java.lang.String", "int[]"}, new String[]{"\n-1.6", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:3>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'\n-1.6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "parsePattern", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}, {"org.apache.commons.lang3.time.FastDatePrinter", "selectNumberRule", "int,int", "30036", "30000"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"1152921504610430565"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "getTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "format", "java.util.Calendar", "<empty>"}}, 2), new String[][]{{"getOffsetsByStandard", "long,int[]", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"java.util.Calendar"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "applyRules", "java.util.Calendar,java.lang.StringBuffer", "<sample:2>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[,sample,GMT] {getMaxLengthEstimate=0, getPattern=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDatePrinter", "org.apache.commons.lang3.time.FastDatePrinter", "format", new String[]{"long"}, new String[]{"144115187002114048"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDatePrinter", "equals", "java.lang.Object", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDatePrinter[0,a_0,GMT] {getMaxLengthEstimate=1, getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
}
