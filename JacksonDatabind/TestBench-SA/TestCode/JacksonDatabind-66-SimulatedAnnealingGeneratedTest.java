package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"7"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1.12345678901234567", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1.12345678901234567", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1.12345678901234567", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericLe.., get...#705#1439182783", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Integer {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Integer, getClasses=[], getConstructors=[public java.lang.Integer(java.lang.String) throws java.lang..,...#840#1423407143", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.lang.Comparable {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Comparable, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[]...#508#-880343186", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.util.ArrayList {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.ArrayList, getClasses=[], getConstructors=[public java.util.ArrayList(int), public java.util.ArrayLis...#858#427306584", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.lang.Comparable {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Comparable, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[]...#508#-880343186", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"12:30:45", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"12:30::45", "<sample:3>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "1.5f"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "TITLE", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"0", "<sample:7>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "1.5f"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "TITLE", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "/a/b", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1", "<sample:5>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "1.5xf"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "TITLE", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"18", "<sample:5>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "1.xf"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("18", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"18", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "1.xf"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("18", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"18", "<sample:5>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "1.xf"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1", "<sample:5>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "0x123456789"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1", "<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "0x123456789"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"11.12345678", "<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "0x123456789"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true), new String[][]{{"getKeyClass", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"\t", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", " ", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "3", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Integer {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Integer, getClasses=[], getConstructors=[public java.lang.Integer(java.lang.String) throws java.lang..,...#840#1423407143", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "4", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2020-02-30T25:61:61", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2020-02-30T25:61:61", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "5."}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 2), new String[][]{{"getKeyClass", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Integer {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Integer, getClasses=[], getConstructors=[public java.lang.Integer(java.lang.String) throws java.lang..,...#840#1423407143", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "--1", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"6"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "--1", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"I"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1.5f", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "<a>b</a>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", ".5e", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "<a>b</a>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", ".5e", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "<a>b</a>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", ".5e", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.Map {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.util.Map, getClasses=[interface java.util.Map$Entry], getConstructors=[], getDeclaredAnnotations=[], getDec...#430#-1339089766", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "<a>b</a>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", ".5e", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.lang.Comparable {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Comparable, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[]...#508#-880343186", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "<a>b</a>", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", ".5e", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Number {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Number, getClasses=[], getConstructors=[public java.lang.Number()], getDeclaredAnnotations=[], getDeclar...#665#-969526999", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "<a>b</a>", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", ".5e", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true), new String[][]{{"getKeyClass", "", "6"}, {"getKeyClass", "", "5"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"18"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "2020-01-01"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("18", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"5."}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"true", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 2), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true, 0, null, 1), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 1), new String[][]{{"getKeyClass", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true, 0, null, 3), new String[][]{{"getKeyClass", "", "3"}, {"getKeyClass", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "1L"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true), new String[][]{{"getKeyClass", "", "3"}, {"getKeyClass", "", "4"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true), new String[][]{{"getKeyClass", "", "3"}, {"getKeyClass", "", "4"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"0", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"getKeyClass", "", "5"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 2), new String[][]{{"getKeyClass", "", "5"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "4"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"8"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"3"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true, 0, null, 3), new String[][]{{"getKeyClass", "", "7"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2"}, {"getKeyClass", "", "4"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 3), new String[][]{{"getKeyClass", "", "7"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2"}, {"getKeyClass", "", "3"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 3), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "5", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 3), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 3), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"2020-02-30T26", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "TITLE"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5E300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.e310"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "TITLE"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"e%aaals"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "true", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1.5e300", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"3", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "5", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"null"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483648E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"2147483548"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483548E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"55-"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "[1,2]"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2020-02-30T25:61:61", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"2147l583648-2a"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2020-02-30T25:61:61", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"66"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("66", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"664"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("664", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"--2PT513"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "1.12345678"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 1), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 2), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "5"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "4"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "TITLE"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"true", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1.12345678901234567", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "\u00e9"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"6"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "a,b,c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "i"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"getKeyClass", "", "6"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 2), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "6"}, {"getKeyClass", "", "7"}, {"getKeyClass", "", "5"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"8", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", ".5", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"18"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("18", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1.1234567890123456", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"7", "<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "1.xf"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"2"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", ".5e", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"4", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"0x123456789", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "\t"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "5."}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"3", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2147483648", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "null", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"18"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("18", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"4"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"3"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"2", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "", "<null>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1.5f", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234567890123457", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "1.5d"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", ".5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"5", "<sample:3>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"H", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "17"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("H", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.lang.Comparable {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Comparable, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[]...#508#-880343186", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Number {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Number, getClasses=[], getConstructors=[public java.lang.Number()], getDeclaredAnnotations=[], getDeclar...#665#-969526999", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "1.1234567890123456"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "UITLE", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.util.ArrayList {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.ArrayList, getClasses=[], getConstructors=[public java.util.ArrayList(int), public java.util.ArrayLis...#858#427306584", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "81E-5"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "<{a>b</a>Hello,  World"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "+1", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"7"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "\n", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "2020-01-01"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "Hello, Wo\"ld"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"a bb"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "oT1H", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "Helo, Wor2ld"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "oT1H", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "Helo, Wor2ld"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "2020-01-01"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1.1234567890123456", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "-1.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"3"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"-115"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-115", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"-11"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"6"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"65"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("65", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "problem: %s", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", ".123;456789012345612:30:45"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "THTLE"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.util.ArrayList {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.ArrayList, getClasses=[], getConstructors=[public java.util.ArrayList(int), public java.util.ArrayLis...#858#427306584", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"5", "<sample:3>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", ".55"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "1.5e300"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"4", "<sample:3>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", ".5"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "1.5e300"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"4"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "7"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "bb"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"false", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2020-01-01", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "12:30:45", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"5"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"12:30:45", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "7"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483648E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"6"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"8"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"3", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"Helo, Wor2ld", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1L", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "-1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"5"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"4"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "-11E-5", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "a bb"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "Helo- World"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"null", "<sample:7>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "\013"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("null {getCountry=, getDisplayCountry=, getDisplayLanguage=null, getDisplayName=null, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=null...#247#-1184460174", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"null", "<sample:7>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "\013"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("null {getCountry=, getDisplayCountry=, getDisplayLanguage=null, getDisplayName=null, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=null...#247#-1184460174", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"null", "<sample:7>"}, false, 15, new String[][]{}), new String[][]{{"getDisplayVariant", "java.util.Locale", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"nulm", "<sample:5>"}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("nulm {getCountry=, getDisplayCountry=, getDisplayLanguage=nulm, getDisplayName=nulm, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=nulm...#247#676155728", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"n8", "<sample:7>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "-1.5"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "problem: %s", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("n8 {getCountry=, getDisplayCountry=, getDisplayLanguage=n8, getDisplayName=n8, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceException, getLanguage=n8, getScr...#239#-19724852", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.9"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "123456789012345;678901234567890", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"1"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"11"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"8"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "1.xf"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"18"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "21474836\u00e98", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "I", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("18", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "6"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"8"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "4"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"7"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "5."}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "null"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"Titlen7ull"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "12:30:45", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "0x123456789"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"x", "<sample:11>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0xFFFFFFFF", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"5"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"6"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "3"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"I", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "17"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"07", "<sample:6>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "V"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"-1245068901234557", "<sample:4>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "0x1123456789"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "31.1234567"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"500"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", ":"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("500", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"-1.2147\r83648"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "PT1H", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "-12345678", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"18"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2147483648", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("18.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "i+"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.util.ArrayList {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.ArrayList, getClasses=[], getConstructors=[public java.util.ArrayList(int), public java.util.ArrayLis...#858#427306584", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"41"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "0xFFFFFFFF"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("41", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"51"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "0xFF\t"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("51", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"551"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "0xFF\t"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("551", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{":c", "<sample:0>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "1//f"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0", "<sample:2>"}}, 3), new String[][]{{"getDisplayCountry", "java.util.Locale", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"de", "<sample:2>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "1.1234567"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "1//ff"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "5", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "1.5f"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"19"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", ".5e"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("19.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", ".5e"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"5", "<sample:8>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "-12345678", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"2", "<sample:9>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "\t", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "33", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "12:30:45", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"2", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "\t", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "33", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "12:30:45", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"7", "<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"7", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"4"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{" ", "<sample:5>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"-12345678"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "{\"a\":1}", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-12345678", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"0123458"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "12:3\t:45"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("123458", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "true", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"2", "<null>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1", "<null>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1", "<null>"}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"E\n", "<sample:7>"}, false, 15, new String[][]{}, 1), new String[][]{{"getDisplayCountry", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"\t", "<sample:1>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{" ", "<sample:0>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"4"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "/xFnFFFFFF"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "oT1H"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"", "<sample:5>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "PT1H"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "a,b,c"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "PT1H"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals(" {getCountry=, getDisplayCountry=, getDisplayLanguage=, getDisplayName=, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=, getLanguage=, getScript=, getVariant=, hasExtensions=...#206#-2102547700", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"Hello, World", "<sample:3>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "a,b,c"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Locale", actual.getClass().getName());
  assertEquals("hello, world {getCountry=, getDisplayCountry=, getDisplayLanguage=hello, world, getDisplayName=hello, world, getDisplayScript=, getDisplayVariant=, getISO3Country=, getISO3Language=!MissingResourceExc...#279#1947843016", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"3.Hello, Worlda", "<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "-12345678", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"16", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "0x1F"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
 }
}
