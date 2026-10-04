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
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"IPT1H", "<sample:8>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"214748E6481.5f", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1.9e300false", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", ">3"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "false", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"hTITLE", "<sample:10>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"123456789012345"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.23456789012345E14", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "0x1Gabc"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"77", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "2020-02-30U25:61:61"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericLe.., get...#705#1439182783", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"-1B\r"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "a,b", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"-1.P", "<sample:0>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"-:1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "--1f", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "-1B\r"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1.123356781.12345678", "<sample:2>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1.5d", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "7"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 3), new String[][]{{"getKeyClass", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 2), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"03"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"15", "<sample:0>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"-1B12:30:45"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "\t", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"0xsFFFFFFFF", "<sample:0>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true), new String[][]{{"getKeyClass", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"a1", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "t3"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1.1234567", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "PU1H2020-01-01"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"5"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "214748E6481.5f"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{","}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "3", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"c", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "\n\n"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"", "<null>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"0105"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "-1x.P", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("105.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"0x1234567"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1.5", "<sample:11>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234567890123457", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "<\u00e9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"0xL2"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"22", "<sample:3>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"42"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "1.123456789012345672020-01-01"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("42", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 1), new String[][]{{"getKeyClass", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"-1.54"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.54", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"7\010"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1L1.5d", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"0", "<sample:10>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"195f"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("195.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1.12345678901234560", "<null>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"38"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "trufTitle", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("38.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"5"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"5"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"-0.0 "}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "-B\r"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 2), new String[][]{{"getKeyClass", "", "7"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"4"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.1233567890123456"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1233567890123457", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"\t1.5e3002"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "Hello, World"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"-1/5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "a b"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1e10\t", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"09"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 3), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"7", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "numl"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "Helllo, World.5", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"5", "<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "--18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.Map {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.util.Map, getClasses=[interface java.util.Map$Entry], getConstructors=[], getDeclaredAnnotations=[], getDec...#430#-1339089766", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.123456789012347562"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234567890123475", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"0.12345678", "<sample:4>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true, 0, null, 1), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"false ", "<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"221.5e300"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.215E302", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"a,b.5"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"A_1"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true, 0, null, 3), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 2), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"-15", "<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "5/", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("-15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"4"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "-1.P12:30:45"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"4-"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "null", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2"}, {"getKeyClass", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"J1.5f", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "-0.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 3), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1712345678"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.712345678E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"5010"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"i/10"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.2f"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"5", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "-1.iP"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"22"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "217483648", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true, 0, null, 2), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"2000"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2000.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"2"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 3), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1E-5123456789012345578901234567890"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "true", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"2", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "nul", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"33"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("33", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "a b"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "1M"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.Map {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.util.Map, getClasses=[interface java.util.Map$Entry], getConstructors=[], getDeclaredAnnotations=[], getDec...#430#-1339089766", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"2147493648"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147493648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"+2", "<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "-t1u", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1", "<sample:8>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"3"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"22", "<sample:9>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1", "<sample:5>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 1), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"8"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "-0.", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true, 0, null, 1), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"010", "<sample:2>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1", "<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "-1B\r", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"2", "<sample:11>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "Helllo, Wosld.5", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.2234567"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "[1,2]"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.2234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"4"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"6"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "1/5f"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"76"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("76", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1L010", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "|"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.Map {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.util.Map, getClasses=[interface java.util.Map$Entry], getConstructors=[], getDeclaredAnnotations=[], getDec...#430#-1339089766", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"7"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "\n"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"fal", "<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "77"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1", "<sample:4>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"+11"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("11.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"numml", "<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"01.25"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"8"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"\t1.2"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "52020-01-01"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.Map {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.util.Map, getClasses=[interface java.util.Map$Entry], getConstructors=[], getDeclaredAnnotations=[], getDec...#430#-1339089766", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"i1234567889012345678901234567890", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "b,b"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"8", "<sample:8>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "uml", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:8>"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"01"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "1e,10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"8", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "PT1H"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"-1.2"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"04", "<sample:7>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"12"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "1234567890123455.010"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"1147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "]{\"a\":1}", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"6", "<sample:3>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"2010-01-011.1234567890123456", "<sample:5>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"4", "<sample:2>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"27", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "\n"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("27", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"11"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "1.1234567890123P567"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"171234467", "<sample:2>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"2", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "1.1u234567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"3"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "h"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"123456789012345"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("123456789012345", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"7"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"0", "<sample:11>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1", "<sample:2>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"0", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"7"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"49", "<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "1.12345678901234565"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("49", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"1"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"16"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "-1.P"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"000"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"171234467", "<sample:7>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"600"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("600", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "Helllo, World.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"2146483648", "<sample:4>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"5", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "1.1234557890123456"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "1B\r"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"}", "<sample:4>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("}", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"5"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"-1", "<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "J"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"3"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"8", "<sample:5>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"2", "<sample:8>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "tste"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1", "<sample:8>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "{\"a\"\u00e9:1}", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"43", "<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "2020-02-30T25:61:61"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("43", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"3", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "F71.12345678901234567"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "numl"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1137483648", "<sample:1>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1137483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"8"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"4", "<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "\u00e9", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"6"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"4", "<sample:0>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"22"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "1.25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("22", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"99", "<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2020-02-30T25:61:61", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "."}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("99", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"82"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("82", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"0", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "2147483648"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "PTITL"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"33"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("33", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "214748E6481.5f"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"6"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "/+1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"-56"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1.5g", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "3Helmo, World", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-56", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"7"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"+1", "<sample:0>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"0"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"5\t"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "false", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "D11", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "0w1F"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"2147383648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "<aH"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147383648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"44", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "5."}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("44", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"27"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1.5{d", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("27", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "PSH"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"6"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"81"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("81", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"12"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"8", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "010h", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
}
