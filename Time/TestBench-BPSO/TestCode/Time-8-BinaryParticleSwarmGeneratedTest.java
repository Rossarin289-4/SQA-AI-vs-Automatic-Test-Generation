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
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"--1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setProvider", new String[]{"org.joda.time.tz.Provider"}, new String[]{"<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.ZoneInfoProvider", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHoursMinutes", new String[]{"int", "int"}, new String[]{"3600001", "59996"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setDefault", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setProvider", new String[]{"org.joda.time.tz.Provider"}, new String[]{"<sample:2>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"86399999"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+23:59:59.999 {getID=+23:59:59.999, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setNameProvider", new String[]{"org.joda.time.tz.NameProvider"}, new String[]{"<sample:7>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, true, 0, null, 1), new String[][]{{"adjustOffset", "long,boolean", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getAvailableIDs", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean", "long"}, new String[]{"-9223372036854775776", "false", "382142"}, false, 5, new String[][]{{"org.joda.time.DateTimeZone", "getShortName", "long", "21599998"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036826397776", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.DateTimeZone", "convertLocalToUTC", "long,boolean,long", "9223372036854775807", "true", "137448250610"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("America/Los_Angeles", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.DateTimeZone", "isStandardOffset", "long", "-6485651969"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("America/Los_Angeles", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, true), new String[][]{{"convertLocalToUTC", "long,boolean", "2"}, {"getOffset", "org.joda.time.ReadableInstant", "1"}, {"getOffsetFromLocal", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "adjustOffset", new String[]{"long", "boolean"}, new String[]{"-9223372036854775808", "false"}, false, 4, new String[][]{{"org.joda.time.DateTimeZone", "getName", "long,java.util.Locale", "1152921504606842882", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"9223372036854775807", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"-86399998"}, true), new String[][]{{"getName", "long,java.util.Locale", "2"}, {"getMillisKeepLocal", "org.joda.time.DateTimeZone,long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-57599994", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffset", new String[]{"long"}, new String[]{"-86399999"}, false, 4, new String[][]{{"org.joda.time.DateTimeZone", "getOffsetFromLocal", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"UTC"}, true), new String[][]{{"adjustOffset", "long,boolean", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHoursMinutes", new String[]{"int", "int"}, new String[]{"0", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"172799983"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setProvider", new String[]{"org.joda.time.tz.Provider"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setDefault", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-3600000", "true"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "adjustOffset", "long,boolean", "9223372036854775806", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("25200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"2773172741170054293", "false"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getOffset", "org.joda.time.ReadableInstant", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2773172741195254293", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getStandardOffset", new String[]{"long"}, new String[]{"127017728"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "convertUTCToLocal", "long", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHoursMinutes", new String[]{"int", "int"}, new String[]{"8", "268435455"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setNameProvider", new String[]{"org.joda.time.tz.NameProvider"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHoursMinutes", new String[]{"int", "int"}, new String[]{"8", "-2"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"-4"}, true, 0, null, 3), new String[][]{{"convertLocalToUTC", "long,boolean,long", "1"}, {"isStandardOffset", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "toTimeZone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.joda.time.DateTimeZone", "getMillisKeepLocal", "org.joda.time.DateTimeZone,long", "<null>", "137448250577"}}, 3), new String[][]{{"getDisplayName", "java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Pacific Standard Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHoursMinutes", new String[]{"int", "int"}, new String[]{"10", "4"}, true), new String[][]{{"getShortName", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+10:04", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"9223372019674906623", "true"}, false, 4, new String[][]{{"org.joda.time.DateTimeZone", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372019700106623", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"WET"}, true), new String[][]{{"getOffsetFromLocal", "long", "1"}, {"getUncachedZone", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone", actual.getClass().getName());
  assertEquals("WET {getID=WET, isCachable=true, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffset", new String[]{"long"}, new String[]{"-135300766848"}, false, 2, new String[][]{{"org.joda.time.DateTimeZone", "getOffsetFromLocal", "long", "9223372019674906623"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-25200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"+11"}, true, 0, null, 2), new String[][]{{"isLocalDateTimeGap", "org.joda.time.LocalDateTime", "5"}, {"adjustOffset", "long,boolean", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"MET"}, true, 0, null, 1), new String[][]{{"getMillisKeepLocal", "org.joda.time.DateTimeZone,long", "0"}, {"convertUTCToLocal", "long", "6"}, {"getOffsetFromLocal", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3600000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"-00"}, true, 0, null, 2), new String[][]{{"adjustOffset", "long,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHoursMinutes", new String[]{"int", "int"}, new String[]{"-2147483648", "-43199999"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.joda.time.DateTimeZone", "getName", "long", "-34359738369"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"119992"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getDefault", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isStandardOffset", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "previousTransition", new String[]{"long"}, new String[]{"10799999"}, false, 3, new String[][]{{"org.joda.time.DateTimeZone", "isLocalDateTimeGap", "org.joda.time.LocalDateTime", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5756400001", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getName", new String[]{"long"}, new String[]{"-17266271232"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isLocalDateTimeGap", new String[]{"org.joda.time.LocalDateTime"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.joda.time.DateTimeZone", "getStandardOffset", "long", "-2147423647"}, {"org.joda.time.DateTimeZone", "getShortName", "long", "137448250556"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<sample:1>", "4611686019588578303"}, false, 7, new String[][]{{"org.joda.time.DateTimeZone", "isFixed", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686019588578303", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "adjustOffset", new String[]{"long", "boolean"}, new String[]{"10802047", "false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10802047", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertUTCToLocal", new String[]{"long"}, new String[]{"87448575"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("58648575", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertUTCToLocal", new String[]{"long"}, new String[]{"2773172741170054292"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2773172741144854292", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffset", new String[]{"long"}, new String[]{"-6471952376487847198"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "convertUTCToLocal", "long", "4648576"}, {"org.joda.time.DateTimeZone", "getName", "long", "-6471952376487863582"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28378000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getDefault", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHoursMinutes", new String[]{"int", "int"}, new String[]{"2147483647", "10800001"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertUTCToLocal", new String[]{"long"}, new String[]{"-60"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-28800060", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"0xD1F"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getAvailableIDs", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffset", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getOffset", "long", "10800046"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffsetFromLocal", new String[]{"long"}, new String[]{"2199196055550"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "convertLocalToUTC", "long,boolean", "10800046", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-25200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1536188456", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isStandardOffset", new String[]{"long"}, new String[]{"174897150"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getAvailableIDs", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"floor", "java.lang.Object", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getNameKey", new String[]{"long"}, new String[]{"6471947978441352477"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PST", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHoursMinutes", new String[]{"int", "int"}, new String[]{"86399999", "30017"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.DateTimeZone", "getMillisKeepLocal", "org.joda.time.DateTimeZone,long", "<sample:7>", "59999"}, {"org.joda.time.DateTimeZone", "toTimeZone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("America/Los_Angeles", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"useer.timezoneCET"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"4648576", "false"}, false, 5, new String[][]{{"org.joda.time.DateTimeZone", "getOffsetFromLocal", "long", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("33448576", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-33434434", "true"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4634434", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setProvider", new String[]{"org.joda.time.tz.Provider"}, new String[]{"<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getID", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("America/Los_Angeles", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getAvailableIDs", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"first", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean", "long"}, new String[]{"21599945", "true", "-137431473340"}, false, 4, new String[][]{{"org.joda.time.DateTimeZone", "convertLocalToUTC", "long,boolean", "68193", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("50399945", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffset", new String[]{"long"}, new String[]{"1799999"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-87448546", "false"}, false, 1, new String[][]{{"org.joda.time.DateTimeZone", "isStandardOffset", "long", "-137465027772"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-58648546", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getAvailableIDs", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"GMT"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("Etc/GMT {getID=Etc/GMT, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isFixed", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.joda.time.DateTimeZone", "isStandardOffset", "long", "-9223371899415822357"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"5102848", "true"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "isLocalDateTimeGap", "org.joda.time.LocalDateTime", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("33902848", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"-10799975"}, true, 0, null, 1), new String[][]{{"convertLocalToUTC", "long,boolean", "1"}, {"toTimeZone", "", "7"}, {"clone", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.SimpleTimeZone", actual.getClass().getName());
  assertEquals("java.util.SimpleTimeZone[id=-02:59:59.975,offset=-10799975,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,e...#347#-712937834", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, true, 0, null, 3), new String[][]{{"getNameKey", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTC", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "toTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.DateTimeZone", "getOffsetFromLocal", "long", "10800001"}}, 1);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,transitions=185,lastRule=java.util.SimpleTimeZone[id=America/Los_Angeles,offset=-28800000,dstSa...#535#1218260140", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1536188456", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getStandardOffset", new String[]{"long"}, new String[]{"86400006"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "writeReplace", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getName", "long", "4503599616570495"}}, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeZone$Stub", actual.getClass().getName());
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "hashCode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1536188456", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-86383615", "true"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "convertLocalToUTC", "long,boolean", "10800129", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-57583615", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "adjustOffset", new String[]{"long", "boolean"}, new String[]{"119982", "true"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("119982", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getStandardOffset", new String[]{"long"}, new String[]{"-6485651969"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "writeReplace", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"UT_C"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"-2"}, true, 0, null, 1), new String[][]{{"getOffsetFromLocal", "long", "5"}, {"getStandardOffset", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"-1.6"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"59999", "false"}, false, 4, new String[][]{{"org.joda.time.DateTimeZone", "isStandardOffset", "long", "3600006"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28859999", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setProvider", new String[]{"org.joda.time.tz.Provider"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertUTCToLocal", new String[]{"long"}, new String[]{"-67650383424"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-67679183424", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setNameProvider", new String[]{"org.joda.time.tz.NameProvider"}, new String[]{"<sample:7>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "writeReplace", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "equals", "java.lang.Object", "<s:&>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeZone$Stub", actual.getClass().getName());
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getAvailableIDs", "", "0"}, {"pollLast", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Zulu", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getNameProvider", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean", "long"}, new String[]{"-17266271232", "false", "-2"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-17241071232", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getStandardOffset", new String[]{"long"}, new String[]{"9223372036854775753"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "writeReplace", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "convertLocalToUTC", "long,boolean,long", "4503599616570495", "true", "9297084"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeZone$Stub", actual.getClass().getName());
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isFixed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getOffsetFromLocal", "long", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1536188456", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "convertLocalToUTC", "long,boolean", "-6471952376487863548", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("America/Los_Angeles", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, true), new String[][]{{"nextTransition", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9972000000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<sample:7>", "3599965"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3599965", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true), new String[][]{{"getAvailableIDs", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:`>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getID", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("America/Los_Angeles", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "adjustOffset", new String[]{"long", "boolean"}, new String[]{"2", "false"}, false, 2, new String[][]{{"org.joda.time.DateTimeZone", "convertUTCToLocal", "long", "87448546"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"26", "false"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800026", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "nextTransition", new String[]{"long"}, new String[]{"-7200002"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9972000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean", "long"}, new String[]{"4503599616570495", "true", "10800000"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "isFixed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4503599641770495", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"60034"}, true), new String[][]{{"convertLocalToUTC", "long,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-60033", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffsetFromLocal", new String[]{"long"}, new String[]{"5546345482340108586"}, false, 4, new String[][]{{"org.joda.time.DateTimeZone", "convertUTCToLocal", "long", "4503599627430497"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-25200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isFixed", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.joda.time.DateTimeZone", "convertLocalToUTC", "long,boolean,long", "9223372036854775807", "true", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "toTimeZone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.joda.time.DateTimeZone", "toTimeZone", ""}, {"org.joda.time.DateTimeZone", "adjustOffset", "long,boolean", "119998", "false"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,transitions=185,lastRule=java.util.SimpleTimeZone[id=America/Los_Angeles,offset=-28800000,dstSa...#535#1218260140", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<sample:4>", "9297084"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9297084", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffset", new String[]{"long"}, new String[]{"9297084"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getID", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<sample:4>", "-34532542518"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "isStandardOffset", "long", "536930912"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-34532542518", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"3600000"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, true), new String[][]{{"toTimeZone", "", "1"}, {"setStartRule", "int,int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHoursMinutes", new String[]{"int", "int"}, new String[]{"1", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean", "long"}, new String[]{"9297084", "true", "1099522427735"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getOffset", "long", "-6485651968"}, {"org.joda.time.DateTimeZone", "convertLocalToUTC", "long,boolean,long", "59999", "true", "9297152"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("38097084", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-6485651968", "false"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getID", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-6460451968", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "previousTransition", new String[]{"long"}, new String[]{"5546345482272999723"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "equals", "java.lang.Object", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5546345467514399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getStandardOffset", new String[]{"long"}, new String[]{"5102848"}, false, 1, new String[][]{{"org.joda.time.DateTimeZone", "equals", "java.lang.Object", "<b:false>"}, {"org.joda.time.DateTimeZone", "adjustOffset", "long,boolean", "-9223372036854775808", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean", "long"}, new String[]{"5546345482306554153", "true", "-3242826014"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "toTimeZone", ""}, {"org.joda.time.DateTimeZone", "getName", "long,java.util.Locale", "-6485651968", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5546345482331754153", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isStandardOffset", new String[]{"long"}, new String[]{"-9223372036854743039"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getName", "long", "576460745817771520"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "previousTransition", new String[]{"long"}, new String[]{"-86399999"}, false, 5, new String[][]{{"org.joda.time.DateTimeZone", "getName", "long,java.util.Locale", "-172799998", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5756400001", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:2>"}, true), new String[][]{{"nextTransition", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("-01:00 {getID=-01:00, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getNameKey", new String[]{"long"}, new String[]{"9297084"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PST", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffset", new String[]{"long"}, new String[]{"9223372036854775806"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "toTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-25200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "previousTransition", new String[]{"long"}, new String[]{"9223372036854775807"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372030230000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<sample:5>", "4611686018427387903"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "isLocalDateTimeGap", "org.joda.time.LocalDateTime", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686018427387903", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<null>", "21599945"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getName", "long", "135300766848"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("21599945", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("UTC {getID=UTC, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffsetFromLocal", new String[]{"long"}, new String[]{"1099522427735"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<sample:0>", "524287"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("524287", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getDefault", new String[]{}, new String[]{}, true), new String[][]{{"convertLocalToUTC", "long,boolean", "0"}, {"getUncachedZone", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isCachable=true, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, true), new String[][]{{"isLocalDateTimeGap", "org.joda.time.LocalDateTime", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "previousTransition", new String[]{"long"}, new String[]{"-6485651969"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-21477600001", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "previousTransition", new String[]{"long"}, new String[]{"-6453937977978381597"}, false, 6, new String[][]{{"org.joda.time.DateTimeZone", "nextTransition", "long", "-6183722000336151893"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-6453937977978381597", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean", "long"}, new String[]{"-1", "true", "-6471952376487863631"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28799999", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertUTCToLocal", new String[]{"long"}, new String[]{"10800061"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "writeReplace", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-17999939", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertUTCToLocal", new String[]{"long"}, new String[]{"3601025"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "convertUTCToLocal", "long", "30000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-25198975", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "adjustOffset", new String[]{"long", "boolean"}, new String[]{"86137855", "false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("86137855", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:6>"}, true), new String[][]{{"convertLocalToUTC", "long,boolean,long", "1"}, {"nextTransition", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"43199743", "false"}, false, 4, new String[][]{{"org.joda.time.DateTimeZone", "isLocalDateTimeGap", "org.joda.time.LocalDateTime", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("71999743", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<null>"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"1", "true"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "equals", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28800001", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getAvailableIDs", new String[]{}, new String[]{}, true), new String[][]{{"add", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getAvailableIDs", new String[]{}, new String[]{}, true), new String[][]{{"removeAll", "java.util.Collection", "6"}, {"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getDefault", new String[]{}, new String[]{}, true), new String[][]{{"isLocalDateTimeGap", "org.joda.time.LocalDateTime", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<sample:4>", "2"}, false, 4, new String[][]{{"org.joda.time.DateTimeZone", "getOffset", "org.joda.time.ReadableInstant", "<sample:3>"}, {"org.joda.time.DateTimeZone", "isFixed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-86399999", "false"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-57599999", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:3>"}, true), new String[][]{{"getID", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UTC", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, true), new String[][]{{"isStandardOffset", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isLocalDateTimeGap", new String[]{"org.joda.time.LocalDateTime"}, new String[]{"<sample:2>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getAvailableIDs", new String[]{}, new String[]{}, true), new String[][]{{"descendingIterator", "", "7"}, {"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-9223372036854775773", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036826397773", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "adjustOffset", new String[]{"long", "boolean"}, new String[]{"-4611686018405787959", "false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4611686018405787959", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffset", new String[]{"long"}, new String[]{"-6471952376487863581"}, false, 1, new String[][]{{"org.joda.time.DateTimeZone", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28378000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-2", "true"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "adjustOffset", "long,boolean", "0", "true"}, {"org.joda.time.DateTimeZone", "adjustOffset", "long,boolean", "-3600000", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28799998", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean", "long"}, new String[]{"86399934", "true", "86399998"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "convertUTCToLocal", "long", "135300766813"}, {"org.joda.time.DateTimeZone", "previousTransition", "long", "-9264316"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("115199934", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"5546345482339977515", "false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5546345482365177515", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<sample:1>", "-86400000"}, false, 6, new String[][]{{"org.joda.time.DateTimeZone", "isLocalDateTimeGap", "org.joda.time.LocalDateTime", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-86400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getDefault", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.CachedDateTimeZone", actual.getClass().getName());
  assertEquals("America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"-86399998"}, true), new String[][]{{"convertUTCToLocal", "long", "6"}, {"nextTransition", "long", "4"}, {"getName", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-23:59:59.998", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true), new String[][]{{"getAvailableIDs", "", "3"}, {"first", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Africa/Abidjan", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffsetFromLocal", new String[]{"long"}, new String[]{"-9007199168340957"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28378000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffset", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:5>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "nextTransition", new String[]{"long"}, new String[]{"-6485651969"}, false, 5, new String[][]{{"org.joda.time.DateTimeZone", "convertUTCToLocal", "long", "119997"}, {"org.joda.time.DateTimeZone", "convertLocalToUTC", "long,boolean,long", "-86399999", "false", "21599988"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-5756400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<sample:4>", "9223372036854775806"}, false, 6, new String[][]{{"org.joda.time.DateTimeZone", "convertUTCToLocal", "long", "9297073"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775806", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setNameProvider", new String[]{"org.joda.time.tz.NameProvider"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"-86399990"}, true), new String[][]{{"convertLocalToUTC", "long,boolean,long", "4"}, {"isLocalDateTimeGap", "org.joda.time.LocalDateTime", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffset", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-25200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"60001"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+00:01:00.001 {getID=+00:01:00.001, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertUTCToLocal", new String[]{"long"}, new String[]{"86400000"}, false, 4, new String[][]{{"org.joda.time.DateTimeZone", "getOffset", "org.joda.time.ReadableInstant", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("57600000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getAvailableIDs", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"pollLast", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Zulu", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean", "long"}, new String[]{"-135300766848", "false", "21600073"}, false, 2, new String[][]{{"org.joda.time.DateTimeZone", "getShortName", "long", "9223372036854775746"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-135275566848", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"2"}, true), new String[][]{{"getOffset", "org.joda.time.ReadableInstant", "0"}, {"adjustOffset", "long,boolean", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:0>"}, true, 0, null, 1), new String[][]{{"previousTransition", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"122116"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+00:02:02.116 {getID=+00:02:02.116, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "adjustOffset", new String[]{"long", "boolean"}, new String[]{"5400023", "true"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5400023", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "writeReplace", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.DateTimeZone$Stub", actual.getClass().getName());
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.ZoneInfoProvider", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffset", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:9>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "adjustOffset", new String[]{"long", "boolean"}, new String[]{"7199998", "false"}, false, 1, new String[][]{{"org.joda.time.DateTimeZone", "nextTransition", "long", "-1073711823"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7199998", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "previousTransition", new String[]{"long"}, new String[]{"4503599616570495"}, false, 5, new String[][]{{"org.joda.time.DateTimeZone", "getOffset", "org.joda.time.ReadableInstant", "<sample:4>"}, {"org.joda.time.DateTimeZone", "getName", "long,java.util.Locale", "5546345482340108074", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4503593296799999", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"4503599616570495", "true"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "writeReplace", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4503599641770495", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "nextTransition", new String[]{"long"}, new String[]{"9223372036854775780"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775780", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"-86367230"}, true), new String[][]{{"convertLocalToUTC", "long,boolean,long", "1"}, {"getNameKey", "long", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-4503599616570495", "false"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4503599588192495", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean", "long"}, new String[]{"120030", "true", "-6485651969"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("28920030", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "previousTransition", new String[]{"long"}, new String[]{"-6471952376487863582"}, false, 7, new String[][]{{"org.joda.time.DateTimeZone", "getShortName", "long,java.util.Locale", "4503603911537791", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-6471952376487863582", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "nextTransition", new String[]{"long"}, new String[]{"7200000"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getShortName", "long,java.util.Locale", "4648543", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9972000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertUTCToLocal", new String[]{"long"}, new String[]{"-86399977"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-115199977", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forID", new String[]{"java.lang.String"}, new String[]{"+"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffset", new String[]{"long"}, new String[]{"60001"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-28800000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getMillisKeepLocal", new String[]{"org.joda.time.DateTimeZone", "long"}, new String[]{"<sample:2>", "-4398041408256"}, false, 2, new String[][]{{"org.joda.time.DateTimeZone", "getName", "long,java.util.Locale", "450470912", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4398041408256", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "adjustOffset", new String[]{"long", "boolean"}, new String[]{"86399999", "false"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("86399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean", "long"}, new String[]{"10205696", "true", "-6471952376487863582"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("39005696", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getNameKey", new String[]{"long"}, new String[]{"137448250556"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getName", "long,java.util.Locale", "-6471952376487847198", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PDT", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-17266271232", "false"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "isFixed", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-17241071232", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isLocalDateTimeGap", new String[]{"org.joda.time.LocalDateTime"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.joda.time.DateTimeZone", "getName", "long", "5111040"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("America/Los_Angeles", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getID", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.joda.time.DateTimeZone", "isStandardOffset", "long", "86399999"}, {"org.joda.time.DateTimeZone", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("America/Los_Angeles", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "adjustOffset", new String[]{"long", "boolean"}, new String[]{"10800081", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10800081", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean", "long"}, new String[]{"1099522427729", "false", "-1"}, false, 4, new String[][]{{"org.joda.time.DateTimeZone", "convertUTCToLocal", "long", "3599963"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1099551227729", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getProvider", new String[]{}, new String[]{}, true), new String[][]{{"getZone", "java.lang.String", "2"}, {"getZone", "java.lang.String", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"59996"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+00:00:59.996 {getID=+00:00:59.996, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertUTCToLocal", new String[]{"long"}, new String[]{"-86399990"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-115199990", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-6485651969", "false"}, false, 4, new String[][]{{"org.joda.time.DateTimeZone", "isStandardOffset", "long", "60001"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-6460451969", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "adjustOffset", new String[]{"long", "boolean"}, new String[]{"2", "false"}, false, 4, new String[][]{{"org.joda.time.DateTimeZone", "getName", "long,java.util.Locale", "86400032", "<sample:0>"}, {"org.joda.time.DateTimeZone", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "getOffset", new String[]{"org.joda.time.ReadableInstant"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.joda.time.DateTimeZone", "toTimeZone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-25200000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "adjustOffset", new String[]{"long", "boolean"}, new String[]{"-29954433", "true"}, false, 6, new String[][]{{"org.joda.time.DateTimeZone", "equals", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-29954433", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "adjustOffset", new String[]{"long", "boolean"}, new String[]{"86399999", "false"}, false, 5, new String[][]{{"org.joda.time.DateTimeZone", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("86399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertUTCToLocal", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036829575807", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "nextTransition", new String[]{"long"}, new String[]{"4503599616569983"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4503613856400000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertUTCToLocal", new String[]{"long"}, new String[]{"2147423647"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2118623647", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forTimeZone", new String[]{"java.util.TimeZone"}, new String[]{"<sample:1>"}, true, 0, null, 3), new String[][]{{"isStandardOffset", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-6471952376487863581", "true"}, false, 4, new String[][]{{"org.joda.time.DateTimeZone", "getOffset", "long", "9305276"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-6471952376459485581", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"-86399998"}, true);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("-23:59:59.998 {getID=-23:59:59.998, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertUTCToLocal", new String[]{"long"}, new String[]{"-86400016"}, false, 4, new String[][]{{"org.joda.time.DateTimeZone", "getOffsetFromLocal", "long", "-10808192"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-115200016", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetMillis", new String[]{"int"}, new String[]{"59999"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.joda.time.tz.FixedDateTimeZone", actual.getClass().getName());
  assertEquals("+00:00:59.999 {getID=+00:00:59.999, isFixed=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertUTCToLocal", new String[]{"long"}, new String[]{"-5102848"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "equals", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-33902848", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertLocalToUTC", new String[]{"long", "boolean"}, new String[]{"-12971303938", "true"}, false, 4, new String[][]{{"org.joda.time.DateTimeZone", "equals", "java.lang.Object", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-12946103938", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "convertUTCToLocal", new String[]{"long"}, new String[]{"135300766848"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("135275566848", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "setDefault", new String[]{"org.joda.time.DateTimeZone"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "nextTransition", new String[]{"long"}, new String[]{"-1"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9972000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "previousTransition", new String[]{"long"}, new String[]{"135300766848"}, false, 0, new String[][]{{"org.joda.time.DateTimeZone", "getOffsetFromLocal", "long", "43724320"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("126698399999", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "isStandardOffset", new String[]{"long"}, new String[]{"5546345482340108585"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "America/Los_Angeles {getID=America/Los_Angeles, isFixed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.joda.time.DateTimeZone", "org.joda.time.tz.CachedDateTimeZone", "forOffsetHours", new String[]{"int"}, new String[]{"1"}, true, 0, null, 1), new String[][]{{"nextTransition", "long", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
}
