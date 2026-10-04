package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:0>", "i"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:2>", "TITLE"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:0>", "-0.0"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "3147483647"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<null>", "66535"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "0xFFEFFFFF"}, true), new String[][]{{"getEmptyValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<empty>", "3147483647"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "\u00e90"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<null>", "1L.5"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "0xFFEFFFFF1.5f"}, true), new String[][]{{"getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:6>", "java.math.BigInteger"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "1.6f"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "a"}, true), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "1.25"}, true, 0, null, 3), new String[][]{{"getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "0"}, true), new String[][]{{"handledType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "/a/b"}, true), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "Hello, World"}, true, 0, null, 2), new String[][]{{"getKnownPropertyNames", "", "4"}, {"getNullValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:2>", "java.math.BigInteger"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<null>", "[1c3,2]"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "1234567890123456789012\u00e93f4567890"}, true, 0, null, 2), new String[][]{{"deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "655b5"}, true, 0, null, 1), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "1L"}, true, 0, null, 3), new String[][]{{"isCachable", "", "1"}, {"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "Hpllo, World"}, true), new String[][]{{"isCachable", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "TITLE"}, true, 0, null, 2), new String[][]{{"handledType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "2147483648"}, true, 0, null, 1), new String[][]{{"handledType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "1e10"}, true, 0, null, 1), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "1.152345678i"}, true, 0, null, 1), new String[][]{{"getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:4>", "java.math.BigInteger"}, true), new String[][]{{"unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "1C:30:45"}, true, 0, null, 2), new String[][]{{"findBackReference", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<null>", "/a/b"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:4>", "java.math.BigInteger"}, true), new String[][]{{"handledType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Integer {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Integer, getClasses=[], getConstructors=[public java.lang.Integer(java.lang.String) throws java.lang..,...#840#1423407143", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "Title"}, true, 0, null, 1), new String[][]{{"unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "1"}, {"findBackReference", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:11>", "java.math.BigInteger"}, true), new String[][]{{"unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:11>", "java.math.BigInteger"}, true), new String[][]{{"isCachable", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "j"}, true, 0, null, 3), new String[][]{{"getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "7"}, {"getValueClass", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:11>", "java.math.BigInteger"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:11>", "java.math.BigInteger"}, true, 0, null, 3), new String[][]{{"handledType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Number {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Number, getClasses=[], getConstructors=[public java.lang.Number()], getDeclaredAnnotations=[], getDeclar...#665#-969526999", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:4>", "java.math.BigInteger"}, true), new String[][]{{"getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "0"}, {"findBackReference", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "java.math.BigInteger"}, true, 0, null, 3), new String[][]{{"isCachable", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "i"}, true, 0, null, 2), new String[][]{{"isCachable", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "-1.5"}, true, 0, null, 2), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:11>", "java.math.BigInteger"}, true), new String[][]{{"getKnownPropertyNames", "", "4"}, {"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
}
