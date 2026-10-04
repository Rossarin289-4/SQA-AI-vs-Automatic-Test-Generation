package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getAvailableIDs", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+01:00 {getID=+01:00, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHoursMinutes", new String[]{"int", "int"}, new String[]{"2147483647", "60001"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setProvider", new String[]{"org.joda.time.tz.Provider"}, new String[]{"<sample:6>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:4>"}, true), new String[][]{{"getMillisKeepLocal", "org.joda.time.DateTimeZone,long", "5"}, {"isLocalDateTimeGap", "org.joda.time.LocalDateTime", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"59999"}, true), new String[][]{{"convertLocalToUTC", "long,boolean", "5"}, {"getStandardOffset", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("59999", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"-3600001"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setProvider", new String[]{"org.joda.time.tz.Provider"}, new String[]{"<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"-6471952376487863581"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"0"}, true), new String[][]{{"convertUTCToLocal", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setProvider", new String[]{"org.joda.time.tz.Provider"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setNameProvider", new String[]{"org.joda.time.tz.NameProvider"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setProvider", new String[]{"org.joda.time.tz.Provider"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setDefault", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setDefault", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHoursMinutes", new String[]{"int", "int"}, new String[]{"0", "10"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+00:10 {getID=+00:10, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setNameProvider", new String[]{"org.joda.time.tz.NameProvider"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"UTC"}, true), new String[][]{{"getOffsetFromLocal", "long", "0"}, {"adjustOffset", "long,boolean", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"EET"}, true), new String[][]{{"getShortName", "long", "0"}, {"getShortName", "long,java.util.Locale", "2"}, {"isLocalDateTimeGap", "org.joda.time.LocalDateTime", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"WET"}, true), new String[][]{{"getOffsetFromLocal", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"+11"}, true, 0, null, 1), new String[][]{{"getMillisKeepLocal", "org.joda.time.DateTimeZone,long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2187083652", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"MET"}, true), new String[][]{{"convertLocalToUTC", "long,boolean,long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"MET"}, true), new String[][]{{"getOffsetFromLocal", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3600000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "toString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("America/Los_Angeles", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isLocalDateTimeGap", new String[]{"org.joda.time.LocalDateTime"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isStandardOffset", new String[]{"long"}, new String[]{"-6489966774997345542"}, false, 1, new String[][]{{"org.joda.time.DateTimeZone", "getOffset", "long", "3600027"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "adjustOffset", new String[]{"long", "boolean"}, new String[]{"-6471952376487863581", "false"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "writeReplace", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-6471952376487863581", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getStandardOffset", new String[]{"long"}, new String[]{"5545782532386687274"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertUTCToLocal", new String[]{"long"}, new String[]{"-9007199243940993"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9007199272318993", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isFixed", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getDefault", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getDefault", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getOffsetFromLocal", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getID", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("America/Los_Angeles", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:k3edy>"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getShortName", "long", "3600001"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<sample:1>", "9223371487098961918"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getID", ""}, {"org.joda.time.DateTimeZone", "getShortName", "long", "10800064"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223371487098961918", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isLocalDateTimeGap", new String[]{"org.joda.time.LocalDateTime"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"5400003", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("34200003", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "hashCode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1536188456", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "toTimeZone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.DateTimeZone", "getMillisKeepLocal", "org.joda.time.DateTimeZone,long", "<sample:1>", "5400003"}}, 1), new String[][]{{"hasSameRules", "java.util.TimeZone", "2"}, {"getLastRuleInstance", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.SimpleTimeZone", actual.getClass().getName());
  assertEquals("java.util.SimpleTimeZone[id=America/Los_Angeles,offset=-28800000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,...#389#1381003328", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"10800001"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+03:00:00.001 {getID=+03:00:00.001, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getNameProvider", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"-2147482624"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"3599983", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("32399983", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "writeReplace", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.DateTimeZone", "convertLocalToUTC", "long,boolean", "3599999", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeZone$Stub", actual.getClass().getName());
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 1), new String[][]{{"getMillisKeepLocal", "org.joda.time.DateTimeZone,long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4294967299", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"user.timezone"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setProvider", new String[]{"org.joda.time.tz.Provider"}, new String[]{"<sample:7>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<sample:10>", "5400003"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2124083651", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setNameProvider", new String[]{"org.joda.time.tz.NameProvider"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getDefault", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"convertUTCToLocal", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-28800001", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<null>", "-6489966774997345564"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-6489966774997345564", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getID", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("America/Los_Angeles", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"-1"}, true, 0, null, 1), new String[][]{{"adjustOffset", "long,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHoursMinutes", new String[]{"int", "int"}, new String[]{"3600000", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getNameProvider", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffsetFromLocal", new String[]{"long"}, new String[]{"2"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffset", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:7>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-9223372036854710272", "false"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036826332272", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getDefault", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"getMillisKeepLocal", "org.joda.time.DateTimeZone,long", "1"}, {"toTimeZone", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.SimpleTimeZone", actual.getClass().getName());
  assertEquals("java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0...#328#81137119", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-3235976188243931791", "false"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "equals", "java.lang.Object", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-3235976188215553791", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"9223372036854775807", "false"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertUTCToLocal", new String[]{"long"}, new String[]{"-6471952376488125724"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-6471952376516503724", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.DateTimeZone", "getOffset", "long", "2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1536188456", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"3599999"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+00:59:59.999 {getID=+00:59:59.999, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:6>"}, true, 0, null, 3), new String[][]{{"getNameKey", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTC", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "nextTransition", new String[]{"long"}, new String[]{"138472031"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9972000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-6471952372192896284", "true"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-6471952372164518284", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffsetFromLocal", new String[]{"long"}, new String[]{"-9223369837563084800"}, false, 6, new String[][]{{"org.joda.time.DateTimeZone", "adjustOffset", "long,boolean", "4969884730036685099", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28378000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-17592180509245", "true"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-17592152131245", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getStandardOffset", new String[]{"long"}, new String[]{"562949957021312"}, false, 3, new String[][]{{"org.joda.time.DateTimeZone", "convertLocalToUTC", "long,boolean,long", "1799999", "false", "144115188075915871"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getNameKey", new String[]{"long"}, new String[]{"8646629809574641663"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getOffset", "long", "281474987510655"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PST", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.DateTimeZone", "getOffset", "org.joda.time.ReadableInstant", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1536188456", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffset", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.joda.time.DateTimeZone", "getShortName", "long", "-134157734"}, {"org.joda.time.DateTimeZone", "equals", "java.lang.Object", "<i:-23>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "adjustOffset", new String[]{"long", "boolean"}, new String[]{"5531075", "true"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5531075", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"3600000"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+01:00 {getID=+01:00, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "nextTransition", new String[]{"long"}, new String[]{"562949964221311"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("562950554400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean", "long"}, new String[]{"0", "true", "-4611684918915760128"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"-2130706432"}, true, 0, null, 1), new String[][]{{"isFixed", "", "1"}, {"getOffsetFromLocal", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2130706432", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"77908849"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setProvider", new String[]{"org.joda.time.tz.Provider"}, new String[]{"<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getZone", "java.lang.String", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isLocalDateTimeGap", new String[]{"org.joda.time.LocalDateTime"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.joda.time.DateTimeZone", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"1", "true"}, false, 7, new String[][]{{"org.joda.time.DateTimeZone", "convertUTCToLocal", "long", "1099515227777"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800001", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, true, 0, null, 1), new String[][]{{"toTimeZone", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.SimpleTimeZone", actual.getClass().getName());
  assertEquals("java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0...#328#81137119", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isFixed", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "adjustOffset", new String[]{"long", "boolean"}, new String[]{"-6489966774997345564", "false"}, false, 7, new String[][]{{"org.joda.time.DateTimeZone", "nextTransition", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-6489966774997345564", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.DateTimeZone", "writeReplace", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("America/Los_Angeles", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1536188456", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"10799985"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isStandardOffset", new String[]{"long"}, new String[]{"562949949821311"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isFixed", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.DateTimeZone", "getOffsetFromLocal", "long", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"1.123456789X01234567"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffset", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "previousTransition", "long", "9223372036854775790"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28378000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getDefault", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"-2146435072"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("-596:13:55.072 {getID=-596:13:55.072, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffsetFromLocal", new String[]{"long"}, new String[]{"3600001"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<sample:5>", "5546345482340108586"}, false, 3, new String[][]{{"org.joda.time.DateTimeZone", "getNameKey", "long", "40"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5546345482340108586", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"5400000", "false"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("34200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffset", new String[]{"long"}, new String[]{"59999"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "toTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"60001"}, true), new String[][]{{"previousTransition", "long", "3"}, {"previousTransition", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<null>", "3599983"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "convertLocalToUTC", "long,boolean,long", "-6471952372192896284", "false", "5400003"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3599983", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getStandardOffset", new String[]{"long"}, new String[]{"10931072"}, false, 4, new String[][]{{"org.joda.time.DateTimeZone", "nextTransition", "long", "5546345482340108587"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.ZoneInfoProvider", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getNameKey", new String[]{"long"}, new String[]{"-5546345482340108534"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "convertLocalToUTC", "long,boolean,long", "1799999", "false", "5546204744851753299"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("LMT", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertUTCToLocal", new String[]{"long"}, new String[]{"-134158240"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-162958240", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setDefault", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:5>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "nextTransition", new String[]{"long"}, new String[]{"562949949821311"}, false, 3, new String[][]{{"org.joda.time.DateTimeZone", "getName", "long", "60001"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("562950554400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getID", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "isStandardOffset", "long", "60000"}, {"org.joda.time.DateTimeZone", "getName", "long", "-34"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("America/Los_Angeles", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-5546345482340108604", "false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5546345482311730604", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, true), new String[][]{{"getOffset", "org.joda.time.ReadableInstant", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-6471952372192896348", "false"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-6471952372164518348", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getAvailableIDs", new String[]{}, new String[]{}, true), new String[][]{{"clear", "", "5"}, {"comparator", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "toTimeZone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.joda.time.DateTimeZone", "adjustOffset", "long,boolean", "-4648575", "true"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,transitions=185,lastRule=java.util.SimpleTimeZone[id=America/Los_Angeles,offset=-28800000,dstSa...#535#1218260140", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true), new String[][]{{"getID", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTC", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertUTCToLocal", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getNameKey", "long", "3599999"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getDefault", new String[]{}, new String[]{}, true), new String[][]{{"getOffset", "long", "3"}, {"getOffset", "org.joda.time.ReadableInstant", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "adjustOffset", new String[]{"long", "boolean"}, new String[]{"0", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getNameKey", new String[]{"long"}, new String[]{"0"}, false, 4, new String[][]{{"org.joda.time.DateTimeZone", "nextTransition", "long", "-5546345482340108585"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PST", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"29999"}, true), new String[][]{{"isStandardOffset", "long", "5"}, {"convertLocalToUTC", "long,boolean,long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-29995", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<sample:7>", "5546345482340174121"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5546345482340174121", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "nextTransition", new String[]{"long"}, new String[]{"-8646911284551352311"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2717640000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"-10799985"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("-02:59:59.985 {getID=-02:59:59.985, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, true), new String[][]{{"isStandardOffset", "long", "0"}, {"getMillisKeepLocal", "org.joda.time.DateTimeZone,long", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"10"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+00:00:00.010 {getID=+00:00:00.010, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "adjustOffset", new String[]{"long", "boolean"}, new String[]{"-9223372036854775808", "true"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getOffsetFromLocal", "long", "5546345482340108587"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true), new String[][]{{"getZone", "java.lang.String", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-4611686018427387904", "true"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "convertUTCToLocal", "long", "8646911284551352362"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4611686018399009904", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "nextTransition", new String[]{"long"}, new String[]{"35184382888831"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getOffset", "long", "-6471952376487863593"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("35191792800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getAvailableIDs", new String[]{}, new String[]{}, true), new String[][]{{"clear", "", "1"}, {"last", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<sample:5>", "577023702253244799"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("577023702253244799", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<sample:2>", "-9223369837831520222"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "isLocalDateTimeGap", "org.joda.time.LocalDateTime", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223369837831520222", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean", "long"}, new String[]{"4611686018427387903", "false", "9223372036854775790"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686018452587903", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getAvailableIDs", new String[]{}, new String[]{}, true), new String[][]{{"add", "java.lang.Object", "5"}, {"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, true), new String[][]{{"isStandardOffset", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertUTCToLocal", new String[]{"long"}, new String[]{"-6471952376487863581"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-6471952376516241581", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<sample:5>", "0"}, false, 6, new String[][]{{"org.joda.time.DateTimeZone", "convertLocalToUTC", "long,boolean,long", "5546345482340108587", "false", "2773172741170054292"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<sample:8>", "10800000"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getID", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2129483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "toTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getOffsetFromLocal", "long", "5546345482340108585"}}), new String[][]{{"getRawOffset", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffsetFromLocal", new String[]{"long"}, new String[]{"-6489966774997345534"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getMillisKeepLocal", "org.joda.time.DateTimeZone,long", "<sample:3>", "-25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28378000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"134217728"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+37:16:57.728 {getID=+37:16:57.728, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"8646911353337937919", "false"}, false, 7, new String[][]{{"org.joda.time.DateTimeZone", "convertLocalToUTC", "long,boolean", "3600001", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8646911353363137919", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertUTCToLocal", new String[]{"long"}, new String[]{"3600000"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "adjustOffset", "long,boolean", "5546345482340108586", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-25200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<sample:0>", "29999"}, false, 3, new String[][]{{"org.joda.time.DateTimeZone", "getName", "long", "3599983"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("29999", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true), new String[][]{{"getOffset", "org.joda.time.ReadableInstant", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, true), new String[][]{{"isLocalDateTimeGap", "org.joda.time.LocalDateTime", "6"}, {"nextTransition", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2717640000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean", "long"}, new String[]{"-6471952376487339294", "true", "1799999"}, false, 5, new String[][]{{"org.joda.time.DateTimeZone", "equals", "java.lang.Object", "<null>"}, {"org.joda.time.DateTimeZone", "getMillisKeepLocal", "org.joda.time.DateTimeZone,long", "<sample:7>", "8646911284551352319"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-6471952376458961294", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertUTCToLocal", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getMillisKeepLocal", "org.joda.time.DateTimeZone,long", "<sample:3>", "562949949821311"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isLocalDateTimeGap", new String[]{"org.joda.time.LocalDateTime"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.joda.time.DateTimeZone", "adjustOffset", "long,boolean", "-4166109367274169630", "false"}, {"org.joda.time.DateTimeZone", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"2147483647"}, true), new String[][]{{"getOffsetFromLocal", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"60000"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+00:01 {getID=+00:01, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setNameProvider", new String[]{"org.joda.time.tz.NameProvider"}, new String[]{"<sample:3>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getNameKey", new String[]{"long"}, new String[]{"5546345482340108842"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "adjustOffset", "long,boolean", "-9223372036854775808", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PDT", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertUTCToLocal", new String[]{"long"}, new String[]{"-3236257663220642446"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-3236257663249020446", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean", "long"}, new String[]{"43104", "true", "10799999"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getStandardOffset", "long", "1799999"}, {"org.joda.time.DateTimeZone", "adjustOffset", "long,boolean", "4611686018427387903", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28843104", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean", "long"}, new String[]{"3599925", "false", "7200000"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("32399925", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"10800000"}, true), new String[][]{{"getShortName", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+03:00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean", "long"}, new String[]{"5395907", "true", "-9223372036854775808"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("34195907", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<sample:2>", "-134157759"}, false, 3, new String[][]{{"org.joda.time.DateTimeZone", "getOffset", "org.joda.time.ReadableInstant", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-134157759", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true), new String[][]{{"adjustOffset", "long,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "adjustOffset", new String[]{"long", "boolean"}, new String[]{"-130617728", "false"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-130617728", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, true), new String[][]{{"convertLocalToUTC", "long,boolean", "2"}, {"getMillisKeepLocal", "org.joda.time.DateTimeZone,long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28799999", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"-1"}, true), new String[][]{{"getShortName", "long,java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-01:00", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"60000"}, true), new String[][]{{"getName", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+00:01", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-6471952376487863580", "true"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "isFixed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-6471952376459485580", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getDefault", new String[]{}, new String[]{}, true), new String[][]{{"isStandardOffset", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "adjustOffset", new String[]{"long", "boolean"}, new String[]{"59986", "false"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("59986", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffset", new String[]{"long"}, new String[]{"9223372036854775806"}, false, 6, new String[][]{{"org.joda.time.DateTimeZone", "previousTransition", "long", "5546345482340108585"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-25200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getStandardOffset", new String[]{"long"}, new String[]{"-3235976188243931791"}, false, 2, new String[][]{{"org.joda.time.DateTimeZone", "getStandardOffset", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28378000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"60000", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28860000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-30000", "false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28770000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "adjustOffset", new String[]{"long", "boolean"}, new String[]{"3597935", "true"}, false, 7, new String[][]{{"org.joda.time.DateTimeZone", "getOffset", "long", "-5546345482340108587"}, {"org.joda.time.DateTimeZone", "writeReplace", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3597935", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getDefault", new String[]{}, new String[]{}, true), new String[][]{{"toTimeZone", "", "1"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,transitions=185,lastRule=java.util.SimpleTimeZone[id=America/Los_Angeles,offset=-28800000,dstSa...#535#1218260140", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertUTCToLocal", new String[]{"long"}, new String[]{"1099515227777"}, false, 7, new String[][]{{"org.joda.time.DateTimeZone", "convertLocalToUTC", "long,boolean,long", "9223372036854775806", "true", "562949949821311"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1099486427777", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "adjustOffset", new String[]{"long", "boolean"}, new String[]{"-120000", "true"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getID", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-120000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffset", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.joda.time.DateTimeZone", "getOffset", "long", "-6471952376487863580"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffsetFromLocal", new String[]{"long"}, new String[]{"5546345482876979499"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-25200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "nextTransition", new String[]{"long"}, new String[]{"3600000"}, false, 1, new String[][]{{"org.joda.time.DateTimeZone", "getName", "long,java.util.Locale", "-1", "<sample:1>"}, {"org.joda.time.DateTimeZone", "getOffset", "long", "1799999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9972000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getAvailableIDs", new String[]{}, new String[]{}, true), new String[][]{{"tailSet", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertUTCToLocal", new String[]{"long"}, new String[]{"-1"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "convertLocalToUTC", "long,boolean", "9297150", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-28800001", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "nextTransition", new String[]{"long"}, new String[]{"9223372036854775790"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getShortName", "long", "30000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775790", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "adjustOffset", new String[]{"long", "boolean"}, new String[]{"3599999", "true"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3599999", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getDefault", new String[]{}, new String[]{}, true), new String[][]{{"adjustOffset", "long,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertUTCToLocal", new String[]{"long"}, new String[]{"-3244983387498672808"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "writeReplace", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-3244983387527050808", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "adjustOffset", new String[]{"long", "boolean"}, new String[]{"9223372036854775807", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"--1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffset", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:8>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-25200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getAvailableIDs", new String[]{}, new String[]{}, true), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true), new String[][]{{"getAvailableIDs", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getAvailableIDs", new String[]{}, new String[]{}, true), new String[][]{{"retainAll", "java.util.Collection", "5"}, {"headSet", "java.lang.Object", "3"}, {"descendingIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$NavigableSubMap$DescendingSubMapKeyIterator", actual.getClass().getName());
  assertEquals("{getExactSizeIfKnown=-1, hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "previousTransition", new String[]{"long"}, new String[]{"3598977"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "isFixed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5756400001", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "previousTransition", new String[]{"long"}, new String[]{"4323455642275676159"}, false, 7, new String[][]{{"org.joda.time.DateTimeZone", "isStandardOffset", "long", "4611686018410610679"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4323455638883999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("-01:00 {getID=-01:00, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "writeReplace", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeZone$Stub", actual.getClass().getName());
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "nextTransition", new String[]{"long"}, new String[]{"4611686018427387903"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getNameKey", "long", "29999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686034906000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"MET"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("MET {getID=MET, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffset", new String[]{"long"}, new String[]{"-4398113589968"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getName", "long", "-6471952342128125212"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28378000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "toTimeZone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.DateTimeZone", "toTimeZone", ""}}), new String[][]{{"inDaylightTime", "java.util.Date", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean", "long"}, new String[]{"9223372036854775807", "true", "3599998"}, false, 6, new String[][]{{"org.joda.time.DateTimeZone", "getShortName", "long,java.util.Locale", "281474974910655", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getDefault", new String[]{}, new String[]{}, true), new String[][]{{"getUncachedZone", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isCachable=true, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"10"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+10:00 {getID=+10:00, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean", "long"}, new String[]{"1099515229826", "true", "-2199023255554"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1099544029826", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean", "long"}, new String[]{"549755813887", "false", "-33539398"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getStandardOffset", "long", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("549781013887", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "nextTransition", new String[]{"long"}, new String[]{"5546345482340108585"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5546345488074000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 1), new String[][]{{"getOffset", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<sample:3>", "5546345482340108587"}, false, 6, new String[][]{{"org.joda.time.DateTimeZone", "equals", "java.lang.Object", "<i:-2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5546345482340108587", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"4", "false"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800004", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getID", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("America/Los_Angeles", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"EET"}, true), new String[][]{{"getStandardOffset", "long", "0"}, {"convertUTCToLocal", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036847575808", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"29982"}, true, 0, null, 3), new String[][]{{"isStandardOffset", "long", "2"}, {"getShortName", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+00:00:29.982", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isFixed", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "toTimeZone", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getDisplayName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Pacific Standard Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-9223301668110598144", "true"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223301668082220144", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "nextTransition", new String[]{"long"}, new String[]{"8796093082207"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8799526800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHoursMinutes", new String[]{"int", "int"}, new String[]{"-1", "21599970"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "toTimeZone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.DateTimeZone", "getOffset", "org.joda.time.ReadableInstant", "<sample:0>"}}, 1), new String[][]{{"getOffsetsByStandard", "long,int[]", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<sample:4>", "0"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2118683648", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"21600000"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+06:00 {getID=+06:00, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<null>", "9223372036854775761"}, false, 6, new String[][]{{"org.joda.time.DateTimeZone", "convertLocalToUTC", "long,boolean", "1800000", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775761", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isStandardOffset", new String[]{"long"}, new String[]{"3600003"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-33524432", "false"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4724432", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"34359798367", "false"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("34388598367", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"22020-01-01"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertUTCToLocal", new String[]{"long"}, new String[]{"16777215"}, false, 5, new String[][]{{"org.joda.time.DateTimeZone", "convertUTCToLocal", "long", "-134157728"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-12022785", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "writeReplace", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeZone$Stub", actual.getClass().getName());
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+596:31:23.647 {getID=+596:31:23.647, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<sample:3>", "7200000"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getStandardOffset", "long", "3599999"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "previousTransition", new String[]{"long"}, new String[]{"2773172741170054292"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2773172721203999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getDefault", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getStandardOffset", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28378000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "previousTransition", new String[]{"long"}, new String[]{"-6471952372192896284"}, false, 2, new String[][]{{"org.joda.time.DateTimeZone", "getStandardOffset", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-6471952372192896284", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"nextTransition", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<sample:3>", "60050"}, false, 3, new String[][]{{"org.joda.time.DateTimeZone", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("60050", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getZone", "java.lang.String", "3"}, {"getAvailableIDs", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, true, 0, null, 2), new String[][]{{"isLocalDateTimeGap", "org.joda.time.LocalDateTime", "0"}, {"isLocalDateTimeGap", "org.joda.time.LocalDateTime", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
}
