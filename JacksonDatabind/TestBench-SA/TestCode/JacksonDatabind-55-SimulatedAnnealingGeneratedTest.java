package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:6>", "<empty>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:6>"}, true), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 2), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:3>"}, true, 0, null, 2), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "7"}, {"withFilterId", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:3>", "<empty>"}, true, 0, null, 2), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:4>", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:1>", "<null>"}, true, 0, null, 2), new String[][]{{"handledType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:9>", "<sample:5>"}, true, 0, null, 2), new String[][]{{"getDelegatee", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:6>", "<null>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<null>", "<empty>", "true"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$StringKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<null>", "<null>", "true"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<null>", "<sample:1>", "true"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<null>", "<sample:1>", "false"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "true"}, true), new String[][]{{"isEmpty", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:3>", "<sample:5>", "false"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "true"}, true), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:2>"}, true), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:3>"}, true), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "2"}, {"properties", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:0>", "<sample:7>", "false"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:0>", "<sample:3>", "false"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:3>", "<sample:5>", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:4>", "<sample:1>", "true"}, true, 0, null, 1), new String[][]{{"usesObjectId", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:6>", "<sample:3>", "true"}, true, 0, null, 1), new String[][]{{"properties", "", "2"}, {"hasNext", "", "4"}, {"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:1>", "<sample:2>", "true"}, true), new String[][]{{"properties", "", "2"}, {"hasNext", "", "4"}, {"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:2>", "<sample:5>", "true"}, true), new String[][]{{"handledType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true), new String[][]{{"properties", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"properties", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"properties", "", "4"}, {"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:5>"}, true), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "3"}, {"findPath", "java.lang.String", "6"}, {"at", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:9>", "<sample:7>"}, true, 0, null, 3), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "5"}, {"findPath", "java.lang.String", "6"}, {"at", "java.lang.String", "4"}, {"isBigInteger", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "3"}, {"findPath", "java.lang.String", "6"}, {"at", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:3>"}, true), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "3"}, {"findPath", "java.lang.String", "6"}, {"at", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "3"}, {"handledType", "", "4"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:6>"}, true), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "3"}, {"handledType", "", "4"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "3"}, {"asDouble", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true), new String[][]{{"withFilterId", "java.lang.Object", "6"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "5"}, {"has", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:0>"}, true), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:8>"}, true, 0, null, 1), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "3"}, {"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "4"}, {"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "3"}, {"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "4"}, {"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "7"}, {"properties", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<null>", "<sample:7>", "false"}, true, 0, null, 2), new String[][]{{"isUnwrappingSerializer", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:3>", "<sample:4>", "true"}, true), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"getDelegatee", "", "0"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"getDelegatee", "", "0"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "5"}, {"binaryNode", "byte[]", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BinaryNode", actual.getClass().getName());
  assertEquals("\"Bgc=\" {canConvertToInt=false, canConvertToLong=false, getNodeType=BINARY, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=true, isBoolean=false, isContainerNode=false, isDouble=false,...#316#-1093746477", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:5>", "<sample:7>", "true"}, true), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "6"}, {"binaryValue", "", "3"}, {"binaryNode", "byte[],int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:0>", "<null>", "true"}, true, 0, null, 1), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "6"}, {"binaryValue", "", "3"}, {"binaryNode", "byte[],int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:7>", "<sample:3>", "false"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:6>", "<empty>", "false"}, true, 0, null, 2), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "6"}, {"binaryValue", "", "2"}, {"binaryNode", "byte[],int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:7>", "<sample:1>", "true"}, true, 0, null, 3), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "6"}, {"binaryValue", "", "2"}, {"binaryNode", "byte[],int,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:1>", "<sample:0>", "false"}, true), new String[][]{{"handledType", "", "4"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$StringKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:3>", "<null>", "true"}, true), new String[][]{{"handledType", "", "4"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:2>", "<null>", "true"}, true), new String[][]{{"handledType", "", "4"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "0"}, {"at", "com.fasterxml.jackson.core.JsonPointer", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<null>", "<null>", "true"}, true, 0, null, 2), new String[][]{{"handledType", "", "4"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "true"}, true, 0, null, 2), new String[][]{{"handledType", "", "4"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:5>", "<null>", "true"}, true, 0, null, 2), new String[][]{{"handledType", "", "4"}, {"withFilterId", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "true"}, true, 0, null, 2), new String[][]{{"handledType", "", "4"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<null>", "<sample:1>"}, true), new String[][]{{"isEmpty", "java.lang.Object", "4"}, {"getDelegatee", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:5>", "<sample:3>", "true"}, true), new String[][]{{"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "6"}, {"properties", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:3>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:4>", "<sample:0>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$StringKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:7>", "<sample:5>", "false"}, true, 0, null, 1), new String[][]{{"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "false"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "true"}, true, 0, null, 3), new String[][]{{"isEmpty", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "true"}, true, 0, null, 3), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:3>", "<empty>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$StringKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "true"}, true, 0, null, 1), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "true"}, true), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "3"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "4"}, {"getDelegatee", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "4"}, {"getDelegatee", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "4"}, {"properties", "", "7"}, {"next", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<null>", "<empty>"}, true, 0, null, 3), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "6"}, {"asBoolean", "", "4"}, {"bigIntegerValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true), new String[][]{{"getDelegatee", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:1>", "<null>", "false"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true), new String[][]{{"isEmpty", "java.lang.Object", "2"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "3"}, {"asLong", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<null>", "<sample:1>"}, true, 0, null, 2), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "1"}, {"asInt", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "1"}, {"isEmpty", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "3"}, {"isEmpty", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:1>"}, true, 0, null, 1), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<null>", "<sample:7>"}, true, 0, null, 3), new String[][]{{"getDelegatee", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "3"}, {"handledType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "1"}, {"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "4"}, {"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "0"}, {"isPojo", "", "0"}, {"binaryNode", "byte[],int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getStdKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class", "boolean"}, new String[]{"<sample:11>", "<sample:1>", "true"}, true, 0, null, 3), new String[][]{{"usesObjectId", "", "2"}, {"isEmpty", "java.lang.Object", "6"}, {"usesObjectId", "", "1"}, {"properties", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true), new String[][]{{"properties", "", "6"}, {"next", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"usesObjectId", "", "0"}, {"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "4"}, {"handledType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:5>", "<empty>"}, true, 0, null, 3), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:13>"}, true, 0, null, 2), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "4"}, {"withFilterId", "java.lang.Object", "2"}, {"properties", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getFallbackKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:7>"}, true, 0, null, 2), new String[][]{{"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "5"}, {"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "6"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "3"}, {"handledType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"properties", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ClassUtil$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getDelegatee", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 2), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "2"}, {"isMissingNode", "", "0"}, {"findPath", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 3), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "1"}, {"isBigDecimal", "", "7"}, {"findValue", "java.lang.String", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"properties", "", "5"}, {"next", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "com.fasterxml.jackson.databind.ser.std.StdKeySerializers", "getDefault", new String[]{}, new String[]{}, true, 0, null, 1), new String[][]{{"isEmpty", "java.lang.Object", "4"}, {"handledType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
}
