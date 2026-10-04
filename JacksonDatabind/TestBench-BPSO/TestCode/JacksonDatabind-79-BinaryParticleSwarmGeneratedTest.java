package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ObjectIdInfo: propName=<a><b>t</b></a>, scope=java.lang.Object, generatorType=java.util.List, alwaysAsId=false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ObjectIdInfo: propName=<a><b>t</b></a>, scope=java.lang.Object, generatorType=java.util.List, alwaysAsId=false {getAlwaysAsId=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyDescription", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findKeySerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:9>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class", "<sample:7>", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "getPropertyName", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "withAlwaysAsId", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals(" {getNamespace=null, getSimpleName=, hasNamespace=false, hasSimpleName=false, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ObjectIdInfo: propName=, scope=null, generatorType=null, alwaysAsId=false {getAlwaysAsId=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNamingStrategy", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findInjectableValueId", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:5>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findTypeName", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findAndAddVirtualProperties", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "java.util.List"}, new String[]{"<sample:0>", "<sample:4>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:7>", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_isIgnorable", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:11>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyContentTypeResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:6>", "<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFieldsFiltered", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<sample:2>", "<sample:0>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "findFormatOverrides", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,java.lang.Class", "<sample:9>", "<sample:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"1.5d\"} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDoub...#325#-1770491942", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationContentConverter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNullSerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:8>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findFilterId", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:11>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isTypeId", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:6>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isAnnotationBundle", "java.lang.annotation.Annotation", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAnyGetterAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findContentDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:2>"}, false, 3, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<null>", "<sample:0>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes"}, new String[]{"<sample:4>", "<sample:6>", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "withIgnorals", "java.lang.String[]", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructStdTypeResolverBuilder", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findObjectReferenceInfo", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:9>", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasRequiredMarker", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:1>"}}), new String[][]{{"buildTypeSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Prop", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:4>", "<sample:5>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findObjectIdInfo", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:15>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findKeyDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:12>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "_serializeObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId"}, new String[]{"<i:-20>", "<sample:1>", "<null>", "<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:6>", "<s:.r>>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:3>", "<sample:7>", "<sample:2>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:1>", "<sample:2>", "<s:>", "020"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "getDelegatee", ""}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "resolve", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasCreatorAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationTyping", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasCreatorAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNameForDeserialization", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:10>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findAutoDetectVisibility", "com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:1>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_propertyName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"50", ""}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", ""}}, 2), new String[][]{{"withSimpleName", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("a {getNamespace=null, getSimpleName=a, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "serializeFieldsFiltered", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:>", "<null>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_serializeObjectId", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "<s:.r>>", "<sample:6>", "<sample:5>", "<sample:7>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findEnumValues", new String[]{"java.lang.Class", "java.lang.Enum[]", "java.lang.String[]"}, new String[]{"<null>", "<sample:2>", "<empty>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationContentConverter", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyIndex", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSubtypes", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:17>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyContentTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findFormat", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:22>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "setConstructorPropertiesImpliesCreator", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyDefaultValue", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:20>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAnySetterAnnotation", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:0>"}}), new String[][]{{"findSerializationInclusionForContent", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.annotation.JsonInclude$Include", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_ABSENT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "withObjectIdWriter", new String[]{"com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:12>", "<sample:9>", "<sample:6>"}}), new String[][]{{"usesObjectId", "", "4"}, {"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "withObjectIdWriter", new String[]{"com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "properties", ""}}), new String[][]{{"withFilterId", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializer", actual.getClass().getName());
  assertEquals("BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findEnumValues", new String[]{"java.lang.Class", "java.lang.Enum[]", "java.lang.String[]"}, new String[]{"<empty>", "<sample:0>", "<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:0>", "<sample:8>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationKeyType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:22>", "<sample:13>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<s:kedy>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "findConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "<sample:4>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "isEmpty", "java.lang.Object", "<i:-1>"}}, 1), new String[][]{{"createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "6"}, {"withFilterId", "java.lang.Object", "7"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findRootName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findCreatorBinding", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:10>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<d:-1.5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "asArraySerializer", ""}}), new String[][]{{"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Attr", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:8>", "<sample:0>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", "java.lang.Class", "<null>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findImplicitPropertyName", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter", actual.getClass().getName());
  assertEquals("property 'sample' (virtual, no static serializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=true, isUnwrapping=false, isVirtual=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationInclusion", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.annotation.JsonInclude$Include", "<sample:19>", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findValueInstantiator", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:3>"}}), new String[][]{{"withContentInclusion", "com.fasterxml.jackson.annotation.JsonInclude$Include", "2"}, {"getValueInclusion", "", "5"}, {"withValueInclusion", "com.fasterxml.jackson.annotation.JsonInclude$Include", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=ALWAYS,content=NON_ABSENT] {getContentInclusion=NON_ABSENT, getValueInclusion=ALWAYS}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "withIgnorals", new String[]{"java.lang.String[]"}, new String[]{"<sample:5>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:7>", "<null>", "<s:kexc>", " I"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "createSchemaNode", "java.lang.String", "rHello, World"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationInclusionForContent", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:8>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findReferenceType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:8>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationSortAlphabetically", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("ALWAYS", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:17>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationConverter", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:21>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findImplicitPropertyName", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "refineSerializationType", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:11>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findInjectableValueId", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNameForSerialization", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:9>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<empty>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findUnwrappingNameTransformer", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "_serializeWithObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<s:a>", "<sample:8>", "<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "properties", ""}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:2>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationContentConverter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "resolveSetterConflict", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:9>", "<sample:3>", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "version", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyDefaultValue", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:9>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findViews", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>"}}, 1), new String[][]{{"isUknownVersion", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findClassDescription", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findContentSerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationContentConverter", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:9>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyAccess", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findCreatorBinding", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:20>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "resolveSetterConflict", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:10>", "<sample:5>", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_propertyName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"x0F", "1e110"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSubtypes", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:15>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "resolveSetterConflict", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:4>", "<sample:13>", "<sample:5>"}}), new String[][]{{"hasSimpleName", "", "4"}, {"getNamespace", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e110", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findRootName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "resolveSetterConflict", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:4>", "<sample:13>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilderConfig", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationTyping", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:1>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyTypeResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAnyGetterAnnotation", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findIgnoreUnknownProperties", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:9>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "findConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "<sample:6>", "<sample:4>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:18>", "<sample:0>"}}), new String[][]{{"isLong", "", "6"}, {"isMissingNode", "", "2"}, {"binaryValue", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationContentType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:15>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "resolveSetterConflict", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:7>", "<sample:13>", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "findConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter"}, new String[]{"<sample:11>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "withFilterId", "java.lang.Object", "<s:.>>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Prop", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:3>", "<sample:9>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "refineDeserializationType", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:7>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "readResolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:4>", "<sample:0>"}}, 1), new String[][]{{"findUnwrappingNameTransformer", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "3"}, {"findIgnoreUnknownProperties", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false), new String[][]{{"withObjectIdWriter", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "4"}, {"serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertiesToIgnore", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:22>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findKeyDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilder", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:12>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "resolveSetterConflict", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:5>", "<sample:3>", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findKeyDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:15>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.Collection {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.Collection, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[],...#556#1623681001", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findObjectReferenceInfo", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:11>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructNoTypeResolverBuilder", ""}}, 2), new String[][]{{"withAlwaysAsId", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.ObjectIdInfo", actual.getClass().getName());
  assertEquals("ObjectIdInfo: propName={sample}0, scope=generated.algorithm.SearchInputFactory_scaffolding$GenericBase, generatorType=generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf, alwaysAsId=true {g...#218#-263105919", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "asArraySerializer", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "createSchemaNode", "java.lang.String,boolean", "5", "true"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "unwrappingSerializer", "com.fasterxml.jackson.databind.util.NameTransformer", "<sample:1>"}}, 3), new String[][]{{"getDelegatee", "", "0"}, {"acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "4"}, {"createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<null>"}, false, 4, new String[][]{}), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Attr", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:9>", "<sample:10>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationPropertyOrder", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:7>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasIgnoreMarker", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>"}}), new String[][]{{"getName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "serializeFields", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:1>", "<sample:13>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_serializeObjectId", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer,com.fasterxml.jackson.databind.ser.impl.WritableObjectId", "<sample:1>", "<sample:5>", "<sample:5>", "<sample:1>", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructStdTypeResolverBuilder", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isIgnorableType", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:8>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAsValueAnnotation", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:1>"}}, 3), new String[][]{{"getTypeProperty", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isAnnotationBundle", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isAnnotationBundle", "java.lang.annotation.Annotation", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:2>", "<sample:4>"}}, 2), new String[][]{{"withObjectIdWriter", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "6"}, {"isUnwrappingSerializer", "", "7"}, {"createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<s:.r >>", "<sample:2>", "<sample:12>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "isDefaultSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:5>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "resolve", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:11>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:4>"}}), new String[][]{{"usesObjectId", "", "1"}, {"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"object\",\"properties\":{},\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=f...#359#499647695", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "withAlwaysAsId", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "getGeneratorType", ""}, {"com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "getResolverType", ""}}, 3), new String[][]{{"getScope", "", "3"}, {"getPropertyName", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("0 {getNamespace=null, getSimpleName=0, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ObjectIdInfo: propName=0, scope=generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf, generatorType=java.lang.Integer, alwaysAsId=false {getAlwaysAsId=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<s:kex>", "<sample:5>", "<sample:5>", "<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_propertyName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{" generatnorType=", "m.5"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("{m.5} generatnorType= {getNamespace=m.5, getSimpleName= generatnorType=, hasNamespace=true, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilder", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:6>", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<i:1>", "<null>", "<sample:1>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationContentType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationContentConverter", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:6>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationContentType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:7>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "getScope", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "withAlwaysAsId", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.Map {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.util.Map, getClasses=[interface java.util.Map$Entry], getConstructors=[], getDeclaredAnnotations=[], getDec...#430#-1339089766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ObjectIdInfo: propName=sample, scope=java.util.Map, generatorType=java.lang.Comparable, alwaysAsId=true {getAlwaysAsId=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findFormat", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:9>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationKeyType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:7>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "acceptJsonFormatVisitor", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "visitStringFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat", "<sample:6>", "<sample:3>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isTypeId", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findEnumValues", new String[]{"java.lang.Class", "java.lang.Enum[]", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:1>", "<sample:2>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "readResolve", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:2>", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findClassDescription", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:5>"}}, 2), new String[][]{{"findPropertyDescription", "com.fasterxml.jackson.databind.introspect.Annotated", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationConverter", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:18>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationKeyType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", "java.util.Collection", "<null>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findContentDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:8>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_hasOneOf", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class[]"}, new String[]{"<sample:10>", "<sample:1>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isAnnotationBundle", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findContentSerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyDefaultValue", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:14>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Prop", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:5>", "<sample:1>", "<sample:3>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findKeySerializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:14>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", "java.util.Collection", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findEnumValues", new String[]{"java.lang.Class", "java.lang.Enum[]", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:0>", "<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findRootName", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:5>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "version", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isAnnotationBundle", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<empty>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationKeyType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_isIgnorable", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:10>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationContentType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:13>", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "getAlwaysAsId", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ObjectIdInfo: propName=, scope=java.lang.Object, generatorType=null, alwaysAsId=false {getAlwaysAsId=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "findConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:3>", "<empty>", "<i:52>", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:kexc>", "<sample:4>", "<sample:9>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNameForDeserialization", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:9>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_isIgnorable", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:13>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findValueInstantiator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyDefaultValue", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:16>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationTyping", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:15>"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationTyping", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertiesToIgnore", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:8>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationInclusion", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.annotation.JsonInclude$Include", "<sample:13>", "<sample:5>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationInclusionForContent", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:16>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasCreatorAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findReferenceType", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:8>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<s:w.r>>"}, false, 0, null, 1), new String[][]{{"getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findFormat", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationContentType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:16>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findContentDeserializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:8>"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationContentType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:9>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findCreatorBinding", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:15>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationInclusion", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_ABSENT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasIgnoreMarker", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:7>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findClassDescription", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationConverter", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:10>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationSortAlphabetically", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "replaceDelegatee", new String[]{"com.fasterxml.jackson.databind.JsonSerializer"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_hasOneOf", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class[]"}, new String[]{"<sample:20>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class", "<sample:13>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findFormat", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "refineSerializationType", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:17>", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findViews", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:15>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:1>", "<sample:12>", "<sample:6>", "<sample:9>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findTypeResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:4>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSubtypes", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNameForSerialization", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isIgnorableType", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findWrapperName", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationInclusionForContent", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_NULL", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "withIgnorals", new String[]{"java.lang.String[]"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "findConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "<sample:8>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationSortAlphabetically", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:20>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "withObjectIdWriter", new String[]{"com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:7>"}, false, 0, null, 2), new String[][]{{"createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "version", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getGroupId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationTyping", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findCreatorBinding", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findTypeName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "readResolve", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "withIgnorals", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:2>", "<sample:2>", "<i:-11>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:10>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:21>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findViews", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "setConstructorPropertiesImpliesCreator", "boolean", "true"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationTyping", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:5>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "getScope", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "getResolverType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ObjectIdInfo: propName={{\"a\":1}}<a><b>t</b></a>, scope=int, generatorType=[Ljava.lang.String;, alwaysAsId=false {getAlwaysAsId=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findFilterId", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findAndAddVirtualProperties", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "java.util.List"}, new String[]{"<null>", "<sample:4>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationContentType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:23>", "<sample:15>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findAndAddVirtualProperties", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "java.util.List"}, new String[]{"<sample:0>", "<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationKeyType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:11>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilderConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:5>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type", "<sample:3>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_propertyName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.15", "2"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", "java.lang.Class", "<sample:0>"}}, 2), new String[][]{{"internSimpleName", "", "3"}, {"simpleAsEncoded", "com.fasterxml.jackson.databind.cfg.MapperConfig", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.io.SerializedString", actual.getClass().getName());
  assertEquals("1.15 {getValue=1.15}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationContentConverter", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationKeyType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:12>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findConstructorName", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findWrapperName", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:16>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findEnumValue", "java.lang.Enum", "<empty>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationType", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:21>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findUnwrappingNameTransformer", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertiesToIgnore", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "boolean"}, new String[]{"<sample:10>", "false"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationContentType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:9>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAnySetterAnnotation", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:6>"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyDescription", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "readResolve", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "refineDeserializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:1>", "<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findAutoDetectVisibility", "com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:3>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_propertyName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1.6", ", scope="}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findReferenceType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:6>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", "java.lang.Class", "<sample:1>"}}, 2), new String[][]{{"internSimpleName", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("{, scope=}1.6 {getNamespace=, scope=, getSimpleName=1.6, hasNamespace=true, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_hasAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:14>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findInjectableValueId", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:8>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "pair", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "_serializeObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer", "com.fasterxml.jackson.databind.ser.impl.WritableObjectId"}, new String[]{"<i:24>", "<sample:4>", "<sample:8>", "<null>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findFilterId", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findUnwrappingNameTransformer", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyIndex", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:1>"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertiesToIgnore", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "boolean"}, new String[]{"<sample:9>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationContentConverter", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findContentSerializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findTypeName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<s:a6>", "<null>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "createSchemaNode", "java.lang.String,boolean", "0x1F", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "refineSerializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:1>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "refineDeserializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<null>", "<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNamingStrategy", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "readResolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "nopInstance", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findViews", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructStdTypeResolverBuilder", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyTypeResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:1>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationTyping", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "version", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.9-2 {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=9, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationConverter", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>"}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNameForSerialization", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "_serializeWithObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "boolean"}, new String[]{"<s:>", "<sample:0>", "<sample:0>", "true"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertiesToIgnore", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:12>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "setConstructorPropertiesImpliesCreator", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "serialize", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:1>", "<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "acceptJsonFormatVisitor", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyDefaultValue", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findViews", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findEnumValue", new String[]{"java.lang.Enum"}, new String[]{"<empty>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "readResolve", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "getSchema", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.reflect.Type", "boolean"}, new String[]{"<sample:0>", "<null>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes", "<sample:5>", "<sample:2>", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findClassDescription", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findWrapperName", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findKeyDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNameForDeserialization", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:9>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "refineDeserializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:8>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findContentDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericLe.., get...#705#1439182783", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "resolveSetterConflict", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:6>", "<sample:7>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findAutoDetectVisibility", "com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:5>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "resolve", new String[]{"com.fasterxml.jackson.databind.SerializerProvider"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "asArraySerializer", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findKeySerializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:2>"}, false, 6, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findImplicitPropertyName", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$SingletonList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructStdTypeResolverBuilder", ""}}), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "getAlwaysAsId", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "ObjectIdInfo: propName=sample, scope=java.util.Map, generatorType=java.lang.Comparable, alwaysAsId=true {getAlwaysAsId=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findFilterId", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findObjectReferenceInfo", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:0>", "<sample:10>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyDefaultValue", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyContentTypeResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>", "<sample:6>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationConverter", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationContentConverter", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"2", "false"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "createObjectNode", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"2\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode...#338#1211578771", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:1>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<sample:0>", "<sample:0>", "<sample:0>", "1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:13>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAnyGetterAnnotation", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findReferenceType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAnySetterAnnotation", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$SingletonList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>"}, false, 3, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findAutoDetectVisibility", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:0>", "<sample:6>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", actual.getClass().getName());
  assertEquals("[Visibility: getter: PUBLIC_ONLY, isGetter: PUBLIC_ONLY, setter: ANY, creator: ANY, field: PUBLIC_ONLY]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findKeySerializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNameForDeserialization", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:10>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyInclusion", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "getPropertyName", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "getResolverType", ""}}), new String[][]{{"hasNamespace", "", "6"}, {"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "ObjectIdInfo: propName=, scope=null, generatorType=null, alwaysAsId=false {getAlwaysAsId=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationContentConverter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationTyping", "com.fasterxml.jackson.databind.introspect.Annotated", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationInclusionForContent", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:6>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_ABSENT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{";.5d1.1234567"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "findPropertyFilter", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object", "<sample:8>", "<s:kexc>", "<s:kex>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:6>", "<sample:2>", "<s:e>>", "-1073741824"}}), new String[][]{{"findValuesAsText", "java.lang.String,java.util.List", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<null>", "<sample:4>", "<sample:3>", "<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "getSchema", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.reflect.Type,boolean", "<sample:9>", "<empty>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createContextual", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:>", "<sample:1>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructStdTypeResolverBuilder", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=null, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilderConfig", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:1>"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "findFormatFeature", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.BeanProperty", "java.lang.Class", "com.fasterxml.jackson.annotation.JsonFormat$Feature"}, new String[]{"<sample:7>", "<sample:5>", "<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "createSchemaNode", "java.lang.String,boolean", "", "true"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findConstructorName", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:8>"}, false, 2, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "nopInstance", new String[]{}, new String[]{}, true), new String[][]{{"findDeserializationType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNullSerializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationPropertyOrder", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyDefaultValue", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findContentDeserializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyDefaultValue", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:18>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findInjectableValueId", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:5>", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "setConstructorPropertiesImpliesCreator", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructStdTypeResolverBuilder", ""}}), new String[][]{{"findPropertyDefaultValue", "com.fasterxml.jackson.databind.introspect.Annotated", "7"}, {"findSerializationContentType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilder", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<null>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "readResolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyInclusion", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>"}}), new String[][]{{"findObjectIdInfo", "com.fasterxml.jackson.databind.introspect.Annotated", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "resolve", "com.fasterxml.jackson.databind.SerializerProvider", "<sample:6>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "withIgnorals", "java.lang.String[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isF...#312#2025645260", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "withIgnorals", new String[]{"java.lang.String[]"}, new String[]{"<empty>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "findConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "<sample:3>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAsValueAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:6>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_isIgnorable", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:11>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findInjectableValueId", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationTyping", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationContentType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyIndex", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:14>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "_serializeWithObjectId", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<s:kedy>", "<null>", "<sample:6>", "<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_hasOneOf", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class[]"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationTyping", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:14>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findObjectReferenceInfo", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:14>", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "withIgnorals", new String[]{"java.lang.String[]"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "findConvertingContentSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty,com.fasterxml.jackson.databind.JsonSerializer", "<sample:2>", "<sample:0>", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFields", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<i:1>", "<sample:0>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializer", actual.getClass().getName());
  assertEquals("BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"findParents", "java.lang.String,java.util.List", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyContentTypeResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:1>", "<sample:8>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findTypeName", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Prop", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:7>", "<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findObjectIdInfo", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:19>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findObjectReferenceInfo", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:12>", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "findConvertingSerializer", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.ser.BeanPropertyWriter"}, new String[]{"<sample:7>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:4>", "<sample:5>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSubtypes", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", "java.lang.Class,java.lang.Class", "<sample:4>", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationInclusion", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.annotation.JsonInclude$Include", "<null>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "withObjectIdWriter", new String[]{"com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_serializeWithObjectId", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,boolean", "<s:>", "<sample:1>", "<sample:6>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findTypeResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:6>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findEnumValue", "java.lang.Enum", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructNoTypeResolverBuilder", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:5>", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:4>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=null, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findReferenceType", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSubtypes", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:18>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:0>", "<sample:6>", "<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "withFilterId", "java.lang.Object", "<i:26>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findEnumValues", new String[]{"java.lang.Class", "java.lang.Enum[]", "java.lang.String[]"}, new String[]{"<sample:3>", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNameForSerialization", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "getGeneratorType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "getAlwaysAsId", ""}, {"com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "getGeneratorType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericLe.., get...#705#1439182783", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ObjectIdInfo: propName={sample}0, scope=generated.algorithm.SearchInputFactory_scaffolding$GenericBase, generatorType=generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf, alwaysAsId=false {...#220#962889097", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNameForDeserialization", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:8>"}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasRequiredMarker", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSubtypes", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:11>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "empty", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.ObjectIdInfo", actual.getClass().getName());
  assertEquals("ObjectIdInfo: propName=, scope=java.lang.Object, generatorType=null, alwaysAsId=false {getAlwaysAsId=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findRootName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", "java.lang.Class", "<sample:8>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructStdTypeResolverBuilder", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "refineSerializationType", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:14>", "<sample:5>"}}), new String[][]{{"typeProperty", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasIgnoreMarker", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertiesToIgnore", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationConverter", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:19>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationTyping", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:14>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findEnumValues", "java.lang.Class,java.lang.Enum[],java.lang.String[]", "<sample:3>", "<sample:2>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "serializeWithType", new String[]{"java.lang.Object", "com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.databind.SerializerProvider", "com.fasterxml.jackson.databind.jsontype.TypeSerializer"}, new String[]{"<b:true>", "<sample:0>", "<sample:4>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:2>", "<null>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationInclusion", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:7>", "<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNamingStrategy", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:5>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("ALWAYS", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_hasAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:12>", "<sample:10>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationInclusion", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.annotation.JsonInclude$Include", "<sample:18>", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:7>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findFormat", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:11>"}, false, 6, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationInclusionForContent", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:10>", "<sample:7>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_NULL", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findImplicitPropertyName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationSortAlphabetically", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:18>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNameForDeserialization", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "properties", ""}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "withObjectIdWriter", "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "<null>"}}), new String[][]{{"isNumber", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationPropertyOrder", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:4>"}, false, 7, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_propertyName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"ti", "--0.0I"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAnyGetterAnnotation", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:6>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationKeyType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:1>"}}), new String[][]{{"hasSimpleName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findCreatorBinding", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:11>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", new String[]{"java.util.Collection"}, new String[]{"<sample:5>"}, false), new String[][]{{"removeAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:7>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer", actual.getClass().getName());
  assertEquals("UnwrappingBeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "visitFloatFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:1>", "<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "wrapAndThrow", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Throwable,java.lang.Object,int", "<sample:0>", "<sample:1>", "<sample:4>", "2147483647"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findTypeResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:0>", "<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilder", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:3>", "<sample:6>", "<sample:6>", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "visitArrayFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JsonSerializer,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:10>", "<sample:2>", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_propertyName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{";+X1", "object"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationInclusionForContent", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.annotation.JsonInclude$Include", "<sample:3>", "<null>"}}), new String[][]{{"hasSimpleName", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:5>", "<sample:7>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "properties", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "readResolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findObjectReferenceInfo", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:7>", "<sample:7>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", "java.lang.Class,java.lang.Class", "<sample:3>", "<sample:9>"}}), new String[][]{{"findPOJOBuilderConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyAccess", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:16>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findAutoDetectVisibility", "com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:7>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "getAlwaysAsId", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "getResolverType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ObjectIdInfo: propName={{\"a\":1}}<a><b>t</b></a>, scope=int, generatorType=[Ljava.lang.String;, alwaysAsId=false {getAlwaysAsId=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:12>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationKeyType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilder", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:7>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNameForDeserialization", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:19>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createSchemaNode", new String[]{"java.lang.String"}, new String[]{"tsueobject"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serialize", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:ley>", "<sample:0>", "<sample:9>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "getDelegatee", ""}}), new String[][]{{"binaryValue", "", "5"}, {"arrayNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ArrayNode", actual.getClass().getName());
  assertEquals("[] {canConvertToInt=false, canConvertToLong=false, getNodeType=ARRAY, isArray=true, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isContainerNode=true, isDouble=false, isFlo...#310#-1644340141", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"Heklo, World", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.ObjectNode", actual.getClass().getName());
  assertEquals("{\"type\":\"Heklo, World\",\"required\":true} {canConvertToInt=false, canConvertToLong=false, getNodeType=OBJECT, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=false, isCo...#349#-1771103488", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilder", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:5>"}, false, 2, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "visitStringFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:5>", "<sample:1>", "<sample:3>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationTyping", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:12>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat"}, new String[]{"<sample:4>", "<sample:1>", "<sample:1>", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "usesObjectId", ""}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "getDelegatee", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "withAlwaysAsId", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "getResolverType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.ObjectIdInfo", actual.getClass().getName());
  assertEquals("ObjectIdInfo: propName={a}, scope=java.lang.Integer, generatorType=java.lang.Object, alwaysAsId=true {getAlwaysAsId=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ObjectIdInfo: propName={a}, scope=java.lang.Integer, generatorType=java.lang.Object, alwaysAsId=false {getAlwaysAsId=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasIgnoreMarker", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:0>", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isTypeId", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createObjectNode", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "visitIntFormat", "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.core.JsonParser$NumberType", "<sample:8>", "<sample:9>", "<sample:1>"}}), new String[][]{{"isEmpty", "com.fasterxml.jackson.databind.SerializerProvider", "3"}, {"findValue", "java.lang.String", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findUnwrappingNameTransformer", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationContentType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:11>", "<sample:9>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Attr", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<null>", "<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAnySetterAnnotation", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter", actual.getClass().getName());
  assertEquals("property '' (virtual, no static serializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=false, isUnwrapping=false, isVirtual=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findFormat", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:14>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findRootName", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationInclusion", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<null>", "<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findImplicitPropertyName", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:5>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findInjectableValueId", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "visitIntFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.core.JsonParser$NumberType"}, new String[]{"<sample:1>", "<sample:0>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "isEmpty", "com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "createContextual", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty", "<sample:9>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "usesObjectId", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "visitArrayFormat", new String[]{"com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.JsonSerializer", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:5>", "<sample:3>", "<sample:11>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "withIgnorals", "java.lang.String[]", "<sample:3>"}, {"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<s:kexc>", "<sample:2>", "<sample:2>", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructNoTypeResolverBuilder", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getDefaultImpl", "", "2"}, {"buildTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", "java.lang.Class", "<sample:0>"}}), new String[][]{{"listIterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.AbstractList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findIgnoreUnknownProperties", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyInclusion", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:12>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "java.lang.String"}, new String[]{"<null>", "<sample:4>", "<s:ic>", "m.5I"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "createSchemaNode", "java.lang.String", "0x1F"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "withFilterId", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializer", actual.getClass().getName());
  assertEquals("BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "wrapAndThrow", new String[]{"com.fasterxml.jackson.databind.SerializerProvider", "java.lang.Throwable", "java.lang.Object", "int"}, new String[]{"<sample:9>", "<sample:1>", "<i:48>", "-10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "createSchemaNode", new String[]{"java.lang.String", "boolean"}, new String[]{"1.5", "false"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "<sample:1>"}}), new String[][]{{"findParent", "java.lang.String", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasCreatorAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_hasOneOf", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class[]", "<sample:0>", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "pair", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:1>", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "usesObjectId", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeFields", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "<s:.r>>", "<sample:0>", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:11>", "<sample:13>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationKeyType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:16>", "<null>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findContentDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:10>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_isIgnorable", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyInclusion", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:20>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findValueInstantiator", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationInclusionForContent", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:3>", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("USE_DEFAULTS", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findWrapperName", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:22>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_propertyName", "java.lang.String,java.lang.String", "1E-5 ", "1.25"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findEnumValues", "java.lang.Class,java.lang.Enum[],java.lang.String[]", "<sample:7>", "<sample:0>", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "getScope", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "toString", ""}, {"com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Integer {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.Integer, getClasses=[], getConstructors=[public java.lang.Integer(java.lang.String) throws java.lang..,...#840#1423407143", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ObjectIdInfo: propName={a}, scope=java.lang.Integer, generatorType=java.lang.Object, alwaysAsId=false {getAlwaysAsId=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_propertyName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"{\"a\"B1}", ";.5d1.1234567"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructNoTypeResolverBuilder", ""}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationKeyType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:7>"}}), new String[][]{{"hasNamespace", "", "4"}, {"internSimpleName", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("{;.5d1.1234567}{\"a\"B1} {getNamespace=;.5d1.1234567, getSimpleName={\"a\"B1}, hasNamespace=true, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "getScope", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.Map {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.util.Map, getClasses=[interface java.util.Map$Entry], getConstructors=[], getDeclaredAnnotations=[], getDec...#430#-1339089766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ObjectIdInfo: propName=sample, scope=java.util.Map, generatorType=java.lang.Comparable, alwaysAsId=true {getAlwaysAsId=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "withObjectIdWriter", new String[]{"com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "serializeWithType", "java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "<i:-59>", "<sample:1>", "<null>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.BeanSerializer", actual.getClass().getName());
  assertEquals("BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "BeanSerializer for generated.algorithm.SearchInputFactory_scaffolding$GenericSub {isUnwrappingSerializer=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationInclusionForContent", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:2>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_EMPTY", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationContentConverter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:16>", "<sample:7>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:8>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationKeyType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasCreatorAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:12>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Attr", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:2>", "<sample:5>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationInclusionForContent", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.annotation.JsonInclude$Include", "<sample:12>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_hasAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isIgnorableType", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyAccess", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:12>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "com.fasterxml.jackson.databind.ser.BeanSerializer", "unwrappingSerializer", new String[]{"com.fasterxml.jackson.databind.util.NameTransformer"}, new String[]{"<sample:10>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "findConvertingSerializer", "com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "<sample:0>", "<sample:0>"}}), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonSerializer", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationKeyType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:21>", "<sample:13>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isAnnotationBundle", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasIgnoreMarker", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", new String[]{"java.util.Collection"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNamingStrategy", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:5>"}}), new String[][]{{"get", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
}
