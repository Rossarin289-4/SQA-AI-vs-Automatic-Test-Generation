package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfCeiling", new String[]{"long"}, new String[]{"1023"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", "long", "-8258715387037665"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("691200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"-16517430774075330", "8258715387168736"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isSupported", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,long", "-281474976710666", "-72"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "int"}, new String[]{"-8258698207299552", "-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5221291774620099552", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"-16517155896430264", "10"}, false, 4, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-16517131358830264", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"144115188075855865", "-8390656782370785"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", new String[]{"long"}, new String[]{"-8390656782370827"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", "long,long", "-8258715387168735", "-144115188075855810"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapDurationField", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "org.joda.time.ReadablePartial,int,int[],int", "<sample:8>", "-2113929245", "<sample:2>", "0"}}, 2), new String[][]{{"compareTo", "org.joda.time.DurationField", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "int"}, new String[]{"74", "0"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"40", "9223372036854775807"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLenient", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", "long", "-33034861548150658"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapAmount", new String[]{"long"}, new String[]{"-8258715252950977"}, false, 6, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "org.joda.time.ReadablePartial,int,int[],int", "<sample:8>", "108", "<sample:1>", "88"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"-4177736205140997", "18014398509481979"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "org.joda.time.ReadablePartial,int,int[],int", "<sample:2>", "2", "<sample:0>", "9"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-9141942", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapAmount", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 5, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfEven", "long", "-152505844858226634"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "org.joda.time.ReadablePartial,java.util.Locale", "<sample:6>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:7>", "2147483602", "<empty>", "-2147483602"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,long", "-8258698207299552", "2147483648"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", "long", "36028797018964226"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"18", "3221225419"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7819549483248000018", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "java.lang.String", "java.util.Locale"}, new String[]{"-72", "1", "<sample:1>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,long", "-16517430774337464", "-9223372036854775784"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-7776000072", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"long", "java.util.Locale"}, new String[]{"72057594037927940", "<sample:4>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "convertText", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"-1", "<sample:4>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial,int[]", "<sample:5>", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "int"}, new String[]{"1064", "-2147483648"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5213033074252798936", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "java.util.Locale"}, new String[]{"<sample:6>", "<empty>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:4>", "0", "<null>", "2"}, false, 6, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", "long", "-562949953421310"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "get", new String[]{"long"}, new String[]{"8796093022213"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],java.lang.String,java.util.Locale", "<sample:2>", "-2147483647", "<sample:1>", "tru", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "convertText", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"", "<empty>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "int"}, new String[]{"1", "606"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"-8249919294080993"}, false, 3, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", "long,int", "-9223372036854775808", "8388653"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8249918515200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "get", new String[]{"long"}, new String[]{"39"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", new String[]{"long"}, new String[]{"1"}, false, 6, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "org.joda.time.ReadablePartial,java.util.Locale", "<sample:6>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"int", "java.util.Locale"}, new String[]{"2147483647", "<sample:3>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapAmount", "long", "36028797018963970"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "long,java.util.Locale", "4136", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"-8249919294015457", "2147483647"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", "long", "72"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", new String[]{"long"}, new String[]{"-8249919294015477"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"int", "java.util.Locale"}, new String[]{"97", "<sample:6>"}, false, 3, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "long", "2251799813685248"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"1049640", "36028797018947564"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"36033193991733250"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", "long", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("36033194217600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfCeiling", new String[]{"long"}, new String[]{"-16517430774075330"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-16517431267200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationField", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField", actual.getClass().getName());
  assertEquals("DurationField[months] {getName=months, getUnitMillis=2592000000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfFloor", new String[]{"long"}, new String[]{"2"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,java.lang.String,java.util.Locale", "36028797018964025", "0", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("691200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "<sample:4>", "524", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "int"}, new String[]{"-144115188075593726", "-1073741801"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2750631669819593726", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:2>", "2147483647", "<sample:2>", "2147483647"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getType", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "long,java.util.Locale", "9223372036854775807", "<sample:0>"}}, 1), new String[][]{{"getField", "org.joda.time.Chronology", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.BasicMonthOfYearDateTimeField", actual.getClass().getName());
  assertEquals("DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", new String[]{"long"}, new String[]{"-9223372036854775807"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundFloor", new String[]{"long"}, new String[]{"1024"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", "long", "-16517430774337430"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationUnitMillis", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2592000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "java.lang.String", "java.util.Locale"}, new String[]{"<sample:8>", "2", "<sample:1>", "-0.5", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundFloor", new String[]{"long"}, new String[]{"-8258715387168760"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8258717923200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"-9223372036854775808", "-562949953421310"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],java.lang.String,java.util.Locale", "<null>", "10", "<sample:5>", "1.5e300", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", new String[]{"long", "long"}, new String[]{"-9223372036846387200", "-72057594037927940"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "get", new String[]{"long"}, new String[]{"8258715387168737"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isSupported", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "long,java.util.Locale", "-8258715387168705", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:3>"}, false, 6, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", "long,int", "-8258698207299552", "1073741823"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long"}, new String[]{"-16517430774075330"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-141", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isSupported", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "java.lang.String"}, new String[]{"-16517430774075366", " "}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"-8258715387168736"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8258650790400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:1>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", "long", "532"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("monthOfYear", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", "long", "-72057594037926912"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long", "java.util.Locale"}, new String[]{"-8390656782370871", "<null>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "get", new String[]{"long"}, new String[]{"-4124959647007728"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],java.lang.String,java.util.Locale", "<sample:7>", "103", "<empty>", "Hello, World", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:4>", "44", "<sample:1>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", "long", "134218751"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "long,java.util.Locale", "-1", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("44", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", new String[]{"long", "long"}, new String[]{"-16517430770143160", "-9223372036854775808"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapDurationField", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3792719024", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:7>", "8388636", "<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8388636", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"int", "java.util.Locale"}, new String[]{"130", "<sample:4>"}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],int", "<sample:7>", "-2147483538", "<sample:6>", "97"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "<sample:6>", "-126", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("130", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"long"}, new String[]{"-8258698207299541"}, false, 3, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", "long,long", "1", "16517430774337414"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getRangeDurationField", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"getMillis", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("126230400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", new String[]{"long"}, new String[]{"4611686018427387903"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "org.joda.time.ReadablePartial,int,java.util.Locale", "<sample:8>", "2048", "<sample:4>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapAmount", new String[]{"long"}, new String[]{"4195328391185392"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapPartial", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:7>", "32", "<sample:2>", "2147483551"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationField", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:0>", "1044", "<sample:4>", "-262047"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationUnitMillis", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long"}, new String[]{"8258715387037665"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"long", "java.util.Locale"}, new String[]{"-144115188075855810", "<sample:0>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfCeiling", new String[]{"long"}, new String[]{"2097153"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("691200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"40", "88"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-7775999960", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long", "java.util.Locale"}, new String[]{"-4611686018427387903", "<sample:1>"}, false, 6, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", "long", "-72"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "get", new String[]{"long"}, new String[]{"-16517430774337464"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"-16517155896430264"}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getRangeDurationField", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-16517155046400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateTimeField[monthOfYear]", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "get", new String[]{"long"}, new String[]{"144115188076380097"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "long", "-8258715387168735"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundFloor", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036362351616", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<null>", "44", "<sample:0>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("44", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long", "java.util.Locale"}, new String[]{"-40", "<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", new String[]{"long"}, new String[]{"-2097058"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "long", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "int"}, new String[]{"-16517155896430198", "-262142"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-17153507102830198", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"72057594037927884", "48"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("72057583669927884", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:4>", "2", "<sample:2>", "42"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"long", "java.util.Locale"}, new String[]{"72057594037927952", "<sample:1>"}, false, 5, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getRangeDurationField", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:3>", "<sample:0>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "java.util.Locale"}, new String[]{"<sample:5>", "<sample:0>"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "convertText", "java.lang.String,java.util.Locale", "5.", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", new String[]{"long"}, new String[]{"72057594037927964"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:0>", "32812", "<sample:4>", "8388610"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapDurationField", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"int", "java.util.Locale"}, new String[]{"2147483647", "<sample:1>"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,long", "36028797018963970", "40"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:4>", "<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"int", "java.util.Locale"}, new String[]{"2147483647", "<sample:4>"}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfEven", "long", "-16517430774337472"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateTimeField[monthOfYear]", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundFloor", new String[]{"long"}, new String[]{"-9223372036854775756"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036362351616", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "java.lang.String", "java.util.Locale"}, new String[]{"0", "Hello, World", "<sample:1>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapPartial", "org.joda.time.ReadablePartial,int,int[],int", "<sample:7>", "10", "<sample:2>", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "long,java.util.Locale", "-16482246402248640", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLenient", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:5>", "2147483647", "<sample:1>", "-61"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"int", "java.util.Locale"}, new String[]{"-51", "<sample:2>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-51", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", "long", "-33017269362630528"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"72057594037927940", "1025"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("72060081925927940", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"int", "java.util.Locale"}, new String[]{"-2147221503", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147221503", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long", "java.util.Locale"}, new String[]{"72057594037927940", "<null>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfFloor", "long", "0"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", "org.joda.time.ReadablePartial,int,int[],int", "<sample:0>", "2147483647", "<null>", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getType", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getType", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("monthOfYear {getName=monthOfYear}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", new String[]{"long"}, new String[]{"-68719476731"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,java.lang.String,java.util.Locale", "36028797018963917", "1.5f", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1437323269", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"long", "java.util.Locale"}, new String[]{"-9214364837600034816", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("691200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfEven", new String[]{"long"}, new String[]{"-8249919294015457"}, false, 6, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", "long,long", "4611686018427387903", "-9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8249918256000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"-16517430774337464"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", "long,int", "5", "-126"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-16517428675200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapPartial", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:3>", "20", "<sample:2>", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"-8258715387234271", "-2147483648"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8258664324834271", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:6>", "0", "<sample:1>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumTextLength", "java.util.Locale", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumTextLength", new String[]{"java.util.Locale"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", "long,long", "-16517430774337464", "-72"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:2>", "2147483647", "<sample:0>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getRangeDurationField", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "convertText", new String[]{"java.lang.String", "java.util.Locale"}, new String[]{"1.1234567890123456", "<sample:2>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", "org.joda.time.ReadablePartial,int,int[],int", "<sample:7>", "67108903", "<sample:1>", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"-144115188075855871", "-16517430774337464"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapPartial", "org.joda.time.ReadablePartial,int,int[],int", "<sample:5>", "522", "<sample:3>", "8388610"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfFloor", new String[]{"long"}, new String[]{"3"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("691200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:4>", "8388570", "<empty>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8388570", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", new String[]{"long"}, new String[]{"-1"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isSupported", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "long", "4611684918915760190"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateTimeField[monthOfYear]", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"long"}, new String[]{"0"}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "org.joda.time.ReadablePartial,int,java.util.Locale", "<sample:0>", "2147483647", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<null>", "2147483647", "<sample:3>"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "org.joda.time.ReadablePartial,int,java.util.Locale", "<sample:5>", "-2147483648", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"long", "java.util.Locale"}, new String[]{"-8258715387168737", "<sample:3>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"long", "java.util.Locale"}, new String[]{"21", "<null>"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:5>", "-31", "<null>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfFloor", "long", "-562949953421310"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-31", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:6>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"long"}, new String[]{"-4611686018427387904"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,java.lang.String", "4603427303040219169", "1-1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"long"}, new String[]{"144115188075856936"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long", "java.util.Locale"}, new String[]{"-8249919294015456", "<sample:4>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:3>", "<sample:2>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getRangeDurationField", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("monthOfYear", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "java.util.Locale"}, new String[]{"<sample:5>", "<sample:1>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapPartial", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:3>", "2147483647", "<sample:2>", "44"}, false, 6, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "org.joda.time.ReadablePartial,int,int[],int", "<sample:4>", "97", "<sample:2>", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:6>", "<empty>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumTextLength", "java.util.Locale", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"-4611686018427387391"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundFloor", "long", "-16517430774206392"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4611685493836800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"long", "java.util.Locale"}, new String[]{"-2251799813685212", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"long"}, new String[]{"-16517430774338496"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationField", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField", actual.getClass().getName());
  assertEquals("DurationField[months] {getName=months, getUnitMillis=2551440384, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundFloor", new String[]{"long"}, new String[]{"8258715387168736"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8258714121600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"int", "java.util.Locale"}, new String[]{"5", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getName", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("monthOfYear", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "int"}, new String[]{"2", "1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2592000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapDurationField", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "int,java.util.Locale", "1073741825", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"int", "java.util.Locale"}, new String[]{"0", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"-562949886312446"}, false, 3, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLenient", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-562947580800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"-4611686018427387904"}, false, 4, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationUnitMillis", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4611686017248000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:8>", "0", "<sample:4>", "-126"}, false, 4, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumShortTextLength", "java.util.Locale", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapDurationField", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"-4611686018427387918", "-144"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1899761650", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long", "java.util.Locale"}, new String[]{"1023", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "java.lang.String", "java.util.Locale"}, new String[]{"<null>", "-2147483648", "<sample:2>", "1.234567890123456", "<empty>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "int"}, new String[]{"-111", "-2147483647"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,java.lang.String", "-4129357693584344", "214748348"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5213033071660800111", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumShortTextLength", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapPartial", "org.joda.time.ReadablePartial,int,int[],int", "<sample:5>", "1", "<sample:0>", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "int"}, new String[]{"-8258715389134817", "-8388610"}, false, 4, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapDurationField", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationUnitMillis", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-28622129990734817", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"-9218868437227405345", "2"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9218868431957005345", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationUnitMillis", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2592000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "java.lang.String"}, new String[]{"8258715387168736", "12345678901234568901234567890"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"-8258698207299552", "1"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "convertText", "java.lang.String,java.util.Locale", "-.1", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8258696738499552", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "int"}, new String[]{"-16517430774337472", "2147483647"}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:3>", "522", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("522", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"int", "java.util.Locale"}, new String[]{"48", "<sample:1>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,java.lang.String,java.util.Locale", "-4129357693518832", "1e0", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "int"}, new String[]{"-8258629487822832", "1073741823"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfCeiling", "long", "9223372036854775807"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapPartial", "org.joda.time.ReadablePartial,int,int[],int", "<sample:8>", "-2147483648", "<sample:3>", "-10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2598257906083377168", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "int"}, new String[]{"-8258715387168737", "-1"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "org.joda.time.ReadablePartial,java.util.Locale", "<sample:0>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8258717979168737", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"263208", "-2147483648"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5184263208", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", new String[]{"long"}, new String[]{"-9223372036854775808"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "get", new String[]{"long"}, new String[]{"2101288"}, false, 6, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,long", "80", "-16517430774337472"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationUnitMillis", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", new String[]{"long"}, new String[]{"-8258715387037665"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-833437665", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", new String[]{"long", "long"}, new String[]{"1024", "-8258715387168705"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3402137", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:1>", "-2147483602", "<null>", "88"}, false, 3, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapAmount", "long", "36028797018963970"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", new String[]{"long"}, new String[]{"-1"}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfFloor", "long", "1099513724930"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", new String[]{"long"}, new String[]{"1"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1987200001", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"-2", "-522"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5184000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"int", "java.util.Locale"}, new String[]{"-2147483648", "<null>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"int", "java.util.Locale"}, new String[]{"-1", "<empty>"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "<sample:2>", "97", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:4>", "2147483602", "<sample:3>", "48"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "java.util.Locale"}, new String[]{"<sample:4>", "<sample:3>"}, false, 3, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getRangeDurationField", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.ZonedChronology$ZonedDurationField", actual.getClass().getName());
  assertEquals("DurationField[years] {getName=years, getUnitMillis=31557600000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:6>", "88", "<sample:4>"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", "long,long", "-8258715387168736", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("88", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", new String[]{"long"}, new String[]{"-40"}, false, 3, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapPartial", "org.joda.time.ReadablePartial,int,int[],int", "<sample:1>", "-2147483647", "<empty>", "-2147483648"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", "org.joda.time.ReadablePartial,int[]", "<sample:6>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getRangeDurationField", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getMillis", "long,long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("94694400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "get", new String[]{"long"}, new String[]{"-33034861548674927"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", "long,long", "144115188075855865", "-8258715387168697"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "java.util.Locale"}, new String[]{"<sample:3>", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"4136", "36"}, false, 3, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "get", "long", "-152373903463024577"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-7775995864", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"int", "java.util.Locale"}, new String[]{"-2147483648", "<empty>"}, false, 6, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapDurationField", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"17188257794"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLeap", "long", "70"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("18835200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"-8390656782370785", "-16517430774337464"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3347785", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"long", "java.util.Locale"}, new String[]{"-16517430774075330", "<sample:4>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapAmount", "long", "1024"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfCeiling", "long", "-16517430774075338"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"72057594037927940", "9223372036854775806"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfFloor", "long", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "java.util.Locale"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", "long,int", "0", "-2147483602"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationUnitMillis", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:0>", "2147483647", "<null>", "8386551"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"int", "java.util.Locale"}, new String[]{"4194305", "<sample:2>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4194305", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", new String[]{"long"}, new String[]{"-72057594037927935"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,int", "8528", "-524263"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1123672065", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"-8258715387037665", "-8258698207299556"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"long"}, new String[]{"8258715387168764"}, false, 3, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],int", "<sample:5>", "2147483647", "<sample:0>", "-2147483602"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapDurationField", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isLenient", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.PreciseDurationField", actual.getClass().getName());
  assertEquals("DurationField[days] {getName=days, getUnitMillis=86400000, isPrecise=true, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long"}, new String[]{"-16517155829321394"}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapDurationField", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:5>", "-2147479551", "<sample:2>", "-2147479506"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "org.joda.time.ReadablePartial,int,java.util.Locale", "<sample:1>", "0", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", new String[]{"org.joda.time.ReadablePartial", "int[]"}, new String[]{"<sample:0>", "<empty>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "get", new String[]{"long"}, new String[]{"-143552238122434579"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "int"}, new String[]{"5", "-2147483648"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5213033074252799995", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumShortTextLength", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"-16517430774337472", "-134216664"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "org.joda.time.ReadablePartial,int,int[],int", "<sample:0>", "2147483647", "<sample:1>", "8355842"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-342329414598337472", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"16517430791114688", "2"}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", "long,int", "-8258715387168705", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6804275", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"-8258715387037709", "2104"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8253182331037709", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:8>", "1044", "<sample:2>", "2147483647"}, false, 6, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,int", "8389119", "88"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.joda.time.IllegalFieldValueException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getRangeDurationField", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.joda.time.chrono.LimitChronology$LimitDurationField", actual.getClass().getName());
  assertEquals("DurationField[years] {getName=years, getUnitMillis=31557600000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "int"}, new String[]{"-8258698207037408", "1"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "org.joda.time.ReadablePartial,java.util.Locale", "<sample:7>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8258696738237408", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapAmount", new String[]{"long"}, new String[]{"1024"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"long", "java.util.Locale"}, new String[]{"-8258715387168735", "<null>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "org.joda.time.ReadablePartial,int,int[],int", "<sample:1>", "10", "<sample:2>", "116"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"2128", "2147483647"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", "long", "1040"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", "long", "-62"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-22982397872", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"-8390655708629003", "2"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,int", "-8258715387168735", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3456489", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "int"}, new String[]{"-9223372036854775808", "44"}, false, 6, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223371920992375808", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long", "java.util.Locale"}, new String[]{"-16517430774337419", "<sample:6>"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getRangeDurationField", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", "long", "144115188075855871"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long", "java.util.Locale"}, new String[]{"-8258715387037665", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "java.util.Locale"}, new String[]{"<sample:11>", "<sample:1>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", "long", "-8258715387168705"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "get", new String[]{"long"}, new String[]{"-143974450587500543"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "org.joda.time.ReadablePartial,int,int[],int", "<sample:4>", "-2", "<sample:4>", "0"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "long,java.util.Locale", "-288230376151711749", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationUnitMillis", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2629746000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"long"}, new String[]{"72057594037927940"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"-8390656782370785", "97"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,long", "-9223372036854775807", "8258715387168705"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8390641230370785", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"-8258714313295841"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8258645692800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"int", "java.util.Locale"}, new String[]{"-2147483601", "<empty>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147483601", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapPartial", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:5>", "52", "<sample:7>", "0"}, false);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[5, 6]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long"}, new String[]{"1099511627869"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", "long,long", "-8258715387168705", "-288230376151711620"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "get", "long", "-4611686018425290752"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"978", "522"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapAmount", "long", "36"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5184000978", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:6>", "-2", "<sample:2>"}, false, 5, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", "org.joda.time.ReadablePartial,int[]", "<sample:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", new String[]{"long", "long"}, new String[]{"144115188075855887", "-9223372036854644678"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapDurationField", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", new String[]{"long"}, new String[]{"-144115188075855810"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-144115187990400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfCeiling", new String[]{"long"}, new String[]{"140737488355341"}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getType", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapPartial", "org.joda.time.ReadablePartial,int,int[],int", "<sample:2>", "-2147483648", "<sample:2>", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("140737219200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"int", "java.util.Locale"}, new String[]{"44", "<empty>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("44", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "java.util.Locale"}, new String[]{"<sample:0>", "<sample:3>"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "convertText", "java.lang.String,java.util.Locale", "-8258715387168736", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:2>", "-2147483648", "<sample:1>", "1044"}, false);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"-8", "-16517155896430264"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6804162", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapDurationField", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getValue", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"long"}, new String[]{"-8258698207298999"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", "long", "1032"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfCeiling", new String[]{"long"}, new String[]{"72057628397666308"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("72057627648000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:5>", "2147483602", "<sample:6>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483602", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"int", "java.util.Locale"}, new String[]{"2147483643", "<sample:1>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundCeiling", "long", "72057594037927940"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483643", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:12>", "284", "<sample:6>", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"int", "java.util.Locale"}, new String[]{"10", "<empty>"}, false, 6, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],int", "<sample:7>", "-2147483648", "<sample:3>", "-2147483593"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", new String[]{"long", "long"}, new String[]{"-144115188075855865", "-16517430774075292"}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,int", "-16517430774337216", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-52563276", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"long"}, new String[]{"-8258715387168755"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"long", "java.util.Locale"}, new String[]{"8249919294015457", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", new String[]{"long", "java.lang.String", "java.util.Locale"}, new String[]{"-4129357693584368", "010", "<sample:3>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4129360285584368", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:7>", "97", "<sample:0>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "org.joda.time.ReadablePartial,int,int[],int", "<sample:6>", "2147483647", "<sample:1>", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", new String[]{"long", "long"}, new String[]{"-4129357693584408", "-72"}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfCeiling", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1701069", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "get", new String[]{"long"}, new String[]{"-16517430774075330"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", "org.joda.time.ReadablePartial", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfCeiling", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "org.joda.time.ReadablePartial,int,int[],java.lang.String,java.util.Locale", "<sample:2>", "43", "<null>", "1.1234567112345678", "<sample:0>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,long", "-16517155896430264", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036362351616", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationField", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"isSupported", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"int", "java.util.Locale"}, new String[]{"33554464", "<sample:4>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundFloor", "long", "-16517430774337410"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("33554464", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"-1", "176"}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "org.joda.time.ReadablePartial,int,int[],int", "<sample:9>", "2147483647", "<empty>", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("18143999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:5>", "-2147483648", "<sample:0>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumShortTextLength", "java.util.Locale", "<sample:2>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,long", "-144115188075855598", "16517430774337464"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "get", new String[]{"long"}, new String[]{"-16517430774337520"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "long,java.util.Locale", "-562949953421336", "<null>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapDurationField", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"8390656782370785", "8258715387037665"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "long", "-1125899906842620"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("54352", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundFloor", new String[]{"long"}, new String[]{"-4129349103649794"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4129350624000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:0>", "-126", "<sample:1>"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundHalfFloor", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-126", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"long", "java.util.Locale"}, new String[]{"8258577948215132", "<empty>"}, false, 3, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "get", new String[]{"long"}, new String[]{"4294967200"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:3>", "121", "<sample:3>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("121", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"int", "java.util.Locale"}, new String[]{"-125", "<sample:1>"}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "long", "4611686018360279039"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-125", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long"}, new String[]{"-16517430774337470"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long", "java.util.Locale"}, new String[]{"-16517430774075330", "<sample:2>"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-141", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", new String[]{"long"}, new String[]{"72057594037932072"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("517932072", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"-1064", "0"}, false, 6, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumShortTextLength", "java.util.Locale", "<sample:0>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,java.lang.String", "8258715387037665", "1.1234b567890123456"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1064", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumTextLength", new String[]{"java.util.Locale"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "convertText", "java.lang.String,java.util.Locale", "<a>b/a>", "<sample:3>"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", "long,int", "-142989288169013194", "16385"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapDurationField", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"add", "long,int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("185542587100800001", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getType", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType", actual.getClass().getName());
  assertEquals("monthOfYear {getName=monthOfYear}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundFloor", new String[]{"long"}, new String[]{"-8258715387168705"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8258717318400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", new String[]{"org.joda.time.ReadablePartial"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,long", "-8390656782370785", "-8258715387037665"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumTextLength", "java.util.Locale", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapPartial", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:1>", "-32758", "<null>", "1044"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundFloor", new String[]{"long"}, new String[]{"-8390656782370795"}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "set", "long,java.lang.String,java.util.Locale", "1064", "\u00e9", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-8390656857600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long"}, new String[]{"-16517430774337435"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"long"}, new String[]{"-8389119"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "org.joda.time.ReadablePartial,int,int[],int", "<sample:2>", "97", "<sample:1>", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"32", "-61"}, false, 2, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", "long", "-8249919294015457"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-155519999968", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getRangeDurationField", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", "long", "16777218"}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "isSupported", ""}});
  assertNotNull(actual);
  assertEquals("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField", actual.getClass().getName());
  assertEquals("DurationField[years] {getName=years, getUnitMillis=31557600000, isPrecise=false, isSupported=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:0>", "522", "<sample:0>"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("522", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapDurationField", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundFloor", "long", "-8258715387037665"}}), new String[][]{{"getDifference", "long,long", "2"}, {"getUnitMillis", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("86400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:2>", "2", "<sample:3>", "-536870390"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifferenceAsLong", new String[]{"long", "long"}, new String[]{"130", "16517430774337472"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-6804275", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getName", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("monthOfYear", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:1>", "4194826", "<sample:2>", "33812"}, false, 3, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", "org.joda.time.ReadablePartial,int[]", "<sample:2>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"-3", "116"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("281404799997", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "roundFloor", new String[]{"long"}, new String[]{"4260864"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "org.joda.time.ReadablePartial,int,int[],int", "<sample:10>", "558", "<sample:0>", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1900800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "remainder", new String[]{"long"}, new String[]{"74"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("74", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsText", new String[]{"org.joda.time.ReadablePartial", "java.util.Locale"}, new String[]{"<sample:2>", "<sample:3>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDifference", new String[]{"long", "long"}, new String[]{"-9007199254740991", "2"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3530241", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", new String[]{"long", "long"}, new String[]{"-72", "4611686018427387869"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "add", "long,long", "-16517430774337464", "1023"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapField", new String[]{"long", "int"}, new String[]{"31", "-2147483648"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5184000031", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getLeapDurationField", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"compareTo", "org.joda.time.DurationField", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "addWrapPartial", new String[]{"org.joda.time.ReadablePartial", "int", "int[]", "int"}, new String[]{"<sample:4>", "2", "<sample:2>", "586"}, false, 0, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getRangeDurationField", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMinimumValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getDurationField", ""}, {"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", "org.joda.time.ReadablePartial,int,java.util.Locale", "<sample:0>", "1049620", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=12, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getAsShortText", new String[]{"org.joda.time.ReadablePartial", "int", "java.util.Locale"}, new String[]{"<sample:3>", "-2147483648", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.chrono.BasicMonthOfYearDateTimeField", "org.joda.time.chrono.BasicMonthOfYearDateTimeField", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.chrono.BasicMonthOfYearDateTimeField", "getMaximumValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("DateTimeField[monthOfYear]", String.valueOf(actual));
  assertEquals("receiver state after the call", "DateTimeField[monthOfYear] {getMaximumValue=13, getMinimumValue=1, getName=monthOfYear, isLenient=false, isSupported=true}", SearchInputFactory_scaffolding.receiverState());
 }
}
