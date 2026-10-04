package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "serializeFields", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<b:false>", "<sample:9>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFieldsFiltered", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:true>", "<null>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "_serializeWithObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "boolean"}, new String[]{"<sample:6>", "<sample:5>", "<sample:0>", "false"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<i:-1>", "<sample:2>", "<sample:7>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFieldsFiltered", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<null>", "<sample:1>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:5>", "<sample:5>", "false", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isIndexedList", "java.lang.Class", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "getFactoryConfig", ""}}), new String[][]{{"getContentType", "", "0"}, {"forcedNarrowBy", "java.lang.Class", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class int] {getErasedSignature=I, getGenericSignature=I;, getTypeName=[simple type, class int], hasGenericTypes=false, isAbstract=true, isArrayType=false, isCollectionLikeType=false, isC...#369#1977653339", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<null>", "<sample:1>", "<empty>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<null>", "<sample:5>", "<i:59>", "2147483647"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:1>", "<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructObjectIdHandler", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:4>", "<sample:3>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConverter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:1>", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "<sample:4>", "true"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanProperties", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", "<sample:2>", "<sample:3>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter,java.lang.Class[]", "<sample:7>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:0>", "<sample:7>", "<sample:4>", "false"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanProperties", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", "<sample:2>", "<sample:3>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>", "false", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter,java.lang.Class[]", "<sample:7>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:2>", "<sample:6>", "<sample:3>", "true"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifyTypeByAnnotation", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:7>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "customSerializers", ""}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeIgnorableTypes", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:6>", "<null>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:4>", "<sample:1>", "true"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"object\",\"properties\":{}} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContaine...#343#1272026730", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "_narrow", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.databind.JavaType", "containedTypeOrUnknown", "int", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findFilterId", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:7>", "<sample:5>", "true", "<sample:5>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyContentTypeSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:1>", "<sample:4>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:9>", "<null>", "false"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_customTypeId", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFields", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:4>", "<sample:3>", "<sample:3>"}}, 1), new String[][]{{"floatValue", "", "4"}, {"findValuesAsText", "java.lang.String,java.util.List", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:6>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:5>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<b:true>", "<sample:0>", "<sample:5>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "getDelegatee", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "resolve", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:2>", "<sample:5>", "true"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:2>", "<sample:2>", "<sample:7>", "1"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "resolve", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFields", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:6>", "<null>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>", "<sample:1>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode...#338#1670214290", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "false"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "isEmpty", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:1>", "<sample:10>"}}, 2), new String[][]{{"elements", "", "1"}, {"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:4>", "<sample:1>", "<i:125>", "2147483647"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:9>", "<i:-2147483648>"}, {"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:5>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:10>", "<i:4>", "<b:false>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:1>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "convertValue", "java.lang.Object", "<i:62>"}, {"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:6>", "<sample:2>"}}), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "1"}, {"isUnwrappingSerializer", "", "6"}, {"isEmpty", "java.lang.Object", "3"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:10>", "<sample:2>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructPropertyBuilder", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "getFactoryConfig", ""}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", "com.fasterxml.jackson.databind.ser.Serializers", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isPotentialBeanType", "java.lang.Class", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.PropertyBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:5>", "<s:jdy\r>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "resolve", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:3>", "<sample:5>", "<i:-8>", "1/5f"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "BeanSerializer for java.lang.Object {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:7>", "<i:-1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "resolve", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:5>", "<sample:5>", "<i:-4>", "1/5f"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"6.-1", "true"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "withIgnorals", "java.lang.String[]", "<sample:1>"}}), new String[][]{{"booleanValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "withIgnorals", "java.lang.String[]", "<empty>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "getDelegatee", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "isEmpty", "java.lang.Object", "<d:1.5>"}, {"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<d:1.26>", "<sample:6>", "<sample:0>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "getConverter", ""}, {"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<null>", "<sample:1>", "<s:>", "-1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "getConverter", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:Pa>", "<sample:0>", "<sample:6>"}}, 2), new String[][]{{"getInputType", "com.fasterxml.jackson.databind.type.TypeFactory", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] -> [simple type, class generated...#758#-1293860936", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "getContentType", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "isMapLikeType", ""}, {"com.fasterxml.jackson.databind.JavaType", "isFinal", ""}, {"com.fasterxml.jackson.databind.JavaType", "isConcrete", ""}}, 3), new String[][]{{"widenContentsBy", "java.lang.Class", "6"}, {"getGenericSignature", "java.lang.StringBuilder", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("[Ljava/util/List;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifyTypeByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<null>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "processViews", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", "<sample:4>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildContainerSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:2>", "<sample:5>", "<sample:10>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=[Lgenerated/algorithm/SearchInputFactory_scaffolding$Generic.., get...#616#933686416", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<s:wofi>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:>", "<sample:0>", "<sample:4>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "withIgnorals", "java.lang.String[]", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "resolve", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>"}}, 2), new String[][]{{"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<i:-2>", "<sample:0>", "<sample:5>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "withIgnorals", "java.lang.String[]", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "resolve", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:2>"}}), new String[][]{{"unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "6"}, {"getDelegatee", "", "5"}, {"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<d:7.46>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<i:-2147483648>", "<sample:0>", "<sample:5>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "withIgnorals", "java.lang.String[]", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "resolve", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>"}}, 2), new String[][]{{"getDelegatee", "", "6"}, {"resolve", "com.fasterxml.jackson.databind.SerializerProvider", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_constructWriter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "boolean", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:5>", "<sample:7>", "<sample:0>", "<sample:4>", "false", "<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSuppressableContentValue", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:5>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<null>", "<sample:0>", "true", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>", "<sample:4>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:0>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "withObjectIdWriter", new String[]{"com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "asArraySerializer", ""}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "withObjectIdWriter", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:2>"}}), new String[][]{{"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "withObjectIdWriter", new String[]{"com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "asArraySerializer", ""}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "withObjectIdWriter", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<sample:2>"}}), new String[][]{{"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<null>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:6>", "<sample:1>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "withIgnorals", "java.lang.String[]", "<sample:1>"}}), new String[][]{{"createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:2>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:25>", "<sample:5>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "handledType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<i:0>", "<sample:0>", "<sample:5>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_serializeObjectId", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "<s:b>", "<sample:0>", "<sample:7>", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:6>"}}, 2), new String[][]{{"resolve", "com.fasterxml.jackson.databind.SerializerProvider", "7"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "0"}, {"deepCopy", "", "7"}, {"POJONode", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.POJONode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#309#35867084", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "hasRawClass", "java.lang.Class", "<empty>"}}, 1), new String[][]{{"containedTypeName", "int", "2"}, {"hasRawClass", "java.lang.Class", "7"}, {"narrowBy", "java.lang.Class", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "true", "<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:5>", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "usesStaticTyping", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:1>", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildContainerSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:4>", "<sample:1>", "<sample:1>", "false"}}), new String[][]{{"usesObjectId", "", "5"}, {"hasSingleElement", "java.util.Collection", "2"}, {"getContentType", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava...#593#-1774974891", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "resolve", new String[]{"com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:14>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:10>", "<sample:2>", "<d:7.46>", "2147483647"}, {"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:#=l5>", "<sample:7>", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:2>", "<s:jdy\r>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "getDelegatee", new String[]{}, new String[]{}, false, 26, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<d:1.26>", "<sample:7>", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:6>", "<sample:4>"}}), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "4"}, {"isUnwrappingSerializer", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:7>", "<sample:6>", "<sample:3>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createTypeSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:11>", "<sample:4>", "<sample:3>", "false"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:10>", "<sample:7>", "<sample:3>", "false", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findKeySerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:9>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "filterBeanProperties", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:3>", "<sample:10>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:10>", "<sample:8>", "<sample:3>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", "com.fasterxml.jackson.databind.ser.Serializers", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<sample:1>", "<sample:10>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:4>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "asArraySerializer", ""}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:4>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "asArraySerializer", ""}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "findConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "<sample:5>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:4>", "<null>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "asArraySerializer", ""}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "findConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "<sample:5>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:4>", "<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "asArraySerializer", ""}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "findConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "<sample:5>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:4>", "<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "findConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "<sample:5>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_serializeWithObjectId", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,boolean", "<null>", "<sample:0>", "<sample:0>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "serializeFields", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<b:true>", "<sample:9>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "usesObjectId", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "serializeFields", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<b:false>", "<sample:9>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFields", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:1>", "<sample:4>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFieldsFiltered", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:true>", "<null>", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "serializeFields", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<b:false>", "<sample:9>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFieldsFiltered", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:true>", "<null>", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "serializeFields", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<b:false>", "<sample:9>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFieldsFiltered", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:true>", "<null>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>", "<null>", "<sample:4>", "false", "<sample:10>", "<sample:5>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"-1.95"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:7>", "<b:false>", "<i:-1>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"-1.95\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#1582944034", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"-1.95"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:7>", "<b:false>", "<i:-1>"}}, 2), new String[][]{{"at", "com.fasterxml.jackson.core.JsonPointer", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.MissingNode", actual.getClass().getName());
  assertEquals(" {canConvertToInt=false, canConvertToLong=false, getNodeType=MISSING, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isF...#311#2070221465", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<null>", "<d:1.5>", "<s:>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdSerializer", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "handledType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:3>", "<sample:2>", "<s:>", "TITLE"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Boolean {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Boolean, getClasses=[], getConstructors=[public java.lang.Boolean(boolean), public java.lang.Boolean..,...#855#-1062272648", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:0>", "<sample:0>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "usesStaticTyping", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<null>", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isContainerType", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "getGenericSignature", "java.lang.StringBuilder", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isFinal", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "containedTypeOrUnknown", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:2>", "<sample:3>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:2>", "<sample:3>", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:2>", "<sample:3>", "true"}, false, 0, null, 1), new String[][]{{"hasNonNull", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, null, 2), new String[][]{{"at", "com.fasterxml.jackson.core.JsonPointer", "3"}, {"asText", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false, 25, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.StdSerializer", "getDelegatee", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sample[[Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "widenBy", "java.lang.Class", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sample[[Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "isAbstract", ""}, {"com.fasterxml.jackson.databind.JavaType", "widenBy", "java.lang.Class", "<sample:0>"}}, 2), new String[][]{{"append", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("[[Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;sample", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withSerializerModifier", new String[]{"com.fasterxml.jackson.databind.ser.BeanSerializerModifier"}, new String[]{"<sample:2>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription", "<sample:6>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:6>", "<sample:5>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:6>", "<sample:5>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:5>", "<sample:1>", "<empty>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:5>", "<null>", "<b:false>", "-0.0"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:0>", "<sample:6>", "<sample:4>", "false"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanProperties", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", "<sample:2>", "<sample:3>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter,java.lang.Class[]", "<sample:7>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:2>", "<sample:6>", "true"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_serializeObjectId", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "<s:key>", "<sample:0>", "<sample:6>", "<sample:1>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_serializeWithObjectId", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<d:1.5>", "<sample:1>", "<sample:1>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "false"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:1>", "<null>", "false"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"object\",\"properties\":{},\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=f...#359#499647695", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:6>", "<null>", "false"}, false, 5, new String[][]{}, 1), new String[][]{{"getNodeType", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.JsonNodeType", actual.getClass().getName());
  assertEquals("OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "false"}, false, 5, new String[][]{}, 1), new String[][]{{"hasNonNull", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "true"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "handledType", ""}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFields", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<sample:2>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:0>", "<sample:4>", "true"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "handledType", ""}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFields", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<sample:2>", "<sample:0>"}}, 2), new String[][]{{"at", "com.fasterxml.jackson.core.JsonPointer", "5"}, {"at", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:2>", "<sample:7>", "true"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFields", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:0>", "<sample:3>", "<sample:0>"}}, 2), new String[][]{{"asText", "java.lang.String", "5"}, {"isLong", "", "1"}, {"booleanNode", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BooleanNode", actual.getClass().getName());
  assertEquals("true {canConvertToInt=false, canConvertToLong=false, getNodeType=BOOLEAN, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=true, isContainerNode=false, isDouble=false, ...#315#-670400195", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isConcrete", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "hasRawClass", "java.lang.Class", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:9>", "<null>", "false"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_customTypeId", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFields", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:4>", "<sample:3>", "<sample:3>"}}, 1), new String[][]{{"floatValue", "", "4"}, {"findValuesAsText", "java.lang.String,java.util.List", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:1>", "<d:1.5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "false"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_customTypeId", "java.lang.Object", "<i:-2147483648>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFields", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:4>", "<sample:3>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "false"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_customTypeId", "java.lang.Object", "<i:-2147483648>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFields", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:4>", "<sample:3>", "<sample:2>"}}, 1), new String[][]{{"floatValue", "", "2"}, {"POJONode", "java.lang.Object", "2"}, {"fieldNames", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:2>", "<sample:4>", "true"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "resolve", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFields", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:6>", "<sample:3>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:6>", "<sample:4>", "true"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "resolve", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFields", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:6>", "<sample:3>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:1>", "<sample:2>", "false"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:5>", "<sample:3>", "<sample:4>", "-2"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "resolve", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFields", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:6>", "<sample:2>", "<sample:2>"}}, 3), new String[][]{{"booleanNode", "boolean", "6"}, {"isNull", "", "6"}, {"asDouble", "double", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdSerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:6>", "<i:-1>", "<i:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "customSerializers", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", new String[]{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "java.lang.Class[]"}, new String[]{"<sample:6>", "<empty>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView", actual.getClass().getName());
  assertEquals("property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:6>", "<sample:6>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:2>", "<empty>", "<null>", "1"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "resolve", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFields", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>", "<null>", "<sample:5>"}}, 1), new String[][]{{"bigIntegerValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "_assertSubclass", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>", "<sample:3>", "<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "isEmpty", "java.lang.Object", "<i:4>"}, {"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:b>", "<sample:3>", "<null>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:3>", "<sample:9>", "false"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:5>", "<sample:0>", "<s:ey>", "-2147483648"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "resolve", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFields", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:-45>", "<sample:2>", "<sample:2>"}}, 2), new String[][]{{"asBoolean", "boolean", "7"}, {"asInt", "int", "4"}, {"findValues", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:6>", "<sample:6>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:5>", "<sample:0>", "<d:1.5>", "-2147483648"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "resolve", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFields", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:false>", "<sample:1>", "<sample:2>"}}, 2), new String[][]{{"asBoolean", "boolean", "6"}, {"asInt", "int", "4"}, {"findValues", "java.lang.String,java.util.List", "7"}, {"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:5>", "<sample:4>", "false"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:5>", "<sample:0>", "<d:1.5>", "2147483647"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "resolve", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFields", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:true>", "<sample:1>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:2>", "<empty>", "true"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:5>", "<sample:6>", "<d:1.5>", "2147483647"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "resolve", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFields", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:true>", "<sample:6>", "<sample:2>"}}, 2), new String[][]{{"POJONode", "java.lang.Object", "1"}, {"asDouble", "double", "4"}, {"isContainerNode", "", "5"}, {"at", "com.fasterxml.jackson.core.JsonPointer", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.POJONode", actual.getClass().getName());
  assertEquals("1 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#-260397509", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "withFilterId", "java.lang.Object", "<s:b>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:9>", "<sample:5>", "<sample:7>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findKeySerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:5>", "<sample:3>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findKeySerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:5>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>", "<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:5>", "<sample:1>", "<b:false>", "'"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:5>", "<sample:6>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:5>", "<sample:1>", "<b:false>", "'"}, {"com.fasterxml.jackson.databind.ser.std.StdSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:0>", "<sample:1>", "<s:>", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isConcrete", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "containedTypeOrUnknown", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isConcrete", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "containedTypeOrUnknown", "int", "5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:9>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<null>", "<sample:0>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:9>", "<sample:4>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "processViews", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", "<sample:9>", "<null>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyTypeSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:3>", "<sample:4>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:1>", "<sample:2>", "<sample:4>", "1.25"}, {"com.fasterxml.jackson.databind.ser.std.StdSerializer", "handledType", ""}}, 2), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "7"}, {"getDelegatee", "", "4"}, {"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "usesStaticTyping", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:0>", "<sample:10>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createTypeSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructObjectIdHandler", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:1>", "<sample:6>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:9>", "<i:-38>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findOptionalStdSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:5>", "<sample:7>", "<sample:1>", "false"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<d:1.5>", "<sample:3>", "<sample:9>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "getGenericSignature", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[[Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:0>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "findConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "<sample:5>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:0>", "<sample:1>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "findConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "<sample:5>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "serializeFields", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<b:true>", "<sample:7>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "usesObjectId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "serializeFields", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<b:true>", "<sample:7>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "usesObjectId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.BooleanSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "_narrow", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "withValueHandler", "java.lang.Object", "<s:key>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>", "<sample:2>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "_serializeWithObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "boolean"}, new String[]{"<sample:1>", "<sample:9>", "<sample:2>", "true"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "_serializeWithObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "boolean"}, new String[]{"<sample:1>", "<sample:9>", "<sample:2>", "true"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<i:-1>", "<sample:2>", "<sample:7>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "handledType", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:5>", "<sample:3>", "false", "<sample:7>", "<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "usesStaticTyping", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:5>", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withSerializerModifier", "com.fasterxml.jackson.databind.ser.BeanSerializerModifier", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:5>", "<sample:2>", "false", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findOptionalStdSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:3>", "<sample:2>", "<sample:5>", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:5>", "<sample:5>", "false", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "customSerializers", ""}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findOptionalStdSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:3>", "<sample:2>", "<sample:5>", "false"}}), new String[][]{{"getContentType", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#589#-669445604", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:5>", "<sample:5>", "false", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findOptionalStdSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:3>", "<sample:2>", "<sample:5>", "false"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isIndexedList", "java.lang.Class", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:5>", "<sample:5>", "false", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isIndexedList", "java.lang.Class", "<empty>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "getFactoryConfig", ""}}), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"-1.5\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#-370442343", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"-1.b5"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"-1.b5\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#1164288793", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"-1.95"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:7>", "<b:false>", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"-1.95\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#1582944034", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "convertValue", "java.lang.Object", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "handledType", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Boolean {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Boolean, getClasses=[], getConstructors=[public java.lang.Boolean(boolean), public java.lang.Boolean..,...#855#-1062272648", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isContainerType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isContainerType", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "getDelegatee", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isFinal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "containedTypeOrUnknown", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:2>", "<sample:3>", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:2>", "<sample:3>", "true"}, false), new String[][]{{"hasNonNull", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "containedTypeName", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "containedTypeName", new String[]{"int"}, new String[]{"-16384"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", new String[]{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "java.lang.Class[]"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:3>", "<sample:7>", "<sample:6>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView", actual.getClass().getName());
  assertEquals("property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:0>", "<sample:0>", "<i:1>", "string"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:0>", "<sample:0>", "<null>", "string"}, {"com.fasterxml.jackson.databind.ser.std.StdSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:6>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", new String[]{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "java.lang.Class[]"}, new String[]{"<sample:6>", "<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifyTypeByAnnotation", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:6>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sample[[Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "withIgnorals", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withSerializerModifier", new String[]{"com.fasterxml.jackson.databind.ser.BeanSerializerModifier"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByPrimaryType", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:6>", "<sample:6>", "<sample:3>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:7>", "<i:-1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "getDelegatee", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "findConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "<sample:3>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:6>", "<sample:6>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdSerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:6>", "<i:-1>", "<i:2>"}, {"com.fasterxml.jackson.databind.ser.std.StdSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:4>", "<sample:3>", "<sample:0>", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:6>", "<sample:2>", "<i:2>", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:5>", "<sample:2>", "<i:4>", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdSerializer", "createSchemaNode", "java.lang.String", "--1"}, {"com.fasterxml.jackson.databind.ser.std.StdSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "useStaticType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "_narrow", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.JavaType", "withStaticTyping", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:2>", "<sample:0>", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", "com.fasterxml.jackson.databind.ser.Serializers", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:1>", "<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConverter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:1>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", "com.fasterxml.jackson.databind.ser.Serializers", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "getErasedSignature", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "isFinal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[[Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_constructWriter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "boolean", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:6>", "<sample:1>", "<sample:5>", "<sample:3>", "false", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:3>", "<sample:2>", "<b:true>", "1.12345678"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:5>", "<null>", "<b:false>", "\u00e9"}, false, 15, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "<sample:5>", "false"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:3>", "<sample:0>", "<sample:6>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "<sample:1>", "true"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanProperties", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", "<sample:3>", "<sample:3>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:0>", "<sample:6>", "<sample:10>", "false"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanProperties", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", "<sample:3>", "<sample:3>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isThrowable", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "widenContentsBy", "java.lang.Class", "<null>"}, {"com.fasterxml.jackson.databind.JavaType", "getParameterSource", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:0>", "<sample:6>", "<sample:4>", "true"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanProperties", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", "<sample:2>", "<sample:3>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter,java.lang.Class[]", "<sample:7>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isPotentialBeanType", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByPrimaryType", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:6>", "<sample:6>", "<null>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "widenBy", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.JavaType", "narrowBy", "java.lang.Class", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "customSerializers", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ArrayIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:3>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"boolean\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContain...#344#-1535411639", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdSerializer", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.StdSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:3>", "<sample:3>", "<b:false>", "1.25"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1.1234567", "false"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "createSchemaNode", "java.lang.String,boolean", "", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1.1234567\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isConta...#346#-1112192296", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "getContentType", ""}, {"com.fasterxml.jackson.databind.JavaType", "withStaticTyping", ""}}), new String[][]{{"isAbstract", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:2>", "<sample:6>", "<sample:3>", "true"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeIgnorableTypes", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:6>", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>", "false", "<sample:3>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConverter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:5>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_findSerializer", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<b:false>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "handledType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<null>", "<sample:6>", "true"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:true>", "<sample:4>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_serializeObjectId", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "<s:key>", "<sample:0>", "<sample:6>", "<sample:1>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_serializeWithObjectId", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<d:1.5>", "<sample:1>", "<sample:2>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:0>", "<sample:1>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "getDelegatee", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:7>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByPrimaryType", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:7>", "<sample:4>", "<sample:6>", "false"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>", "<sample:0>", "<null>", "true", "<sample:3>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "false"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:4>", "<sample:0>", "<sample:0>"}}), new String[][]{{"hasNonNull", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<i:59>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "containedTypeName", "int", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "<sample:5>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:0>", "<sample:1>", "<s:key>", "1.12345678"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "_customTypeId", new String[]{"java.lang.Object"}, new String[]{"<i:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isInterface", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "getKeyType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "hasGenericTypes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isMapLikeType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "isThrowable", ""}, {"com.fasterxml.jackson.databind.JavaType", "useStaticType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isEnumType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "widenBy", "java.lang.Class", "<empty>"}}), new String[][]{{"lastIndexOf", "java.lang.String,int", "5"}, {"append", "long", "1"}, {"insert", "int,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("[[Ltruegenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;-1", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isArrayType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<null>", "<sample:6>", "true"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFields", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:3>", "<sample:8>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"object\",\"properties\":{}} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContaine...#343#1272026730", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "true", "<sample:0>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructObjectIdHandler", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:7>", "<null>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CollectionSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildContainerSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:7>", "<sample:4>", "<sample:1>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", "com.fasterxml.jackson.databind.ser.Serializers", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyContentTypeSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:0>", "<null>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "getTypeHandler", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "isPrimitive", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "false"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFields", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:4>", "<sample:0>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "withObjectIdWriter", new String[]{"com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "hasGenericTypes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructPropertyBuilder", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByPrimaryType", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:6>", "<sample:3>", "<sample:5>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAddonType", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:1>", "<sample:0>", "<sample:10>", "false"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "widenBy", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "isPrimitive", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFieldsFiltered", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:-2147483648>", "<sample:3>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:5>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByPrimaryType", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "<sample:0>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>", "<sample:7>", "<sample:5>", "true", "<sample:3>", "<sample:1>", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructObjectIdHandler", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:4>", "<sample:2>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<null>", "<null>", "false", "<null>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isPotentialBeanType", "java.lang.Class", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<i:59>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:4>", "<i:0>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "usesStaticTyping", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:0>", "<sample:10>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildContainerSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:9>", "<sample:4>", "<sample:7>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createTypeSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:7>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "isEmpty", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:5>", "<sample:10>", "true"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:5>", "<null>", "<sample:0>", "-2"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "resolve", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFields", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:key>", "<sample:4>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isAbstract", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "getFactoryConfig", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", actual.getClass().getName());
  assertEquals("{hasKeySerializers=true, hasSerializerModifiers=true, hasSerializers=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:0>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "toCanonical", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "getContentType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[[Lgenerated.algorithm.SearchInputFactory_scaffolding$GenericSub;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isJavaLangObject", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"required", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"required\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContai...#345#-1096189774", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:0>", "<sample:3>", "<i:-1>", "2"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:7>", "<sample:3>", "<b:false>", "2020-02-30T25:61:61"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:4>"}, false), new String[][]{{"createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "filterBeanProperties", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:0>", "<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyContentTypeSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:5>", "<sample:6>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:1.5>", "<sample:0>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:3>", "<null>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "getValueHandler", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "widenContentsBy", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.JavaType", "getParameterSource", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:0>", "<sample:4>", "<sample:0>", "false"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifyTypeByAnnotation", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:4>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isIndexedList", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:1>", "<i:-2147483648>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:a>", "<sample:9>", "<sample:9>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":null} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble...#323#1626409927", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withConfig", new String[]{"com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "withObjectIdWriter", new String[]{"com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:2>", "<sample:3>", "<s:>", "-1"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "createObjectNode", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializer", actual.getClass().getName());
  assertEquals("BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:6>", "<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<null>", "<sample:1>", "<s:a>", "\t"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSetSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.EnumSetSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConverter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:1>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getDelegatee", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "getParameterSource", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:1>", "<empty>", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"boolean\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContain...#344#-1535411639", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createTypeSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeIgnorableTypes", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:7>", "<sample:7>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "findConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_serializeWithObjectId", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:4>", "<sample:1>", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFields", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:-2147483648>", "<sample:9>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<null>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"10"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, isAbstra...#430#255789530", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:7>", "<sample:5>", "<sample:3>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "widenBy", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "getGenericSignature", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "equals", "java.lang.Object", "<b:true>"}, {"com.fasterxml.jackson.databind.JavaType", "isJavaLangObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[[Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "containedType", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildContainerSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:6>", "<sample:0>", "<sample:7>", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:6>", "<sample:5>", "<null>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "isUnwrappingSerializer", ""}}), new String[][]{{"fieldNames", "", "4"}, {"next", "", "1"}, {"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "convertValue", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:3>", "<i:4>"}, {"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "withDelegate", "com.fasterxml.jackson.databind.util.Converter,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>", "<sample:5>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1.1234567890123456", "true"}, false), new String[][]{{"findValue", "java.lang.String", "4"}, {"fieldNames", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedKeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSuppressableContentValue", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<sample:4>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"\n"}, false), new String[][]{{"isInt", "", "2"}, {"isBinary", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "narrowContentsBy", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "asArraySerializer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:4>", "<sample:7>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "withFilterId", "java.lang.Object", "<s:b>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:0>", "<sample:7>", "<sample:10>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>", "<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:5>", "<sample:1>", "<b:false>", "'"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<null>", "<i:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "serializeFields", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:-4>", "<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:10>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifyTypeByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:7>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifyTypeByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:7>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildContainerSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:1>", "<sample:0>", "<sample:7>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#589#-669445604", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifyTypeByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:11>", "<sample:2>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildContainerSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:2>", "<sample:0>", "<sample:7>", "true"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava...#593#-1774974891", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifyTypeByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:0>", "<sample:5>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildContainerSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:2>", "<sample:0>", "<sample:7>", "true"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:0>"}}), new String[][]{{"isAbstract", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isConcrete", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "containedTypeOrUnknown", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<null>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "customSerializers", ""}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyTypeSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:3>", "<sample:4>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findOptionalStdSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:5>", "<sample:7>", "<sample:4>", "false"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifyTypeByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:4>", "<sample:7>"}, false), new String[][]{{"containedTypeName", "int", "3"}, {"widenBy", "java.lang.Class", "5"}, {"containedType", "int", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "containedTypeCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "createSchemaNode", "java.lang.String", "12:30:45"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "createSchemaNode", "java.lang.String", "12:30:45"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "createSchemaNode", "java.lang.String", "object"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "createSchemaNode", "java.lang.String", "12:30:45"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "createSchemaNode", "java.lang.String", "-0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "BeanSerializer for java.lang.Object {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "useStaticType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isPrimitive", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
}
