package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.ZoneInfoProvider", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setProvider", new String[]{"org.joda.time.tz.Provider"}, new String[]{"<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setDefault", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:6>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setProvider", new String[]{"org.joda.time.tz.Provider"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setProvider", new String[]{"org.joda.time.tz.Provider"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getAvailableIDs", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setNameProvider", new String[]{"org.joda.time.tz.NameProvider"}, new String[]{"<sample:6>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setNameProvider", new String[]{"org.joda.time.tz.NameProvider"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"9223372036854775807", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHoursMinutes", new String[]{"int", "int"}, new String[]{"0", "10799999"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setDefault", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"UTC"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"-1"}, true, 0, null, 1), new String[][]{{"getName", "long,java.util.Locale", "5"}, {"getShortName", "long,java.util.Locale", "6"}, {"getNameKey", "long", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"EET"}, true), new String[][]{{"isLocalDateTimeGap", "org.joda.time.LocalDateTime", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"+00"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHoursMinutes", new String[]{"int", "int"}, new String[]{"2", "36"}, true, 0, null, 3), new String[][]{{"convertLocalToUTC", "long,boolean", "2"}, {"nextTransition", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"+01"}, true, 0, null, 2), new String[][]{{"getShortName", "long", "0"}, {"isStandardOffset", "long", "6"}, {"adjustOffset", "long,boolean", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isLocalDateTimeGap", new String[]{"org.joda.time.LocalDateTime"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isLocalDateTimeGap", new String[]{"org.joda.time.LocalDateTime"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "isLocalDateTimeGap", "org.joda.time.LocalDateTime", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isLocalDateTimeGap", new String[]{"org.joda.time.LocalDateTime"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getShortName", "long", "3600000"}, {"org.joda.time.DateTimeZone", "isLocalDateTimeGap", "org.joda.time.LocalDateTime", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isLocalDateTimeGap", new String[]{"org.joda.time.LocalDateTime"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "convertLocalToUTC", "long,boolean,long", "-6471952376487863580", "false", "3599999"}, {"org.joda.time.DateTimeZone", "getShortName", "long", "3600000"}, {"org.joda.time.DateTimeZone", "isLocalDateTimeGap", "org.joda.time.LocalDateTime", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isLocalDateTimeGap", new String[]{"org.joda.time.LocalDateTime"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "convertLocalToUTC", "long,boolean,long", "-6471952376487863580", "false", "3599999"}, {"org.joda.time.DateTimeZone", "getShortName", "long", "3600000"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isLocalDateTimeGap", new String[]{"org.joda.time.LocalDateTime"}, new String[]{"<sample:0>"}, false, 16, new String[][]{{"org.joda.time.DateTimeZone", "convertLocalToUTC", "long,boolean,long", "-6471952376487863580", "false", "7199998"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHoursMinutes", new String[]{"int", "int"}, new String[]{"-3599999", "3599999"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isLocalDateTimeGap", new String[]{"org.joda.time.LocalDateTime"}, new String[]{"<sample:5>"}, false, 16, new String[][]{{"org.joda.time.DateTimeZone", "getShortName", "long", "3600000"}, {"org.joda.time.DateTimeZone", "getShortName", "long", "1800025"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isLocalDateTimeGap", new String[]{"org.joda.time.LocalDateTime"}, new String[]{"<sample:3>"}, false, 16, new String[][]{{"org.joda.time.DateTimeZone", "getName", "long", "-6471952376487863580"}, {"org.joda.time.DateTimeZone", "isStandardOffset", "long", "10800000"}, {"org.joda.time.DateTimeZone", "getShortName", "long", "-15108263"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setDefault", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"3600001"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+01:00:00.001 {getID=+01:00:00.001, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHoursMinutes", new String[]{"int", "int"}, new String[]{"3600001", "60001"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setDefault", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getNameProvider", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setProvider", new String[]{"org.joda.time.tz.Provider"}, new String[]{"<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"-3599999"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getNameProvider", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getShortName", "java.util.Locale,java.lang.String,java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setNameProvider", new String[]{"org.joda.time.tz.NameProvider"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setProvider", new String[]{"org.joda.time.tz.Provider"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+00:00:00.001 {getID=+00:00:00.001, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setNameProvider", new String[]{"org.joda.time.tz.NameProvider"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getNameProvider", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getZone", "java.lang.String", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"1E-5"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHoursMinutes", new String[]{"int", "int"}, new String[]{"3600000", "3599999"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHoursMinutes", new String[]{"int", "int"}, new String[]{"2147483647", "-3599999"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isLocalDateTimeGap", new String[]{"org.joda.time.LocalDateTime"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isLocalDateTimeGap", new String[]{"org.joda.time.LocalDateTime"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1536188456", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "isFixed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isLocalDateTimeGap", new String[]{"org.joda.time.LocalDateTime"}, new String[]{"<sample:3>"}, false, 16, new String[][]{{"org.joda.time.DateTimeZone", "isStandardOffset", "long", "60000"}, {"org.joda.time.DateTimeZone", "convertLocalToUTC", "long,boolean,long", "-6480959575742604572", "false", "7199998"}, {"org.joda.time.DateTimeZone", "getShortName", "long", "1800025"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffsetFromLocal", new String[]{"long"}, new String[]{"-6471952376487863581"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getOffsetFromLocal", "long", "10799999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28378000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "nextTransition", new String[]{"long"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9972000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffset", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getStandardOffset", new String[]{"long"}, new String[]{"1"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "writeReplace", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertUTCToLocal", new String[]{"long"}, new String[]{"10799999"}, false, 6, new String[][]{{"org.joda.time.DateTimeZone", "getOffsetFromLocal", "long", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-18000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getDefault", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"10"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+10:00 {getID=+10:00, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "writeReplace", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.DateTimeZone", "isLocalDateTimeGap", "org.joda.time.LocalDateTime", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeZone$Stub", actual.getClass().getName());
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setNameProvider", new String[]{"org.joda.time.tz.NameProvider"}, new String[]{"<sample:7>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, true), new String[][]{{"convertUTCToLocal", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, true), new String[][]{{"convertLocalToUTC", "long,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.ZoneInfoProvider", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, true), new String[][]{{"getStandardOffset", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, true), new String[][]{{"convertLocalToUTC", "long,boolean,long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, true), new String[][]{{"isLocalDateTimeGap", "org.joda.time.LocalDateTime", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isFixed", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, true), new String[][]{{"isStandardOffset", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, true), new String[][]{{"getID", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTC", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isStandardOffset", new String[]{"long"}, new String[]{"60000"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"a b"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, true), new String[][]{{"adjustOffset", "long,boolean", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"10799999"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+02:59:59.999 {getID=+02:59:59.999, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, true), new String[][]{{"previousTransition", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getID", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("America/Los_Angeles", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getStandardOffset", new String[]{"long"}, new String[]{"-6471952376487863581"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getOffsetFromLocal", "long", "1800025"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28378000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "previousTransition", new String[]{"long"}, new String[]{"3600001"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5756400001", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"10800000"}, true), new String[][]{{"getShortName", "long,java.util.Locale", "7"}, {"getOffset", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10800000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"59999"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"3599999"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+00:59:59.999 {getID=+00:59:59.999, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true), new String[][]{{"getZone", "java.lang.String", "3"}, {"getAvailableIDs", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true), new String[][]{{"getAvailableIDs", "", "4"}, {"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("572", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"60000"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+00:01 {getID=+00:01, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"-3599999"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("-00:59:59.999 {getID=-00:59:59.999, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"-6471952376487863581"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"+1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"2147483647"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+596:31:23.647 {getID=+596:31:23.647, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("-00:00:00.001 {getID=-00:00:00.001, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getDefault", new String[]{}, new String[]{}, true), new String[][]{{"adjustOffset", "long,boolean", "1"}, {"getMillisKeepLocal", "org.joda.time.DateTimeZone,long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"10800000"}, true), new String[][]{{"getID", "", "7"}, {"previousTransition", "long", "6"}, {"isStandardOffset", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true), new String[][]{{"getAvailableIDs", "", "3"}, {"removeAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getAvailableIDs", new String[]{}, new String[]{}, true), new String[][]{{"clear", "", "5"}, {"isEmpty", "", "3"}, {"addAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "toTimeZone", new String[]{}, new String[]{}, false), new String[][]{{"getID", "", "3"}, {"getDisplayName", "boolean,int,java.util.Locale", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHoursMinutes", new String[]{"int", "int"}, new String[]{"10", "0"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+10:00 {getID=+10:00, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"-1"}, true), new String[][]{{"getMillisKeepLocal", "org.joda.time.DateTimeZone,long", "4"}, {"convertLocalToUTC", "long,boolean,long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036851175809", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true), new String[][]{{"getZone", "java.lang.String", "4"}, {"getZone", "java.lang.String", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true), new String[][]{{"getAvailableIDs", "", "3"}, {"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true), new String[][]{{"getZone", "java.lang.String", "1"}, {"getAvailableIDs", "", "3"}, {"add", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"a"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getAvailableIDs", "", "7"}, {"first", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Africa/Abidjan", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+01:00 {getID=+01:00, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getAvailableIDs", new String[]{}, new String[]{}, true), new String[][]{{"last", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Zulu", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"WET"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("WET {getID=WET, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setDefault", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:7>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.ZoneInfoProvider", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getAvailableIDs", new String[]{}, new String[]{}, true), new String[][]{{"pollFirst", "", "1"}, {"higher", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true), new String[][]{{"getAvailableIDs", "", "2"}, {"first", "", "2"}, {"first", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Africa/Abidjan", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"-3599999"}, true, 0, null, 3), new String[][]{{"isLocalDateTimeGap", "org.joda.time.LocalDateTime", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, true, 0, null, 3), new String[][]{{"isLocalDateTimeGap", "org.joda.time.LocalDateTime", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"10800000"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+03:00 {getID=+03:00, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHoursMinutes", new String[]{"int", "int"}, new String[]{"10", "1"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+10:01 {getID=+10:01, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setProvider", new String[]{"org.joda.time.tz.Provider"}, new String[]{"<sample:5>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHoursMinutes", new String[]{"int", "int"}, new String[]{"-1", "10"}, true), new String[][]{{"getShortName", "long", "5"}, {"getName", "long", "4"}, {"getID", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-01:10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getAvailableIDs", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.ZoneInfoProvider", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<empty>"}, true, 0, null, 2), new String[][]{{"convertUTCToLocal", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
 }
}
