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
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"5?.", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1.123456782", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "214748364"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"9"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{".5f"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"2147483648123456789012345678901234567890"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.1474836481234568E39", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "!", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "ull", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{".6"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "-10x123456789"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"\037", "<sample:1>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1:1234567890123456", "<sample:0>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericLe.., get...#705#1439182783", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"a,b+ca b"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "d", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"110"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("110", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"5["}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "8", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1K", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "0xFFFFFFFFTitle\t"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"214648364"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("214648364", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"0w123456789"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "-1."}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"0x1234567890"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"", "<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", ".5", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "03"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<null>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"-0tt.0", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", ".5", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true), new String[][]{{"getKeyClass", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Integer {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Integer, getClasses=[], getConstructors=[public java.lang.Integer(java.lang.String) throws java.lang..,...#840#1423407143", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"0 ", "<sample:11>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"0x12"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "6", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "6"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 2), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{""}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0!", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2144748364", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"01"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "{\"a\"::1}"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"3"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "a,6b,c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 1), new String[][]{{"getKeyClass", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "+1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"a,b,c3", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "\0370xFFFFFFFF", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", ",1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.2345678901234568E29", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 3), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "5"}, {"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "0xFFFFFFFF0xFFFFFFFF"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.Map {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.util.Map, getClasses=[interface java.util.Map$Entry], getConstructors=[], getDeclaredAnnotations=[], getDec...#430#-1339089766", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.123456782"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.123456782", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"null", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"4"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "a,b,c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 3), new String[][]{{"getKeyClass", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "+I"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1e1011234567890123456"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "12:30:45"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 1), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 3), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "+H"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"110", "<sample:11>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 1), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"010"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 1), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{".", "<sample:11>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"null-1", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "nulk"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1.134567890123456", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"0 "}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", ".", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"aaaaaaa`aaaaaaaaaaaaaaaaaaaaaa", "<sample:11>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "fare", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringKD", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true, 0, null, 3), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 2), new String[][]{{"getKeyClass", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true, 0, null, 1), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"99"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("99", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"i", "<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "/", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"/x12", "<sample:11>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "0xFF"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{".123456782"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.123456782", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"I", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "-0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("I", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1110", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "\037", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1", "<sample:3>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"110010", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "33"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"7", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "-/.05"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Integer {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Integer, getClasses=[], getConstructors=[public java.lang.Integer(java.lang.String) throws java.lang..,...#840#1423407143", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5E300", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "I", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"1110"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "1.1234556782147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1110", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"110"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("110", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "0x\u00e9122456789"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"85", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "i", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("85", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{" 110"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("110.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"[1+2]", "<sample:11>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "6", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"a", "<sample:4>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, true), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234567890123457", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "1.25"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.Map {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.util.Map, getClasses=[interface java.util.Map$Entry], getConstructors=[], getDeclaredAnnotations=[], getDec...#430#-1339089766", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"7"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0x0F", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericLe.., get...#705#1439182783", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"6"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "08", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"9"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "I"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "2.25"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 2), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"8", "<sample:5>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"9", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "+10", "<sample:11>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "http:/.example.com/a?b=c"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "2020-12-30T25:61:61"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"-11.5d"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-11.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"false", "<sample:5>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"9"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"++", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "5.."}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 3), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"+1", "<sample:4>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"410"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "66", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("410", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"44"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "1110"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("44", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"4", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "1.0234567890123456"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1e0/", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1110", "<sample:9>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("1110", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "", "<sample:11>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"true12:30:45"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, true, 0, null, 2), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"-5", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "-.0", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{".5"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "1.5e30012:30:45"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"21474836448"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("21474836448", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"-1", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"5", "<null>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "110", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "TITLE\t"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "214748364Title", "<sample:11>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1234567890123457", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "F"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Integer {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Integer, getClasses=[], getConstructors=[public java.lang.Integer(java.lang.String) throws java.lang..,...#840#1423407143", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"3", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "ull", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"3"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"01"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "ul+1", "<sample:11>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"9"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1", "<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "33", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483648E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{".", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(".", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"4"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "Tit\u00e9le", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "famse-1", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "1.12W3456782"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"6", "<sample:6>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"8"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"a b`,b,c", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "00!", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "a .L"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"110010"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "-"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("110010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"0100", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "1.25"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"110", "<sample:4>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("110", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"9", "<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"false", "<sample:11>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"\0373", "<sample:11>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "t.1234567890123456", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"214748364"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "", "<sample:10>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "-0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("214748364", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "1.12445677"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"\t", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1.51e10", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"2"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "0"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "Gello, Wor2ld"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"010"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"5", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "0xFFFFFFFF"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"i", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1L", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"2147483"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"8"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"1117"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "4", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1117", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"0"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"3", "<sample:2>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, true, 0, null, 2), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"6"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "5", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"\037", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "Hello, World"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\037", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"1110"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "31.55f", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "P"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1110", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<null>", "<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"3"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "bbT", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"5", "<sample:0>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"2", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "forType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, true, 0, null, 2), new String[][]{{"deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"1110", "<sample:6>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1110", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "1.12345678901234567"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "problem: %s", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"0", "<sample:0>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"2", "<sample:9>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "a,a,c"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"0110", "<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "problem: %s", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("110", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"1110"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1110", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"0", "<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"7"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "2T20-02-30T25:61:61"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"4", "<sample:11>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"6"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "nu3l", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"343"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "\u00e8"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("343", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"2"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", new String[]{"java.lang.String"}, new String[]{"8"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "\na>b\"/a>"}, {"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "+1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"8"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "1.12345678"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"4", "<null>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"\t", "<sample:11>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "2020-01-01"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "null", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"46"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "0x1F", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("46", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"2", "<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "\u00e8"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"110010"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "4"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("110010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"true", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "[1,2]"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"+1", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"\n", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "0e10<a>b</a>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"7"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "1L"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"11", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", "java.lang.String,com.fasterxml.jackson.databind.DeserializationContext", "1110", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parse", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"7", "<sample:11>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "1..5f"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"1100"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "6"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1100", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"33", "<sample:2>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("33", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"0", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "getKeyClass", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"7"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "deserializeKey", new String[]{"java.lang.String", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"110", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("110", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"6"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseDouble", "java.lang.String", "\n"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"110010"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", "2020-02-30T24:61:61"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("110010", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"313"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", "java.lang.String", "1.25"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("313", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"7"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseInt", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", "_parseLong", "java.lang.String", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
}
