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
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:2>"}, true), new String[][]{{"display", "", "1"}, {"getInteger", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String"}, new String[]{"inckude"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<null>", "010"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setInclude", "java.lang.String", "1.5Wc"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "1..5fon", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"false"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "isInitialized", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "3L", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"${1.12345678901234567"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "display", ""}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,java.lang.Long", "off => ", "-6"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("${1.12345678901234567", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "float"}, new String[]{"l3", "-0.0"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "fil1/sep}arator", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "=file.separator"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,short", "$", "32767"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "PT6", "0.0"}, {"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "subset", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getKeys", ""}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,java.lang.Byte", "1.5f2020-01-01", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{ey0=sample, ey1=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String", "02147483648"}, {"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", "123456789012345678901234567890"}}, 3), new String[][]{{"addElement", "java.lang.Object", "2"}, {"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<sample:3>", "1.134567"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<i:0>", "<i:-4194302>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{0=-4194302, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"yes"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream", "java.lang.String"}, new String[]{"<empty>", "l3"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "off", "-2"}, {"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", ".2", "<s:b>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{.2=b, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"l", "1e1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "\tI", "<null>"}, {"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[, sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "java.lang.Short"}, new String[]{"tque", "-32768"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<sample:9>", "d${"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "}\r2147483648", "13"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-32768", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:3>"}, true), new String[][]{{"putAll", "java.util.Map", "0"}, {"putAll", "java.util.Map", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{key0=[sample, , ]}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:0>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"214748368"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", "${"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String", "-0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setInclude", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "214748368"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "}"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "o2n", "<s:a>"}, {"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=0, key2=sample, o2n=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<sample:1>", "fil.separatnr0x1F"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a, ], key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"0", "<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getKeys", "java.lang.String", ""}, {"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "inclvdeHello, Worlda"}}, 3), new String[][]{{"load", "java.io.InputStream", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{a=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"no"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<empty>", "\t"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"off"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "double"}, new String[]{"l31", "Infinity"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", " "}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", "]]-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"true"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"on"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"010=1", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}, {"org.apache.commons.collections.ExtendedProperties", "interpolate", "java.lang.String", "${}"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "i", "<i:44>"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "i", "<sample:2>"}}), new String[][]{{"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{i=44, key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<sample:1>", "-0f.0"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "fil.separatnr0x1F--1", "<s:kf\\F,>"}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "="}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{fil.separatnr0x1F--1=kf\\F, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{"", "false"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=false, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"->", "536870978"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<s:+>", "<i:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "+", "-9223372036854775808"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("536870978", String.valueOf(actual));
  assertEquals("receiver state after the call", "{+=0, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "float"}, new String[]{"null", "-26.0"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<null>", "<i:-2147483636>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "", "<i:-2147483640>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"", "-128"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "", "<s:a>"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "->0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<i:2>", "<s:0ke\\,>"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "-2", "-536870959"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:3>", "<i:4>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<i:2>", "<i:-4194302>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4194302", String.valueOf(actual));
  assertEquals("receiver state after the call", "{2=4, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"${1.12345678902345670x123456789", "<s:a>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "H${~", "<s:0pke,\\,>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{${1.12345678902345670x123456789=a, H${~=[0pke, ,], key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"${}", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "{"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"H$u{~", "127"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "1.12345678901234567", "<i:-2147483648>"}, {"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", "1.12345678901234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1.12345678901234567=-2147483648, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{"HelWo, World", "true"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "1-14567", "<s:ke\\,>"}, {"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:2>", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1-14567=ke,, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setInclude", "java.lang.String", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "subset", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", "=0x1F"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String", "->08"}}, 1), new String[][]{{"getVector", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"", "true"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "", "<i:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"", "-3"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "", "<d:-1.5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{"+"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "+", "<i:-2147483616>"}, {"org.apache.commons.collections.ExtendedProperties", "getKeys", "java.lang.String", "4\t"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"1", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "", "<s:E0ke\\,>"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=E0ke,, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<i:-1>", "<s:ke4y>"}, {"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-1=ke4y, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"", "<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "nll", "<s:_\n>"}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "", "<sample:0>"}}, 3), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{=[a], key0=, nll=_\n}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setInclude", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "-1", "<i:-2147483626>"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{-1=-2147483626, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-2>", "<b:false>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<sample:3>", "<s:>"}, {"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "2", "abc-0.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{-2=false, 2=, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<empty>"}, true), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "0"}, {"getInt", "java.lang.String,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"01.5f", "5"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "1", "<s:ke\\\\,>"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,java.lang.Long", "1", "-15"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1=ke\\, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<s:>", "<i:-2097120>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:1>"}, true), new String[][]{{"addProperty", "java.lang.String,java.lang.Object", "4"}, {"getDouble", "java.lang.String,double", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"no", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "PT", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperty", new String[]{"java.lang.String"}, new String[]{"]-11.51.5d"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "p-2", "-0.0"}, {"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,java.lang.Double", "2", "-1.7976931348623157E308"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"imclve", "1879048191"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1879048191", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "-11.12", "<s:cc>"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,float", "20200-01-01", "3.4028235E38"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{-11.12=cc, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String"}, new String[]{"on0"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String"}, new String[]{"1M"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"l.4f", "<empty>"}, false, 0, null, 3), new String[][]{{"containsValue", "java.lang.Object", "7"}, {"getOrDefault", "java.lang.Object,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{"famse"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{"java.lang.String"}, new String[]{"1.5e31"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "1.25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"inckude", "127"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "", "Infinity"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", ".50", "-9187343239835779072"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream", "java.lang.String"}, new String[]{"<sample:1>", "1.12345678901234567"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "}", "<b:false>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, }=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "subset", new String[]{"java.lang.String"}, new String[]{"--="}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "1.5-0.0", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperty", new String[]{"java.lang.String"}, new String[]{"-0.5"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "-", "<i:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{-=0, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"Hello, Word", "127"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:1>"}, true, 0, null, 1), new String[][]{{"getList", "java.lang.String,java.util.List", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String"}, new String[]{"TT-E"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "float"}, new String[]{"1.5e31", "1.0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String"}, new String[]{"1.5e311.5f"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"false1E-5", "<empty>"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,float", "=", "Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("false1E-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"]-", "<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "2-1.5", "-1064961"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("]-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "float"}, new String[]{"1.123456=78", "-1.0"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "1.5e300"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1L", "<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{1L=1, key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String"}, new String[]{",]-1"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "=file.se:arator1.5", "9223372036854775807"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,java.lang.Long", ".51.12345678", "-9223372036854775808"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String"}, new String[]{"2.1234567890123456"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,java.lang.Double", "->", "-Infinity"}, {"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<sample:6>"}}, 1), new String[][]{{"ensureCapacity", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"inclue", "true"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "trt", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"+1", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "display", ""}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "null", "<s:b>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{+1=, key0=, null=b}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"${", "-32768"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "+1.5", "1.7976931348623157E308"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,java.lang.Byte", "$0", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-32768", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"1.1234567890123456", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "]-1.51.5da b", "<null>"}, {"org.apache.commons.collections.ExtendedProperties", "interpolate", "java.lang.String", "1.53"}}, 1), new String[][]{{"set", "int,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "0", "-0.9999999999999999"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "file/sepa\\rator", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String"}, new String[]{"]-11"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "inckude1.12345671.5e300"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String"}, new String[]{"\t>"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "/L"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "0x1F"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String"}, new String[]{"08859_1"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "1.1234F578"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String", ": "}}, 1), new String[][]{{"firstElement", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String"}, new String[]{"]--11.51.5d"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:2>", "1.0234567890123456"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{": "}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"include"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "interpolate", "java.lang.String", "Titme"}, {"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "=:: 1.1234567890123456null ", "6t"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:0>"}, true, 0, null, 1), new String[][]{{"clearProperty", "java.lang.String", "4"}, {"combine", "org.apache.commons.collections.ExtendedProperties", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"]-011.51.5d"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("]-011.51.5d", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "clearProperty", new String[]{"java.lang.String"}, new String[]{"a"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,float", "-11.25", "-Infinity"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "no"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "clearProperty", new String[]{"java.lang.String"}, new String[]{"}a"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"}", "-32767"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:3>"}, {"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:2>", "yes"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-32767", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"=fild.reparator", "-1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0", "on"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,java.lang.Long", "4/", "4611686018427387903"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,java.lang.Long", "Hello, W}rld", "-10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("on", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{",", "true"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperty", new String[]{"java.lang.String"}, new String[]{"+0"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "f"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String"}, new String[]{"212/-01-01"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", "9x1F"}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "false0xEFFFFFFF", "<s:>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"=:: 1.12345678901234564"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"l.5f", "<null>"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String"}, new String[]{"1.B5f"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,float", ".5", "4.6"}, {"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "C", "2020-02-30S25:61:61on"}}, 3), new String[][]{{"insertElementAt", "java.lang.Object,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setInclude", new String[]{"java.lang.String"}, new String[]{"=:: 1.123456789"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", "0+1", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String"}, new String[]{"nll"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "inclue+1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{"2020-2-30S25E61:61"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "1>50x123456789", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", ":}off"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", "p-2"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{"A", "false"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", "`Cb"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String"}, new String[]{"=o1.5d"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,short", "2=", "2"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "a,"}}, 3), new String[][]{{"set", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"J", "-2"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "java.lang.Double"}, new String[]{"abcno", "Infinity"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, a], key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{" b"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"0l0", "<s:bb>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{0l0=bb, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", ": ", "<b:false>"}}, 1), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{: =false, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{",1.5", "0x113456799"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x113456799", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"1.5d7"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "12345678901234567890123456790"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5d7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setInclude", new String[]{"java.lang.String"}, new String[]{"offon"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<empty>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String"}, new String[]{"ff"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}}, 1), new String[][]{{"subList", "int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream", "java.lang.String"}, new String[]{"<sample:3>", "1.255abc"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String"}, new String[]{"1.5Wci"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "-1.5Hello, WorldPT1H", "<null>"}, {"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "0x1"}}, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String"}, new String[]{"2020-02-30S25:61:61"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "-0.0a,b,c", "-2143289344"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getKeys", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", "file/separator"}}), new String[][]{{"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "subset", new String[]{"java.lang.String"}, new String[]{"=: "}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<s:c>", "<i:-2>"}, {"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "--", "]-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{c=-2, key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1.5f", "<i:-4>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1.5f=-4, key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234568", "PT1H"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT1H", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{","}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "clearProperty", new String[]{"java.lang.String"}, new String[]{"1 "}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"l.5f", "<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "=file.separator"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("l.5f", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{"", "true"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "l3", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "remove", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"-1", "false"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, ]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"inckude", "-64"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-64", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{key0=a, key1=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"--", "0"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "subset", new String[]{"java.lang.String"}, new String[]{"--1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"2020-2-30S25:61:61", "-9187343239835779072"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9187343239835779072", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{": "}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"inclue", "<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,float", "Title", "0.2"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "java.lang.Double"}, new String[]{"=file.separator", "-1.7976931348623157E308"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[sample, ]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<i:-2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "clearProperty", new String[]{"java.lang.String"}, new String[]{"+1}"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"010", "2143289343"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2143289343", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "double"}, new String[]{"ynclude", "-1.0"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"falIse", "-2143289344"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2143289344", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"file/separator12:30:45", "2147483647"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String"}, new String[]{"hnclue"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String"}, new String[]{"\n"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String", "java.util.List"}, new String[]{"0xFFFFFFFF", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{"+0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String"}, new String[]{"0a"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234567-0.0", "0.00x123456789"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.00x123456789", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:bb>", "<s:b>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{bb=b, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"yes.", "--f"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", "11M"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--f", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"1-1", "1"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setInclude", new String[]{"java.lang.String"}, new String[]{"."}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"0", "<sample:0>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream", "java.lang.String"}, new String[]{"<null>", "6t"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"incluude", "<null>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"nll", "2"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,java.lang.Byte", "includeHello, World", "127"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String", "010="}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "isInitialized", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "214748368", "false"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", "1.225", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "java.lang.Double"}, new String[]{"f`lse", "-Infinity"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"true", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"0xF", "127"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "clearProperty", new String[]{"java.lang.String"}, new String[]{": "}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", ".-file.separator"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String"}, new String[]{""}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,java.lang.Byte", "-1.5Hello, World", "127"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"\n", "1"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "float"}, new String[]{"1.12345678", "-3.4028235E38"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-3.4028235E38", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1b.25", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{1b.25=a, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"-1.51.5f", "9223372036854775807"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String"}, new String[]{"fil.separator"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:-1.5>", "<sample:2>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{-1.5=b, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"010=", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "1.24", "-8.0"}}), new String[][]{{"loadFromXML", "java.io.InputStream", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.InvalidPropertiesFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<i:-54>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, a], key1=[a, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"-1", "-6"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "double"}, new String[]{"ogf", "1.42"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.42", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "isInitialized", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"+1", "4"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "9: ", "88"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "java.lang.Float"}, new String[]{",,", "3.4028235E38"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "+0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("3.4028235E38", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperty", new String[]{"java.lang.String"}, new String[]{"1.5e31"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", ",$|"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "0x12n3456789"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[0, sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"=:: ", "0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "5.1.12345678901234567", "NaN"}, {"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a, a], key1=[0, 0], key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:7>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<sample:2>", "00${"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"-1.5Hello, dWorld", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5Hello, dWorld", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"a", "32767"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("32767", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"off", "63"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("63", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "java.lang.Float"}, new String[]{"inckude", "1.7014117E38"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.7014117E38", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1>3456789012345678901234567890", "<i:41>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "-1", "134217728"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1>3456789012345678901234567890=41, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String"}, new String[]{"=:: 1.1234567890123456"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String", "Hello, World"}}), new String[][]{{"indexOf", "java.lang.Object", "0"}, {"removeElementAt", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "0", "true"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,short", "1.22225", "8191"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "=:: 1.1234567890123456a", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{=:: 1.1234567890123456a=-1, key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"1}e10", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "float"}, new String[]{"PT1H", "3.4028235E38"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "W1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("3.4028235E38", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream", "java.lang.String"}, new String[]{"<sample:3>", "=: "}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "Title1.1345678901234567", "true"}, {"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"0", "127"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "2010-01-01"}, {"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a, 0], key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "float"}, new String[]{"$${5.", "-8.5070587E37"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-8.5070587E37", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"+02020-01-01"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+02020-01-01", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "isInitialized", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"inclue", "08859_1"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "=o1.5d", "<sample:1>"}, {"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:2>", "1e10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("08859_1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"a", "4611686018427387903"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", "0x123456789"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686018427387903", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "float"}, new String[]{"x5no", "-0.1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", ",b,c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-0.1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:10>"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", "i"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{"1.2251"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "->", "<sample:1>"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,java.lang.Long", "nll1.1234567", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"file.separator", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", "a,bb,c"}, {"org.apache.commons.collections.ExtendedProperties", "display", ""}}), new String[][]{{"elementAt", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", "Title"}, {"org.apache.commons.collections.ExtendedProperties", "getKeys", ""}}), new String[][]{{"save", "java.io.OutputStream,java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream", "java.lang.String"}, new String[]{"<sample:1>", "1E.5"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "+/", "9214364837600034815"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"<null>", "true"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String"}, new String[]{"12:30045"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "interpolateHelper", "java.lang.String,java.util.List", " +1", "<empty>"}}), new String[][]{{"addElement", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"=1: ", "false"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", "Tile"}, {"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"/>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "isInitialized", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "1L", "<s:`>"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", "$${"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1L=`, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "java.lang.Short"}, new String[]{"\013", "<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:6>", "file/sepfrator"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String"}, new String[]{"file.separator"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "0010=", "<sample:3>"}}), new String[][]{{"get", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "PTPT1H"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "java.lang.Double"}, new String[]{"1", "0.09"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "Titl"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "-1PT1H"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.09", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperty", new String[]{"java.lang.String"}, new String[]{"]-11.51.5d1.5f"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "java.lang.Double"}, new String[]{"Hello, Worldfile.separator", "0.74"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "]-11.51.5d"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.74", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:1>", "<s:key>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1=key, key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<b:true>"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String", "=: "}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "iocludeHello, World"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, true=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"l3", "1e00"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String", "12:30:45true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e00", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,java.lang.Double", "Tile", "0.1"}}), new String[][]{{"addAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"onfile.separator", "<s:db>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "falsE", "<sample:2>"}, {"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", "1.5e31"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, onfile.separator=db}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:3>"}, true), new String[][]{{"getInteger", "java.lang.String,java.lang.Integer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"1.1234", "-64"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "display", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-64", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream", "java.lang.String"}, new String[]{"<sample:2>", "-C"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String", "inc"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"15d", "8"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "display", ""}, {"org.apache.commons.collections.ExtendedProperties", "interpolateHelper", "java.lang.String,java.util.List", "2", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"-0.0a,b,c", "-10"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setInclude", "java.lang.String", "a,b,c+1"}, {"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "includello, World", "QT"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "java.lang.Double"}, new String[]{"=: ", "0.4865"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "interpolate", "java.lang.String", "-0.;0"}, {"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "Tite"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4865", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"2020-02--30T25:61:61", "-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"L", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,java.lang.Long", "", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1e10", "<b:false>"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "interpolate", "java.lang.String", "}PT1H"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1e10=false, key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.12345678i", "1.6f"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.6f", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "clearProperty", new String[]{"java.lang.String"}, new String[]{"inckude"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,short", "1.22225", "-16384"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"-t1.5", "-32768"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", ".+11"}, {"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-32768", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "java.lang.Short"}, new String[]{"\n", "32744"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "5.", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("32744", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"8859_:1", "2020-02-30T2"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:4>", "-1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{"=o1.5", "false"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", "a,b,cHello, World"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<sample:2>", "2020-02-30S25:61:61"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", "-0.0", "-1"}, {"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<sample:1>", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1=, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"]-12.51.5d", "true"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:30:{45", "123456789112345678901234567890"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", "yI"}, {"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "4", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("123456789112345678901234567890", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"trve", "true"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", "-1.y5 => "}, {"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "-0./,b,c", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-0./,b,c=true, key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperty", new String[]{"java.lang.String"}, new String[]{"]W1"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", " =>u1e10", "<sample:5>"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String", "--1L8859_1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:false>", "<i:1>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", "1", "2147483646"}, {"org.apache.commons.collections.ExtendedProperties", "getKeys", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{false=1, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream", "java.lang.String"}, new String[]{"<sample:0>", "-1"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "--1", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<sample:0>", " =5."}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "->1.26"}, {"org.apache.commons.collections.ExtendedProperties", "display", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"inclAde", "75497472"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("75497472", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "java.lang.Short"}, new String[]{"125", "-32744"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", " <> "}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-32744", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"=:: 1.1234567890123456"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=:: 1.1234567890123456", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"<null>", "127"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:5>", "01D0="}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "java.lang.Short"}, new String[]{"->null0xFFFFFFFF", "6"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"10", "<s:a>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,short", "innclue", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{10=a, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"].1", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,java.lang.Byte", "PToff0x123456789", "-128"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{].1=, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"2020-01-01=", "32767"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "->.5", "9223372036854775807"}, {"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", "fimIe/separator"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("32767", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperty", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "-0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{"]-11.51.5d"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "a ", "10"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "clearProperty", new String[]{"java.lang.String"}, new String[]{"]-1"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "Title1.5e300"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", "}"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String"}, new String[]{"a\\"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream", "java.lang.String"}, new String[]{"<sample:0>", "Titlf"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "]", "<i:-2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{]=-2, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:0>"}, true), new String[][]{{"getInt", "java.lang.String,int", "3"}, {"clear", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{": ", "<empty>"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String", "x1"}, {"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(": ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"2.5", "mll"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<sample:5>"}, {"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("mll", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a, a], key1=[0, 0], key2=[sample, sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"true", "0"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String", "a\t,b,c"}, {"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", "0w23456789"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"1.5d", "<sample:2>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5d", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<sample:4>", "file/sep`rator"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:8>"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,float", "3147483648", "2.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"=n1.5d"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "1.123456c1.25", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"file/separatorTITLE", "<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "display", ""}, {"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "=file.separator1e10", "Infinity"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"\\\\", "-128"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "1.5", "<s:kfy>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-128", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1.5=kfy, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"-1.4}", "<i:-1>"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", "inckude"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{-1.4}=-1, key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"0x123456789", "<b:true>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{0x123456789=true, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "trud"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{"2020-12-30S25:61:61"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String", "java.util.List"}, new String[]{"$${{", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getKeys", ""}}), new String[][]{{"add", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{":", "0"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String", "214748368off"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,java.lang.Long", "p-", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"1.5f", "-1"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "interpolate", "java.lang.String", "=file.separator"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "java.lang.Double"}, new String[]{"<null>", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "-111"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
}
