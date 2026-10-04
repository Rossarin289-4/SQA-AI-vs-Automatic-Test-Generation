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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String"}, new String[]{"03:po0:551.25abc"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "I"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,java.lang.Byte", "Tff", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"Tff", "0"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "2020-02-30T25:61:61", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String"}, new String[]{"yes"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", ",", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "setInclude", "java.lang.String", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{"falsd1"}, false, 14, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "2020-01-01", "${"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", "5.", "-2147483648"}, {"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "a,b,c"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String"}, new String[]{"UfA12F30:T45"}, false, 14, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String", "2020-01-01"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String", "-.1"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", "1..5"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,java.lang.Double", "ys", "1.0"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", "+1", "32767"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<null>", "-01.5Btruee"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream", "java.lang.String"}, new String[]{"<sample:2>", "1E-50x1F"}, false, 8, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "8859_1", "1"}, {"org.apache.commons.collections.ExtendedProperties", "setInclude", "java.lang.String", "="}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<sample:0>", "<sample:1>"}, {"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:2>", ".5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{a=1, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"yes"}, false, 10, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String", "1.5d"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "-=", "2013265919"}, {"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<empty>", "1.123456778901234456"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String"}, new String[]{"11234567890133456"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"off"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<sample:3>", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"no"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"a b", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "no", "<sample:3>"}, {"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "on"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,float", "a,b,c", "-3.4028235E38"}, {"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<sample:2>", "ntll"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", "off"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a, 0], key1=[0, sample], key2=[sample, ]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"", "98"}, false, 15, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "", "<s:>"}, {"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,java.lang.Double", "", "<null>"}, {"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "1.5e300", "1.123456778901234456"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"1.5f", "1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<sample:0>", "8859_1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"0x1463456789|:P0C ", "true"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<sample:3>", "<i:-41>"}, {"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<i:2>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{2=1, key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", "1L", "2"}, {"org.apache.commons.collections.ExtendedProperties", "getKeys", ""}, {"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, , a], key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream", "java.lang.String"}, new String[]{"<sample:10>", "-#"}, false, 14, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<sample:3>"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "9-1", "9223372036854775807"}, {"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "i--1", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[0, sample], key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{"java.lang.String"}, new String[]{""}, false, 8, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "1.12345678901y3456"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "->"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "\n", "<sample:3>"}}), new String[][]{{"next", "", "4"}, {"remove", "", "5"}, {"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:3>"}, true, 0, null, 3), new String[][]{{"getFloat", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:9>"}, false, 14, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:6>"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "03:po0:551.25abc", "2147483647"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", "2e20"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:l15zz>"}, false, 10, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", "off"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", "null", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{"0.5.}", "false"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "f-lsd1", "9223372036854775807"}, {"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:2>"}, {"org.apache.commons.collections.ExtendedProperties", "display", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"0xr1E", "<empty>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getKeys", "java.lang.String", "include"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,java.lang.Byte", "1234567890123456789012345678901.12345678", "1"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "ii"}}, 2), new String[][]{{"save", "java.io.OutputStream,java.lang.String", "0"}, {"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "java.lang.Float"}, new String[]{"falsd1", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "0", "-9223372036854775808"}, {"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "falsd1", "<b:true>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"${}"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", "1.5d0.0true"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "1.4", "-Infinity"}, {"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "1.5", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("${}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"${}", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"null", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<null>", "<s:t4kkety>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", "file.separator1", "2147483647"}, {"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "2020-02-30T25:61:62", "1.5e300"}, {"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<s:>", "<i:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String"}, new String[]{"1"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<sample:1>", "<s:t4kkety>"}, {"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}, {"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "IHello, World", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{".-#\n", "-1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "off", "<i:1>"}, {"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "off", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, off=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "subset", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "-1.5", "yes-1.;"}, {"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "${", "1.0000000000000002"}, {"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{ey0=a, ey1=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String"}, new String[]{"b"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<s:b>", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", "file.separator", "<sample:3>"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", "\\", "-32768"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String"}, new String[]{"1.12345677890123456"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "1.12345677890123456", "<s:a>"}}), new String[][]{{"trimToSize", "", "7"}, {"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1.12345677890123456=[a], key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<s:>", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=false, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInclude", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setInclude", "java.lang.String", ""}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "ioclude 0", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"a", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "a", "<s:b>"}}, 2), new String[][]{{"addAll", "java.util.Collection", "0"}, {"lastIndexOf", "java.lang.Object,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"ur<ue", "<s:5,2\\\\>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<null>"}, {"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "Tff", "pff"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, ur<ue=[5, 2\\]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String"}, new String[]{""}, false, 12, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", "famsd1"}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "", "<i:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"--1", "<s:tkkke\\ty>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<sample:1>", "<s:tkkke\\ty>"}, {"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:1>", "ioclude 0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{--1=tkkke\\ty, 1=tkkke\\ty, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{"2e20"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "2e20", "<s:5,\\>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{2e20=[5, ,], key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String"}, new String[]{""}, false, 11, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<s:>", "<s:5,2\\>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "false", "<sample:3>"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", "false", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "", "<s:t4kkety>"}, {"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", ""}, {"org.apache.commons.collections.ExtendedProperties", "getKeys", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{=t4kkety, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"-", "1073741823"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "1.1234567890123456", "<s:5,2\\>"}, {"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:1>", "202I0-02-30T25:61:62"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1.1234567890123456=[5, 2,], key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "subset", new String[]{"java.lang.String"}, new String[]{"->"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "off", "1.7976931348623157E308"}, {"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<s:b>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "subset", new String[]{"java.lang.String"}, new String[]{"1;1/"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "off", "1.7976931348623157E308"}, {"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<s:b>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "subset", new String[]{"java.lang.String"}, new String[]{"1;1/"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "off", "1.7976931348623157E308"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "yes", "<sample:3>"}, {"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<s:>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{"false"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getKeys", "java.lang.String", "1E-5"}, {"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "yes"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{"false"}, false, 10, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getKeys", "java.lang.String", "1E-5"}, {"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "yes"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "1.12345678", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "no"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "1.12345678", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "no"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "1.12345678", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "no"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "1.12345678", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{"l", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{"k", "false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{"tD", "true"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "1.1234567890123456", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{"tC", "true"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "\t", "<i:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\t=2, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String"}, new String[]{"-0.5true"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{".5", "<s:tkklxty>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "-1.5"}, {"org.apache.commons.collections.ExtendedProperties", "display", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{.5=tkklxty, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{".H5", "<s:tkklxty>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "display", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{.H5=tkklxty, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{".H5", "<s:kklxty>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "display", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{.H5=kklxty, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{".H5", "<s:key>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "display", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{.H5=key, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{".H5", "<s:key>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{.H5=key, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"no", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "1", "<s:tkklety>"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", ".5,", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1=tkklety, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"no", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "<", "<s:tkklety>"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", ".5,", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{<=tkklety, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"no", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "<", "<s:tkklety>"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", ".5,", "2147483647"}}, 1), new String[][]{{"containsValue", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{<=tkklety, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"no", "<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String", "1L"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", ".5,", "2147483647"}}, 1), new String[][]{{"containsValue", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{"a,b,c1.9234567890123456"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{"falsd"}, false, 14, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", "5.", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{""}, false, 14, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "2020-01-01", "${"}, {"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "a,b+c"}, {"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<sample:1>", "<s:tkkkety>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1=tkkkety, key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{""}, false, 15, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "2020-01-01", "${"}, {"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "a,b+c"}, {"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<sample:1>", "<s:tkkkety>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1=tkkkety, key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"\\", "1"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"fakse", "-1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:6>"}, {"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "1.5"}, {"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "00"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"fakse", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:6>"}, {"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "1.5"}, {"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "00"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"-1", "<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 0, null, 2), new String[][]{{"getProperty", "java.lang.String", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "interpolate", "java.lang.String", "Title"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "interpolate", "java.lang.String", "Title"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "interpolate", "java.lang.String", "Title"}}, 3), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "false"}}, 3), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "false"}}, 3), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{"java.lang.String"}, new String[]{": null"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"2", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"7", "-2147483648"}, false, 14, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"7", "-1073741824"}, false, 14, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741824", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"6", "-1073741884"}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741884", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"1f10", "-2146435064"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2146435064", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"1f/1e10", "-1073217532"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073217532", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"1f/1e10d", "-2147483648"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String"}, new String[]{".0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String"}, new String[]{" => "}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "112345678901234565.", "17592186044416"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", ".>>>", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "1.12345677890123456", "<null>"}}, 2), new String[][]{{"hasNext", "", "0"}, {"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"}", "0"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getKeys", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<null>"}, {"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", "\n"}, {"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, ], key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<null>"}, {"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", "\n"}, {"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[0, ], key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<null>"}, {"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[sample, ], key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<i:7>"}, {"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[sample, sample], key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<i:2>"}, {"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:7>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[sample, 0], key1=[, sample], key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String"}, new String[]{"5.\\"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "0xFFFFFFFF"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String", "="}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"false", ": null"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(": null", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"+1", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", ".5", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String"}, new String[]{"111125\r779901123456falBse"}, false, 11, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:0>", "01FF => "}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"0xFFFFFFF", "6917529027641081855"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "-01.5Btruee"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6917529027641081855", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"0xFFFFFFF", "6917529027641081855"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "-01.5Btruee"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6917529027641081855", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"0xFFFFFFF", "6917529028177952767"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "-01.5Btruee"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6917529028177952767", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"0xFFFFFFF", "-9223372036854775808"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "-01.5Btruee"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"0xFFFFFFF", "9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "-01.5Btruee"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "no", "3.4028235E38"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "\\", "true"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", "ii", "10"}, {"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<sample:2>", "11234567890113456"}}, 3), new String[][]{{"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{"java.lang.String"}, new String[]{""}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "\\", "true"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", "ii", "10"}, {"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<sample:2>", "11234567890113456"}}, 3), new String[][]{{"next", "", "3"}, {"hasNext", "", "7"}, {"remove", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"of", "-128"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "yes", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-128", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"n", "127"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "on", "false"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", "I", "-1"}, {"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "a b"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"n", "-128"}, false, 15, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", "I", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-128", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"n", "-128"}, false, 13, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", "I", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-128", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "subset", new String[]{"java.lang.String"}, new String[]{"->"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "off", "1.7976931348623157E308"}, {"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<s:b>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "subset", new String[]{"java.lang.String"}, new String[]{"1;1/"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "off", "1.7976931348623157E308"}, {"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<s:b>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "-1"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,java.lang.Byte", "off", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<sample:1>", "file.separator"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<sample:1>", "file.separator"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:10>"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<sample:1>", "file.separator"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<sample:1>", "file.separator"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<sample:1>", "file.separator"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "java.lang.Float"}, new String[]{",", "3.4028235E38"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("3.4028235E38", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "java.lang.Float"}, new String[]{",", "1.7014117E38"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", ": "}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.7014117E38", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "java.lang.Float"}, new String[]{"-o1..0", "-1.7014117E38"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,java.lang.Double", ".", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.7014117E38", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "java.lang.Float"}, new String[]{"-o1.-0", "NaN"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1.1234567890123456", "<s:key>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{1.1234567890123456=key, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1.1234567890123456", "<s:kkey>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{1.1234567890123456=kkey, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1.1234567890123456", "<s:tkkety>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{1.1234567890123456=tkkety, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1.1234567890123456", "<s:tkkkety>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{1.1234567890123456=tkkkety, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1.12345677890123456", "<s:tkkkety>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{1.12345677890123456=tkkkety, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1.12345677890123456", "<s:tkkkety>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "0", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1.12345677890123456=tkkkety, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1.12345677890123456", "<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "0", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1.12345677890123456=-1, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1.12345677890123456", "<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "0", "true"}, {"org.apache.commons.collections.ExtendedProperties", "display", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1.12345677890123456=-1, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{",", "false"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String", ": "}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{",", "true"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String", ": "}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{": "}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "1", "-1"}, {"org.apache.commons.collections.ExtendedProperties", "getKeys", "java.lang.String", "8859_1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"abc", "-1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{".fno"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getKeys", "java.lang.String", "8859_1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{": ", "<null>"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", " => ", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{": null", "<s:b>"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", "5."}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", ".5", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{: null=b, key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{": null", "<s:b>"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", "5."}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", ".5", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{: null=b, key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{": null", "<s:b>"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", "5."}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", "2020-02-30T25:61:61"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", ".5", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{: null=b, key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{": null", "<s:4>"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", "5."}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", "2020-02-30T25:61:61"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", ".5", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{: null=4, key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{": null", "<s:4>"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", "5."}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", "2020-02-30T25:61:61"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", ".5", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{: null=4, key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"1.5f", "-1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "2020-02-30T25:61:61", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"<null>", "-1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "2020-02-30T25:61:61", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String"}, new String[]{"1.12345677890123456"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String"}, new String[]{"-01.5Btruee"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", "Hello, World"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String"}, new String[]{"-01.5Btruee"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", "Hello, World"}, {"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "}"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String"}, new String[]{"--1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "remove", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"=", "1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"=", "-1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1.5", "<s:tkkkety>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "display", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1.5=tkkkety, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1.5", "<s:tkklety>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "-1.5"}, {"org.apache.commons.collections.ExtendedProperties", "display", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1.5=tkklety, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "java.lang.Short"}, new String[]{"\n", "-32768"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-32768", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String"}, new String[]{"yes"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", ",", "<sample:1>"}, {"org.apache.commons.collections.ExtendedProperties", "setInclude", "java.lang.String", "PT1H"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String"}, new String[]{""}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", ",", "<sample:1>"}, {"org.apache.commons.collections.ExtendedProperties", "setInclude", "java.lang.String", "T1H"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "1.12345678901234567", "1"}}), new String[][]{{"keys", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 13, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", ",", "<sample:1>"}, {"org.apache.commons.collections.ExtendedProperties", "setInclude", "java.lang.String", "T1H"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "1.12345678901234567", "1"}}), new String[][]{{"keys", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 12, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", ",", "<sample:1>"}, {"org.apache.commons.collections.ExtendedProperties", "setInclude", "java.lang.String", "T1H"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "1.12345678901234567", "1"}}), new String[][]{{"keys", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 11, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", ",", "<sample:1>"}, {"org.apache.commons.collections.ExtendedProperties", "setInclude", "java.lang.String", "T1H"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "1.12345678901234567", "1"}}), new String[][]{{"keys", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"\t", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", ""}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", ".5", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"T", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", ""}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "1", "<s:tkklety>"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", ".5,", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1=tkklety, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{"}"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String", "--1"}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "i", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{i=1.5, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{" 1.5"}, false, 15, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "2020-01-01", "${"}, {"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<sample:1>", "<s:tkkkety>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1=tkkkety, key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{".5", "10"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{".5", "-10"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{".", "-522"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-522", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"", "-261"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-261", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"", "-262"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-262", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "\n"}, {"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"p", "2147483647"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "0"}, {"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:6>"}, {"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "0"}, {"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"abd", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:6>"}, {"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "0"}, {"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperty", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"false", "1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:6>"}, {"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "1.5"}, {"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "00"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"fakse", "1"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:6>"}, {"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "1.5"}, {"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "00"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "float"}, new String[]{"\t", "NaN"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", "1.12345678901234567"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "falsd1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,float", "8859_1", "0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,float", "8859_1", "0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,float", "8859_1", "-0.01"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String"}, new String[]{"true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "interpolate", "java.lang.String", "Title"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "interpolate", "java.lang.String", "Title"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{"java.lang.String"}, new String[]{"--1"}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false), new String[][]{{"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "1", "<s:>"}}), new String[][]{{"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1=, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"1", "-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"1", "-2147483639"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483639", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"2", "2147483647"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"2", "-2147483647"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"2", "-2147450879"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147450879", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String"}, new String[]{"\\"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "--1", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"1e10", "10"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"1e10", "10"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"1e10", "-10"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"1f10", "-2146435072"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2146435072", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", ",", "0"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", "->", "<null>"}}), new String[][]{{"hasNext", "", "0"}, {"next", "", "1"}, {"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", ",", "0"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", ".>", "<null>"}}), new String[][]{{"hasNext", "", "0"}, {"next", "", "1"}, {"next", "", "2"}, {"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "11234567890123456", "0"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", ".>>", "<null>"}}), new String[][]{{"hasNext", "", "0"}, {"next", "", "0"}, {"next", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "11234567890123456", "0"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", ".>>>", "<sample:3>"}}), new String[][]{{"hasNext", "", "0"}, {"next", "", "0"}, {"next", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "11234567890123456", "0"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", ".>>>", "<sample:0>"}}), new String[][]{{"hasNext", "", "0"}, {"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "11234567890123456", "0"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", ".>>>", "<sample:0>"}}), new String[][]{{"hasNext", "", "0"}, {"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "112345678901234565.", "17592186044416"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", ".>>>", "<sample:0>"}}), new String[][]{{"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "112345678901234565.", "17592186044416"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", ".>>>", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "1.12345677890123456", "<null>"}}), new String[][]{{"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "112345678901234565.", "17592186044416"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", ".>>>", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "1.12345677890123456", "<null>"}}), new String[][]{{"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", "\n"}, {"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, ], key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", "\n"}, {"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", "\n"}, {"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, 0], key1=[a, sample], key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{".5", "<sample:3>"}, false), new String[][]{{"keys", "", "4"}, {"nextElement", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"1.12345678", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"123456789012345678901234567890", "-1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"\\", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "display", ""}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", "include", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\\", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"->", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "display", ""}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", "include", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("->", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"->123456789012345678901234567890", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "display", ""}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", "include", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("->123456789012345678901234567890", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"+1", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", ".5", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"2147483648", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "1.1p345678901234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"21 743648", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "display", ""}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "8859_1}"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21 743648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"21 743648null", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "display", ""}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "8859_1}"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21 743648null", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"x\\", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "display", ""}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "8859_1}2020-01-01"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("x\\", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:3>"}, {"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:0>", "0x1F"}, {"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "-01.5Btruee"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"PT1H", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", "1e10"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "i", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream", "java.lang.String"}, new String[]{"<null>", "11234567890123456"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "${", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{"java.lang.String"}, new String[]{"8859_1"}, false), new String[][]{{"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"0xFFFFFFFF", "9223372036854775807"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"0xFFFFFFF", "6917529027641081855"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "-01.5Btruee"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6917529027641081855", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"3xFFFFFF F", "-9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "-01.5Btruee+1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"3xFFFFFF F1.12345678901234567", "-9223372036854775807"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "-01.5Btruee+1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"3xFFFFFF F1.12345678901234567", "-4611686018427387903"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "yes"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4611686018427387903", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"3xFFFFFF F1.12345678901234567", "-4611686018427391999"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "yes"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4611686018427391999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"3xAFFFFFF F1.12345678901234567", "-2305843009213695999"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "yes"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2305843009213695999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream", "java.lang.String"}, new String[]{"<sample:2>", "2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{"java.lang.String"}, new String[]{"1123467890123456"}, false), new String[][]{{"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{"java.lang.String"}, new String[]{""}, false), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"off", "-128"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "yes", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-128", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String"}, new String[]{"-01.5Btruee"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String", "java.util.List"}, new String[]{"1.12345678901234567", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String", "0xFFFFFFFF"}, {"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"1.5", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "1.12345677890123456", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"1.5", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "1.12345677890123456", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"1.5", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "-1"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "1.123456778901234456", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"1.5", "<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "-1"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "1.123456778901234456", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"1.5", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "-1"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "1.123456778901234456", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String", ""}}, 1), new String[][]{{"ensureCapacity", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"1.5", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "-1"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "1.123456778901234456", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String", ""}}, 1), new String[][]{{"ensureCapacity", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"1.5", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "-1"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "1.123456778901234456", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String", ""}}), new String[][]{{"ensureCapacity", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"11.5", "<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "-1"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "1.123456778901234456", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String", ""}}), new String[][]{{"ensureCapacity", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setInclude", new String[]{"java.lang.String"}, new String[]{": "}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", "true", "32767"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"10.5", "<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<sample:2>"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "null"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "1.12345677890123456", "<sample:0>"}}), new String[][]{{"ensureCapacity", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[0, 0], key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"10.5", "<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<sample:2>"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "null"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "1.12345677890123456", "<sample:0>"}}), new String[][]{{"ensureCapacity", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[0, 0], key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"10.51e10", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<sample:2>"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "null"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "1.12345677890123456", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[0, 0], key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"-1.5", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "=", ""}, {"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "1.5d="}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"-1.50xFFFFFFFF", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "=", ""}, {"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "1 .5d="}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.50xFFFFFFFF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"-1.50FFFFFFFF", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "=", ""}, {"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "1 .5d="}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1.50FFFFFFFF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "isInitialized", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "null"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "isInitialized", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "isInitialized", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "isInitialized", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "\r1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "isInitialized", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "\r1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "isInitialized", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "\r1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String"}, new String[]{"false"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "java.lang.Short"}, new String[]{"a,b,c", "1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "1.5d", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"*1", "-34"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "noo"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-34", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"*1", "-34"}, false, 15, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "non"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-34", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"*1", "-34"}, false, 15, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "non"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-34", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"*F1", "-68"}, false, 15, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "non"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-68", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"*F1", "68"}, false, 15, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "non1.5e300"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", "\n"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("68", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"*E1", "24"}, false, 15, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "non1.5e300"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", "\n"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("24", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"*E1", "12"}, false, 15, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "non1.5e300"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", "\n"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"*E1", "-562949953421300"}, false, 15, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "non1.5e300"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", "\n"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-562949953421300", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String"}, new String[]{"1?12345677801234561.12345678901234567"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String", "!=oa"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String", "a b"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String", "/"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "java.lang.Short"}, new String[]{"a,b,c", "2"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "i", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String"}, new String[]{"\\"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"1.12345678", "0"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<empty>", "off"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", ": ", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"a b", "false"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "TITLE"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"1.12345678", "0"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", ": ", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"1.12345677890123456", "-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"1.1234567890123456", "<empty>"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,java.lang.Byte", ".>>>", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"1.1234567890123456", "<empty>"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,java.lang.Byte", ".>>>", "0"}}), new String[][]{{"put", "java.lang.Object,java.lang.Object", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"1.1234567890123456", "<empty>"}, false, 15, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,java.lang.Byte", ".>>>", "0"}}), new String[][]{{"put", "java.lang.Object,java.lang.Object", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"1.1234567890123456", "<empty>"}, false, 14, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,java.lang.Byte", ".>>>", "0"}}), new String[][]{{"put", "java.lang.Object,java.lang.Object", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "subset", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String", "010"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
}
