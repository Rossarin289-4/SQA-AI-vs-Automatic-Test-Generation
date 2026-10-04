package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "1L", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "2147483647"}, {"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}), new String[][]{{"getOffsetsByStandard", "long,int[]", "7"}, {"setID", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=GMT+00:00, getID=, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}, {"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "33554432"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<i:-1>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"2"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "1879048191"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "7"}, {"org.apache.commons.lang3.time.FastDateParser", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{"PMS1H"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "Title0x123456789"}, {"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 1), new String[][]{{"getMonth", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"5.", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "{\"}:1}", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"1"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("_A {getCountry=A, getDisplayCountry=A, getDisplayLanguage=, getDisplayName=A, getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=, getLanguage=, getScript...#236#-232682629", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"1879048191"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1879048091", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"observesDaylightTime", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.regex.Pattern", actual.getClass().getName());
  assertEquals("(AM|PM)", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[a,,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String"}, new String[]{"]"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1255f", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<d:1.5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147481649", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "abc"}, {"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"aa~ bb", "<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{""}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<s:keyv>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-30T25:6161", "<null>"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", " no in ("}}, 3), new String[][]{{"getISO3Language", "", "6"}, {"getDisplayVariant", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[a,,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"a,b,c", "<sample:6>"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[a,,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483547", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"JJP", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"Invalid attern", "<sample:7>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String"}, new String[]{"-0.vTITLE"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"flags", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147481648", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"2147483592"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147481704", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "-1"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "1.1234567"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "]", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}}, 1), new String[][]{{"getExtensionKeys", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "1L"}, {"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-1"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<s:b)>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{"M+):"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "}+)-0.0", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 3), new String[][]{{"split", "java.lang.CharSequence,int", "2"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"/a/b", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{"1.123D5678"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "null", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{"(TheB 1E-5"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"31"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<i:-38>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2031", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:-3.08>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-62"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "2020-"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1938", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"toLanguageTag", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("und", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"TITLE", "<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.regex.Pattern", actual.getClass().getName());
  assertEquals("(AM|PM)", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-23"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<s:b>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1977", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483547", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "a,b,c"}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "+1\" ; gave up at!index "}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2/20-0<1-01", "<sample:7>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "8"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "I"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 1), new String[][]{{"getID", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GMT", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147481649", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String"}, new String[]{"}+"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "-0.0", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"45"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-55", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147481649", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}, {"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.util.regex.Pattern", actual.getClass().getName());
  assertEquals("(AM|PM)", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.util.regex.Pattern", actual.getClass().getName());
  assertEquals("(AM|PM)", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"1879048191"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1879050091", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147481648", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "-2147483630"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "1.1323"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}), new String[][]{{"split", "java.lang.CharSequence,int", "4"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String"}, new String[]{"aa} b"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0x123466789", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"(\\p{IsNd}++)1.25", "<sample:3>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{"1.5fJP0xFFFFFFFF"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "tNrue", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[a,,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String"}, new String[]{","}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:4b>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "(he ", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"j", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "D does not match ", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("488615383", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"null--1", "<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-2146435072"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2146433072", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false), new String[][]{{"toZoneId", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.time.ZoneRegion", actual.getClass().getName());
  assertEquals("GMT {getId=GMT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false), new String[][]{{"setID", "java.lang.String", "6"}, {"getRawOffset", "", "2"}, {"setRawOffset", "int", "6"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"0\",offset=3,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=GMT+00:00, getID=0, getRawOffset=3, isDirty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,0] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"2"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"TITcLE", "<sample:7>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"Unparseable date: \"", "<sample:1>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"aa} bUnparseable date: \"", "<sample:4>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"splitAsStream", "java.lang.CharSequence", "1"}, {"isParallel", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2001", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"Hemlo, World", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<i:-13>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483547", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("340632", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"\n-11.5", "<sample:6>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"65538"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("65438", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2147483647"}}), new String[][]{{"getRawOffset", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "a b5."}}), new String[][]{{"pattern", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(AM|PM)", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{"(\\p{IsNd}{"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "nul", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false), new String[][]{{"getDisplayLanguage", "java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}}), new String[][]{{"getDisplayCountry", "", "5"}, {"getUnicodeLocaleType", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"2"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "Ianvlid pattern", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "aa} btrue", "<sample:3>"}}), new String[][]{{"clone", "", "2"}, {"getLanguage", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false), new String[][]{{"useDaylightTime", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "/a/b", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:2>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false), new String[][]{{"toZoneId", "", "0"}, {"normalized", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.time.ZoneOffset", actual.getClass().getName());
  assertEquals("Z {getId=Z, getTotalSeconds=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "FastDateParser[1.1234567890123456", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[0,a_0_sample,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "1"}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147481648", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}}), new String[][]{{"getOffsetsByWall", "long,int[]", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false), new String[][]{{"asPredicate", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}}), new String[][]{{"asPredicate", "", "0"}, {"test", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "\" ; gave up at index "}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "86"}}), new String[][]{{"toZoneId", "", "4"}, {"getRules", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.time.zone.ZoneRules", actual.getClass().getName());
  assertEquals("ZoneRules[currentStandardOffset=Z] {isFixedOffset=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"asPredicate", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false), new String[][]{{"splitAsStream", "java.lang.CharSequence", "0"}, {"anyMatch", "java.util.function.Predicate", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String"}, new String[]{"abc1.12345678"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<i:-1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false), new String[][]{{"toLanguageTag", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("und", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false), new String[][]{{"getExtensionKeys", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "{\"#:1}"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String"}, new String[]{"01F"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false), new String[][]{{"pattern", "", "4"}, {"matcher", "java.lang.CharSequence", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.regex.Matcher", actual.getClass().getName());
  assertEquals("java.util.regex.Matcher[pattern=(AM|PM) region=0,1 lastmatch=] {hasAnchoringBounds=true, hasTransparentBounds=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-27"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1973", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "-0.0", "<null>"}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "12:30:45", "<sample:5>"}}, 2), new String[][]{{"getDisplayName", "", "3"}, {"getDisplayName", "boolean,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "0:.1323"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<i:-2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"-0.01.5f", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[a,_A,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"-1"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}}), new String[][]{{"setID", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"sample\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=GMT+00:00, getID=sample, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,sample] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"1"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "65538"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147481648", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"1"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"2"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2147483647"}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2147483647"}}), new String[][]{{"getDisplayName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Greenwich Mean Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String"}, new String[]{"1:30:45"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"setID", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"sample\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=GMT+00:00, getID=sample, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,sample] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "1073741823"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-254"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1746", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"1879048191"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1879050091", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[0,a_0,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "null"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147481649", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"asPredicate", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}), new String[][]{{"getDisplayVariant", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "-2147483648"}}, 3), new String[][]{{"getOffsets", "long,int[]", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1999", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"939524095"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("939525995", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"Invalid pattern", "<sample:10>"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "{\"\":1}"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2147483628"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2001", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<s:sb7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[a,_A,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getDisplayName", "java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String"}, new String[]{"0"}, false, 1, new String[][]{}), new String[][]{{"getTimezoneOffset", "", "6"}, {"setTime", "long", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Sat Aug 16 23:12:55 PST 292278994 {getDate=16, getDay=6, getHours=23, getMinutes=12, getMonth=7, getSeconds=55, getTime=9223372036854775807, getTimezoneOffset=480, getYear=292277094}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"2"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.5e300", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "69"}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "12:30:45", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}), new String[][]{{"getDisplayName", "boolean,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0}+)", "<sample:3>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getDisplayCountry", "java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "-25"}, {"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"a,b,", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "Failed to parse \""}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0 {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=!MissingResourceExc...#268#-877192394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147481648", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0 {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=!MissingResourceExc...#268#-877192394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getDisplayVariant", "java.util.Locale", "4"}, {"getDisplayCountry", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1372347153", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("488615383", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "i]", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.regex.Pattern", actual.getClass().getName());
  assertEquals("(AM|PM)", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("340632", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1372347153", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"UI)TLE", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "54"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<i:0>"}, {"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 3), new String[][]{{"getDisplayName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a (0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String"}, new String[]{"0x123 "}, false, 1, new String[][]{}), new String[][]{{"toInstant", "", "7"}, {"getEpochSecond", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"ITLE", "<sample:0>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "6.Title", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("340632", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0xFFFFFFF", "<sample:9>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "/a/b"}, {"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "0.25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[0,a_0,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<s:>"}}, 3), new String[][]{{"asPredicate", "", "6"}, {"or", "java.util.function.Predicate", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "a(\\p{IsNd}{"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("340632", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"split", "java.lang.CharSequence", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}}, 3), new String[][]{{"getUnicodeLocaleKeys", "", "2"}, {"clear", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 2), new String[][]{{"getUnicodeLocaleAttributes", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<s:b>"}}, 2), new String[][]{{"split", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0 {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=!MissingResourceExc...#268#-877192394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "-1"}}, 2), new String[][]{{"getExtension", "char", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"1"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2001", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"1879048191"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1879050091", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"2"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"111323", "<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "-65526"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}, 3), new String[][]{{"getUnicodeLocaleAttributes", "", "3"}, {"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "+1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[0,a_0,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "/x1F", "<sample:6>"}}, 3), new String[][]{{"getCountry", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.util.regex.Pattern", actual.getClass().getName());
  assertEquals("0", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("_A {getCountry=A, getDisplayCountry=A, getDisplayLanguage=, getDisplayName=A, getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=, getLanguage=, getScript...#236#-232682629", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147481648", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "i0", "<sample:3>"}}, 3), new String[][]{{"splitAsStream", "java.lang.CharSequence", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.stream.ReferencePipeline$Head", actual.getClass().getName());
  assertEquals("{count=1, isParallel=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<s:4b>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("488615383", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[a,_A,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "Title"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "1_", "<sample:8>"}}, 2), new String[][]{{"getISO3Country", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.MissingResourceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[0,a_0_sample,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"getDisplayCountry", "java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:hb>"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "0fF", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}}, 3), new String[][]{{"matcher", "java.lang.CharSequence", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.regex.Matcher", actual.getClass().getName());
  assertEquals("java.util.regex.Matcher[pattern=(AM|PM) region=0,6 lastmatch=] {hasAnchoringBounds=true, hasTransparentBounds=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "1879048238"}, {"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<s:>"}}, 2), new String[][]{{"split", "java.lang.CharSequence", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0_sample {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0, sample), getDisplayScript=, getDisplayVariant=sample, getISO3Country=!MissingResourceException, getISO3Languag...#295#545310035", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"\" doees not match (\\p{IsNd}{", "<sample:12>"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "null010", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "1073741823"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "-8"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2147483647"}}, 1), new String[][]{{"splitAsStream", "java.lang.CharSequence", "7"}, {"max", "java.util.Comparator", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Optional", actual.getClass().getName());
  assertEquals("Optional[sample] {isEmpty=false, isPresent=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"1878917119"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "(\\p{IsNd}{0x123456789"}, {"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1878919019", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"\n,", "<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "Z1,2]"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0_sample {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0, sample), getDisplayScript=, getDisplayVariant=sample, getISO3Country=!MissingResourceException, getISO3Languag...#295#545310035", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<i:2>"}}, 2), new String[][]{{"split", "java.lang.CharSequence,int", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "-2147483648"}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "1.\r12345678901234567"}}, 3), new String[][]{{"observesDaylightTime", "", "4"}, {"isDirty", "", "3"}, {"getDisplayName", "java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Greenwich Mean Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}}, 3), new String[][]{{"split", "java.lang.CharSequence", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.regex.Pattern", actual.getClass().getName());
  assertEquals("0", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<i:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1372347153", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "{\"a\":1}", "<sample:7>"}, {"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 2), new String[][]{{"splitAsStream", "java.lang.CharSequence", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.stream.ReferencePipeline$Head", actual.getClass().getName());
  assertEquals("{count=1, isParallel=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[0,a_0_sample,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}, {"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 1), new String[][]{{"inDaylightTime", "java.util.Date", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"hasExtensions", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "JJ", "<sample:4>"}}, 2), new String[][]{{"hasExtensions", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "ba} a"}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "TITLEGMT"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String"}, new String[]{"01F"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<s:aP>"}, {"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}}), new String[][]{{"toInstant", "", "3"}, {"plus", "long,java.time.temporal.TemporalUnit", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 1), new String[][]{{"split", "java.lang.CharSequence,int", "2"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"<a>b</a>", "<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "-10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
}
