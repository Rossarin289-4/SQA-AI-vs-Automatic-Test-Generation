package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:2>", "I"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<null>", "1.12345678"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:2>", "1.12345678"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:0>", "a"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<null>", "ar"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "abc"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:2>", "\n"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "i"}, true), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<null>", "i"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", ""}, true), new String[][]{{"getNullValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", ""}, true), new String[][]{{"getNullValue", "", "1"}, {"deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "\taaaaaaaaaaaaaaaaba/aaaaaaaT\taaaa"}, true, 0, null, 2), new String[][]{{"findBackReference", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "1"}, true), new String[][]{{"unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "4"}, {"replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "1.12345678901234567"}, true), new String[][]{{"getValueClass", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<empty>", "java.math.BigInteger"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "nP>ll10x123456789"}, true, 0, null, 2), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<null>", "2020-02-30T25:61:61"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "22020-01_-v01"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "\u00e9"}, true), new String[][]{{"isCachable", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:0>", "java.math.BigInteger"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "ja"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "ja"}, true, 0, null, 1), new String[][]{{"getNullValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "0x1234556789TITLE"}, true), new String[][]{{"getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "{-\"a\":1}"}, true, 0, null, 2), new String[][]{{"getEmptyValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", ""}, true, 0, null, 1), new String[][]{{"deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "PU0dI-1.5"}, true, 0, null, 3), new String[][]{{"handledType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "a1+2]a\"1}"}, true, 0, null, 3), new String[][]{{"getEmptyValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "\u00e9"}, true, 0, null, 2), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "C|Xa\"E1~221not a  valid numberu\u00e9"}, true, 0, null, 1), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "2/b-1//51.25"}, true, 0, null, 3), new String[][]{{"findBackReference", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", ""}, true, 0, null, 3), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "J0\tx1F"}, true, 0, null, 3), new String[][]{{"isCachable", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "H"}, true, 0, null, 2), new String[][]{{"handledType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "0x02 4456 n95j--1"}, true, 0, null, 1), new String[][]{{"isCachable", "", "2"}, {"getValueClass", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:4>", "java.math.BigInteger"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:7>", "java.math.BifIntegeraaaaaaaaaaaabaaaaaaaaaaaaaaaaa"}, true, 0, null, 2), new String[][]{{"isCachable", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:4>", "java.math.BigInteger"}, true), new String[][]{{"handledType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Integer {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Integer, getClasses=[], getConstructors=[public java.lang.Integer(java.lang.String) throws java.lang..,...#840#1423407143", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:4>", "java.math.BigInteger"}, true), new String[][]{{"getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:11>", "java.math.BigInteger"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:11>", "java.math.BigInteger"}, true), new String[][]{{"getValueClass", "", "4"}, {"unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "7"}, {"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:11>", "java.math.BigInteger"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "com.fasterxml.jackson.databind.deser.std.NumberDeserializers", "find", new String[]{"java.lang.Class", "java.lang.String"}, new String[]{"<sample:11>", "java.math.BigInteger"}, true), new String[][]{{"isCachable", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
}
