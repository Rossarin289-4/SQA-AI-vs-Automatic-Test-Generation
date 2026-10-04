package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"+1", "0"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "off"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String"}, new String[]{"1,,23\n"}, false, 15, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,java.lang.Byte", "I", "-128"}, {"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "1", "123456789012345678901234567890"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,float", "Hello, World", "-1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"CTHT", "-4611686018427387905"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setInclude", "java.lang.String", "\\"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "Hello, World"}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", " => "}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4611686018427387905", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<null>", "a"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "}", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperty", new String[]{"java.lang.String"}, new String[]{"4W"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<sample:2>", "8859_1"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "pff", "-549755813888"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"no"}, false, 9, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", "}aHello, World", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:0>"}, true), new String[][]{{"display", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"}aHelln, World1.5d", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,java.lang.Long", ": ", "1"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "no"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("}aHelln, World1.5d", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String"}, new String[]{".5"}, false, 11, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String", "HTLE"}, {"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", ""}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,short", "false", "-1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{"PSxd"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "a", "3.4028235E38"}, {"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<empty>", "<null>"}, {"org.apache.commons.collections.ExtendedProperties", "display", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"-0.0", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "on"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "clearProperty", new String[]{"java.lang.String"}, new String[]{"yes"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "-", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "7"}, {"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", "4W"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{-=a, key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setInclude", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "yes"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<sample:3>", ""}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "8e59_1", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{8e59_1=true, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"file.separator", "${"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("${", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "--1", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String"}, new String[]{"I"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "I", "<s:u>"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", "}a b"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "-0.0", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{"X1.123451678901234567"}, false, 11, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "1.25"}, {"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "1", "<s:o>"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{1=o, key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream", "java.lang.String"}, new String[]{"<sample:1>", "}aHello, World"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setInclude", "java.lang.String", "0x1F"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "double"}, new String[]{"1{.1445678901234567PT1H", "-1.7976931348623157E308"}, false, 12, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "}aHello, W/orldd", "0"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String", "inlu9ee"}, {"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "null"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String", "0x1F"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"+1", "-21"}, false, 13, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "}}a b", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,java.lang.Double", "2147483648", "-1.0"}, {"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "}}a b"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-21", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, }}a b=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String"}, new String[]{"pff"}, false, 8, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "pff", "<s:}\\\\F3KdHHt;Gx<23a+,\\>"}, {"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "2020-03-3025:,6/1:10x223456789: "}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<sample:0>", "???nff[="}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "1M", "<s:}1\\\\93KdHHt7;Gx<23a+,\\>"}, {"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "0xFFFFFFFF", "-2147483648"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", "off"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{1M=[}1\\93KdHHt7;Gx<23a+, ,], key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String"}, new String[]{""}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "", "<s:}\\\\F3KdHHt;Gx<23a+,\\>"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", ",0//9."}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String", "22H342/--"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1e10", "<s:u>"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "5}=", "-9223372036854775808"}, {"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "1e10", "<i:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1e10=u, key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"", "-9223372036854775807"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "", "<i:35>"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", ",e", "false"}, {"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,java.lang.Double", "off", "-Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"", "-1"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "urue", "-1.0"}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "", "<s:oo>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setInclude", new String[]{"java.lang.String"}, new String[]{"PPPEEET"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "0xFFFFFFFF", "<i:50>"}, {"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "0xFFFFFFFF"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "urue"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{0xFFFFFFFF=50, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String"}, new String[]{"."}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "W", "true"}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", ".", "<i:1>"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "false", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{"of"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "8859_1"}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "i", "<s:fKeI,\\_>"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", "i"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{i=[fKeI, \\_], key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"ac", "0"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "0x123456789", "true"}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "ac", "<s:}\\F3KdHHt;Gx<23+3+,.\\>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInclude", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setInclude", "java.lang.String", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String"}, new String[]{"010"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "010", "<s:s_&\010I,\\>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"on", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getKeys", "java.lang.String", "1.1234567"}, {"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "on", "<sample:1>"}, {"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"-0//.0", "-105"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "-0//.0", "<s:>"}, {"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{": ", "-1"}, false, 10, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:3>"}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", ": ", "<i:35>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("35", String.valueOf(actual));
  assertEquals("receiver state after the call", "{: =35, key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "1e10", "<s:u>"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String", "1e10"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", "inclun9de", "-9"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{1e10=false, key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1-5", "-0//.0"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "qf_cf", "<s:}\\\\F3KdHHt;Gx<23a+,\\>"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String", "qf_cf"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0//.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, qf_cf=[}\\F3KdHHt;Gx<23a+, ,]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "", "<i:-1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "subset", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "-1.5", "<s:_KeI%\n,\\>"}, {"org.apache.commons.collections.ExtendedProperties", "getKeys", "java.lang.String", "2020-02-30T25:61:61"}, {"org.apache.commons.collections.ExtendedProperties", "interpolate", "java.lang.String", "5}="}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{1.5=[_KeI%, ,]}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{-1.5=[_KeI%, ,], key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperty", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", "5}=", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=a, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{""}, false, 11, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "", "<s:_+,KxtpofJ%\n},\\>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("_+", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=[_+, KxtpofJ%\n}, ,], key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{"-,1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "-,1", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-,1=, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String", "."}, {"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", ":\"1-0.0", "<s:t_&\010I,\\\\>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{:\"1-0.0=[t_&\010I, \\], key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInclude", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "", "<s:b>"}, {"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "", "-0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("include", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=b, key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "subset", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<sample:2>", "_Title"}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "", "<s:b>"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String", "2020-02-3025:61:10x123456789"}}, 3), new String[][]{{"getVector", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{=b, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1.1234567890123456", "<s:e,:>"}, false, 15, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "1.1234567890123456", "<i:35>"}, {"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "0x123446789"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", "s", "32767"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{1.1234567890123456=[e, :], key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String", "java.util.List"}, new String[]{":!1", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "1.1234567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String", "java.util.List"}, new String[]{":!1", "<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "1.1234567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String", "java.util.List"}, new String[]{":!1", "<sample:2>"}, false, 12, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "1.1234567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String", "java.util.List"}, new String[]{":\"1-0.0}", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "1.5f"}, {"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "1.1234567"}}, 1), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String", "java.util.List"}, new String[]{":\"1-0.0}", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "1.5f"}, {"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "1.1234567"}}, 1), new String[][]{{"isEmpty", "", "5"}, {"indexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"1", "32767"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<sample:3>", "PT1H"}, {"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "pf_1f"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("32767", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"1", "16383"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<sample:3>", "PT1H-1"}, {"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "pf_1f"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("16383", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"1", "32766"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<sample:3>", "PT1H-1"}, {"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "pf_1f"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("32766", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"A", "-32767"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<sample:5>", "PT1H-1"}, {"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "pf_0f"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-32767", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"0xFFFFFFFF", "<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "1L"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{0xFFFFFFFF=-1, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"0xFFFEFFFF", "<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "1L"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{0xFFFEFFFF=-1, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"0xFFFEFFFF", "<i:-2>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "1L"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{0xFFFEFFFF=-2, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"xFFEFFFF", "<i:-2>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "1L_"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, xFFEFFFF=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"xFFEGFFF", "<i:-2>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "1L_"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, xFFEGFFF=-2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1", "<i:35>"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,java.lang.Long", "1E-5", "-1"}, {"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "\t"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{1=35, key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"", "<i:35>"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,java.lang.Long", "1E-5", "-1"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", "2147483648"}, {"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "\t"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{=35, key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "java.lang.Double"}, new String[]{"-0.0", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "2020-02-30T25:61:61", "-0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"", "<s:u>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", " "}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "inclun9de", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{=u, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"", "<s:u>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", " "}, {"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "1L"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "inclun9de", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{=u, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"", "<s:P>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", "9"}, {"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "1M"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "inclun9de", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{=P, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{",1.55", "<null>"}, false, 9, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "-1.5", "true"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,java.lang.Long", "a b", "-562949953421311"}}, 1), new String[][]{{"get", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"123456789012345678901234567890", "<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", "PTH"}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "010", "<b:true>"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "12:30:45", "-1.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{010=true, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "true", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "true", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "true", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "true", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "true", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "java.lang.Short"}, new String[]{"Hello, Wor", "0"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "1.5f", "127"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String"}, new String[]{"of"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String", "L"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", "1.5fa b", "32767"}}, 3), new String[][]{{"get", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String"}, new String[]{"a,b,\t\t"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", ",0.0", "3.4028235E38"}, {"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "1", "123456789012345678901234567890"}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "file.separator", "<s:b>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{": 1", "-9223372036854775808"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "inclun9de"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "TITLE", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{": 1", "-9223372036853727232"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "inclun9de"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "TITLE", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036853727232", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"", "9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "pf1f"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "TITLE", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"", "9223372036854775807"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "pf1f"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "TITLE", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"", "4611686018427387897"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "pf1f"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "1e10", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686018427387897", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String"}, new String[]{"inclun9de"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<sample:0>", "a"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "}", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "010", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<sample:3>", "aHello, World"}, false, 13, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "}", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "010", "<null>"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,java.lang.Byte", "8859_1", "-1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<sample:2>", "EE\n"}, false, 13, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", "->"}, {"org.apache.commons.collections.ExtendedProperties", "interpolateHelper", "java.lang.String,java.util.List", "Hello, World", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", "on"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String"}, new String[]{"1/1234567890123456"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String", "pf1f"}, {"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", "->"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "yWs", "true"}}, 2), new String[][]{{"trimToSize", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String"}, new String[]{"1/1\\234567890123456"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String", "pf31f"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "yWs", "true"}}, 2), new String[][]{{"trimToSize", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "java.lang.Float"}, new String[]{"SITLETitle", "-2.8"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "1.234567"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-2.8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "java.lang.Float"}, new String[]{"SITLETitle", "-2.8"}, false, 9, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "1.2345670"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-2.8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "java.lang.Float"}, new String[]{"SITLETitle", "-3.28"}, false, 9, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "1.2345670"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-3.28", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "java.lang.Float"}, new String[]{"SITLESitle", "0.22"}, false, 9, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "1.2345670"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.22", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"cHello, World"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "off", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "15"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"cHello, World"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "off", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "15"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{";", "14"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "123456789012345678L901234567890"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{" => ", "-2147483648"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"1/22345678", "-128"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-128", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"1/223455678", "-128"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:6>"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,float", "0", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-128", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"1/223455678", "-75"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:6>"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,float", "0", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-75", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"1/223455678", "-57"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:6>"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,float", "0", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-57", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"1/223455678", "57"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,float", "0", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("57", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String"}, new String[]{"inclun9de"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String"}, new String[]{"1,,23\n"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", "false"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String", "Hello, Wo8rld"}}, 1), new String[][]{{"listIterator", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String"}, new String[]{"PT76"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "-0//.0"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "\n", "-1"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String", "+1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"1.12345678", "-1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", "PT5."}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"1.12345678", "-36028797018963969"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", "PT5."}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-36028797018963969", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{key0=, key1=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{key0=sample, key1=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:10>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:10>"}, true, 0, null, 3), new String[][]{{"getFloat", "java.lang.String,java.lang.Float", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setInclude", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,float", "file.separator", "1.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setInclude", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,float", "file.separator", "1.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setInclude", new String[]{"java.lang.String"}, new String[]{"12:30:5"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,float", "file.sepasator", "1.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"inclun8de", "of"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "2147483648", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "0x123456P789"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("of", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"inclun8de", ""}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "2147483648", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "0x123456P789"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"inclun8de", "4"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "2147483648", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "0x123456P789"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "Title", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String", "java.util.List"}, new String[]{": ", "<null>"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String", "java.util.List"}, new String[]{": 1", "<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String", "java.util.List"}, new String[]{": 1", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String", "java.util.List"}, new String[]{": 1", "<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "1.1234567"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String", "java.util.List"}, new String[]{": 1", "<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "1.1234567"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String", "java.util.List"}, new String[]{":\"1", "<sample:1>"}, false, 12, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "1.1234567"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String", "java.util.List"}, new String[]{":\"1-0.0", "<empty>"}, false, 13, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "1.1234567"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String", "java.util.List"}, new String[]{":\"1-0.0", "<null>"}, false, 13, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "1.5f"}, {"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "1.1234567"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String", "java.util.List"}, new String[]{":\"1-0.0", "<null>"}, false, 13, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "1.5f"}, {"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "1.1234567"}}), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String", "java.util.List"}, new String[]{":\"1-0.0}", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "1.5f"}, {"org.apache.commons.collections.ExtendedProperties", "getInclude", ""}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "1.1234567"}}), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"+1", "0"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "pff"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"+1", "-14"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "pf1f"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"+1", "1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "pf1f"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"+1", "1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<sample:0>", "PT1H"}, {"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "pf1f"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"+1", "-8"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<sample:0>", "PT1H"}, {"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "pf1f"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"+1", "1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<sample:3>", "PT1H"}, {"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "pf1f"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"1", "32767"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<sample:3>", "PT1H"}, {"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "pf_1f"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("32767", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"21/12345678", "-1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "qf_0f"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "TITLE", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"includ=", "-2"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "qf_cf"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "include", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"i", "-2"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "qf_cf"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String", ": 1"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "include", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"1.25", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"1.25", "2147483647"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"1.26", "10"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"1.>262020-01-01", "0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"1.12345678", "0"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "display", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"1.12345678", "-1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "display", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"1.1234n678", "20"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"1.1234n678", "-16"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"1.1234n678", "-32"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"include", "16"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"include", "16"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "1.5d", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"include", "16"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "1.5d", "abc"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "java.lang.Float"}, new String[]{"file.separator", "-1.0"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", "file.separator", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"0xFFFFFFFF", "<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "1L"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{0xFFFFFFFF=-1, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"pf f", "<b:false>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,java.lang.Long", "1E-5", "-1"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", "0xFFFFFFFF"}, {"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "\t"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, pf f=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"pf f", "<b:false>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,java.lang.Long", "1E-5", "-1"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", "0xFFFFFFFF"}, {"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "\t"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, pf f=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"010", "include"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "\n", "false"}, {"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", "1.5f"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("include", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"file.separator", "inclu9de"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "\n", "false"}, {"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", "1.5f"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("inclu9de", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"file.separator", "inclu9de"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "\n", "false"}, {"org.apache.commons.collections.ExtendedProperties", "getKeys", "java.lang.String", "\\"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("inclu9de", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"file.separator", "Hello, World"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "\n", "true"}, {"org.apache.commons.collections.ExtendedProperties", "getKeys", "java.lang.String", "\\"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"file.teparator", "Hel6lo, World"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hel6lo, World", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"PT1H", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", " "}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "inclu9de", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{PT1H=, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"PT", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", " "}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "inclu9de", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{PT=, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"PPT", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", " "}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "inclu9de", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{PPT=, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"PQT", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", " "}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "inclu9de", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{PQT=, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"PT5.", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", " "}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "inclu9de", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{PT5.=, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"PT5.", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "${"}, {"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", " "}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "inclu9de", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{PT5.=, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"--1", "false"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", "${"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"include", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"inc}ude", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"in}ude", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"PT1H", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT1H", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{",1.55", "<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "-1.5", "true"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,java.lang.Long", "0.5e300", "-1"}}), new String[][]{{"get", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"123456789012345678901234567890", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"123456789012345678901234567890", "<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "010", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{010=true, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"2020-02-30T25:61:61", "-1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", "OTH"}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "010", "<b:true>"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "12:30:45", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{010=true, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"2020-02-30T25:62:61", "511"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", "OTH"}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "010", "<b:true>"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "12:30:45", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("511", String.valueOf(actual));
  assertEquals("receiver state after the call", "{010=true, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"2020-02-30T25:62:61", "511"}, false, 11, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", "OTH"}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "010", "<b:true>"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "12:30:45", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("511", String.valueOf(actual));
  assertEquals("receiver state after the call", "{010=true, key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"2021-02-30T25:61:61", "-511"}, false, 11, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", "OTH"}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "010", "<b:true>"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "12:30:45", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-511", String.valueOf(actual));
  assertEquals("receiver state after the call", "{010=true, key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"2021-02-30T25:61:61", "509"}, false, 11, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", "OTH"}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "010", "<b:true>"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "12:30:45", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("509", String.valueOf(actual));
  assertEquals("receiver state after the call", "{010=true, key0=sample, key1=, key2=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"2021-02-30T25:61:61", "-511"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", "OTH"}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "010", "<b:true>"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "12:30:45", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-511", String.valueOf(actual));
  assertEquals("receiver state after the call", "{010=true, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"2021-02-30T25:61:61", "-511"}, false, 8, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", "OTH"}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "010", "<b:true>"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "12:30:45", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-511", String.valueOf(actual));
  assertEquals("receiver state after the call", "{010=true, key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"2021-02-30T25:61:61", "-456"}, false, 8, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", "OTH"}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "010", "<b:true>"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "12:30:45", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-456", String.valueOf(actual));
  assertEquals("receiver state after the call", "{010=true, key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"1e10", "127"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"2021-02-30Tr5:61:61TITLE", "456"}, false, 8, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "010", "<b:false>"}, {"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "abc", "<d:1.5>"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("456", String.valueOf(actual));
  assertEquals("receiver state after the call", "{010=false, abc=1.5, key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"2021-02-30Tr5:61:61TITLEfalse", "912"}, false, 8, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "010", "<b:false>"}, {"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "abc", "<d:1.5>"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("912", String.valueOf(actual));
  assertEquals("receiver state after the call", "{010=false, abc=1.5, key0=, key1=a, key2=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{key0=sample}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"=", "-32768"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-32768", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"=", "-32767"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-32767", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "true", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "true", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "true", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "java.lang.Short"}, new String[]{"Hello, World", "0"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "1.5f", "127"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInclude", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("include", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String"}, new String[]{"pff"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,short", "0", "-2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String"}, new String[]{"pf"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,short", "", "-2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String", "java.util.List"}, new String[]{"0x123456789", "<empty>"}, false), new String[][]{{"trimToSize", "", "2"}, {"add", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String"}, new String[]{"pf"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,short", "", "-2"}}), new String[][]{{"removeAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String"}, new String[]{"of"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,short", "", "-1"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String", "1L"}}), new String[][]{{"removeAll", "java.util.Collection", "2"}, {"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String"}, new String[]{"of"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,short", "", "-1"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String", "1L"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", "1.5f", "32767"}}), new String[][]{{"removeAll", "java.util.Collection", "2"}, {"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String"}, new String[]{"of"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,short", "", "-1"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String", "1L"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", "1.5f", "32767"}}), new String[][]{{"get", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"of", "-9223372036854775808"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", "1.1234567890123456"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1.12345678901234567", "<i:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{1.12345678901234567=2, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{": 1123456789012345678:01234567890", "-9223372036853727232"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "inclun9de"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "TITLE", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036853727232", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{": 1123456789012345678:01234567890", "-4611686018426863616"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "inclun9de"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "TITLE", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4611686018426863616", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{": 1123", "9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "inclun9de"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "TITLE", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"", "4611686018427387897"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "pf1f"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "1e10", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686018427387897", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"C", "4611686018427387905"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setInclude", "java.lang.String", "pf1f"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686018427387905", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"C", "4611686018427387905"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setInclude", "java.lang.String", "pf1f"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686018427387905", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"\nTHT ", "4611686018427386881"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setInclude", "java.lang.String", "-1.5"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "1"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String", "i"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686018427386881", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "java.lang.Double"}, new String[]{"5.", "-1.7976931348623157E308"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "java.lang.Double"}, new String[]{"55", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "123456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "123456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "1233456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "1233456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String"}, new String[]{"nclun9de"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String"}, new String[]{"8e59_1"}, false, 13, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "\\"}, {"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", ""}, {"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"1.25", "127"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<empty>", "a"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "}", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<sample:3>", "aHello, World"}, false, 13, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "|", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,java.lang.Byte", "8", "-1"}, {"org.apache.commons.collections.ExtendedProperties", "interpolateHelper", "java.lang.String,java.util.List", "Hello, World", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{"Title"}, false);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{"-1.5", "false"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "include", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{"-1.5", "true"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "include", "0"}, {"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "qf_tcf"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"-0.0", "2147483647"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"-0.0", "1073741823"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String", "int"}, new String[]{"-70.0", "1073741823"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:1>"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "1.5f", "4611686018427387905"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", "on"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", "on"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "yes", "true"}, {"org.apache.commons.collections.ExtendedProperties", "interpolate", "java.lang.String", "1.5f"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "yWs", "true"}, {"org.apache.commons.collections.ExtendedProperties", "interpolate", "java.lang.String", "1.5f"}}), new String[][]{{"lastIndexOf", "java.lang.Object,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"1.5"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "subset", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", "of", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String"}, new String[]{": "}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "java.lang.Float"}, new String[]{"TITLE", "1.0"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "1.1234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "java.lang.Float"}, new String[]{"SITLETitle", "-2.8"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "1.1234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-2.8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "Hell"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{": 1", "false"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", "1.5d"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 14, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "Hell"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String"}, new String[]{"12L"}, false, 15, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "Hfll"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String"}, new String[]{""}, false, 15, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "Hfll"}}), new String[][]{{"put", "java.lang.Object,java.lang.Object", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String"}, new String[]{"2F-5"}, false), new String[][]{{"keys", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "float"}, new String[]{"I", "3.4028235E38"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", "a", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("3.4028235E38", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "float"}, new String[]{"I", "3.4028235E38"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", "a1.1234567", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("3.4028235E38", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{key0=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{key0=, key1=a}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String", "java.util.List"}, new String[]{",", "<empty>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String", "java.util.List"}, new String[]{"", "<sample:3>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "1.5d", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"s"}, false, 10, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "1.5f"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{": "}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "1.5f"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "15f"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{"a", "10"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "java.lang.Integer"}, new String[]{";", "14"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "123456789012345678L901234567890"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{": ", "1.25"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{": ", " => "}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" => ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"123456789012345678901234567890", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "1", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{123456789012345678901234567890=, 1=1, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"<null>", "<s:,X>"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "->>", "<d:1.5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"-0//.0", "<s:e,;>"}, false, 12, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String", "_Title"}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "->>", "<d:1.5>"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "\n", "3.4028235E38"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{-0//.0=[e, ;], ->>=1.5, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "isInitialized", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "\n", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"1.5d", "-1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "yes"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"1.5d", "-1"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "yes"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"of", "-1"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"of", "<null>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"1/22345678", "1"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"1/22345678", "127"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"1/22345678", "-128"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-128", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"1/223455678", "57"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String", ".5"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,float", "0", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("57", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"1/223455678", "-127"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String", ".5"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,float", "0", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String"}, new String[]{"h"}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String"}, new String[]{"h"}, false, 9, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String"}, new String[]{"h"}, false, 9, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:1>"}}), new String[][]{{"addAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:5>"}}), new String[][]{{"addAll", "java.util.Collection", "5"}, {"trimToSize", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:5>"}}), new String[][]{{"addAll", "java.util.Collection", "1"}, {"trimToSize", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String"}, new String[]{"Ess"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:7>"}, {"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<sample:3>", "."}}), new String[][]{{"addAll", "java.util.Collection", "0"}, {"listIterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "float"}, new String[]{"-0.0", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String", "Hello, World"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "010"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"1L", "-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "float"}, new String[]{"4.", "-Infinity"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String", "He;llo, "}, {"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,java.lang.Double", "I", "<null>"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "01o"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "float"}, new String[]{"4", "-Infinity"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,java.lang.Double", "HI", "1.7976931348623157E308"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "01o"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "float"}, new String[]{"${1.12335678901234567", "Infinity"}, false, 10, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,java.lang.Double", "HF", "Infinity"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "01o"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "float"}, new String[]{"${1.12335578901234567", "Infinity"}, false, 10, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,java.lang.Double", "HF", "Infinity"}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "false", "<i:35>"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "01o"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{false=35, key0=0, key1=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String"}, new String[]{"\\"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:10>"}, true), new String[][]{{"getFloat", "java.lang.String,java.lang.Float", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:0>"}, true), new String[][]{{"getFloat", "java.lang.String,java.lang.Float", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setInclude", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "interpolate", "java.lang.String", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setInclude", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "interpolate", "java.lang.String", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.5e300", "no"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", ".", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("no", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"no", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
}
