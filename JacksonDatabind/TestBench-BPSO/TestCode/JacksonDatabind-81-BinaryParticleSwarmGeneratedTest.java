package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationKeyType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:4>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findCreatorAnnotation", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertiesToIgnore", "com.fasterxml.jackson.databind.introspect.Annotated", "<null>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyDescription", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Attr", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:6>", "<sample:4>", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findAndAddVirtualProperties", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass,java.util.List", "<sample:0>", "<sample:1>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Prop", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:3>", "<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findImplicitPropertyName", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:6>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasIgnoreMarker", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isTypeId", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_hasOneOf", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class[]"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:4>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSubtypes", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyContentTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:1>", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<null>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", "java.util.Collection", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_hasAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class", "<sample:8>", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_propertyName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"0x1FF", ""}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findInjectableValueId", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("0x1FF {getNamespace=null, getSimpleName=0x1FF, hasNamespace=false, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAsValueAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructNoTypeResolverBuilder", ""}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findAutoDetectVisibility", "com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:7>", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findFilterId", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findObjectIdInfo", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findReferenceType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:8>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Attr", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:10>", "<sample:1>", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter", actual.getClass().getName());
  assertEquals("property 'a' (virtual, no static serializer) {getName=a, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=true, isUnwrapping=false, isVirtual=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyIgnorals", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findRootName", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findContentDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value", actual.getClass().getName());
  assertEquals("JsonIgnoreProperties.Value(ignored=[],ignoreUnknown=false,allowGetters=false,allowSetters=false,merge=true) {getAllowGetters=false, getAllowSetters=false, getIgnoreUnknown=false, getMerge=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationTyping", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDefaultEnumValue", "java.lang.Class", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNameForDeserialization", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:10>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilderConfig", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "resolveSetterConflict", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:4>", "<sample:5>", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasCreatorAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_hasOneOf", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class[]", "<sample:12>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Prop", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:8>", "<sample:9>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSetterInfo", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAnySetterAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:6>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findMergeInfo", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "resolveSetterConflict", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:4>", "<sample:3>", "<sample:9>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "refineDeserializationType", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:8>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isAnnotationBundle", "java.lang.annotation.Annotation", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findInjectableValue", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:5>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findClassDescription", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNullSerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilderConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNameForSerialization", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "refineSerializationType", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:9>", "<sample:8>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findReferenceType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:9>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyContentTypeResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:11>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationSortAlphabetically", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:9>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyDefaultValue", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findValueInstantiator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class", "<sample:4>", "<sample:1>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyAccess", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findViews", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findKeyDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findKeySerializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:3>", "<sample:11>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasRequiredMarker", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasRequiredMarker", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findEnumValue", "java.lang.Enum", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNameForSerialization", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isIgnorableType", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:11>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationContentConverter", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findFormat", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:13>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findContentSerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:8>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_isIgnorable", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyIndex", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:8>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findValueInstantiator", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructStdTypeResolverBuilder", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findTypeName", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:1>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAnyGetterAnnotation", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:7>"}}), new String[][]{{"typeIdVisibility", "boolean", "0"}, {"getTypeProperty", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyIgnorals", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "resolveSetterConflict", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:9>", "<sample:5>", "<sample:7>"}}), new String[][]{{"withAllowGetters", "", "5"}, {"withoutIgnoreUnknown", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value", actual.getClass().getName());
  assertEquals("JsonIgnoreProperties.Value(ignored=[],ignoreUnknown=false,allowGetters=true,allowSetters=false,merge=true) {getAllowGetters=true, getAllowSetters=false, getIgnoreUnknown=false, getMerge=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "version", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasCreatorAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", "java.lang.Class,java.lang.Class", "<sample:3>", "<sample:0>"}}, 1), new String[][]{{"getGroupId", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructNoTypeResolverBuilder", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "resolveSetterConflict", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:10>", "<sample:1>", "<sample:5>"}}), new String[][]{{"getTypeProperty", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationPropertyOrder", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyIgnorals", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:14>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "refineDeserializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationContentType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:8>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findReferenceType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:7>"}}), new String[][]{{"hasContentType", "", "4"}, {"isReferenceType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findImplicitPropertyName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNamingStrategy", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilder", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:1>", "<sample:5>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findKeySerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findObjectReferenceInfo", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:11>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAnySetter", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:10>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationContentConverter", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.ObjectIdInfo", actual.getClass().getName());
  assertEquals("ObjectIdInfo: propName=null, scope=[null], generatorType=[null], alwaysAsId=false {getAlwaysAsId=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_propertyName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TH", "<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilder", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:1>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findEnumValue", "java.lang.Enum", "<sample:5>"}}), new String[][]{{"hasNamespace", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAnyGetter", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findEnumValues", "java.lang.Class,java.lang.Enum[],java.lang.String[]", "<sample:4>", "<sample:1>", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "readResolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructStdTypeResolverBuilder", ""}}, 2), new String[][]{{"findSerializationConverter", "com.fasterxml.jackson.databind.introspect.Annotated", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNamingStrategy", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationContentType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:13>", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationKeyType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyIndex", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAsValue", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:9>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "resolveSetterConflict", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:2>", "<sample:7>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Prop", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:0>", "<sample:8>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyAliases", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findInjectableValue", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNameForDeserialization", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findCreatorAnnotation", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:4>", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNamingStrategy", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals(" {getNamespace=null, getSimpleName=, hasNamespace=false, hasSimpleName=false, isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "setConstructorPropertiesImpliesCreator", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findUnwrappingNameTransformer", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:1>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", ""}}, 1), new String[][]{{"findCreatorBinding", "com.fasterxml.jackson.databind.introspect.Annotated", "7"}, {"findObjectIdInfo", "com.fasterxml.jackson.databind.introspect.Annotated", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findCreatorAnnotation", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:9>", "<sample:10>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", "java.util.Collection", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "setConstructorPropertiesImpliesCreator", "boolean", "false"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Attr", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:7>", "<sample:1>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyInclusion", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>"}}, 2), new String[][]{{"assignSerializer", "com.fasterxml.jackson.databind.JsonSerializer", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter", actual.getClass().getName());
  assertEquals("property '0' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.BeanSerializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=true, isRequired=false, isUnwrappi...#225#-1774671071", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "refineSerializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", "com.fasterxml.jackson.databind.annotation.JsonAppend$Prop,com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:1>", "<sample:9>", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findInjectableValue", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:6>"}}, 3), new String[][]{{"getInterfaces", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructNoTypeResolverBuilder", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=null, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationInclusion", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:3>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilder", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("CUSTOM", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSubtypes", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilderConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:1>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findCreatorBinding", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:9>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "readResolve", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationContentType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<null>"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findUnwrappingNameTransformer", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findConstructorName", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationInclusion", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.annotation.JsonInclude$Include", "<sample:0>", "<null>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationContentConverter", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findValueInstantiator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findImplicitPropertyName", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationPropertyOrder", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAsValueAnnotation", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:10>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findImplicitPropertyName", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$SingletonList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "refineDeserializationType", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:10>", "<sample:3>", "<sample:8>"}}, 1), new String[][]{{"add", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Prop", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:3>", "<sample:5>", "<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertiesToIgnore", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findInjectableValueId", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Attr", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>", "<sample:4>", "<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findAndAddVirtualProperties", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass,java.util.List", "<sample:5>", "<sample:7>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilder", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class", "<sample:7>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAnySetter", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>"}}, 3), new String[][]{{"size", "", "4"}, {"set", "int,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findMergeInfo", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Prop", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:0>", "<sample:12>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_hasAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class", "<sample:2>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findWrapperName", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNameForSerialization", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findAndAddVirtualProperties", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "java.util.List"}, new String[]{"<sample:14>", "<sample:7>", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:12>", "<sample:5>", "<sample:12>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilder", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyContentTypeResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:12>", "<sample:8>", "<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findEnumValue", new String[]{"java.lang.Enum"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", "java.lang.Class", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findUnwrappingNameTransformer", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", "java.lang.Class,java.lang.Class", "<sample:0>", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findClassDescription", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findIgnoreUnknownProperties", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyTypeResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:5>", "<sample:1>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_hasAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:17>", "<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasIgnoreMarker", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationContentConverter", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", "java.lang.Class", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:4>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findImplicitPropertyName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:7>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findInjectableValueId", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyIgnorals", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:11>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAsValue", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:12>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationSortAlphabetically", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationKeyType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:10>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findKeySerializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:10>", "<empty>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findTypeResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:0>", "<sample:8>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Attr", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:7>", "<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findEnumValue", "java.lang.Enum", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter", actual.getClass().getName());
  assertEquals("property 'sample' (virtual, no static serializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=true, isUnwrapping=false, isVirtual=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findContentSerializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationContentConverter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationKeyType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findKeySerializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:11>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findObjectReferenceInfo", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", "com.fasterxml.jackson.databind.annotation.JsonAppend$Attr,com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.JavaType", "<sample:10>", "<sample:5>", "<sample:1>", "<sample:9>"}}, 3), new String[][]{{"getAlwaysAsId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findRootName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertiesToIgnore", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findFilterId", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:13>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Prop", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<null>", "<sample:7>", "<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasIgnoreMarker", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findConstructorName", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findValueInstantiator", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findFilterId", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:9>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructStdTypeResolverBuilder", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findContentDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNullSerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=null, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findAndAddVirtualProperties", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass,java.util.List", "<sample:9>", "<sample:4>", "<empty>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findCreatorAnnotation", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findContentSerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:12>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "setConstructorPropertiesImpliesCreator", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNamingStrategy", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyDefaultValue", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findReferenceType", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findInjectableValue", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findMergeInfo", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isAnnotationBundle", "java.lang.annotation.Annotation", "<empty>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_hasOneOf", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class[]"}, new String[]{"<null>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isAnnotationBundle", "java.lang.annotation.Annotation", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAnySetterAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class", "<sample:10>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyAliases", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:10>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findMergeInfo", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isIgnorableType", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:5>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "readResolve", ""}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("JsonInclude.Value(value=USE_DEFAULTS,content=USE_DEFAULTS) {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilderConfig", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertiesToIgnore", "com.fasterxml.jackson.databind.introspect.Annotated,boolean", "<sample:4>", "false"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class", "<sample:1>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_hasOneOf", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class[]"}, new String[]{"<sample:12>", "<empty>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilderConfig", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isAnnotationBundle", "java.lang.annotation.Annotation", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_isIgnorable", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findInjectableValue", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAsValueAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isTypeId", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:1>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isIgnorableType", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilderConfig", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAnySetterAnnotation", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findContentSerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findObjectIdInfo", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:12>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findContentDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:10>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyDefaultValue", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyIgnorals", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findKeySerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value", actual.getClass().getName());
  assertEquals("JsonIgnoreProperties.Value(ignored=[],ignoreUnknown=false,allowGetters=false,allowSetters=false,merge=true) {getAllowGetters=false, getAllowSetters=false, getIgnoreUnknown=false, getMerge=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findClassDescription", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationContentType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:5>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:6>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationContentConverter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyAccess", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "resolveSetterConflict", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:5>", "<sample:6>", "<null>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationContentType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findEnumValue", "java.lang.Enum", "<null>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAnySetterAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationConverter", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findTypeResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:5>", "<sample:4>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNameForSerialization", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findObjectReferenceInfo", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:2>", "<sample:1>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNameForSerialization", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:12>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findRootName", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:1>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:12>", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationSortAlphabetically", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_propertyName", "java.lang.String,java.lang.String", "abc", "1.5e300"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findWrapperName", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAnySetterAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationKeyType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:9>"}, false, 2, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findTypeResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationInclusionForContent", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.annotation.JsonInclude$Include", "<sample:6>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findInjectableValue", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructStdTypeResolverBuilder", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=null, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilder", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertiesToIgnore", "com.fasterxml.jackson.databind.introspect.Annotated,boolean", "<sample:6>", "false"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationContentType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationInclusionForContent", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "version", ""}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findCreatorAnnotation", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:10>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("USE_DEFAULTS", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyContentTypeResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:0>", "<sample:7>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findCreatorAnnotation", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:9>", "<sample:9>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", "com.fasterxml.jackson.databind.annotation.JsonAppend$Prop,com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:5>", "<sample:3>", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAnySetterAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_hasOneOf", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class[]", "<null>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findCreatorBinding", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationContentType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$SingletonList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Prop", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:1>", "<sample:1>", "<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findObjectIdInfo", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAnySetterAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNameForSerialization", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findFilterId", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructNoTypeResolverBuilder", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationKeyType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:7>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findKeyDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>"}}), new String[][]{{"getDefaultImpl", "", "1"}, {"buildTypeSerializer", "com.fasterxml.jackson.databind.SerializationConfig,com.fasterxml.jackson.databind.JavaType,java.util.Collection", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNameForSerialization", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findKeyDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:9>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findWrapperName", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructStdTypeResolverBuilder", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findContentDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyAliases", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>"}}), new String[][]{{"typeProperty", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=a, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findInjectableValueId", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findUnwrappingNameTransformer", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNameForSerialization", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findReferenceType", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasIgnoreMarker", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasRequiredMarker", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Prop", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:4>", "<sample:12>", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilderConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasRequiredMarker", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", "java.lang.Class", "<empty>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findCreatorAnnotation", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<null>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findWrapperName", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyAliases", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", "java.lang.Class,java.lang.Class", "<sample:2>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", "java.lang.Class,java.lang.Class", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:6>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericLe.., get...#705#1439182783", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "resolveSetterConflict", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:12>", "<sample:10>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationContentType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructNoTypeResolverBuilder", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findContentDeserializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationConverter", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructNoTypeResolverBuilder", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.String {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.lang.String, getClasses=[], getConstructors=[public java.lang.String(byte[]), public java.lang.String(by.., g...#779#-421279309", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findObjectReferenceInfo", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:4>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.ObjectIdInfo", actual.getClass().getName());
  assertEquals("ObjectIdInfo: propName=<a><b>t</b></a>, scope=java.lang.Object, generatorType=java.util.List, alwaysAsId=true {getAlwaysAsId=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findCreatorBinding", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilderConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:10>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationConverter", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:3>"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findClassDescription", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDefaultEnumValue", "java.lang.Class", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyAliases", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Prop", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:5>", "<sample:10>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findObjectIdInfo", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDefaultEnumValue", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationContentType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasIgnoreMarker", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isTypeId", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "resolveSetterConflict", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:1>", "<sample:4>", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "setConstructorPropertiesImpliesCreator", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDefaultEnumValue", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAnyGetterAnnotation", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyDefaultValue", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericLe.., get...#705#1439182783", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findContentSerializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:9>"}, false, 5, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyDescription", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findRootName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findReferenceType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationKeyType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findMergeInfo", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:7>"}, false, 3, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_hasAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationInclusion", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.annotation.JsonInclude$Include", "<sample:3>", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findObjectReferenceInfo", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:4>", "<sample:3>"}, false), new String[][]{{"getScope", "", "6"}, {"getGeneratorType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findIgnoreUnknownProperties", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:7>"}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:9>"}, false, 6, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "pair", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findConstructorName", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findAutoDetectVisibility", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:2>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Prop", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:2>", "<sample:8>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findFormat", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Prop", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:3>", "<null>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationPropertyOrder", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Attr", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:9>", "<sample:0>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findIgnoreUnknownProperties", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter", actual.getClass().getName());
  assertEquals("property '' (virtual, no static serializer) {getName=, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=false, isUnwrapping=false, isVirtual=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAsValue", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findMergeInfo", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findIgnoreUnknownProperties", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationTyping", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:11>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationInclusionForContent", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:11>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilder", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("CUSTOM", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_propertyName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\nI", "5."}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", "java.lang.Class,java.lang.Class", "<empty>", "<sample:1>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", "com.fasterxml.jackson.databind.annotation.JsonAppend$Attr,com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:8>", "<sample:1>", "<sample:4>"}}), new String[][]{{"hasSimpleName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructNoTypeResolverBuilder", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAsValue", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:11>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilderConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:4>"}}), new String[][]{{"inclusion", "com.fasterxml.jackson.annotation.JsonTypeInfo$As", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder", actual.getClass().getName());
  assertEquals("{getTypeProperty=null, isTypeIdVisible=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findValueInstantiator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNamingStrategy", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationContentType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:6>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:3>"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationInclusionForContent", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:9>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findObjectIdInfo", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationKeyType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:11>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_NULL", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "readResolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationKeyType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>", "<sample:10>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationKeyType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:7>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findObjectReferenceInfo", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:0>", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyDefaultValue", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationContentType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:11>", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationContentConverter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyDescription", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_isIgnorable", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationContentConverter", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyDefaultValue", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isAnnotationBundle", "java.lang.annotation.Annotation", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSetterInfo", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:12>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findMergeInfo", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", "java.lang.Class", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertiesToIgnore", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<null>"}, false, 5, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findObjectReferenceInfo", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:9>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyAliases", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", "java.util.Collection", "<empty>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationContentConverter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationContentConverter", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isTypeId", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:0>"}}), new String[][]{{"removeAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findEnumValue", new String[]{"java.lang.Enum"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructNoTypeResolverBuilder", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilderConfig", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:10>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"subList", "int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", new String[]{"java.lang.Class"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", new String[]{"java.util.Collection"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isAnnotationBundle", "java.lang.annotation.Annotation", "<empty>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyDescription", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:5>"}}), new String[][]{{"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findTypeName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", "com.fasterxml.jackson.databind.annotation.JsonAppend$Prop,com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:7>", "<sample:2>", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertiesToIgnore", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "boolean"}, new String[]{"<sample:5>", "false"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyContentTypeResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:8>", "<sample:11>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "refineSerializationType", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:8>", "<sample:7>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findIgnoreUnknownProperties", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findEnumValues", new String[]{"java.lang.Class", "java.lang.Enum[]", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:2>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyIndex", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "nopInstance", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findAndAddVirtualProperties", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "java.util.List"}, new String[]{"<sample:10>", "<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationType", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "setConstructorPropertiesImpliesCreator", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "setConstructorPropertiesImpliesCreator", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findKeySerializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:11>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findFilterId", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", "com.fasterxml.jackson.databind.annotation.JsonAppend$Attr,com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:6>", "<sample:3>", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findFilterId", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findValueInstantiator", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findCreatorBinding", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertiesToIgnore", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:9>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyInclusion", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findEnumValues", new String[]{"java.lang.Class", "java.lang.Enum[]", "java.lang.String[]"}, new String[]{"<sample:3>", "<null>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findConstructorName", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<empty>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyInclusion", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructStdTypeResolverBuilder", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationKeyType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:2>"}}), new String[][]{{"isTypeIdVisible", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findTypeResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_isIgnorable", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false), new String[][]{{"retainAll", "java.util.Collection", "4"}, {"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyDescription", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:9>"}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findClassDescription", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyDefaultValue", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Attr", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:12>", "<sample:6>", "<sample:8>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyAliases", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:10>"}}), new String[][]{{"unwrappingWriter", "com.fasterxml.jackson.databind.util.NameTransformer", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter", actual.getClass().getName());
  assertEquals("property 'sample' (virtual, no static serializer) {getName=sample, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=true, isUnwrapping=true, isVirtual=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "refineDeserializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:7>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationKeyType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:12>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findMergeInfo", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilder", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyIndex", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:9>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_hasAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:12>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_isIgnorable", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAnyGetterAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:10>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findRootName", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findObjectReferenceInfo", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:12>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findIgnoreUnknownProperties", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findMergeInfo", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:14>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findObjectReferenceInfo", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:5>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findViews", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDefaultEnumValue", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAnySetterAnnotation", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSetterInfo", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:6>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonSetter$Value", actual.getClass().getName());
  assertEquals("JsonSetter.Value(valueNulls=DEFAULT,contentNulls=DEFAULT) {getContentNulls=DEFAULT, getValueNulls=DEFAULT}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNullSerializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyAccess", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findValueInstantiator", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:2>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyContentTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:5>", "<sample:10>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNameForDeserialization", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:14>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "refineDeserializationType", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:7>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findAndAddVirtualProperties", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "java.util.List"}, new String[]{"<sample:1>", "<sample:4>", "<sample:3>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findViews", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:3>"}, false, 2, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:12>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_propertyName", "java.lang.String,java.lang.String", "(", "a"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findRootName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationContentConverter", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAsValue", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:13>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:12>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDefaultEnumValue", "java.lang.Class", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationConverter", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:13>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findFilterId", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationType", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findTypeResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:3>", "<sample:12>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationContentType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_hasAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasCreatorAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_classIfExplicit", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:7>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isAnnotationBundle", "java.lang.annotation.Annotation", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("int {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=int, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclaredConstructors=[], getDeclaredFie...#344#1759716971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isIgnorableType", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilderConfig", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilderConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_propertyName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"1e16.5", "PT1H"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findEnumValues", "java.lang.Class,java.lang.Enum[],java.lang.String[]", "<sample:4>", "<empty>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("{PT1H}1e16.5 {getNamespace=PT1H, getSimpleName=1e16.5, hasNamespace=true, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", new String[]{}, new String[]{}, false), new String[][]{{"addAll", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyIgnorals", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:11>"}, false, 1, new String[][]{}), new String[][]{{"findIgnoredForDeserialization", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNameForDeserialization", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "refineDeserializationType", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:9>", "<sample:10>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_propertyName", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"\u00e9", "1)"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "resolveSetterConflict", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:2>", "<sample:3>", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.PropertyName", actual.getClass().getName());
  assertEquals("{1)}\u00e9 {getNamespace=1), getSimpleName=\u00e9, hasNamespace=true, hasSimpleName=true, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findImplicitPropertyName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasRequiredMarker", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationContentConverter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:12>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNamingStrategy", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAnySetterAnnotation", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Attr", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:7>", "<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationInclusionForContent", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.annotation.JsonInclude$Include", "<sample:1>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter", actual.getClass().getName());
  assertEquals("property '0' (virtual, no static serializer) {getName=0, getViews=null, hasNullSerializer=false, hasSerializer=false, isRequired=false, isUnwrapping=false, isVirtual=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyIgnorals", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findContentSerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:11>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAsValue", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:1>"}}), new String[][]{{"getMerge", "", "3"}, {"getAllowSetters", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilder", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAsValueAnnotation", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyAliases", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findObjectIdInfo", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findClassDescription", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findContentDeserializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:11>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_isIgnorable", "com.fasterxml.jackson.databind.introspect.Annotated", "<null>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", new String[]{"com.fasterxml.jackson.databind.annotation.JsonAppend$Prop", "com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:7>", "<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructVirtualProperty", "com.fasterxml.jackson.databind.annotation.JsonAppend$Prop,com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:2>", "<sample:12>", "<sample:8>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findConstructorName", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationInclusion", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "refineDeserializationType", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:8>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_ABSENT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_hasOneOf", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class[]"}, new String[]{"<sample:10>", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAnyGetter", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:9>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findMergeInfo", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyIgnorals", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:18>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isTypeId", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:5>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNullSerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:13>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAnySetterAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructStdTypeResolverBuilder", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationConverter", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasCreatorAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findReferenceType", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findClassDescription", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isAnnotationBundle", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationInclusion", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.annotation.JsonInclude$Include", "<sample:9>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationContentType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findUnwrappingNameTransformer", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.JavaType", "<sample:10>", "<sample:2>", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findMergeInfo", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationTyping", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_constructNoTypeResolverBuilder", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:3>"}}, 1), new String[][]{{"getTypeProperty", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationInclusionForContent", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<null>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "resolveSetterConflict", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:0>", "<null>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_ABSENT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "resolveSetterConflict", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:9>", "<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAsValueAnnotation", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_isIgnorable", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:14>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationSortAlphabetically", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findAndAddVirtualProperties", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "java.util.List"}, new String[]{"<sample:5>", "<sample:0>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findContentSerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:9>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findImplicitPropertyName", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNamingStrategy", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPOJOBuilder", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findRootName", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:0>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findNameForDeserialization", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:9>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationContentConverter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasAsValueAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_findTypeResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<null>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findDeserializationConverter", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findSerializationType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:7>", "<sample:5>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "isAnnotationBundle", "java.lang.annotation.Annotation", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findUnwrappingNameTransformer", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyTypeResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:12>", "<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyAliases", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:0>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findInjectableValue", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findContentSerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:12>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findPropertyAccess", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "hasRequiredMarker", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "_hasAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class", "<sample:12>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findValueInstantiator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "allIntrospectors", "java.util.Collection", "<sample:1>"}, {"com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector", "findMergeInfo", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
