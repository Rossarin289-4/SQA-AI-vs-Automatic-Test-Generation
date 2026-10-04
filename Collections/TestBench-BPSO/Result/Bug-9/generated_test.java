package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{"4", "false"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "interpolateHelper", "java.lang.String,java.util.List", "${{", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setInclude", "java.lang.String", "1.61e10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"PT1Hno", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "no"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"==", "127"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", "TITLDI", "-31"}, {"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "off"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream"}, new String[]{"<sample:9>"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "1.", "8.988465674311579E307"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String", "-0.0 => "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"no${", "<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,short", "8859_1=", "32767"}, {"org.apache.commons.collections.ExtendedProperties", "getKeys", "java.lang.String", "W,"}}), new String[][]{{"trimToSize", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "double"}, new String[]{"1.1234446l7->", "-4.9E-324"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String", "}"}, {"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", "12:30:45"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.9E-324", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String"}, new String[]{"6,f"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "fals1.5d", "2.5-0."}, {"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:3>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "=", "-62"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "2:30:45", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String"}, new String[]{"Titke"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "0x12"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String", "72:3/:45"}}), new String[][]{{"size", "", "6"}, {"listIterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{"j", "true"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "on"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "TITLDI", "<sample:1>"}, {"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:0>", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{TITLDI=1, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String"}, new String[]{"p"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "", "<s:a>"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String"}, new String[]{"1.12344356l7"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "20-0c1-01"}, {"org.apache.commons.collections.ExtendedProperties", "display", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setInclude", new String[]{"java.lang.String"}, new String[]{"file.separatorr"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<null>", "\t"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", "-3", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:2>"}, true, 0, null, 1), new String[][]{{"load", "java.io.InputStream,java.lang.String", "7"}, {"contains", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream", "java.lang.String"}, new String[]{"<sample:0>", "2.54.${"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "true"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String", "--"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<sample:2>"}, {"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", "onn"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, 0, a], key1=[sample, 0], key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "float"}, new String[]{"01X.5", "1.7014117E38"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<sample:2>"}, {"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:0>", "-> "}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.7014117E38", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[a, 0], key1=[0, sample], key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"Titlenou", "false"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String"}, new String[]{"off"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "interpolate", "java.lang.String", "2.53.${}"}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{=, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String", "fil.separator"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", "1-12345679901234562147483648"}}), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"nulli1.5d", "file.separator"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", "<"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("file.separator", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[, ]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String"}, new String[]{"2.63A${}"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "interpolateHelper", "java.lang.String,java.util.List", "2.53.${}", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"afile.separator", "0"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", "1-5d", "32767"}, {"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "yes"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "double"}, new String[]{"1K", "4.0"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", "1.12345{6789/124567"}, {"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "1K", "<s:>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String"}, new String[]{" a b"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setInclude", "java.lang.String", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<empty>"}, true), new String[][]{{"addProperty", "java.lang.String,java.lang.Object", "4"}, {"getByte", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "java.lang.Double"}, new String[]{"1E-5", "NaN"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "1E-5", "<b:true>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"888_1", "<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<empty>", "8859_1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "", "<s:key,>"}, {"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "1", "<b:true>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"tve", "<s:ke\\\\,y>"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", "falsBe", "<sample:5>"}, {"org.apache.commons.collections.ExtendedProperties", "display", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=, tve=[ke\\, y]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "", "<s:b>"}, {"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{"p1.123456789012345670xFFFFFFFF"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "", "<s:\\b>"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "", "false"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{=false, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "subset", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", ".7>"}}, 3), new String[][]{{"load", "java.io.InputStream", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{ey0=a, ey1=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<empty>", " =>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "file.separator1.12345678901234567123456789012345678901234567890", "<s:kHe\\\\\\,y>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{file.separator1.12345678901234567123456789012345678901234567890=kHe\\,y, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "java.lang.Short"}, new String[]{"", "-32768"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "", "<s:>"}, {"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "}", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInclude", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setInclude", "java.lang.String", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "1.12345678"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "Titleno", "<s:>"}, {"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<s:>", "<s:keyy,\\>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("keyy", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=[keyy, ,], Titleno=, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "", "<s:Ib>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=false, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "remove", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "12:30:45", "-9223372036854775808"}, {"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "true", "<i:22>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", "1D5"}, {"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<i:1>", "<i:-1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "float"}, new String[]{"", "1.7014117E38"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "", "<s:ke\\\\\\9,y>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:3>"}, true), new String[][]{{"addProperty", "java.lang.String,java.lang.Object", "0"}, {"getInteger", "java.lang.String,int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "subset", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<i:2>", "<s:-ke\\y>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{2=-ke\\y}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{2=-ke\\y, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:6>"}, true), new String[][]{{"addProperty", "java.lang.String,java.lang.Object", "0"}, {"getBoolean", "java.lang.String,java.lang.Boolean", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"", "127"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "", "<s:-kFe\\y>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String"}, new String[]{"-> "}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "TITLD", "-53"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", " =>", "-9223372036854775749"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"null", "0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "clearProperty", new String[]{"java.lang.String"}, new String[]{"-,"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,float", "1", "-2.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"5.1L", "127"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", "1.1234456l7", "32735"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{"java.lang.String"}, new String[]{"null"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "double"}, new String[]{"72:30:45", "-8.988465674311578E307"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.988465674311578E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String"}, new String[]{"1-25"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "=> ", "-1.7976931348623157E308"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"-1.o", "<i:-1>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{-1.o=-1, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{".>", "1025"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<b:true>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1025", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"5.1L", "<i:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<d:1.51>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{5.1L=1, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"itleno", "<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("itleno", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String"}, new String[]{"\t12:30:45"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"false", "-128"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-128", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "float"}, new String[]{"1E-5", "-0.047"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "-00", "3"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-0.047", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"1.1234567890123356", "<null>"}, false, 0, null, 3), new String[][]{{"indexOf", "java.lang.Object", "6"}, {"removeAllElements", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String"}, new String[]{",,5."}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{"c"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "7T1H", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"Bff7", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", "a,b,b.", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"12:3/:45on"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,float", "P5", "-Infinity"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{"n"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "1e1", "<sample:2>"}, {"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"file.separatr", "=="}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("==", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "-21D5", "-2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:ap>"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"", "false"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<empty>", "35"}}, 3), new String[][]{{"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "java.lang.Double"}, new String[]{"0", "0.0"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String", "1.1P234456l7"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{"^", "false"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "display", ""}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "abc"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "float"}, new String[]{": n", "NaN"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", "1E-5no"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream", "java.lang.String"}, new String[]{"<sample:0>", ".>ntll"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "1.g"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, ]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperty", new String[]{"java.lang.String"}, new String[]{"0.1234567790123456"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "1.123456678", "-9223372036854775749"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String"}, new String[]{",,,5.1L"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,java.lang.Byte", "1E-0", "0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"211:30:25", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:3>"}}, 1), new String[][]{{"copyInto", "java.lang.Object[]", "5"}, {"addElement", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[sample, 2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"220-01-01.5", "<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "aa b", "NaN"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", "}I"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("220-01-01.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"0ww1F", "<null>"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "include", "0.1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0ww1F", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "java.lang.Byte"}, new String[]{"ox3", "127"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", "1.61eD101.5d"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:>", "<s:key>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{=key, key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{": iclde", "<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "display", ""}}, 1), new String[][]{{"copyInto", "java.lang.Object[]", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"0f10", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", "-1.4", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "nclude", "22;30:25"}, {"org.apache.commons.collections.ExtendedProperties", "getKeys", "java.lang.String", "2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"", "<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<empty>"}}, 1), new String[][]{{"add", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String"}, new String[]{"72:30:451.12345670x123456789"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", "5.", "-32735"}}, 1), new String[][]{{"clone", "", "6"}, {"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "1.25"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", "2.25", "-16384"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "clearProperty", new String[]{"java.lang.String"}, new String[]{"..5e"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<sample:1>", "trud"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,java.lang.Byte", "include", "-128"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "java.lang.Double"}, new String[]{"1.5", "-8.98846567431158E307"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "}", "<sample:1>"}, {"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,java.lang.Double", "35", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.98846567431158E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream", "java.lang.String"}, new String[]{"<sample:3>", "123456789012345678901234567890"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<empty>", "14.123456789012345567"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"nnno", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "yes"}}, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"1.1e334567", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "1."}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.1e334567", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream", "java.lang.String"}, new String[]{"<sample:4>", "1.5f"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", "=x="}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "java.lang.Float"}, new String[]{"\t", "0.0"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:2>", "offa b"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"B", "false"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<s:>", "<s:>"}, {"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "1.12345678890123326", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{=, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"4", "<s:c>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{4=c, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "subset", new String[]{"java.lang.String"}, new String[]{"Titlenoyes+1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream", "<empty>"}, {"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "--1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"", "<sample:0>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"1-5", "1"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"1..12345678"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "y5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1..12345678", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"2..5f"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,boolean", "y0140", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2..5f", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"f", "<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "fal", "true"}}, 3), new String[][]{{"firstElement", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", ": -1.5", "-128"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "include55."}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream"}, new String[]{"<sample:12>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"iii"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,float", "of", "0.0"}, {"org.apache.commons.collections.ExtendedProperties", "getKeys", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("iii", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"88559_1", "<i:-35>"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", "}r", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{88559_1=-35, key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"nn1E-5"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,java.lang.Double", "Iinclude", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nn1E-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"Titleno1.5f"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Titleno1.5f", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{"$p", "false"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "indludP", "-1.7976931348623155E308"}, {"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "11.12345678901234577"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String"}, new String[]{"+"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getKeys", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{"java.lang.String"}, new String[]{"iindludP2020-01-01"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", "-"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setInclude", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "Hello, World", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{Hello, World=0, key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setInclude", new String[]{"java.lang.String"}, new String[]{","}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", ".>"}, {"org.apache.commons.collections.ExtendedProperties", "interpolateHelper", "java.lang.String,java.util.List", "include", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String"}, new String[]{"fals"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:6>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream", "java.lang.String"}, new String[]{"<sample:3>", "file.sep4arator8859_1"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String"}, new String[]{"2020-01-018859_1"}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"1.12345{6789/1234567", "<sample:1>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Properties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{".", "<s:a>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{.=a, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String"}, new String[]{"indlude"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"12:30;45", "Bf7"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Bf7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "135", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"0.5f", "<null>"}, false, 4, new String[][]{}), new String[][]{{"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "0"}, {"remove", "java.lang.Object", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperty", new String[]{"java.lang.String"}, new String[]{"ifals"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"TITLDHello, Worldfalse", "127"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"fals", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=[, ]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"1.1234456l7", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "11.12345678901234567", "<sample:3>"}}), new String[][]{{"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream", "java.lang.String"}, new String[]{"<sample:2>", "247483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream", "java.lang.String"}, new String[]{"<null>", "b"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"--1} => ", "-9223372036854775808"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample, a], key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{" 12:30:45", "true"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", ","}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{"Titleno", "false"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", ": include", "1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "save", new String[]{"java.io.OutputStream", "java.lang.String"}, new String[]{"<null>", "a,b,cinclude"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,short", "-1D5", "-64"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{"xes", "true"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "0E-5", "0.0"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String"}, new String[]{"b"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "y7s", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"3", "iAn"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:0>", "22:30:25"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("iAn", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{"2.5"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "1.1234567890123456", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream", "java.lang.String"}, new String[]{"<sample:0>", "\013"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<i:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"0w123456789", "false"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String", ".5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{"1/25"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", "1L", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"2B020-01-01", "<s:>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{2B020-01-01=, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "remove", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,java.lang.Byte", "8859_1", "2"}, {"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "}", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInclude", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<sample:2>", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("include", String.valueOf(actual));
  assertEquals("receiver state after the call", "{b=1.5, key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{".1", "Titleno"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream", "<sample:1>"}, {"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", "noX+1", "-32768"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Titleno", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream", "java.lang.String"}, new String[]{"<sample:0>", "8859_1="}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "Titleno"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"}H"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("}H", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "java.lang.Float"}, new String[]{"aP b", "-0.51"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String", "2020-01-01"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-0.51", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"1.5f", "-128"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,java.lang.Double", "00", "Infinity"}, {"org.apache.commons.collections.ExtendedProperties", "interpolateHelper", "java.lang.String,java.util.List", "TIT6LD\t", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-128", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"0C"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", "1E-5a b"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0C", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "indludP"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, ]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"i+1yes", "9223372036854775807"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{"a0.5"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"15d", "true"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<s:a>", "<s:ky>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{a=ky, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String"}, new String[]{"1-1234567990123456"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "020-01-01"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"--", "1.25Hello, World"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "22:30:25"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.25Hello, World", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:a2>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:1>", "<i:0>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,byte", "X,", "-128"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1=0, key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"nn", "-48"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "~", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-48", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"I,a b", "<sample:1>"}, false, 1, new String[][]{}), new String[][]{{"ensureCapacity", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "clearProperty", new String[]{"java.lang.String"}, new String[]{"Title${2020-01-01"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "double"}, new String[]{"859_1", "1.0"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", "1.12345678", "-27"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"11", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String", ","}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{11=1, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String"}, new String[]{"/.5"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,java.lang.Long", "i", "-1"}, {"org.apache.commons.collections.ExtendedProperties", "display", ""}}), new String[][]{{"ensureCapacity", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TITALEon", ""}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String", "i@n"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperty", new String[]{"java.lang.String"}, new String[]{"nu3ll"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "1.1234456l7", "1073741823"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"", "<empty>"}, false, 4, new String[][]{}), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String"}, new String[]{" >>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "1.5e300"}}), new String[][]{{"containsAll", "java.util.Collection", "0"}, {"get", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "1e10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[, a], key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream", "java.lang.String"}, new String[]{"<sample:2>", "1.i25\\"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "15u1234456l7", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{15u1234456l7=a, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"5."}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "2020-02-30T25:61:61", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5.", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{"t1L"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "0xFFFFFFFF"}, {"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String"}, new String[]{"u>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "010", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{010=b, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"2.55.${", "2"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String", "2L"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,java.lang.Long", "PTC1H{", "31"}}), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"-", "false"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "\r", "<s:7>"}, {"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String", ".> "}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{\r=7, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "isInitialized", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "p1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInclude", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("include", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String"}, new String[]{"trrue"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream", "java.lang.String"}, new String[]{"<sample:1>", "!!"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String", "faals"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"inc/lue"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String,java.lang.Byte", "1.C5", "-128"}, {"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String", "1E;-5a b"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1\\", "1..25I"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1..25I", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"12345678901234567{901234567890", "-2147483624"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<null>", "file.sfpasator"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483624", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"72:30:45", "63"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("63", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "double"}, new String[]{"2020-01-01=", "-4.494232837155789E307"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String", "u"}, {"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.494232837155789E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[, 0], key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"214=7483648", "37"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("37", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"a,c,c", "<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", ".:5", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"/", "<i:7>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<s:jy>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{/=7, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.1234577890123356", ": false1.5d"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:2>", "TIfTLD"}, {"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<s:.a>", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(": false1.5d", String.valueOf(actual));
  assertEquals("receiver state after the call", "{.a=-1, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "java.lang.Double"}, new String[]{"PU1H", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:2>", "1-:25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:5>"}, true), new String[][]{{"getByte", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{":!"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(":!", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"=", "<s:a8>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getKeys", "java.lang.String", "0xFFFFFFFG"}, {"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,java.lang.Double", "1.123456", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{==a8, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"00w113456789", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream", "<sample:1>"}, {"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:1>", ": "}}), new String[][]{{"elements", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "java.lang.Short"}, new String[]{"a,b,cinclude", "32767"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "A"}, {"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", "a+b"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("32767", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"T/ITLD", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String", "/"}}), new String[][]{{"clear", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:0>", "<s:9b>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "->\037"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{0=9b, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{" =", "<s:key>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<d:1.77>", "<s:`>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{ ==key, 1.77=`, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "020-01-01<", "<i:0>"}, {"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "2.25Title"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{020-01-01<=0, key0=[, ], key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "subset", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getKeys", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"nullTitle"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("nullTitle", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "double"}, new String[]{"1.1=2345678:01234567", "Infinity"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,long", "E=>  ", "9223372036854775799"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "double"}, new String[]{"2.5", "0.5000000000000001"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getString", "java.lang.String,java.lang.String", "\t2.55.${", "22:30:25"}, {"org.apache.commons.collections.ExtendedProperties", "interpolateHelper", "java.lang.String,java.util.List", "nos", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5000000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "setInclude", new String[]{"java.lang.String"}, new String[]{"h}"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperty", "java.lang.String", "12:30;44"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "subset", new String[]{"java.lang.String"}, new String[]{"no"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "", "1073741823"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getFloat", new String[]{"java.lang.String", "float"}, new String[]{"+1Title", "3.4028235E38"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("3.4028235E38", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "addProperty", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"j", "<s:D>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{j=D, key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"1.1234456l7off", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"5.", "true"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "java.lang.Short"}, new String[]{"1e0", "32767"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<null>"}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", "-xD5", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("32767", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"=on", "<sample:7>"}, false, 4, new String[][]{}), new String[][]{{"elements", "", "7"}, {"asIterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{"java.lang.String"}, new String[]{"4"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"1.5f", "<null>"}, false), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "java.lang.Short"}, new String[]{"1.5 = ", "-37"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "1.1234567I", "-10"}, {"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", "indmude"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-37", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "remove", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String", "1.6e300"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-2>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "72:20:45", "53"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "java.lang.Boolean"}, new String[]{"", "false"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "1E-5"}, {"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{]=a, key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<sample:4>"}, true), new String[][]{{"getLong", "java.lang.String,java.lang.Long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String", "int"}, new String[]{"12:30:45", "33554431"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("33554431", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "putAll", new String[]{"java.util.Map"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "TITLE"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=[a, ], key1=[0, a], key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "clearProperty", new String[]{"java.lang.String"}, new String[]{"\t020-01-011"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", "1.12345{6789/12345671.5", "46"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,java.lang.Long", "12:.30;45", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"Helko, World", "0"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getStringArray", "java.lang.String", "885:_1=file.separator"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{">.5e300", "<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<sample:4>"}, {"org.apache.commons.collections.ExtendedProperties", "remove", "java.lang.Object", "<s:kedy>"}}), new String[][]{{"containsAll", "java.util.Collection", "0"}, {"contains", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=[sample, ], key1=[, a]}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"-", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", "1-1234567990123456", "-32680"}, {"org.apache.commons.collections.ExtendedProperties", "clearProperty", "java.lang.String", "="}}), new String[][]{{"subList", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "interpolateHelper", "java.lang.String,java.util.List", "  =", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"file.separator", " => "}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getKeys", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" => ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"22-5", "0\n"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "n", "1.7976931348623157E308"}, {"org.apache.commons.collections.ExtendedProperties", "interpolate", "java.lang.String", " 2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"1.1234567", "1"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "", "-2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"000", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", "", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.util.Vector", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"1.61e1abc"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "put", "java.lang.Object,java.lang.Object", "<i:-2147483648>", "<b:false>"}, {"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", ";.5", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.61e1abc", String.valueOf(actual));
  assertEquals("receiver state after the call", "{-2147483648=false, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "long"}, new String[]{"I", "9223372036854775807"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:a>", "<s:aa>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream", "<sample:0>"}, {"org.apache.commons.collections.ExtendedProperties", "interpolate", "java.lang.String", "`,b,dinclude"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{a=aa, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInteger", new String[]{"java.lang.String"}, new String[]{"0Xno"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String,java.util.List", "[", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{"java.lang.String"}, new String[]{"-1TITLE"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getKeys", ""}, {"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "incclude", "-Infinity"}}), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperty", new String[]{"java.lang.String"}, new String[]{"Hello, Worlc"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<sample:1>", "11D5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"045f"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "testBoolean", "java.lang.String", "file.sep4arator8859_1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "java.lang.Double"}, new String[]{"1.1235678901234567", "Infinity"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "convertProperties", new String[]{"java.util.Properties"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.collections.ExtendedProperties", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "java.lang.Double"}, new String[]{"1E-", "Infinity"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "putAll", "java.util.Map", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "put", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:1>", "<i:-8388606>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{1=-8388606, key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String"}, new String[]{"1P"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String", "fals1.25"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"1--123456799013456", "14"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream,java.lang.String", "<sample:3>", "1.1234567890123456true"}, {"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,java.lang.Long", "a", "35"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"00x123456789", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("00x123456789", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{"P"}, false);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInt", new String[]{"java.lang.String"}, new String[]{"Tip1e"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String", "deals"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"a bb", "+2"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"5.1L2020-01-01", "1f10"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1f10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperty", new String[]{"java.lang.String"}, new String[]{"filf.sep4arator8859_1"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getKeys", "java.lang.String", "020-01.01"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"=b"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String", " =>"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String", "2.5off"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "java.lang.Short"}, new String[]{"include", "32767"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "addProperty", "java.lang.String,java.lang.Object", "+1", "<null>"}, {"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,java.lang.Integer", "abc", "45"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("32767", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "java.lang.Double"}, new String[]{"i-", "1.7976931348623157E308"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "isInitialized", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String", "1.1234456l7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"aaabc", "3"}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getFloat", "java.lang.String,java.lang.Float", "fals", "0.24"}, {"org.apache.commons.collections.ExtendedProperties", "getInt", "java.lang.String,int", "1.1234567890123356o", "-2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "display", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "double"}, new String[]{"trufe-1", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getList", "java.lang.String", "1e1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getByte", new String[]{"java.lang.String", "byte"}, new String[]{"12345678", "127"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "123456789012345678901234567890", "<s:kla>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
  assertEquals("receiver state after the call", "{123456789012345678901234567890=kla, key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{"java.lang.String"}, new String[]{"abno"}, false), new String[][]{{"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String", "\na1.1234567890123456"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolate", new String[]{"java.lang.String"}, new String[]{"/10"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("/10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "load", new String[]{"java.io.InputStream"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "combine", "org.apache.commons.collections.ExtendedProperties", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "isInitialized", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "setProperty", "java.lang.String,java.lang.Object", "u", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, u=b}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getString", new String[]{"java.lang.String"}, new String[]{"Titke\n"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getBoolean", new String[]{"java.lang.String", "boolean"}, new String[]{"010", "false"}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "load", "java.io.InputStream", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getKeys", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getInteger", "java.lang.String,int", "Titmeno1.5", "0"}}), new String[][]{{"next", "", "2"}, {"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"TISL", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String,java.lang.Short", "offoffon", "-16384"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("TISL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getDouble", new String[]{"java.lang.String", "double"}, new String[]{"1.12345678901234567false", "8.988465674311578E307"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "tre", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311578E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getList", new String[]{"java.lang.String"}, new String[]{"0x124456789"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "save", "java.io.OutputStream,java.lang.String", "<sample:2>", "1X..5e300"}}), new String[][]{{"get", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getShort", new String[]{"java.lang.String", "short"}, new String[]{"1", "32767"}, false, 6, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getProperties", "java.lang.String,java.util.Properties", "2230:25}", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("32767", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "interpolateHelper", new String[]{"java.lang.String", "java.util.List"}, new String[]{"1d10", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getByte", "java.lang.String", "falsabc"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1d10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getStringArray", new String[]{"java.lang.String"}, new String[]{"-1D5."}, false, 2, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "subset", "java.lang.String", "a,,cincludea"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=0, key1=sample, key2=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getProperties", new String[]{"java.lang.String", "java.util.Properties"}, new String[]{"fhke.separator", "<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getLong", "java.lang.String,java.lang.Long", "12:30;45a,b,c", "-54"}}), new String[][]{{"list", "java.io.PrintStream", "6"}, {"propertyNames", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Hashtable$Enumerator", actual.getClass().getName());
  assertEquals("{hasMoreElements=true, hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String"}, new String[]{"12:30:4u5"}, false, 1, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "isInitialized", ""}, {"org.apache.commons.collections.ExtendedProperties", "getVector", "java.lang.String,java.util.Vector", "2L", "<sample:1>"}}), new String[][]{{"capacity", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=a, key1=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "combine", new String[]{"org.apache.commons.collections.ExtendedProperties"}, new String[]{"<sample:7>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=, key2=sample}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "testBoolean", new String[]{"java.lang.String"}, new String[]{"1K"}, false, 7, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getShort", "java.lang.String", "34"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getInclude", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getDouble", "java.lang.String,double", "0C+1", "-1.0000000000000004"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("include", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=, key1=a}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getLong", new String[]{"java.lang.String", "java.lang.Long"}, new String[]{"", "0"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample, key1=}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.collections.ExtendedProperties", "org.apache.commons.collections.ExtendedProperties", "getVector", new String[]{"java.lang.String", "java.util.Vector"}, new String[]{"/00", "<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.collections.ExtendedProperties", "getBoolean", "java.lang.String,java.lang.Boolean", "1-1234567990723456", "false"}}), new String[][]{{"addAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{key0=sample}", SearchInputFactory_scaffolding.receiverState());
 }
}
