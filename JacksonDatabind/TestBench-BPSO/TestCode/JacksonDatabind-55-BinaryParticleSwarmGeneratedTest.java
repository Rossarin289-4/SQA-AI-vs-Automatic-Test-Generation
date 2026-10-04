package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "true"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$StringKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:1>", "<empty>"}, true), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true), new String[][]{{"handledType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:3>"}, true), new String[][]{{"usesObjectId", "", "2"}, {"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:3>", "<sample:4>", "false"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:5>", "<sample:5>", "true"}, true), new String[][]{{"usesObjectId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:3>", "<null>", "false"}, true, 0, null, 1), new String[][]{{"usesObjectId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:2>", "<sample:3>", "true"}, true, 0, null, 2), new String[][]{{"getDelegatee", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:6>", "<empty>", "true"}, true), new String[][]{{"properties", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "false"}, true, 0, null, 3), new String[][]{{"withFilterId", "java.lang.Object", "1"}, {"isEmpty", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:7>", "<null>"}, true), new String[][]{{"usesObjectId", "", "7"}, {"usesObjectId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:7>", "<sample:2>", "false"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:3>", "<empty>"}, true), new String[][]{{"handledType", "", "3"}, {"getDelegatee", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:8>", "<sample:5>"}, true, 0, null, 2), new String[][]{{"withFilterId", "java.lang.Object", "2"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"handledType", "", "3"}, {"handledType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:3>", "<sample:4>", "true"}, true, 0, null, 3), new String[][]{{"handledType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:4>"}, true), new String[][]{{"properties", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:5>", "<sample:4>", "false"}, true), new String[][]{{"handledType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"handledType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "true"}, true), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<null>", "<sample:5>", "true"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:6>", "<sample:1>", "true"}, true, 0, null, 2), new String[][]{{"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "true"}, true, 0, null, 2), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "0"}, {"asText", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true), new String[][]{{"getDelegatee", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"isEmpty", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:4>", "<sample:3>", "true"}, true), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:7>", "<sample:0>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$StringKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:1>"}, true), new String[][]{{"handledType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"properties", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:8>", "<sample:7>", "true"}, true), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "3"}, {"withFilterId", "java.lang.Object", "1"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:2>", "<empty>", "true"}, true, 0, null, 2), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:3>", "<sample:6>", "true"}, true, 0, null, 1), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:8>"}, true, 0, null, 3), new String[][]{{"properties", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:8>", "<sample:7>"}, true, 0, null, 2), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContaine...#343#-1065561756", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:6>", "<sample:5>", "false"}, true), new String[][]{{"getDelegatee", "", "6"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"isEmpty", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:9>", "<null>", "true"}, true, 0, null, 2), new String[][]{{"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:6>", "<null>", "false"}, true), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "6"}, {"asText", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true), new String[][]{{"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true), new String[][]{{"usesObjectId", "", "5"}, {"properties", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "false"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:10>", "<null>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "4"}, {"arrayNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isFlo...#310#-1644340141", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<null>", "<sample:0>", "true"}, true), new String[][]{{"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:3>"}, true), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "0"}, {"asText", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:8>", "<null>", "false"}, true, 0, null, 2), new String[][]{{"isEmpty", "java.lang.Object", "7"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:5>", "<null>", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:8>"}, true, 0, null, 3), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "5"}, {"hasNonNull", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getDelegatee", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:6>", "<sample:1>", "true"}, true, 0, null, 1), new String[][]{{"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "5"}, {"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:8>", "<sample:0>", "false"}, true, 0, null, 1), new String[][]{{"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:0>", "<sample:7>", "false"}, true, 0, null, 3), new String[][]{{"properties", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"usesObjectId", "", "4"}, {"handledType", "", "2"}, {"getDelegatee", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "true"}, true, 0, null, 2), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "5"}, {"asToken", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_OBJECT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:0>", "<sample:7>", "true"}, true, 0, null, 1), new String[][]{{"properties", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:0>", "<sample:4>", "true"}, true, 0, null, 1), new String[][]{{"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:4>", "<sample:5>", "false"}, true, 0, null, 1), new String[][]{{"properties", "", "6"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:0>", "<sample:4>", "true"}, true, 0, null, 2), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "0"}, {"intValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:1>", "<sample:7>", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:8>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"handledType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:2>", "<empty>"}, true, 0, null, 1), new String[][]{{"withFilterId", "java.lang.Object", "0"}, {"properties", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"isEmpty", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "false"}, true, 0, null, 3), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "3"}, {"properties", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "1"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "6"}, {"findParents", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "false"}, true, 0, null, 3), new String[][]{{"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$StringKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "1"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:2>"}, true, 0, null, 3), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:3>"}, true), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "3"}, {"asLong", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:7>"}, true, 0, null, 2), new String[][]{{"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "1"}, {"properties", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:3>", "<empty>", "true"}, true, 0, null, 3), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "0"}, {"elements", "", "3"}, {"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getDelegatee", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:5>"}, true, 0, null, 2), new String[][]{{"isUnwrappingSerializer", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 3), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:10>"}, true, 0, null, 2), new String[][]{{"getDelegatee", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:1>", "<sample:7>", "false"}, true, 0, null, 3), new String[][]{{"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:9>", "<sample:5>"}, true, 0, null, 3), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContaine...#343#-1065561756", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:0>", "<null>"}, true, 0, null, 2), new String[][]{{"handledType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:5>"}, true, 0, null, 3), new String[][]{{"getDelegatee", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContaine...#343#-1065561756", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:8>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:1>", "<sample:5>", "true"}, true), new String[][]{{"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "2"}, {"getNodeType", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.JsonNodeType", actual.getClass().getName());
  assertEquals("OBJECT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:5>"}, true, 0, null, 3), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "0"}, {"handledType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:7>"}, true, 0, null, 1), new String[][]{{"getDelegatee", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:8>", "<sample:4>"}, true, 0, null, 1), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "7"}, {"intValue", "", "1"}, {"asInt", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:8>", "<sample:0>"}, true, 0, null, 2), new String[][]{{"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:8>"}, true, 0, null, 2), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:7>"}, true, 0, null, 1), new String[][]{{"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "3"}, {"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "0"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
}
