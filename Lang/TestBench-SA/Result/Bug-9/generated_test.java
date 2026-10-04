package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<b:false>"}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "(The ", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1372347153", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"1"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "1"}, {"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "1610612735"}}), new String[][]{{"pattern", "", "7"}, {"flags", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2"}}, 3), new String[][]{{"getOffsetsByWall", "long,int[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"7"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{"0x123c56789"}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}}, 3), new String[][]{{"getTimezoneOffset", "", "3"}, {"getTimezoneOffset", "", "6"}, {"getTimezoneOffset", "", "7"}, {"getYear", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("69", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"9"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", " nos\037inn (2020-0[B-1"}, {"org.apache.commons.lang3.time.FastDateParser", "toString", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "(The "}, {"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "PT1H1.1234567", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<b:false>"}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "(The ", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<b:false>"}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "(The ", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("348744", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "\" does not match "}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "(The ", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("488615383", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"1.5f", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "1.12345678", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"FastDateParser[", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "1.12345-78", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"<null>", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "1"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"Invalid pattern", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.regex.Pattern", actual.getClass().getName());
  assertEquals("(AM|PM)", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.regex.Pattern", actual.getClass().getName());
  assertEquals("0", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 1), new String[][]{{"matcher", "java.lang.CharSequence", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.regex.Matcher", actual.getClass().getName());
  assertEquals("java.util.regex.Matcher[pattern=(AM|PM) region=0,0 lastmatch=] {hasAnchoringBounds=true, hasTransparentBounds=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "10"}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 1), new String[][]{{"matcher", "java.lang.CharSequence", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.regex.Matcher", actual.getClass().getName());
  assertEquals("java.util.regex.Matcher[pattern=0 region=0,0 lastmatch=] {hasAnchoringBounds=true, hasTransparentBounds=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0x1234456789", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "36"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c0x123456789"}, false, 8, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "1.5", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"inDaylightTime", "java.util.Date", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"inDaylightTime", "java.util.Date", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[a,,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"-1"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "(The "}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "1.5d", "<sample:6>"}}, 3), new String[][]{{"getVariant", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "(The "}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "1.5d", "<sample:6>"}}, 3), new String[][]{{"getVariant", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[0,a_0_sample,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[a,_A_0,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[0,a,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "null", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "null", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "null", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "null", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "null", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}}, 1), new String[][]{{"getDisplayScript", "java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}}, 1), new String[][]{{"getDisplayScript", "java.util.Locale", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "null", "<sample:7>"}}, 2), new String[][]{{"getDisplayScript", "java.util.Locale", "3"}, {"getUnicodeLocaleType", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "null", "<sample:7>"}}, 2), new String[][]{{"getDisplayScript", "java.util.Locale", "3"}, {"getLanguage", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"59"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "null", "<null>"}, {"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "63"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1372347153", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "null", "<null>"}, {"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "63"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "null", "<null>"}, {"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "63"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("348744", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "null", "<null>"}, {"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "63"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("488363911", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "ntll", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("488615383", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "ntll", "<null>"}, {"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("340632", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2147483647"}}, 2), new String[][]{{"getOffset", "long", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 2), new String[][]{{"getID", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GMT", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 2), new String[][]{{"getID", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GMT", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 2), new String[][]{{"getID", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GMT", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 2), new String[][]{{"getRawOffset", "", "1"}, {"toZoneId", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.time.ZoneRegion", actual.getClass().getName());
  assertEquals("GMT {getId=GMT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"[1,2]", "<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"[1,2]", "<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "-1.5", "<null>"}, {"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"2"}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"2", "<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 19, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 20, new String[][]{}, 3), new String[][]{{"flags", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 21, new String[][]{}, 3), new String[][]{{"flags", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "(\\p{IsNd}++)", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[a,,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"-1", "<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "0x123455789", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("340632", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("488363911", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "31"}}, 1);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("488615383", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "1.25"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<b:false>"}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "(The ", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("348744", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<b:false>"}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "(The ", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("488363911", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "\" does not match "}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "(The ", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("348744", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"\n", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"\n", "<sample:1>"}, false, 13, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"\n", "<sample:4>"}, false, 13, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"63"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-37", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"1087"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("987", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"1102"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483547", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0xFFFFFFFF", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"(\\p{IsNd}{", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"(\\p", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "]", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("_A {getCountry=A, getDisplayCountry=A, getDisplayLanguage=, getDisplayName=A, getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=, getLanguage=, getScript...#236#-232682629", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "]", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0_sample {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0, sample), getDisplayScript=, getDisplayVariant=sample, getISO3Country=!MissingResourceException, getISO3Languag...#295#545310035", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "]", "<sample:2>"}}), new String[][]{{"getUnicodeLocaleAttributes", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}), new String[][]{{"getExtensionKeys", "", "0"}, {"retainAll", "java.util.Collection", "5"}, {"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}), new String[][]{{"getExtensionKeys", "", "0"}, {"retainAll", "java.util.Collection", "5"}, {"contains", "java.lang.Object", "2"}, {"add", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}), new String[][]{{"getExtensionKeys", "", "0"}, {"retainAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "1"}}), new String[][]{{"getExtensionKeys", "", "2"}, {"retainAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"63"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1963", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"117"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2017", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"58"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1958", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"29"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2029", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.regex.Pattern", actual.getClass().getName());
  assertEquals("(AM|PM)", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.regex.Pattern", actual.getClass().getName());
  assertEquals("0", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.regex.Pattern", actual.getClass().getName());
  assertEquals("(AM|PM)", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "-1"}, {"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}), new String[][]{{"pattern", "", "7"}, {"flags", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "-1"}, {"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}), new String[][]{{"pattern", "", "7"}, {"flags", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "2147483647"}}), new String[][]{{"pattern", "", "7"}, {"flags", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "1"}, {"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "1610612735"}}), new String[][]{{"pattern", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(AM|PM)", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "1"}}), new String[][]{{"pattern", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "1L"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "1L"}});
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "Failed to parse \""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "63"}, {"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}), new String[][]{{"getOffsetsByStandard", "long,int[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{"Invalid field value "}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 8, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("340632", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1372347153", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "/a/b"}}), new String[][]{{"getOffset", "long", "6"}, {"getRawOffset", "", "6"}, {"observesDaylightTime", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getOffset", "long", "6"}, {"getRawOffset", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}, {"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<sample:1>"}}), new String[][]{{"getOffset", "long", "6"}, {"getRawOffset", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}, {"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<sample:1>"}}), new String[][]{{"getOffset", "long", "6"}, {"getRawOffset", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}, {"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<sample:1>"}}), new String[][]{{"getOffset", "long", "6"}, {"getRawOffset", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[a,,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[0,a_0,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "(The "}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "1.5d", "<sample:6>"}}), new String[][]{{"getVariant", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "(The "}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "1.5d", "<sample:6>"}}), new String[][]{{"getVariant", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "(The "}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "1.5d", "<sample:6>"}}), new String[][]{{"getVariant", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[a,_A,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[0,a_0_sample,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}), new String[][]{{"inDaylightTime", "java.util.Date", "6"}, {"getDisplayName", "boolean,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}), new String[][]{{"getID", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("GMT", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"matcher", "java.lang.CharSequence", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.regex.Matcher", actual.getClass().getName());
  assertEquals("java.util.regex.Matcher[pattern=(AM|PM) region=0,0 lastmatch=] {hasAnchoringBounds=true, hasTransparentBounds=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"matcher", "java.lang.CharSequence", "4"}, {"end", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"2"}, false, 6, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "63"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String"}, new String[]{"0x1)"}, false, 11, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"Nc", "<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "/b/b", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "0x123456789", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"<a>b</a>", "<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "isNextNumber", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getDisplayLanguage", "java.util.Locale", "6"}, {"stripExtensions", "", "5"}, {"toLanguageTag", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("und", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"getDisplayLanguage", "java.util.Locale", "6"}, {"stripExtensions", "", "5"}, {"toLanguageTag", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("und", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 2), new String[][]{{"getDisplayLanguage", "java.util.Locale", "6"}, {"stripExtensions", "", "5"}, {"toLanguageTag", "", "2"}, {"getDisplayScript", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 2), new String[][]{{"getDisplayLanguage", "java.util.Locale", "6"}, {"stripExtensions", "", "5"}, {"toLanguageTag", "", "2"}, {"getDisplayScript", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 2), new String[][]{{"getDisplayLanguage", "java.util.Locale", "6"}, {"stripExtensions", "", "5"}, {"toLanguageTag", "", "2"}, {"getDisplayScript", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 2), new String[][]{{"getDisplayLanguage", "java.util.Locale", "7"}, {"stripExtensions", "", "5"}, {"toLanguageTag", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("und-sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2), new String[][]{{"getDisplayLanguage", "java.util.Locale", "7"}, {"stripExtensions", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0 {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=!MissingResourceExc...#268#-877192394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<i:-59>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"/bC", "<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "0"}, {"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"/bC", "<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "0"}, {"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "FastDateParser[", "<sample:0>"}}, 1), new String[][]{{"split", "java.lang.CharSequence", "7"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"0"}, false, 11, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "1E-5"}, {"org.apache.commons.lang3.time.FastDateParser", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}}, 1), new String[][]{{"matcher", "java.lang.CharSequence", "7"}, {"start", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b >"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:]b >"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "PITLE", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:]b >"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "PITLEa b", "<sample:3>"}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 1);
  assertNotNull(actual);
  assertEquals("sun.util.calendar.ZoneInfo", actual.getClass().getName());
  assertEquals("sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null] {getDSTSavings=0, getDisplayName=Greenwich Mean Time, getID=GMT, getRawOffset=0, isDirty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"63"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1963", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"PT>f1H", "<sample:1>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"\rPU>fPH", "<sample:6>"}, false, 8, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"2"}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[a,_A_0,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[0,a,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}, 2), new String[][]{{"flags", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}, 2), new String[][]{{"flags", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}, 2), new String[][]{{"flags", "", "7"}, {"split", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}, 2), new String[][]{{"flags", "", "7"}, {"split", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}, 2), new String[][]{{"flags", "", "7"}, {"split", "java.lang.CharSequence", "2"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2"}, {"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<s:key>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("_A {getCountry=A, getDisplayCountry=A, getDisplayLanguage=, getDisplayName=A, getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=, getLanguage=, getScript...#236#-232682629", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"getISO3Country", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.MissingResourceException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String"}, new String[]{"\037P1H(\\p"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"Inald field value\037", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "-2147483648"}, {"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "abcg", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "63"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[a,_A,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{".0-5Hello, Iorld1.25", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{".0-5Hello, Iorld1.25", "<sample:7>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-52"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}, {"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1948", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getLocale", ""}, {"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<s:a>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<i:-2147483648>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"63"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1963", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"31"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2031", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"25"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2025", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"12"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2012", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147481649", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"1073741823"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073743723", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"10"}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2010", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{"GMT"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "1.12345678"}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "0x1F"}}), new String[][]{{"flags", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "1.12345678"}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "0x1\n"}}, 2), new String[][]{{"flags", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "1.12345678"}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "0x1\n"}}, 2), new String[][]{{"flags", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "1.5e300", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "1.5e3001e10", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"Unparsebble date: \"", "<sample:4>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}}), new String[][]{{"getDisplayName", "java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Greenwich Mean Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3), new String[][]{{"isDirty", "", "1"}, {"getDisplayName", "boolean,int,java.util.Locale", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[a,_A,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-23"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "\014"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1977", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "\01423456789012345678901234567890"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147481648", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "\0142345678901234567890123456F7890"}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1999", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "TITLE"}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "63"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{"http:///exampke.com/a?b=c11.1234567890123456"}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("340632", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1372347153", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("348744", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("488363911", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("97", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "hashCode", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("488615383", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "[1,2]", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.regex.Pattern", actual.getClass().getName());
  assertEquals("(AM|PM)", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "[1,2]", "<null>"}}, 3), new String[][]{{"asMatchPredicate", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "[1,2]", "<null>"}}, 3), new String[][]{{"asMatchPredicate", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<b:true>"}, {"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "[1,2]A", "<null>"}}, 3), new String[][]{{"asMatchPredicate", "", "7"}, {"test", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"536870911"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("536872811", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-1073741822"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073739822", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-1073741766"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073739766", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-1073741254"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073739254", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-1073741242"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073739242", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2000", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.regex.Pattern", actual.getClass().getName());
  assertEquals("(AM|PM)", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.regex.Pattern", actual.getClass().getName());
  assertEquals("0", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String,java.text.ParsePosition", "abc", "<sample:5>"}}, 1), new String[][]{{"asPredicate", "", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String"}, new String[]{"0Tile.T{"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "<a>b</a>ii"}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String"}, new String[]{"0Tile.T{"}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "<a>b</a>ii"}}), new String[][]{{"getTime", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "TITKEa b"}, {"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "-2147483611"}, {"org.apache.commons.lang3.time.FastDateParser", "toString", ""}}, 3), new String[][]{{"pattern", "", "2"}, {"split", "java.lang.CharSequence,int", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getParsePattern", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "TITKEa b"}, {"org.apache.commons.lang3.time.FastDateParser", "adjustYear", "int", "-2147483611"}, {"org.apache.commons.lang3.time.FastDateParser", "toString", ""}}, 3), new String[][]{{"pattern", "", "2"}, {"split", "java.lang.CharSequence,int", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getTimeZone", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getDisplayName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Greenwich Mean Time", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"0ja", "<sample:4>"}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{"KG"}, false, 7, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String,java.text.ParsePosition", "1.5f", "<sample:2>"}, {"org.apache.commons.lang3.time.FastDateParser", "getFieldWidth", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", "int", "63"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[0,a_0,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parse", "java.lang.String", "JP"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[a,_A,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[0,a_0_sample,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "toString", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FastDateParser[0,a_0,GMT]", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parseObject", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "0x123456789"}, {"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.text.ParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"010", "<sample:4>"}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Date", actual.getClass().getName());
  assertEquals("Wed Dec 31 16:00:00 PST 1969 {getDate=31, getDay=3, getHours=16, getMinutes=0, getMonth=11, getSeconds=0, getTime=0, getTimezoneOffset=480, getYear=69}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String", "java.text.ParsePosition"}, new String[]{"010", "<sample:4>"}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getParsePattern", ""}}), new String[][]{{"getTime", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"-2147483392"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147481392", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("a_0 {getCountry=0, getDisplayCountry=0, getDisplayLanguage=a, getDisplayName=a (0), getDisplayScript=, getDisplayVariant=, getISO3Country=!MissingResourceException, getISO3Language=!MissingResourceExc...#268#-877192394", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getLocale", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "rX5.5"}, {"org.apache.commons.lang3.time.FastDateParser", "getPattern", ""}, {"org.apache.commons.lang3.time.FastDateParser", "equals", "java.lang.Object", "<i:2>"}}, 1), new String[][]{{"getScript", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "aaT]"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "parseObject", "java.lang.String", "aaT]"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getPattern", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "parse", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "getDisplayNames", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.lang3.time.FastDateParser$KeyValue;", actual.getClass().getName());
  assertEquals("receiver state after the call", "FastDateParser[0,a_0,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"1"}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2001", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A_0,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "adjustYear", new String[]{"int"}, new String[]{"57"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1957", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 4, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[a,_A,GMT] {getPattern=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.time.FastDateParser", "org.apache.commons.lang3.time.FastDateParser", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:ix>"}, false, 5, new String[][]{{"org.apache.commons.lang3.time.FastDateParser", "isNextNumber", ""}, {"org.apache.commons.lang3.time.FastDateParser", "getTimeZone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "FastDateParser[0,a_0_sample,GMT] {getPattern=0}", SearchInputFactory_scaffolding.receiverState());
 }
}
