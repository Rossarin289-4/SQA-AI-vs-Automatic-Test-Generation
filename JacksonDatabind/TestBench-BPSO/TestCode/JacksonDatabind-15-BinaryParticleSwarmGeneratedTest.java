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
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:1>", "<sample:5>", "<sample:4>", "<sample:5>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:1>", "<sample:3>", "<sample:4>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "narrowBy", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "getKeyType", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:10>", "false", "<sample:5>", "<sample:4>"}}), new String[][]{{"findPropertyContentTypeSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "_serializeObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId"}, new String[]{"<b:true>", "<sample:4>", "<sample:8>", "<sample:7>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<null>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:2>", "<sample:1>", "<empty>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifyTypeByAnnotation", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:5>", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<null>", "<sample:6>", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findKeySerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:1>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "resolve", new String[]{"com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_serializeWithObjectId", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:8>", "<sample:7>", "<sample:8>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:8>", "<sample:10>", "<sample:3>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:5>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter,java.lang.Class[]", "<sample:7>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructPropertyBuilder", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyContentTypeSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:1>", "<sample:6>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:62>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "containedTypeOrUnknown", "int", "0"}}), new String[][]{{"isEnumType", "", "6"}, {"containedTypeCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "withDelegate", "com.fasterxml.jackson.databind.util.Converter,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>", "<sample:7>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:4>", "<sample:9>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>", "<sample:6>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>", "<sample:2>", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeIgnorableTypes", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:0>", "<sample:5>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "getConverter", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getInputType", "com.fasterxml.jackson.databind.type.TypeFactory", "0"}, {"narrowBy", "java.lang.Class", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericB.., getGenericSignature=Lgenerated/a...#590#10970761", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifySecondaryTypesByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:3>", "<sample:13>"}, true), new String[][]{{"widenBy", "java.lang.Class", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=Ljava/lang/String;, getGenericSignature=...#598#1097262824", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructObjectIdHandler", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:8>", "<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyContentTypeSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:2>", "<sample:5>", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<s:_2>"}, false), new String[][]{{"getDelegatee", "", "1"}, {"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<null>"}, false, 5, new String[][]{}), new String[][]{{"isEmpty", "java.lang.Object", "4"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "resolve", new String[]{"com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<null>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getDelegatee", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "withDelegate", new String[]{"com.fasterxml.jackson.databind.util.Converter", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>", "<sample:9>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "usesObjectId", ""}}), new String[][]{{"getDelegatee", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CalendarSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "withIgnorals", new String[]{"java.lang.String[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "findConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "<null>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifySecondaryTypesByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:7>", "<sample:14>"}, true), new String[][]{{"forcedNarrowBy", "java.lang.Class", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.util.List, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=Ljava/util/List;, getGenericSignature=Ljava/uti...#589#-1140390457", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>", "<sample:8>", "<sample:4>", "false", "<sample:8>", "<sample:2>", "<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>", "true", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyTypeSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:3>", "<sample:6>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"Su-class "}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"Su-class \"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, i...#330#-1570593713", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "resolve", new String[]{"com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:12>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "resolve", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:11>", "<sample:12>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:5>", "<sample:9>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<null>", "<sample:2>", "<b:false>", "2147483647"}}, 1), new String[][]{{"getDelegatee", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "resolve", new String[]{"com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:10>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "withIgnorals", "java.lang.String[]", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"id\t"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<null>", "<sample:0>", "<b:false>", "Cmas"}}), new String[][]{{"intValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "filterBeanProperties", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:0>", "<sample:4>", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_constructWriter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.ser.PropertyBuilder,boolean,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:2>", "<sample:4>", "<sample:2>", "<sample:0>", "false", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "serializeFields", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:_L>", "<sample:10>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_customTypeId", "java.lang.Object", "<i:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "serializeFieldsFiltered", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<b:true>", "<sample:5>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "getDelegatee", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:2>", "<sample:10>", "<sample:4>", "false"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", "com.fasterxml.jackson.databind.ser.Serializers", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "resolve", new String[]{"com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:11>", "<sample:1>", "true"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"array\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDou...#326#-1883172651", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:5>", "<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:8>", "<empty>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<sample:0>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:3>", "<sample:2>", "false", "<sample:10>", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "processViews", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", "<sample:2>", "<sample:5>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1E-.5", "false"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "resolve", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:2>"}}, 3), new String[][]{{"intValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "_serializeWithObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "boolean"}, new String[]{"<s:key>", "<sample:2>", "<sample:4>", "false"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFieldsFiltered", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:>", "<sample:9>", "<sample:11>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:5>", "<empty>", "<i:22>", "-1073741824"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<b:false>", "<sample:8>", "<sample:12>"}, {"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:12>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "asArraySerializer", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "withFilterId", "java.lang.Object", "<d:1.5>"}}), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"object\",\"properties\":{},\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=f...#359#499647695", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifySecondaryTypesByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:10>", "<sample:5>"}, true), new String[][]{{"containedTypeCount", "", "3"}, {"hasRawClass", "java.lang.Class", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:8>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifySecondaryTypesByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:2>", "<sample:4>"}, true), new String[][]{{"forcedNarrowBy", "java.lang.Class", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#589#-669445604", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:2>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "createSchemaNode", "java.lang.String,boolean", "-1", "true"}}, 2), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializer", actual.getClass().getName());
  assertEquals("BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<s:a>", "<sample:1>", "<sample:2>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_serializeObjectId", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "<s:ta>", "<sample:2>", "<null>", "<sample:10>", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:-5>", "<sample:12>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<i:1>", "<sample:5>", "<sample:10>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructPropertyBuilder", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findKeySerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:4>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:11>", "<sample:9>", "<sample:9>", "true"}}), new String[][]{{"getClassAnnotations", "", "7"}, {"annotations", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<empty>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "hasRawClass", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.JavaType", "useStaticType", ""}}, 2), new String[][]{{"insert", "int,int", "2"}, {"append", "java.lang.CharSequence,int,int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("1[[Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;a", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "withDelegate", new String[]{"com.fasterxml.jackson.databind.util.Converter", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:17>", "<sample:2>"}, false, 3, new String[][]{}), new String[][]{{"createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:9>", "<sample:6>", "true", "<sample:12>", "<sample:8>"}, false), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "5"}, {"_withValueTypeSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructObjectIdHandler", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:3>", "<sample:1>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_constructWriter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.ser.PropertyBuilder,boolean,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:5>", "<sample:8>", "<sample:7>", "<sample:5>", "true", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:11>", "<sample:4>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "resolve", new String[]{"com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "isEmpty", "java.lang.Object", "<s:_>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:8>", "false", "<sample:4>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:8>", "<sample:8>", "<sample:0>", "true", "<sample:4>", "<sample:9>", "<sample:6>"}}), new String[][]{{"serialize", "java.util.Collection,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifySecondaryTypesByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:13>", "<sample:6>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"narrowBy", "java.lang.Class", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava...#593#-1774974891", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "getParameterSource", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("[[Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "withIgnorals", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("[[Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "handledType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Boolean {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Boolean, getClasses=[], getConstructors=[public java.lang.Boolean(boolean), public java.lang.Boolean..,...#855#-1062272648", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>", "false", "<sample:4>", "<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JsonSerializer", "<sample:9>", "<sample:6>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAnnotations", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:6>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("sample[[Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "_serializeObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId"}, new String[]{"<sample:1>", "<sample:6>", "<sample:2>", "<sample:8>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "hasRawClass", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:2>", "<sample:8>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructPropertyBuilder", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isFinal", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAddonType", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:7>", "<sample:5>", "<sample:5>", "true"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:2>", "<sample:2>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_findSerializer", "java.lang.Object,com.fasterxml.jackson.databind.SerializerProvider", "<i:0>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "handledType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"string\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDo...#327#932457727", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<null>", "<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByLookup", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:10>", "<sample:2>", "<sample:2>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>", "true", "<sample:9>", "<sample:8>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:10>", "<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "findConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isPrimitive", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:10>", "<sample:8>", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:2>", "<sample:6>", "<sample:4>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"2020-00-01", "false"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"2020-00-01\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCont...#347#-310555216", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isThrowable", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "widenContentsBy", "java.lang.Class", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructPropertyBuilder", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "narrowContentsBy", "java.lang.Class", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("941574457", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:7>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<null>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>", "false", "<sample:5>", "<sample:3>"}, false, 1, new String[][]{}, 3), new String[][]{{"usesObjectId", "", "4"}, {"serialize", "java.util.List,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:6>", "<null>", "<i:-15>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "withFilterId", "java.lang.Object", "<i:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "serializeFields", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:1>", "<sample:4>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:8>", "<s:kx>", "<s:sa_>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "false", "<sample:8>", "<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:8>", "<sample:9>", "true", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructObjectIdHandler", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:5>", "<sample:1>", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>", "false", "<sample:4>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<i:62>"}, false, 0, null, 1), new String[][]{{"getRawClass", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [[Lgenerated.algorithm.SearchInputFactory_scaffolding$GenericSub; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., ...#651#-564124287", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_verifyAsClass", new String[]{"java.lang.Object", "java.lang.String", "java.lang.Class"}, new String[]{"<i:-86>", "-0./5.", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:4>", "<sample:10>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "hasRawClass", "java.lang.Class", "<sample:3>"}, {"com.fasterxml.jackson.databind.JavaType", "containedTypeName", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "toCanonical", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "containedTypeCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[[Lgenerated.algorithm.SearchInputFactory_scaffolding$GenericSub;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "containedTypeName", new String[]{"int"}, new String[]{"536870895"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "containedTypeOrUnknown", "int", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:3>", "<sample:3>", "false", "<sample:1>", "<sample:13>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "widenBy", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "isArrayType", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:10>", "<sample:1>", "false", "<sample:0>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConverter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSetSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.EnumSetSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:8>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<null>", "<b:true>", "<s:_>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "usesObjectId", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:8>", "<sample:7>", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>", "<sample:6>", "<sample:3>", "true", "<sample:5>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:0>", "<null>", "true", "<sample:6>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:12>", "<sample:3>", "<sample:4>", "true", "<sample:4>", "<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "false", "<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_constructWriter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.ser.PropertyBuilder,boolean,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:1>", "<sample:4>", "<sample:8>", "<sample:3>", "true", "<sample:3>"}}, 1), new String[][]{{"usesObjectId", "", "4"}, {"isUnwrappingSerializer", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "hasGenericTypes", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>", "<sample:2>", "<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "customSerializers", ""}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>", "<sample:6>", "<sample:4>"}}, 1), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<null>", "<sample:0>", "true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "useStaticType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isAbstract", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:0>", "<sample:5>", "false", "<sample:3>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findFilterId", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:1>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:4>", "<sample:6>", "true", "<sample:4>", "<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:4>", "<sample:0>", "<sample:4>", "false", "<sample:0>", "<sample:1>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<d:-4.415>"}, false, 6, new String[][]{}, 3), new String[][]{{"serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "_serializeWithObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<s:B.>", "<sample:8>", "<sample:10>", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "handledType", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:11>", "<null>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", "com.fasterxml.jackson.databind.ser.Serializers", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:14>", "<sample:7>", "<sample:2>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:8>", "<d:0.15>", "<s:dk0eyy>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<null>", "<sample:9>", "false", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_constructWriter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.ser.PropertyBuilder,boolean,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:3>", "<sample:1>", "<sample:10>", "<sample:1>", "false", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:7>", "<sample:7>", "<sample:2>", "false"}}, 3), new String[][]{{"serializeContents", "java.util.Iterator,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findKeySerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<d:1.516>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "isAbstract", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"[1,A2]", "false"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"[1,A2]\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContaine...#343#986509129", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "hasGenericTypes", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>", "<sample:6>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "isMapLikeType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("941574457", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "asArraySerializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "usesObjectId", ""}}, 2), new String[][]{{"isEmpty", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 7, new String[][]{}, 3), new String[][]{{"POJONode", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.POJONode", actual.getClass().getName());
  assertEquals("2 {canConvertToInt=false, canConvertToLong=false, getNodeType=POJO, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFlo...#310#84165850", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>", "<null>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "toCanonical", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[[Lgenerated.algorithm.SearchInputFactory_scaffolding$GenericSub;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>", "false", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerFromAnnotation", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:7>", "<sample:8>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_constructWriter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.ser.PropertyBuilder,boolean,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:11>", "<sample:6>", "<null>", "<sample:6>", "false", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:5>", "<sample:6>", "true", "<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByLookup", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:5>", "<sample:3>", "<sample:4>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<null>", "<sample:13>", "<sample:6>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:k exS>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:2>", "<sample:6>", "false", "<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_verifyAsClass", "java.lang.Object,java.lang.String,java.lang.Class", "<i:1>", "0L", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:3>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifyTypeByAnnotation", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:3>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer", "<null>", "<sample:3>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "serializeFieldsFiltered", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<null>", "<null>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createTypeSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:3>"}, false, 7, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "withContentValueHandler", new String[]{"java.lang.Object"}, new String[]{"<s:8Eb>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:8>", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdSerializer", "handledType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isAbstract", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", actual.getClass().getName());
  assertEquals("{hasKeySerializers=false, hasSerializerModifiers=false, hasSerializers=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "getDelegatee", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "getContentType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=[Lgenerated/algorithm/SearchInputFactory_scaffolding$Generic.., get...#616#933686416", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "getRawClass", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [[Lgenerated.algorithm.SearchInputFactory_scaffolding$GenericSub; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., ...#651#-564124287", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getDelegatee", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:7>", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "isArrayType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("941574457", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<s:ke#>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:6>", "<sample:0>", "<d:1.17>", "1073741823"}, {"com.fasterxml.jackson.databind.ser.std.StdSerializer", "isEmpty", "java.lang.Object", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "widenContentsBy", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "isMapLikeType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getDelegatee", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", new String[]{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "java.lang.Class[]"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "filterBeanProperties", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<null>", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>", "<sample:4>", "<sample:7>", "true", "<sample:1>", "<sample:9>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isInterface", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "getErasedSignature", "java.lang.StringBuilder", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "forcedNarrowBy", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>", "<sample:6>", "<sample:9>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructObjectIdHandler", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:0>", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAnnotations", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:12>", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.StringArraySerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "withTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "_narrow", "java.lang.Class", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "getDelegatee", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isEnumType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "isArrayType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanProperties", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.ser.BeanSerializerBuilder"}, new String[]{"<null>", "<sample:3>", "<sample:3>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<null>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructPropertyBuilder", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", "com.fasterxml.jackson.databind.ser.Serializers", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalKeySerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:5>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "containedTypeName", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("E", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:3>", "<sample:4>", "false", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>", "<sample:7>", "<sample:2>", "true", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.IterableSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_findSerializer", new String[]{"java.lang.Object", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<b:true>", "<sample:5>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_verifyAsClass", new String[]{"java.lang.Object", "java.lang.String", "java.lang.Class"}, new String[]{"<sample:0>", "--0.0", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", "com.fasterxml.jackson.databind.ser.Serializers", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_constructWriter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "com.fasterxml.jackson.databind.type.TypeBindings", "com.fasterxml.jackson.databind.ser.PropertyBuilder", "boolean", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:1>", "<sample:5>", "<null>", "<sample:3>", "false", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifyTypeByAnnotation", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:7>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "withContentTypeHandler", new String[]{"java.lang.Object"}, new String[]{"<d:1.17>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "isArrayType", ""}, {"com.fasterxml.jackson.databind.JavaType", "narrowBy", "java.lang.Class", "<sample:0>"}}), new String[][]{{"getErasedSignature", "java.lang.StringBuilder", "1"}, {"insert", "int,boolean", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:3>", "<sample:9>", "false", "<sample:7>", "<sample:0>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "isThrowable", ""}}), new String[][]{{"indexOf", "java.lang.String,int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "handledType", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1.5e3000xFFFFFFFFF"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "isUnwrappingSerializer", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1.5e3000xFFFFFFFFF\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNod...#339#-48412154", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "narrowContentsBy", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isMapLikeType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializerBuilder", new String[]{"com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAddonType", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:5>", "<sample:7>", "<null>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", actual.getClass().getName());
  assertEquals("{getFilteredProperties=null, hasProperties=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildArraySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>", "<sample:2>", "<null>", "false", "<sample:9>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isPotentialBeanType", "java.lang.Class", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSuppressableContentValue", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:9>", "<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAddonType", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:6>", "<sample:0>", "<sample:4>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<i:62>", "<sample:9>", "<sample:8>", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "resolve", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_customTypeId", "java.lang.Object", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createTypeSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:1>", "<sample:6>", "<sample:3>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:3>", "<s:ta>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isIndexedList", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "containedTypeCount", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildEnumSetSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_constructWriter", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.ser.PropertyBuilder,boolean,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:0>", "<sample:6>", "<sample:2>", "<sample:7>", "true", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyTypeSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:5>", "<sample:6>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.EnumSetSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "resolve", "com.fasterxml.jackson.databind.SerializerProvider", "<null>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "isEmpty", "java.lang.Object", "<i:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:7>", "<sample:6>", "<sample:3>", "true"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:2>", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "customSerializers", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "widenBy", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:8>", "true", "<sample:2>", "<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyContentTypeSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:5>", "<sample:5>", "<sample:4>"}}), new String[][]{{"serializeContents", "java.util.List,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructPropertyBuilder", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<null>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_createSerializer2", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:2>", "<sample:2>", "<sample:4>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "withStaticTyping", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:3>", "<null>", "false"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "createSchemaNode", "java.lang.String,boolean", "Cmas", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"object\",\"properties\":{},\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=f...#359#499647695", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:7>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifyTypeByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:6>", "<sample:3>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] -> [simple type, class generated...#758#-1293860936", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAnnotations", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<sample:8>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withSerializerModifier", "com.fasterxml.jackson.databind.ser.BeanSerializerModifier", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "handledType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"0x1F\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#-1483191893", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "getKeyType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "containedType", "int", "-1073741844"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isCollectionLikeType", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "widenBy", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "isMapLikeType", ""}, {"com.fasterxml.jackson.databind.JavaType", "isFinal", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByLookup", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,boolean", "<null>", "<sample:5>", "<sample:4>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "_customTypeId", new String[]{"java.lang.Object"}, new String[]{"<s:aT>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "createObjectNode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "<sample:8>", "true"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyContentTypeSerializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<null>", "<sample:7>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "_serializeWithObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<i:2>", "<sample:4>", "<sample:0>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:7>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:2>", "<sample:1>", "<d:0.585>", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isPotentialBeanType", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "findConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter"}, new String[]{"<null>", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<d:2.34>", "<sample:9>", "<sample:0>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:8>", "<sample:0>", "true", "<sample:2>", "<sample:6>", "<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "filterBeanProperties", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:0>", "<sample:6>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "convertValue", new String[]{"java.lang.Object"}, new String[]{"<d:1.17>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "getGenericSignature", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[[Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "handledType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_serializeWithObjectId", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<sample:1>", "<sample:7>", "<sample:7>", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:5>", "<null>", "false"}, false, 5, new String[][]{}), new String[][]{{"findValuesAsText", "java.lang.String,java.util.List", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withSerializerModifier", new String[]{"com.fasterxml.jackson.databind.ser.BeanSerializerModifier"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByPrimaryType", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:12>", "<null>", "<sample:2>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"536870895"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "getRawClass", ""}, {"com.fasterxml.jackson.databind.JavaType", "getTypeHandler", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, isAbstra...#430#255789530", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>", "<sample:2>", "<sample:4>", "false", "<sample:0>", "<sample:4>", "<sample:4>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.MapSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:2>", "<null>", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", "com.fasterxml.jackson.databind.ser.Serializers", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:7>", "<sample:0>", "<sample:6>", "false"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:6>", "true", "<sample:3>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getDelegatee", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "asArraySerializer", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:3>", "<sample:4>", "<sample:3>"}, false, 5, new String[][]{}), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildContainerSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:8>", "<sample:6>", "<sample:5>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "processViews", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.ser.BeanSerializerBuilder"}, new String[]{"<null>", "<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByLookup", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:0>", "<sample:6>", "<sample:2>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withAdditionalSerializers", new String[]{"com.fasterxml.jackson.databind.ser.Serializers"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "filterBeanProperties", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:1>", "<sample:4>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "isEmpty", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<d:0.75>", "<sample:11>", "<sample:10>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "resolve", new String[]{"com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "handledType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:0>", "<null>", "<sample:0>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isConcrete", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "containedType", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:4>", "false", "<sample:0>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withConfig", "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "<sample:0>"}}), new String[][]{{"serialize", "java.util.List,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:9>", "<sample:2>", "true", "<sample:9>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", "com.fasterxml.jackson.databind.JavaType,boolean,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>", "true", "<sample:0>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IteratorSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"keySerializers", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ArrayIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIteratorSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:5>", "<sample:0>", "true", "<sample:9>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "isIndexedList", "java.lang.Class", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyContentTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:2>", "<sample:5>", "<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withSerializerModifier", "com.fasterxml.jackson.databind.ser.BeanSerializerModifier", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:6>", "<sample:1>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "isEmpty", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object"}, new String[]{"<sample:8>", "<s:b>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,java.lang.String", "<sample:5>", "<empty>", "<i:-56>", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "getConverter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "_serializeWithObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "boolean"}, new String[]{"<s:kex>", "<sample:7>", "<sample:8>", "true"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:5>", "<sample:8>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:9>", "false", "<sample:1>", "<sample:6>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CollectionSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "findConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter"}, new String[]{"<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFields", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:e>", "<sample:9>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "handledType", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription", "<sample:1>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAnnotations", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:10>", "<sample:1>", "<sample:8>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:7>", "<sample:0>", "<sample:3>", "true", "<sample:3>", "<sample:0>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.CollectionSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "_findKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>", "<sample:4>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "withDelegate", new String[]{"com.fasterxml.jackson.databind.util.Converter", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:4>", "<sample:8>", "<s:Bb>", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructBeanSerializerBuilder", new String[]{"com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>"}, false), new String[][]{{"getBeanDescription", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:0>", "<b:true>", "<i:41>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "getDelegatee", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:_>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "toCanonical", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "false"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:9>", "<sample:1>"}}), new String[][]{{"isPojo", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"decimalValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "usesStaticTyping", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<sample:6>", "<sample:1>", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "isDefaultSerializer", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:8>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByLookup", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "<sample:4>", "false"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAddonType", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:5>", "<sample:5>", "<sample:1>", "true"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"PT1H", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdSerializer", "createSchemaNode", "java.lang.String", "properties"}}), new String[][]{{"asDouble", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "getParameterSource", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "withTypeHandler", "java.lang.Object", "<i:-1023>"}, {"com.fasterxml.jackson.databind.JavaType", "_widen", "java.lang.Class", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "serializeFields", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:1>", "<sample:6>", "<sample:8>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "asArraySerializer", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"8"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"8\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=...#322#-1747564236", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructPropertyBuilder", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanProperties", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.ser.BeanSerializerBuilder", "<sample:7>", "<sample:2>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.PropertyBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription,boolean,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.JsonSerializer", "<sample:9>", "<sample:3>", "<sample:5>", "false", "<sample:7>", "<sample:5>", "<null>"}}), new String[][]{{"hasKeySerializers", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIterableSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:10>", "<sample:1>", "true", "<sample:3>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "_serializeObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId"}, new String[]{"<i:1>", "<sample:3>", "<sample:1>", "<sample:2>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "_widen", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "isJavaLangObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "containedTypeName", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:6>", "<sample:2>", "<s:ua>", "2020-02-30T25:61:61"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "containedType", new String[]{"int"}, new String[]{"1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "withValueHandler", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "getGenericSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "widenBy", "java.lang.Class", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("[[Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "createKeySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:6>", "<sample:7>", "<sample:3>"}, false, 5, new String[][]{}), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FailingSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findBeanSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<sample:7>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "isArrayType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "isJavaLangObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildIndexedListSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<null>", "false", "<sample:2>", "<sample:9>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByPrimaryType", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,boolean", "<sample:6>", "<sample:1>", "<sample:1>", "true"}}), new String[][]{{"withValueTypeSerializer", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:3>", "<sample:3>", "true"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdSerializer", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:11>", "<sample:3>", "<s:k0eyy>", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"boolean\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isD...#328#-1073528860", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdSerializer", "createSchemaNode", "java.lang.String,boolean", "type", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "containedTypeOrUnknown", new String[]{"int"}, new String[]{"67108864"}, false), new String[][]{{"isAbstract", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "widenContentsBy", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "isCollectionLikeType", ""}, {"com.fasterxml.jackson.databind.JavaType", "getErasedSignature", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withConfig", new String[]{"com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig"}, new String[]{"<sample:3>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "findConvertingContentSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdSerializer", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildCollectionSerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:2>", "<sample:4>", "<sample:6>", "false", "<sample:8>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "findPropertyFilter", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Object", "java.lang.Object"}, new String[]{"<sample:11>", "<b:true>", "<i:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdSerializer", "createSchemaNode", "java.lang.String,boolean", " is not assignable to 0x1F", "true"}, {"com.fasterxml.jackson.databind.ser.std.StdSerializer", "getDelegatee", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "buildMapEntrySerializer", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:1>", "<sample:1>", "true", "<sample:6>", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.BeanDescription,java.util.List", "<sample:3>", "<sample:4>", "<sample:2>"}, {"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withSerializerModifier", "com.fasterxml.jackson.databind.ser.BeanSerializerModifier", "<sample:5>"}}), new String[][]{{"getContentType", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#589#-669445604", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "isUnwrappingSerializer", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "withStaticTyping", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getKeyType", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "_serializeObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId"}, new String[]{"<sample:3>", "<sample:6>", "<sample:11>", "<sample:4>", "<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:2>", "<sample:8>", "<s:bu>", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructFilteredBeanWriter", new String[]{"com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "java.lang.Class[]"}, new String[]{"<sample:2>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView", actual.getClass().getName());
  assertEquals("property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=!NullPointerException, isUnwrapping=false, isVirtual=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "useStaticType", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "constructObjectIdHandler", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:8>", "<sample:5>", "<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "withConfig", "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1L", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1L\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble...#323#-1253520983", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findPropertyTypeSerializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<null>", "<sample:3>", "<null>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "modifySecondaryTypesByAnnotation", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:6>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#589#-669445604", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "findSerializerByAddonType", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "boolean"}, new String[]{"<sample:1>", "<sample:4>", "<sample:6>", "true"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "narrowBy", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "isContainerType", ""}, {"com.fasterxml.jackson.databind.JavaType", "withTypeHandler", "java.lang.Object", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:3>", "<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdSerializer", "isEmpty", "java.lang.Object", "<s:ta>"}, {"com.fasterxml.jackson.databind.ser.std.StdSerializer", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "_assertSubclass", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:4>", "<empty>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "getErasedSignature", "java.lang.StringBuilder", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "com.fasterxml.jackson.databind.ser.BeanSerializerFactory", "removeSetterlessGetters", new String[]{"com.fasterxml.jackson.databind.SerializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "java.util.List"}, new String[]{"<sample:9>", "<sample:2>", "<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.StdSerializer", "com.fasterxml.jackson.databind.ser.std.BooleanSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.StdSerializer", "getDelegatee", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.std.BooleanSerializer", actual.getClass().getName());
  assertEquals("{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.type.ArrayType", "getErasedSignature", new String[]{"java.lang.StringBuilder"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.JavaType", "narrowContentsBy", "java.lang.Class", "<null>"}, {"com.fasterxml.jackson.databind.JavaType", "forcedNarrowBy", "java.lang.Class", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("[[Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[array type, component type: [array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]]] {getErasedSignature=[[Lgenerated/algorithm/SearchInputFac...#646#374692064", SearchInputFactory_scaffolding.receiverState());
 }
}
