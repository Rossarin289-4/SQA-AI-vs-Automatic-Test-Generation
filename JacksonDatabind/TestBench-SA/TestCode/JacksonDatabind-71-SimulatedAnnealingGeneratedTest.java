package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"/a/b", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "\u00e9"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"3"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{""}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"http://example.com/a?b=c", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"false", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"0xFFFFFF+G", "<sample:7>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"`", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "2147483648"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"`7\t", "<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "2147483648"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"`7133", "<sample:1>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"Title"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericLe.., get...#705#1439182783", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Integer {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Integer, getClasses=[], getConstructors=[public java.lang.Integer(java.lang.String) throws java.lang..,...#840#1423407143", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "3", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "3", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "3", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"Hemlo, VorldTITLE"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"Hemlo, Vpqrle"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"77"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("77", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"6+11"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"6"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"6"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2020-01-01", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "+1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "`", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "+1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "`", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "+1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{""}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "+1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{""}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "+1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1"}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"2"}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"010"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1.123456C890123467", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"0106"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1.123456C890123467", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("106.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"010"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "1.5"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2147483648", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"`7\t", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "Hello, World"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "Hello, World", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"1ec+/"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true), new String[][]{{"getKeyClass", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true), new String[][]{{"getKeyClass", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"0123456789"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("123456789", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"0123456089"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("123456089", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"12:30:45", "<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1L0x1234567891", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "PT1H", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1e10aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:7>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"8"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "Title", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "Title", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"ir8xe4."}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1.25", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "a", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"kr8xe<-null"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "a", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.1234561"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "8", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "--1", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234561", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "8", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "--1", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.1234578"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "8", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "--1", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234578", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{" ", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "123456789012345678901234567890"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.lang.Comparable {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Comparable, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[]...#508#-880343186", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"7", "<sample:7>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "1.5e30"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "\t", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"A-00x12F3456789211474836\n48"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "j"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "-1.5", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"A-00x12F3456789211474836\n48"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "j"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "-1.5", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", ".5", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "1.12345678901234567"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "67\t"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "5", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "1.1234567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "5", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "1.1234567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.lang.Comparable {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Comparable, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[]...#508#-880343186", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "5", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "1.1234567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Number {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Number, getClasses=[], getConstructors=[public java.lang.Number()], getDeclaredAnnotations=[], getDeclar...#665#-969526999", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "1.1234567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.Collection {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.Collection, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[],...#556#1623681001", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "1.1234567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.util.ArrayList {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.ArrayList, getClasses=[], getConstructors=[public java.util.ArrayList(int), public java.util.ArrayLis...#858#427306584", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "8", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "12:30:45"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "8", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "8", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "6"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "8", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "6"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "8", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.lang.Comparable {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Comparable, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[]...#508#-880343186", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "6"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "8", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$TypeSamples {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.TypeSampl.., get...#766#1514574851", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{",1T[tle"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "6"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "6"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "6", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.util.ArrayList {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.ArrayList, getClasses=[], getConstructors=[public java.util.ArrayList(int), public java.util.ArrayLis...#858#427306584", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.util.ArrayList {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.ArrayList, getClasses=[], getConstructors=[public java.util.ArrayList(int), public java.util.ArrayLis...#858#427306584", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "6"}, {"getKeyClass", "", "0"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "6"}, {"getKeyClass", "", "0"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 3), new String[][]{{"getKeyClass", "", "6"}, {"getKeyClass", "", "0"}, {"getKeyClass", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Integer {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Integer, getClasses=[], getConstructors=[public java.lang.Integer(java.lang.String) throws java.lang..,...#840#1423407143", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 3), new String[][]{{"getKeyClass", "", "6"}, {"getKeyClass", "", "0"}, {"getKeyClass", "", "3"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 3), new String[][]{{"getKeyClass", "", "6"}, {"getKeyClass", "", "0"}, {"getKeyClass", "", "3"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 3), new String[][]{{"getKeyClass", "", "6"}, {"getKeyClass", "", "0"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"getKeyClass", "", "6"}, {"getKeyClass", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 2), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true, 0, null, 3), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"i"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", " "}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 2), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"3"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "\t"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 1), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "1e10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"2"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "0xFFFFFFFF"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "/a/b", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "Titld"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"22"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "0xFFFFFFFF"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "/a/b", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "Titld"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "false", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Integer {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Integer, getClasses=[], getConstructors=[public java.lang.Integer(java.lang.String) throws java.lang..,...#840#1423407143", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"0xFFFFFFFF", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "12:30:45"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"0xFFFFFFFF", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "12:30:45"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "TITLE"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "TITLE"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "TIT+LE"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"4", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "null"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 3), new String[][]{{"getKeyClass", "", "4"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true, 0, null, 2), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"getKeyClass", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Integer {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Integer, getClasses=[], getConstructors=[public java.lang.Integer(java.lang.String) throws java.lang..,...#840#1423407143", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.2345678901234568E29", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"023456789012345678901234567890"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.3456789012345678E28", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"99", "<sample:6>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "_a=b</a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("99.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"99", "<sample:6>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "_a<b</a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("99", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"abc", "<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "1e10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 1), new String[][]{{"getKeyClass", "", "7"}, {"getKeyClass", "", "7"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "6"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"getKeyClass", "", "7"}, {"getKeyClass", "", "7"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "6"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"-1", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "http://example.com/a?b=c", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"-1", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "http://example.com/a?b=c", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"-1", "<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "http://example.com/a?b=c", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"r}e`7\t", "<sample:13>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "PT1H", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1.1234567890123456", "<sample:4>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "Hemlo, VorldTITLE"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"1"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "`7\t"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"6"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"7"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"7"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "`7\t", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1E-5", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"6", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "PT1H", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1.1234567", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{" ", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "TITLE"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "6", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2.15", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"-0.0", "<sample:5>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "[1,2]"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"-0.0", "<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1.5f", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "http://exampple.com/a?b=c"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"5", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "<a>b</a>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"`7133", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", " "}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1E-5", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "7"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"i", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "0x1F"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "1.12345678901234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"5", "<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2147483648", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"8"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "1E-5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5E300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "{\"a\":1}", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "-1.5"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234567890123457", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"8", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "kr8xe<-null", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2020-01-01", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1.25", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "3", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"5"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"7"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "PT1H"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"0", "<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "http://example.com/a?b=c"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "1.5d"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"3", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "1.1234567"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"6", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "a", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"202"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0x123456789", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "8"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("202", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", " T1H", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"6"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "\\"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "/a/b"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.util.ArrayList {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.ArrayList, getClasses=[], getConstructors=[public java.util.ArrayList(int), public java.util.ArrayLis...#858#427306584", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"2", "<sample:2>"}, false, 14, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "1.12345678901234567"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"4"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"7"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"125"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "5."}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("125", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"1225"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "5."}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1225", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"3"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"0"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "{\"a\"\":1}", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.lang.Comparable {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Comparable, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[]...#508#-880343186", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"+1", "<sample:6>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "<a>T</a>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"0"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"pp", "<sample:3>"}, false, 15, new String[][]{}, 1), new String[][]{{"getExtension", "char", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"5."}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"44."}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("44.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"7133"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7133", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"713"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("713", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "h2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"4"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "h2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"0x113456798h98010", "<sample:3>"}, false, 15, new String[][]{}, 2), new String[][]{{"getDisplayVariant", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"2h:-1.5", "<sample:3>"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"11000"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("11000", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1.1234568", "<sample:6>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "-0.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1.12345568", "<sample:5>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "0.0PT1H"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "kr8xe<-null"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.12345568", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1.12345568", "<null>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "165"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "kr8xe<-null"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.1234556", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"0", "<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"7\010", "<sample:2>"}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("7.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"5.", "<sample:0>"}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"3"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"4"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "ir8xe4."}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "http://example.com/a?b=c"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{",1", "<sample:3>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "i"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"1"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"11"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"true", "<sample:5>"}, false, 15, new String[][]{}, 2), new String[][]{{"getLanguage", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"kr8xe<-null", "<sample:5>"}, false, 15, new String[][]{}, 2), new String[][]{{"getLanguage", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kr8xe<", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"kq8xe<-null", "<sample:5>"}, false, 15, new String[][]{}, 2), new String[][]{{"getLanguage", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kq8xe<", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"kF8xe<-null", "<sample:4>"}, false, 15, new String[][]{}, 2), new String[][]{{"getLanguage", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("kf8xe<", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaFaaaaaa"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "Tiule"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"6"}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"2020-02-30T2:61:61", "<sample:5>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "--1o"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "1.5"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "1.5e"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("2020_02_30T2:61:61 {getCountry=02, getDisplayCountry=02, getDisplayLanguage=2020, getDisplayName=2020 (02, 30T2:61:61), getDisplayScript=, getDisplayVariant=30T2:61:61, getISO3Country=!MissingResource...#327#-217332357", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"4"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "true"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "<a>b</a>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"3"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "7", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"2146483648"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2146483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"6"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "-1.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"7"}, false, 12, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"`7\t", "<sample:8>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "7", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"", "<sample:2>"}, false, 15, new String[][]{}, 2), new String[][]{{"getDisplayScript", "java.util.Locale", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"m", "<sample:2>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1E-5", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "\u00e9", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 2), new String[][]{{"getDisplayScript", "java.util.Locale", "1"}, {"getDisplayName", "java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("m", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{" ", "<sample:2>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1E-5", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 2), new String[][]{{"getDisplayScript", "java.util.Locale", "1"}, {"getDisplayName", "java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1.5eXx00", "<sample:2>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"`7\t,", "<sample:0>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 3), new String[][]{{"getDisplayVariant", "java.util.Locale", "7"}, {"getScript", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"Hello, World", "<sample:6>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "010"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", ".5"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "0x123456789"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("hello, world {getCountry=, getDisplayCountry=, getDisplayLanguage=hello, world, getDisplayName=hello, world, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceExc...#279#1947843016", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"Hello, World0", "<sample:6>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "6"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "0x123456789"}}, 3), new String[][]{{"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("hello, world0 {getCountry=, getDisplayCountry=, getDisplayLanguage=hello, world0, getDisplayName=hello, world0, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResource...#283#-1943630614", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "true", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1.12345678901234567", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Integer {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Integer, getClasses=[], getConstructors=[public java.lang.Integer(java.lang.String) throws java.lang..,...#840#1423407143", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"thttp://example.com/a?b=c"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2020", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"}", "<sample:0>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaa`aaaa", "<sample:0>"}, false, 15, new String[][]{}, 3), new String[][]{{"getUnicodeLocaleKeys", "", "3"}, {"isEmpty", "", "4"}, {"addAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"2047583648", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0.25", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
}
