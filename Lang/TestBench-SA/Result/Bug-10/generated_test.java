package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1999", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "[1,2]", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "-1"}}, 1), new String[][]{{"toZoneId", "", "3"}, {"getId", "", "3"}, {"getId", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GMT", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "2147483647"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<i:0>"}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "1.123455678901234567"}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "0"}}, 3), new String[][]{{"asPredicate", "", "4"}, {"or", "java.util.function.Predicate", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "TITLE"}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{"01/"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "7"}, {"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<s:b>"}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "1.12345678", "<sample:6>"}}, 1), new String[][]{{"before", "java.util.Date", "4"}, {"getDay", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"229377"}, false, 12, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-30T25:61:61", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-30T25:61:61", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", " ", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", " I", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"Invalid field value ", "<sample:4>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"Invalid field value ", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", ".5", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"(\\p{IsNd}++)p", "<null>"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}, {"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "2"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"JP", "<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "1.1234567890123456", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{"ed0"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{"dd0"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "[1,2]", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "-1"}, {"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 1), new String[][]{{"toZoneId", "", "3"}, {"getId", "", "3"}, {"getId", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GMT", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "[1,2]", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "-19"}, {"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 1), new String[][]{{"toZoneId", "", "3"}, {"getId", "", "3"}, {"getId", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GMT", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "[1,2]", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "-19"}, {"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"\"\" abc", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "12:30:45"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"\"\" abd", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "12:30:45"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"{#ax\":1}PT1s", "<sample:6>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2147483647"}}, 3), new String[][]{{"getDisplayName", "boolean,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2147483620"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2147483620"}}, 1), new String[][]{{"getDisplayName", "boolean,int,java.util.Locale", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "2147483647"}}, 1), new String[][]{{"getDisplayName", "", "6"}, {"getISO3Country", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.MissingResourceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "123456789012345678901234567890", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "2147483647"}}, 1), new String[][]{{"getDisplayName", "", "6"}, {"getISO3Country", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "1E-5"}}, 2);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2037865984", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("340632", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1372347153", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String"}, new String[]{"h5."}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String"}, new String[]{"GhT8"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1372347153", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2147483391"}, {"org.apache.commons.lang3.time.FastDateParser", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-668010502", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2147483391"}, {"org.apache.commons.lang3.time.FastDateParser", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("488363911", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"-2147483648"}, false, 11, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "2147483647"}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "[1},2]"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{" n", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{" n", "<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "I"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "I"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "I"}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "1.5d"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "I"}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "1.5d"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[a,,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2002", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 2), new String[][]{{"useDaylightTime", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 2), new String[][]{{"useDaylightTime", "", "1"}, {"getDSTSavings", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 2), new String[][]{{"useDaylightTime", "", "1"}, {"getDSTSavings", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0(he true1.12345678901234567", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "1"}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "-2147483648"}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", " ", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<s:key>"}, {"org.apache.commons.lang3.time.FastDateParser", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"splitAsStream", "java.lang.CharSequence", "3"}, {"map", "java.util.function.Function", "1"}, {"dropWhile", "java.util.function.Predicate", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"splitAsStream", "java.lang.CharSequence", "3"}, {"map", "java.util.function.Function", "1"}, {"dropWhile", "java.util.function.Predicate", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"splitAsStream", "java.lang.CharSequence", "3"}, {"map", "java.util.function.Function", "1"}, {"dropWhile", "java.util.function.Predicate", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"splitAsStream", "java.lang.CharSequence", "3"}, {"map", "java.util.function.Function", "1"}, {"dropWhile", "java.util.function.Predicate", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[sample,0,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "Invalid field value ", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String"}, new String[]{"`aaaaaaaaa-aaaaaaa`aaaaaaaaaa.{a,b,c+1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-8"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1992", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-90"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1910", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2"}, {"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1999", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-1"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2"}, {"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1999", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"1"}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<s:a>"}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"262145"}, false, 11, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "1.1234567", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "1.1234567", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2020-02-30T25:61:61", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1L", "<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1L", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"123456789012345678901234567890", "<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "0"}, {"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147481648", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
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
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"Invalid field value ", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"Invalid field value ", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "I"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("java.util.regex.Pattern", actual.getClass().getName());
  assertEquals("(AM|PM)", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1", "<sample:1>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1", "<sample:1>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"n1", "<null>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("488615383", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2037865984", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("340632", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1372347153", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-668010502", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("348744", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("488363911", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"(\\p{IsNd}++)", "<sample:6>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{"0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{"0(he true"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "Hello, World", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.regex.Pattern", actual.getClass().getName());
  assertEquals("(AM|PM)", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.util.regex.Pattern", actual.getClass().getName());
  assertEquals("0", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.regex.Pattern", actual.getClass().getName());
  assertEquals("(\\p{IsNd}++)(AM|PM)(\\p{IsNd}++)", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.regex.Pattern", actual.getClass().getName());
  assertEquals("0", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<sample:2>"}}), new String[][]{{"pattern", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<sample:2>"}}), new String[][]{{"pattern", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(\\p{IsNd}++)(AM|PM)(\\p{IsNd}++)", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String"}, new String[]{"Unparseable date: \""}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2001", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"39"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2039", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"setID", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"a\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=GMT+00:00, getID=a, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,a] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "2147483648"}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "1.5f"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "2147483648"}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "1.5f"}, {"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "21474836488"}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "1.5f"}, {"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"2"}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}), new String[][]{{"getDisplayName", "boolean,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0_sample {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0, sample), getDisplayScript=, getDisplayVariant=sample, getISO3Country=!MissingResourceException, getISO3Languag...#295#545310035", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0 {getCountry=, getDisplayCountry=, getDisplayLanguage=0, getDisplayName=0, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=0, getScript=...#235#-1893121582", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "Invalid field value ", "<sample:7>"}, {"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<sample:1>"}}), new String[][]{{"getDisplayCountry", "java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "Invalid field value ", "<sample:7>"}, {"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<sample:1>"}}), new String[][]{{"getDisplayCountry", "java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}), new String[][]{{"getDisplayCountry", "java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("SAMPLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}), new String[][]{{"getDisplayCountry", "java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}, {"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "2147483647"}}), new String[][]{{"getDisplayName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a (0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-1"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "null"}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}});
  assertNotNull(actual);
  assertEquals("java.util.regex.Pattern", actual.getClass().getName());
  assertEquals("(\\p{IsNd}++)(AM|PM)(\\p{IsNd}++)", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<s:a>"}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[a,,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[0,a_0,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[sample,0_SAMPLE,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<i:35>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<i:35>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[a,_A,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}), new String[][]{{"useDaylightTime", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getDisplayVariant", "java.util.Locale", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "-0.1"}, {"org.apache.commons.lang3.time.FastDateParser", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<s:key>"}, {"org.apache.commons.lang3.time.FastDateParser", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<s:key>"}, {"org.apache.commons.lang3.time.FastDateParser", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}}), new String[][]{{"splitAsStream", "java.lang.CharSequence", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.stream.ReferencePipeline$Head", actual.getClass().getName());
  assertEquals("{count=1, isParallel=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}}), new String[][]{{"splitAsStream", "java.lang.CharSequence", "3"}, {"map", "java.util.function.Function", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 8, new String[][]{}), new String[][]{{"splitAsStream", "java.lang.CharSequence", "3"}, {"map", "java.util.function.Function", "1"}, {"dropWhile", "java.util.function.Predicate", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"54"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1954", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"44"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2044", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"88"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1988", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-47"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1953", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0x123456789", "<sample:7>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0x123456789", "<sample:7>"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "1.25", "<sample:1>"}}), new String[][]{{"hasSameRules", "java.util.TimeZone", "6"}, {"getDisplayName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Greenwich Mean Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[0,a_0_sample,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"-103"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"clone", "", "2"}, {"toZoneId", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.time.ZoneRegion", actual.getClass().getName());
  assertEquals("GMT {getId=GMT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "http://exampke.com/a?b=c", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[a,_A,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "http://exampke.com/a?b=c", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[0,a_0_sample,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "http://exampke.com/a?b=c", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[sample,0,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "http://exampke.com/a?b=c", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "JP"}}), new String[][]{{"hasSameRules", "java.util.TimeZone", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("348744", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("488363911", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"-6"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 2);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 2);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 2), new String[][]{{"getOffset", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2), new String[][]{{"getDisplayName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("A (0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2), new String[][]{{"getDisplayName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147481648", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[sample,0_SAMPLE,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "<null>"}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "-2147483647"}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "]"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[0,a_0,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "1.1234567", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "1.1234567", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "1.1234567", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"2"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"524290"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "PT1H", "<sample:7>"}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}), new String[][]{{"observesDaylightTime", "", "6"}, {"getOffset", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"2"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[sample,0,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "-2147483648"}}, 2), new String[][]{{"getDisplayName", "java.util.Locale", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Greenwich Mean Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[a,_A_0,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[sample,0_SAMPLE,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[0,a,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[a,,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[0,a_0,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[a,_A,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-10"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1990", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-8"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1992", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "1e10"}, {"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}, {"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "4194305"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "Invalid pattern"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"a b", "<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"Invalid pattern", "<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "2020-01-01", "<sample:3>"}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "1.5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"Invalie qa", "<null>"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "2020-01-0a1", "<sample:3>"}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "1.12345678"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 3), new String[][]{{"split", "java.lang.CharSequence", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "toString", ""}, {"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 2), new String[][]{{"split", "java.lang.CharSequence", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "toString", ""}, {"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "toString", ""}, {"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 2), new String[][]{{"split", "java.lang.CharSequence", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "toString", ""}, {"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 2), new String[][]{{"split", "java.lang.CharSequence", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1), new String[][]{{"split", "java.lang.CharSequence", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 20, new String[][]{}, 1), new String[][]{{"asMatchPredicate", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"PT1H]", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[sample,0_SAMPLE,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[a,_A_0,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[0,a,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"10"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2010", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"10"}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2010", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "1.5f"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{"5:s+))"}, false, 11, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "1.5f"}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "(\\p{IsNd}++)"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[a,_A_0,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[0,a,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[a,,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "Invalid pattern"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[a,_A,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "Inval4id pattern"}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[0,a_0_sample,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "(\\p{IsNd}+)Invalid pattern1.25"}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "0"}}, 1), new String[][]{{"matcher", "java.lang.CharSequence", "0"}, {"reset", "", "6"}, {"group", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", " not in ("}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "(The "}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "(The "}}, 2), new String[][]{{"getScript", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "(The "}}, 2), new String[][]{{"getScript", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "(The "}}, 2), new String[][]{{"getScript", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "(The "}}, 2), new String[][]{{"getScript", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "1e10"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"Invaljd field!ualue ", "<sample:7>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("348744", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"15"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2015", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147481648", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"1073741823"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073743723", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"536870911"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("536872811", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("488615383", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2037865984", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("340632", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"matcher", "java.lang.CharSequence", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.regex.Matcher", actual.getClass().getName());
  assertEquals("java.util.regex.Matcher[pattern=(AM|PM) region=0,6 lastmatch=] {hasAnchoringBounds=true, hasTransparentBounds=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"10"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2010", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"0"}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "-1", "<sample:1>"}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-128"}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "-1", "<sample:1>"}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1872", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-64"}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "-1", "<sample:1>"}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1936", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-192"}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "-1", "<sample:1>"}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1808", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-2147483648"}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "-1", "<sample:1>"}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147481648", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "-1"}}, 2), new String[][]{{"getExtension", "char", "2"}, {"getLanguage", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"2"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}, {"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<i:-16>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<s::>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("488615383", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "Invalid pattern"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2037865984", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"TITLE", "<sample:5>"}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "123456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 1), new String[][]{{"getVariant", "", "2"}, {"getScript", "", "4"}, {"getDisplayScript", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 1), new String[][]{{"getVariant", "", "2"}, {"getScript", "", "4"}, {"getDisplayScript", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0_SAMPLE,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("_A {getCountry=A, getDisplayCountry=A, getDisplayLanguage=, getDisplayName=A, getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=, getLanguage=, getScript...#236#-232682629", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0_sample {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0, sample), getDisplayScript=, getDisplayVariant=sample, getISO3Country=!MissingResourceException, getISO3Languag...#295#545310035", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("0 {getCountry=, getDisplayCountry=, getDisplayLanguage=0, getDisplayName=0, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=0, getScript=...#235#-1893121582", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[sample,0,GMT] {getPattern=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"getExtensionKeys", "", "1"}, {"add", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "Title"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1999", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
}
