package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"a``)", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "0101.12345678", "-88"}, {"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "\t"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", "-1"}}, 2), new String[][]{{"entrySet", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$SynchronizedSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:3>", "0"}, {"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<s:>", "<i:-2147483648>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "Hello, World", "<s:b>"}, {"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "1e10", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1e10=1, Hello, World=b, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setInclude", "java.lang.String", "I"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "1.5f", "-2"}, {"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "isInitialized", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<null>", "2020-02-30T25:61:61"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"yes"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,java.lang.Long", "i", "0"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "=", "127"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<sample:0>", "a`+"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<s:b>", "<i:-2147483648>"}, {"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{b=-2147483648, key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInclude", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,java.lang.Byte", ".5", "127"}, {"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "8858_1"}, {"org.apache.commons.collections.ExtendedProperties", "interpolate", "java.lang.String", "${"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("include", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String"}, new String[]{"${"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "${", "<b:true>"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", ".", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:0>"}, true, 0, null, 3), new String[][]{{"getVector", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,float", "-1", "Infinity"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "12345678901234567890123456789l"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"\t", "<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "\n", "<null>"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "1E-5", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"falr=e", "-2147483615"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,java.lang.Double", "PT1H", "<null>"}, {"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<sample:1>"}, {"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483615", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=[sample, 0], key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "clearProperty", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "`*po$50", "<sample:3>"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "es", "16777226"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "13:30:45", "-9223372036854775808"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String"}, new String[]{"P2010/02-no"}, false, 10, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String", "TITLE"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,short", "1.12345678901234567", "-1"}, {"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<sample:1>", "8859_1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{"123456889012345678901234567890"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "on"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", "123456789012345678901234567890", "<sample:2>"}, {"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String"}, new String[]{"3108477A8="}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:1>", "\n"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String", "12345678901234567890123456789l"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "a b"}}, 2), new String[][]{{"add", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"", "2147483622"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<sample:0>", "<s:\\key>"}, {"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:3>", "$F"}, {"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "20220-01-01", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483622", String.valueOf(actual));
  assertEquals("receiver state after the call", "{a=\\key, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<sample:3>", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "off"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"null", "127"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "null", "<d:1.5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"no"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"412234656791132.1234f567", "10"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setInclude", "java.lang.String", "<null>"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "${", "0"}, {"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,java.lang.Double", "$X", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "subset", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "display", ""}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,short", "#{", "0"}}, 3), new String[][]{{"getString", "java.lang.String", "0"}, {"load", "java.io.InputStream,java.lang.String", "7"}, {"getInt", "java.lang.String,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String", ":\037="}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String", "false"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", "1e10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"3xG>221-01-0", "je0"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "1E-5", "<i:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String", "P1H,"}, {"org.apache.commons.collections.ExtendedProperties", "getKeys", "java.lang.String", "}"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("je0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1E-5=0, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{"12:t030:;6"}, false, 16, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setInclude", "java.lang.String", ""}, {"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream", "<sample:2>"}, {"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "-0.0", "0.29999999999999993"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String"}, new String[]{"\037>?E"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "F"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "nuamTITLE", "2146959359"}, {"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "\037>?E", "<i:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:1>"}, true, 0, null, 2), new String[][]{{"addProperty", "java.lang.String,java.lang.Object", "6"}, {"getVector", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String"}, new String[]{"5.np\t}"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "TITLE", "<s:b>"}, {"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", "TITLE"}}, 3), new String[][]{{"elements", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{TITLE=b, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"-1", "-1"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "00l"}, {"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<i:-1>", "<s:key>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String"}, new String[]{"x"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream", "<sample:10>"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "file.separatornull", "-0.338"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", "0", "-32768"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<i:0>", "<i:-1>"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "1e10", "true"}, {"org.apache.commons.collections.ExtendedProperties", "setInclude", "java.lang.String", "\\{"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"1", "false"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<i:1>", "<s:key>"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "1.12345678:01234567"}, {"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1=false, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<s:>", "<sample:1>"}, {"org.apache.commons.collections.ExtendedProperties", "setInclude", "java.lang.String", "1.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<sample:2>", "90120::61.1234567P1.D5f"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<i:1>", "<s:@/Ldy],U\\>"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", ": ", "<sample:5>"}, {"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", "F"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{1=[@/Ldy], U,], key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{"->"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "2", "3.6"}, {"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "->", "<s:b>"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{->=b, key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "java.lang.Double"}, new String[]{"1.5f", "1.0"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "1.5f", "<s:>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"1", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "1", "<s:@/dy],\\>"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,java.lang.Byte", "20200-02-30T2", "127"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "java.lang.Float"}, new String[]{"2020-02-30,25:61;6", "Infinity"}, false, 12, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "2020-02-30,25:61;6", "<s:@/Ldy],U\\>"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,short", ": ", "32767"}, {"org.apache.commons.collections.ExtendedProperties", "interpolateHelper", "java.lang.String,java.util.List", "123456789012345678901234567890", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "a,b,c", "<s:>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"5", "0"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", ""}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "5", "<s:b>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<s:=],\\key>"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<s:>", "<s:nB]6,T\\\\>"}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "412234656791132.1234f567"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[nB]6, T\\, =], \\key]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{=[nB]6, T\\, =], \\key], key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<d:1.5>"}, false, 12, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<sample:1>", "<s:@/dy],\\>"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", "1", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1=[@/dy], ,], =1.5, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"", "-8796093022149"}, false, 14, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", "1.12B2567"}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "", "<s:>],\\key>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"a", "-2147483648"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<sample:0>", "<i:-10>"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,java.lang.Byte", "2020-02-30T25:61:61", "0"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "20220-01-01", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{a=-10, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", ""}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,short", "$F", "0"}, {"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<s:>", "<s:>d],\\{ezl\r>"}, {"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">d]", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=[>d], \\{ezl], key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String"}, new String[]{"aa"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "-1.5"}, {"org.apache.commons.collections.ExtendedProperties", "interpolate", "java.lang.String", "off"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String"}, new String[]{"a`+"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "0xFFFFFFFF"}, {"org.apache.commons.collections.ExtendedProperties", "interpolate", "java.lang.String", "off"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"/", "0"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<s:key>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String"}, new String[]{"2147473648="}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "13:30:45", "-29"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String"}, new String[]{"217473648<"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "123456789012345678901234567890"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "13:30:45", "-29"}, {"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String"}, new String[]{"6217473648<"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "123456789012345678901234567890"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "13:3s:45", "-29"}, {"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "1"}}, 1), new String[][]{{"putIfAbsent", "java.lang.Object,java.lang.Object", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"2.1234567", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "1.5f", "<empty>"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", ",", "-32768"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"2.12341567", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "i", "<sample:3>"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "1.5f", "<empty>"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", ",", "-32768"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"2.12341567", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "1-5f", "<empty>"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", ",", "-32768"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"2121-01-01", "2147483637"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483637", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "java.lang.Short"}, new String[]{"12345678901234-5678901234467890", "0"}, false, 12, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", "2147473648="}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", "i", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{"1", "true"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "a9", "yes"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{"1", "true"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "a9", "yes"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{"u", "false"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "remove", new String[]{"java.lang.Object"}, new String[]{"<i:17>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String", "PT1H"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "remove", new String[]{"java.lang.Object"}, new String[]{"<i:17>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String"}, new String[]{"9abc"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", "i"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "subset", new String[]{"java.lang.String"}, new String[]{"T3ITLE"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "Title"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "a*"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "subset", new String[]{"java.lang.String"}, new String[]{"T3ITLE"}, false, 10, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "Title"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "a*"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String"}, new String[]{"file.separator: "}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:2>", "2020-02-30T25:61:61"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"12.5d: 0x123456789", "<empty>"}, false, 12, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<s:6a>"}}, 2), new String[][]{{"get", "java.lang.Object", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"12.5d: 0x123456789", "<empty>"}, false, 12, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<s:6a>"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "1.5e300", "Infinity"}}, 1), new String[][]{{"get", "java.lang.Object", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"a`+", "<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "010", "-128"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"a`+", "<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "0101.12345678", "-128"}}, 2), new String[][]{{"entrySet", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$SynchronizedSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"a`*", "<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "0101.12345678", "-88"}}, 2), new String[][]{{"entrySet", "", "7"}, {"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"a`*", "<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "0101.12345678", "-88"}, {"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "\t"}}, 2), new String[][]{{"entrySet", "", "7"}, {"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"a``)", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "0101.12345678", "-88"}, {"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "\t"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", "-1"}}, 2), new String[][]{{"entrySet", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$SynchronizedSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "8859_1", "9223372036854775807"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String"}, new String[]{"2020-02-30,25:61;6"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String"}, new String[]{""}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "t123355789"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String"}, new String[]{"123456888022345678901234567890"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream", "<sample:2>"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "null"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{key0=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:6>"}, true, 0, null, 1), new String[][]{{"getProperty", "java.lang.String", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{key0=, key1=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{"Hello, Worle"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "0101.12345678"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{"Hello, Worle"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{"Hdll-"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "file.separator"}, {"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{"Hdll-"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "file.separator"}, {"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, a], key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"a b", "127"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"a b", "-128"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-128", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String", "abc"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "double"}, new String[]{"+1", "0.0"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "0", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "double"}, new String[]{"1", "3.7"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "0x123456789", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, a], key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a, a], key1=[0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a, 0], key1=[0, sample], key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a, ], key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "interpolateHelper", "java.lang.String,java.util.List", "0x1F", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a, 0], key1=[0, sample], key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{"2XX020.L02{30,15:61;I"}, false, 15, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:0>", "1E-<"}, {"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", "Title"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"->", "-1073741824"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "a6*", "127"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741824", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"->", "2147483647"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"->", "2147483647"}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "0{/", "1"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "123456889012345678901234567890", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "0{/", "1"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "123456889012345678901234567890", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "0{/", "1"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "123456889012345678901234567890", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "0z/", "1"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "123456889012345678901234567890", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "04{/", "1"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "1234,688901234578901234567890", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"1.1234567890123456", "-128"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "2020-02-30,25:61;6", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-128", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String"}, new String[]{"yrue"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", " => "}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{"false", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String"}, new String[]{"21474736A8="}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String"}, new String[]{"38"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,java.lang.Byte", "yes", "<null>"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "t0xFFFFFFFF"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{" => "}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "I"}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "=", "<i:-2>"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,java.lang.Byte", ";yesn", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "1.5e300", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "1.5e300", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String"}, new String[]{"2147473648="}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "1.5e3;0", "false"}, {"org.apache.commons.collections.ExtendedProperties", "interpolate", "java.lang.String", "}"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String"}, new String[]{"21474736A8="}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "1.5e3;0", "false"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "-1.5"}, {"org.apache.commons.collections.ExtendedProperties", "interpolate", "java.lang.String", "}}"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String"}, new String[]{"a*"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "0"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "0xFFFFFFFF"}, {"org.apache.commons.collections.ExtendedProperties", "interpolate", "java.lang.String", "off"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "."}, {"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", ",", "<i:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{,=1, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", ".Hello, World"}, {"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", ",", "<i:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{,=1, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String"}, new String[]{"->"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", "0x1F", "-32768"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String"}, new String[]{"a`+"}, false, 15, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,java.lang.Long", "12:30:45", "-9223372036854775808"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String"}, new String[]{"a`+"}, false, 15, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "1.5e300"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,java.lang.Long", "13:30:45", "<null>"}, {"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", "abc"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"true", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", "a", "10"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"trueI", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"trueI", "<empty>"}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"trueI", "<empty>"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a,b,c", "1"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "1", "-3.4028235E38"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "float"}, new String[]{"0", "-1.0"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "}", "0"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", "\\", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "float"}, new String[]{"", "-0.1"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "}", "0"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-0.1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "float"}, new String[]{"", "-0.1"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", "", "1"}, {"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<s:b>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-0.1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{b=0, key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{".", "0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"/", "0"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"", "0"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,java.lang.Double", "i", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"", "0"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,java.lang.Double", "i", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"123456789012345678901234567890", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"", "9223372036854775807"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"123456889012345678901234567890", "4611686018427387903"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,java.lang.Double", "fals=e", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686018427387903", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"123456889012345678901234567890", "4611686018427387903"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,java.lang.Double", "fals=e", "Infinity"}, {"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686018427387903", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0, ], key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"}}", "4611686018427387903"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,java.lang.Double", "fals=e", "Infinity"}, {"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686018427387903", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[0, sample], key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "13:30:45", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream", "java.lang.String"}, new String[]{"<null>", "123456789012345678901234567890"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String", "-0.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<sample:2>", "a`+"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<sample:2>", "a`+"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"1.1234567", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "1.5f", "<empty>"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", ",", "-32768"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"2121-01-01", "2147483637"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483637", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"2121-01-", "2147483630"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483630", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "java.lang.Short"}, new String[]{"123456789012345678901234567890", "-1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setInclude", "java.lang.String", "1.12345678"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "java.lang.Short"}, new String[]{"123456789012345678901234567890", "32767"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("32767", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "java.lang.Short"}, new String[]{"12345678901234-5678901234467890", "0"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", "2147473648="}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "->", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"1E-5", "127"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "1.1234567", "-1"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,java.lang.Byte", "<null>", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"1E-5", "-128"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "1.1234567", "-1"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,java.lang.Byte", "<null>", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-128", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"1E-5", "127"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,java.lang.Byte", "<null>", "0"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String", "1"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "9abc", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"1E", "-127"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "9abc", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"1E", "-127"}, false, 11, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "9abc", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"1E", "-63"}, false, 11, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "9abc", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-63", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"1E", "-27"}, false, 11, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "9abc", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-27", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"0E", "69"}, false, 11, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "9abc", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("69", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"0E", "<null>"}, false, 11, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "9abc", "2147483647"}, {"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"B", "-127"}, false, 13, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "9abc", "2147483647"}, {"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "21474736A8=", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"B", "-127"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "9abc", "2147483647"}, {"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "21474736A8=", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"2020-02-30T2:61:61", "-127"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "9abc", "2147483647"}, {"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "21474736A8=", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{"-1", "true"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "a*", "yes"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "->", "-128"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "java.lang.Float"}, new String[]{": ", "0.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{"1", "true"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "a9", "yes"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"123456789012325678901234567890", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"}}", "<sample:1>"}, false), new String[][]{{"get", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"", "<sample:1>"}, false, 5, new String[][]{}), new String[][]{{"get", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"", "<null>"}, false, 5, new String[][]{}), new String[][]{{"get", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"", "<null>"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", "8859_1"}}), new String[][]{{"get", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "remove", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<null>", "a*"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<sample:6>", "a*on"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<null>", "13:330:45"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<sample:0>", "`*pn$4"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "1L", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"1.5e300", "-1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "clearProperty", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "include"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<null>", ".`*pn$4yes1.133425678901254567"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "0xFFFFFFFF", "-3.4028235E38"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String", "1L.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInclude", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("include", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "subset", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "a*"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "subset", new String[]{"java.lang.String"}, new String[]{"T3ITLE"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "a*"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String"}, new String[]{"file.separator"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:2>", "2020-02-30T25:61:61"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"0x123456789", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"0x123456789", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<s:a>"}}), new String[][]{{"stringPropertyNames", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[key0, key1, key2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"0E12", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<s:`>"}}), new String[][]{{"stringPropertyNames", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableSet", actual.getClass().getName());
  assertEquals("[key0, key1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"0E12", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<s:a>"}}), new String[][]{{"get", "java.lang.Object", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"a`+", "<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "010", "-128"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a b", "}}"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", "1.5e3;0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("}}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"9abc", "<b:true>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "I", "0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{9abc=true, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "float"}, new String[]{"-0.0", "0.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"off"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", ".", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("off", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"of"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", ".", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("of", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", ".", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"E"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", ".", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"9abc"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", ".", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9abc", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"9abbc"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", ".", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9abbc", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"on"}, false, 12, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", "abc"}, {"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", ".", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("on", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 12, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", "abc"}, {"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", ".", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"0Title"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0Title", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"01l0"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "1.5e3;0"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", "2020-02-30T25:61:610x1F", "32767"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("01l0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String"}, new String[]{"a`*"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String"}, new String[]{"${"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{key0=a, key1=0}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"\t", "9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "\n", "0x1F"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "remove", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String", "5."}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "remove", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "no"}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "1.5e300", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String", "t0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1.5e300=a, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "double"}, new String[]{"9abc", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", "\\", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, a], key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, sample]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a, a], key1=[0, 0]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a, ], key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"2147473648=", "0"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "Hello, World", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{"}}"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String", ": "}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{" =>\037"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String", ":\037="}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "0101.12345678"}, {"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<null>", "2147483648"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{"\037>?E"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<sample:2>"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String", ":\037="}, {"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:0>", "2020-02-30T25:61:610x1F"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a, 0], key1=[0, sample], key2=[sample, ]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{"java.lang.String"}, new String[]{"\n"}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{"2X020-02{30,15:61;6"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<sample:1>"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String", ":\037="}, {"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:3>", "1E-5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[a, a], key1=[0, 0], key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{"2X020-02{30,15:61;6"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<sample:1>"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String", ":\037="}, {"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:3>", "1E-5"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[0, a], key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "java.lang.Short"}, new String[]{".", "1"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{"2XX020.L02{30,15:61;6"}, false, 14, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String", ":\037<"}, {"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:3>", "1E-<"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"->", "2147483647"}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String"}, new String[]{"I"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"PT1H", "-32768"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-32768", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"a", "-88"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-88", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "", "false"}, {"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "010", "-1"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "123456889012345678901234567890", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "010", "1"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "123456889012345678901234567890", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "010", "1"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "123456889012345678901234567890", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "01/", "1"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "123456889012345678901234567890", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "0{/", "1"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "123456889012345678901234567890", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "double"}, new String[]{"TITLE", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "a`*", "<sample:2>"}, {"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", "`*pn$4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "double"}, new String[]{"TITLEa b", "-Infinity"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "a`*", "<sample:2>"}, {"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", "`*pn$4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "double"}, new String[]{"TITLEa b", "-Infinity"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "``*", "<sample:2>"}, {"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", "`*pn$4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "double"}, new String[]{"TITLda b", "-Infinity"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "``*", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"false", "-1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "1", "<i:-2147483648>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{1=-2147483648, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "--1", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "double"}, new String[]{"a`*", "Infinity"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "1.12345678901234567", "1.0"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "1.5", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "H", "885;9_1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setInclude", new String[]{"java.lang.String"}, new String[]{"fals=e"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", "+1"}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "2147473648="}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"2020-02-30T25:61:61", "-1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "-1.5", "-88"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"2020-02-20T25:61:61", "0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInclude", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("include", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInclude", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("include", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInclude", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("include", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInclude", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("include", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInclude", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("include", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInclude", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("include", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"1L", "0"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "a,b,c", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"", "10"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "->", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"", "10"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "->", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"2020-02-30T25:61:61", "10"}, false, 8, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getKeys", "java.lang.String", "1"}, {"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "->", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"2020-02-30T255:61:61", "10"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getKeys", "java.lang.String", "1"}, {"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "->", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"1p.5d", "1"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getKeys", "java.lang.String", "1"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "01l0", "-1"}, {"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"1p.5d", "1"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getKeys", "java.lang.String", "1"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "01l0", "-1"}, {"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"a`*", "-1"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "interpolate", "java.lang.String", "${"}, {"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,java.lang.Double", "2020-02-30T25:61:610x1F", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "interpolate", "java.lang.String", "abc"}, {"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "13:30:45"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<sample:1>", "<i:0>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "1.12345678901234567", "1.7976931348623157E308"}, {"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "\037>?E", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1=0, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "double"}, new String[]{"1.5d", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}, {"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:3>", "--1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1.5e3;0", "<b:true>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{1.5e3;0=true, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1.5e3;0", "<b:false>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{1.5e3;0=false, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{" ", "10"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "}"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{" ", "40"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "}"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{" ", "8388648"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "}"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8388648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{" ", "-8388648"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "1Ly"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-8388648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"!", "8388648"}, false, 11, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "1Lx"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "=", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8388648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"\036", "-2147483648"}, false, 12, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "1l0"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"\036", "-2147483648"}, false, 12, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", ""}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"\036", "10"}, false, 12, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "9abc"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"\036", "10"}, false, 13, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "9abc"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"\036", "10"}, false, 13, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "9abc"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"\036", "2147483647"}, false, 13, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "9aabc"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String"}, new String[]{"1.5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"", "1073741823"}, false, 11, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "9aabc"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"false", "-2147483648"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "9aabc"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "2020-02-30,25:61;6", "-128"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"fbblse", "-2147483647"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "9aabc"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "2020-02-30,25:61;6", "-128"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"fbblre+", "1"}, false, 8, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "2020-02-30,25:61;6", "-128"}, {"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", "THTLE"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
}
