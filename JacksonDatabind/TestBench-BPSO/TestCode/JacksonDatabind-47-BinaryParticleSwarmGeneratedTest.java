package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSubtypes", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPropertyAccess", "com.fasterxml.jackson.databind.introspect.Annotated", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findObjectReferenceInfo", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPOJOBuilder", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.ObjectIdInfo", actual.getClass().getName());
  assertEquals("ObjectIdInfo: propName=0, scope=generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf, generatorType=java.lang.Integer, alwaysAsId=false {getAlwaysAsId=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "hasAsValueAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findValueInstantiator", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "_hasOneOf", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class[]", "<sample:6>", "<sample:1>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPropertyDescription", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationSortAlphabetically", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findContentSerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationConverter", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>"}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPropertyIndex", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findClassDescription", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPropertyTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:5>", "<sample:5>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPOJOBuilder", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:3>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPropertyInclusion", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findDeserializationConverter", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findContentSerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPOJOBuilderConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:6>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findDeserializationContentType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "hasAnyGetterAnnotation", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findAndAddVirtualProperties", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "java.util.List"}, new String[]{"<null>", "<sample:3>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSerializationTyping", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:11>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findViews", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<null>"}, false, 2, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPropertyDescription", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPropertyContentTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<null>", "<sample:7>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_hasOneOf", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class[]"}, new String[]{"<sample:8>", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPropertyDefaultValue", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:5>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "resolveSetterConflict", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:1>", "<sample:5>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findTypeResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:3>", "<sample:7>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "hasIgnoreMarker", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "hasIgnoreMarker", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:1>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "hasAnySetterAnnotation", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findReferenceType", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findFormat", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:10>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findDeserializationContentConverter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findWrapperName", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_findAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "_hasAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class", "<sample:1>", "<sample:0>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findNullSerializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findObjectIdInfo", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:8>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findRootName", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findCreatorBinding", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "hasRequiredMarker", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:3>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "isIgnorableType", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:0>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "pair", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>", "<sample:1>"}, true), new String[][]{{"findPropertiesToIgnore", "com.fasterxml.jackson.databind.introspect.Annotated", "5"}, {"allIntrospectors", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findTypeName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findAutoDetectVisibility", "com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:7>", "<sample:3>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findInjectableValueId", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:5>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findImplicitPropertyName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSerializationContentConverter", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:6>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "refineSerializationType", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:7>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findNullSerializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findNameForSerialization", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:0>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findFilterId", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationInclusion", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:3>", "<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "hasCreatorAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:0>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findKeyDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:10>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findEnumValues", new String[]{"java.lang.Class", "java.lang.Enum[]", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:0>", "<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findUnwrappingNameTransformer", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:1>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findIgnoreUnknownProperties", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineDeserializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:8>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPropertyDefaultValue", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:11>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSerializationInclusionForContent", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.annotation.JsonInclude$Include", "<sample:4>", "<sample:5>"}}, 2), new String[][]{{"withContentTypeHandler", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[resolved recursive type -> null] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[resolved recursive type -> null], hasGenericTypes=false, hasValueHa...#433#1682370604", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineDeserializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:10>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSerializationPropertyOrder", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<null>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "isAnnotationBundle", "java.lang.annotation.Annotation", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive type -> null]] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaf...#603#-1656586349", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "nopInstance", new String[]{}, new String[]{}, true), new String[][]{{"allIntrospectors", "", "3"}, {"remove", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineDeserializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findContentDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:1>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findNamingStrategy", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:7>"}}, 1), new String[][]{{"getRawClass", "", "7"}, {"getRawClass", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericSub {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericSu.., getC...#704#-369832670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineSerializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:11>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findNameForDeserialization", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:9>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSubtypes", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>"}}, 3), new String[][]{{"containedTypeCount", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findKeySerializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "isTypeId", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:1>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findTypeName", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:9>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findIgnoreUnknownProperties", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "refineDeserializationType", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:5>", "<sample:8>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_hasAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:6>", "<sample:1>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "allIntrospectors", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findInjectableValueId", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findContentSerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:5>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findFilterId", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationContentType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "_hasAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class", "<null>", "<sample:5>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findFilterId", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findRootName", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findNameForDeserialization", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "hasCreatorAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:9>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSerializationType", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findContentDeserializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:9>"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPropertyTypeResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:5>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "_hasOneOf", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class[]", "<sample:2>", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "hasAnySetterAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "hasCreatorAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findEnumValues", new String[]{"java.lang.Class", "java.lang.Enum[]", "java.lang.String[]"}, new String[]{"<empty>", "<null>", "<empty>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "allIntrospectors", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "_findAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class", "<sample:7>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationConverter", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "allIntrospectors", "java.util.Collection", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findNameForSerialization", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:9>"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "pair", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>", "<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findIgnoreUnknownProperties", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findAutoDetectVisibility", "com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:7>", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findObjectIdInfo", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "allIntrospectors", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPOJOBuilder", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPropertyDefaultValue", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPropertyIndex", "com.fasterxml.jackson.databind.introspect.Annotated", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationPropertyOrder", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationContentType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSerializationInclusionForContent", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.annotation.JsonInclude$Include", "<sample:6>", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPropertiesToIgnore", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "boolean"}, new String[]{"<sample:0>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findAutoDetectVisibility", "com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:2>", "<sample:2>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "_findAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class", "<sample:7>", "<null>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findCreatorBinding", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPOJOBuilder", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPropertyAccess", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonProperty$Access", actual.getClass().getName());
  assertEquals("AUTO", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findDeserializationConverter", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:10>"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findNameForSerialization", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "allIntrospectors", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineDeserializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:10>", "<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "isAnnotationBundle", "java.lang.annotation.Annotation", "<sample:1>"}}, 1), new String[][]{{"getKeyType", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findIgnoreUnknownProperties", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findDeserializationType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:7>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationInclusionForContent", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:0>", "<null>"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPOJOBuilderConfig", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:6>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findCreatorBinding", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "version", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findDeserializationContentType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<null>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationInclusionForContent", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:1>", "<sample:7>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_NULL", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findDeserializationKeyType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findEnumValues", "java.lang.Class,java.lang.Enum[],java.lang.String[]", "<sample:3>", "<null>", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findDeserializationContentConverter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findNullSerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:8>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPropertiesToIgnore", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "boolean"}, new String[]{"<sample:4>", "false"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "version", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getMinorVersion", "", "1"}, {"getMajorVersion", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findObjectReferenceInfo", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:7>", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "isIgnorableType", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:7>"}}, 3), new String[][]{{"getResolverType", "", "0"}, {"withAlwaysAsId", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.ObjectIdInfo", actual.getClass().getName());
  assertEquals("ObjectIdInfo: propName=null, scope=null, generatorType=null, alwaysAsId=false {getAlwaysAsId=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findDeserializationKeyType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:1>"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "hasAsValueAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:11>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findDeserializationContentConverter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:5>"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPOJOBuilderConfig", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPropertyIndex", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "_hasAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class", "<sample:2>", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineSerializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:2>", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "hasRequiredMarker", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<[resolved recursive type -> null]>] {getErasedSignatu...#652#-990335633", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findNullSerializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findEnumValue", "java.lang.Enum", "<sample:0>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "hasCreatorAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findDeserializationContentType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:13>"}, false, 5, new String[][]{}, 3), new String[][]{{"withValueInclusion", "com.fasterxml.jackson.annotation.JsonInclude$Include", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=NON_DEFAULT,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=NON_DEFAULT}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_hasOneOf", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class[]"}, new String[]{"<sample:10>", "<empty>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "isAnnotationBundle", "java.lang.annotation.Annotation", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findImplicitPropertyName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "isIgnorableType", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findFormat", "com.fasterxml.jackson.databind.introspect.Annotated", "<null>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findKeySerializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findNameForDeserialization", "com.fasterxml.jackson.databind.introspect.Annotated", "<null>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findNamingStrategy", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findNameForSerialization", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<null>"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineDeserializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:2>", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "hasAsValueAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "refineDeserializationType", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:6>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_hasOneOf", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class[]"}, new String[]{"<sample:6>", "<empty>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "hasCreatorAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findDeserializationType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findAutoDetectVisibility", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:2>", "<sample:9>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findIgnoreUnknownProperties", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:3>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findFormat", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>"}}, 3), new String[][]{{"isIsGetterVisible", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "version", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.5-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=5, isSnapshot=true, isUknownVersion=false, isUnknownVersion=f...#205#-849916516", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "pair", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:2>", "<sample:6>"}, true, 0, null, 3), new String[][]{{"findTypeName", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:10>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findUnwrappingNameTransformer", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:9>"}}, 1), new String[][]{{"valueFor", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface com.fasterxml.jackson.annotation.JsonInclude {getAnnotatedInterfaces=?, getAnnotations=?, getCanonicalName=com.fasterxml.jackson.annotation.JsonInclude, getClasses=[class com.fasterxml.jacks...#755#-1498942298", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPropertyTypeResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:1>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findImplicitPropertyName", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "allIntrospectors", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSubtypes", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>"}}, 1), new String[][]{{"add", "int,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findReferenceType", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "isIgnorableType", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:6>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPropertyTypeResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:3>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSerializationKeyType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:13>", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "hasRequiredMarker", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "hasAnySetterAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findDeserializationType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:10>", "<null>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findIgnoreUnknownProperties", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "isTypeId", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationContentConverter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findDeserializationKeyType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "hasIgnoreMarker", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:0>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineDeserializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:7>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "allIntrospectors", ""}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findKeyDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPropertyDescription", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "allIntrospectors", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findFormat", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<null>"}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findDeserializationType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:6>"}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findDeserializationConverter", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineDeserializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:6>", "<sample:6>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findNamingStrategy", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "_findAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Class", "<null>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationContentConverter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findUnwrappingNameTransformer", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findContentSerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationInclusion", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:3>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_DEFAULT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationContentType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:4>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "hasRequiredMarker", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPOJOBuilder", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPropertyAccess", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:9>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonProperty$Access", actual.getClass().getName());
  assertEquals("AUTO", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findNameForDeserialization", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:8>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findEnumValues", "java.lang.Class,java.lang.Enum[],java.lang.String[]", "<sample:1>", "<null>", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findWrapperName", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findImplicitPropertyName", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:2>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSerializationContentConverter", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findTypeName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findNullSerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findEnumValue", new String[]{"java.lang.Enum"}, new String[]{"<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationTyping", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSerializationContentConverter", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findNameForDeserialization", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:6>"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPOJOBuilderConfig", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findAndAddVirtualProperties", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass,java.util.List", "<sample:5>", "<sample:4>", "<sample:2>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPropertiesToIgnore", "com.fasterxml.jackson.databind.introspect.Annotated,boolean", "<sample:4>", "false"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPropertyDescription", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "isTypeId", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findEnumValues", new String[]{"java.lang.Class", "java.lang.Enum[]", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:0>", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSubtypes", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPOJOBuilder", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findObjectReferenceInfo", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:5>", "<sample:8>"}, false), new String[][]{{"getResolverType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.Collection {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.Collection, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[],...#556#1623681001", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "allIntrospectors", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPropertyInclusion", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:5>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findDeserializationConverter", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findObjectIdInfo", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSerializationType", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationInclusion", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:2>", "<sample:2>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_ABSENT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:8>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findEnumValues", new String[]{"java.lang.Class", "java.lang.Enum[]", "java.lang.String[]"}, new String[]{"<sample:3>", "<empty>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationKeyType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findContentDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:10>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findReferenceType", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationInclusionForContent", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:2>", "<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPropertyDescription", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("USE_DEFAULTS", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findContentDeserializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSerializationTyping", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findImplicitPropertyName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "allIntrospectors", "java.util.Collection", "<empty>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPOJOBuilderConfig", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "isAnnotationBundle", "java.lang.annotation.Annotation", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findObjectIdInfo", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findNameForSerialization", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findNameForDeserialization", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findInjectableValueId", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:6>"}, false, 6, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "isIgnorableType", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findAutoDetectVisibility", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:2>", "<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findContentDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findRootName", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std", actual.getClass().getName());
  assertEquals("[Visibility: getter: PUBLIC_ONLY, isGetter: PUBLIC_ONLY, setter: ANY, creator: ANY, field: PUBLIC_ONLY]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPropertiesToIgnore", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:2>"}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findDeserializationKeyType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findAutoDetectVisibility", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:5>", "<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findImplicitPropertyName", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:3>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPropertiesToIgnore", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:5>"}}), new String[][]{{"withIsGetterVisibility", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "4"}, {"isSetterVisible", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "pair", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:3>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findImplicitPropertyName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "hasAnySetterAnnotation", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationInclusion", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:1>", "<sample:1>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_NULL", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findFilterId", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>"}, false, 2, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPropertiesToIgnore", "com.fasterxml.jackson.databind.introspect.Annotated,boolean", "<sample:1>", "false"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findNameForSerialization", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSubtypes", "com.fasterxml.jackson.databind.introspect.Annotated", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findEnumValues", new String[]{"java.lang.Class", "java.lang.Enum[]", "java.lang.String[]"}, new String[]{"<sample:4>", "<null>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "isAnnotationBundle", new String[]{"java.lang.annotation.Annotation"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findEnumValues", new String[]{"java.lang.Class", "java.lang.Enum[]", "java.lang.String[]"}, new String[]{"<sample:1>", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findObjectIdInfo", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:0>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findObjectReferenceInfo", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:0>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPropertyDefaultValue", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findNamingStrategy", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSerializationInclusion", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.annotation.JsonInclude$Include", "<sample:1>", "<sample:5>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findKeySerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:10>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationPropertyOrder", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findContentSerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "allIntrospectors", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationInclusion", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:7>", "<sample:0>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("ALWAYS", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findContentSerializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:11>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findRootName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findValueInstantiator", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:8>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findDeserializationKeyType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "resolveSetterConflict", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:1>", "<null>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findCreatorBinding", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:10>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPropertyInclusion", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findRootName", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:9>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findEnumValues", new String[]{"java.lang.Class", "java.lang.Enum[]", "java.lang.String[]"}, new String[]{"<sample:4>", "<sample:0>", "<sample:5>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationInclusionForContent", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:6>", "<sample:6>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("ALWAYS", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPropertyTypeResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:7>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineDeserializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<null>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findObjectIdInfo", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPropertiesToIgnore", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "boolean"}, new String[]{"<sample:9>", "false"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineDeserializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:10>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "isIgnorableType", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:0>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findEnumValues", "java.lang.Class,java.lang.Enum[],java.lang.String[]", "<sample:0>", "<empty>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive type -> null]] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaf...#603#-1656586349", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "version", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSerializationInclusionForContent", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.annotation.JsonInclude$Include", "<sample:8>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.5-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=5, isSnapshot=true, isUknownVersion=false, isUnknownVersion=f...#205#-849916516", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_hasAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:2>", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "nopInstance", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findAutoDetectVisibility", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:0>", "<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "allIntrospectors", new String[]{"java.util.Collection"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>"}}), new String[][]{{"get", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_findAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findUnwrappingNameTransformer", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineDeserializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:7>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findContentDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<null>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSerializationKeyType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[resolved recursive type -> null] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[resolved recursive type -> null], hasGenericTypes=false, hasValueHa...#433#1682370604", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "resolveSetterConflict", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:3>", "<sample:6>", "<sample:0>"}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findAutoDetectVisibility", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findImplicitPropertyName", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:7>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findValueInstantiator", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:4>"}}), new String[][]{{"withCreatorVisibility", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "hasCreatorAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPropertyIndex", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "hasAnySetterAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findKeyDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:5>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "refineDeserializationType", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:9>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "nopInstance", new String[]{}, new String[]{}, true), new String[][]{{"findPOJOBuilderConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineSerializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:5>", "<sample:5>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<[resolved recursive type -> null]>] {getErasedSignatu...#652#-990335633", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "allIntrospectors", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findDeserializationContentConverter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findClassDescription", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findIgnoreUnknownProperties", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "hasAnyGetterAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSerializationInclusionForContent", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.annotation.JsonInclude$Include", "<sample:0>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineSerializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<null>", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "hasRequiredMarker", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:5>"}}), new String[][]{{"isArrayType", "", "0"}, {"withStaticTyping", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive type -> null]] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffoldi...#598#-1202175670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationInclusionForContent", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:1>", "<sample:8>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findKeySerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_ABSENT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "allIntrospectors", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"iterator", "", "3"}, {"next", "", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineSerializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:7>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "pair", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:0>", "<sample:0>"}, true), new String[][]{{"findFormat", "com.fasterxml.jackson.databind.introspect.Annotated", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "isTypeId", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:0>"}, false, 6, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_hasOneOf", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class[]"}, new String[]{"<sample:14>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findRootName", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "allIntrospectors", new String[]{}, new String[]{}, false), new String[][]{{"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findKeySerializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findEnumValues", "java.lang.Class,java.lang.Enum[],java.lang.String[]", "<sample:1>", "<sample:3>", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findWrapperName", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:1>"}}), new String[][]{{"getValueInclusion", "", "5"}, {"withValueInclusion", "com.fasterxml.jackson.annotation.JsonInclude$Include", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=NON_ABSENT,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=NON_ABSENT}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "allIntrospectors", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPropertyContentTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:3>", "<sample:7>"}}), new String[][]{{"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPropertyContentTypeResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<null>", "<sample:2>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findObjectReferenceInfo", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.introspect.ObjectIdInfo"}, new String[]{"<sample:2>", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPropertiesToIgnore", "com.fasterxml.jackson.databind.introspect.Annotated,boolean", "<sample:1>", "true"}}), new String[][]{{"withAlwaysAsId", "boolean", "5"}, {"getPropertyName", "", "3"}, {"getPropertyName", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineDeserializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:12>", "<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findTypeName", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:2>"}}), new String[][]{{"isConcrete", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "allIntrospectors", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}), new String[][]{{"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "allIntrospectors", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "isIgnorableType", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:0>"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findIgnoreUnknownProperties", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findObjectIdInfo", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:9>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineDeserializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findDeserializationContentType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:1>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSerializationInclusionForContent", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.annotation.JsonInclude$Include", "<sample:9>", "<sample:3>"}}), new String[][]{{"findTypeParameters", "java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineSerializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:7>", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "hasCreatorAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:0>"}}), new String[][]{{"getErasedSignature", "java.lang.StringBuilder", "3"}, {"append", "boolean", "4"}, {"append", "char[],int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "version", new String[]{}, new String[]{}, false), new String[][]{{"isUknownVersion", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineSerializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:8>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findDeserializationContentType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:9>"}}), new String[][]{{"getGenericSignature", "java.lang.StringBuilder", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findAutoDetectVisibility", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:3>", "<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:9>"}}), new String[][]{{"isFieldVisible", "com.fasterxml.jackson.databind.introspect.AnnotatedField", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "version", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findKeyDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:0>"}}), new String[][]{{"getMajorVersion", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineSerializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<null>", "<sample:5>"}, false), new String[][]{{"findTypeParameters", "java.lang.Class", "5"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationInclusionForContent", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:9>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_EMPTY", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineDeserializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:10>", "<sample:8>"}, false, 6, new String[][]{}), new String[][]{{"isInterface", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findEnumValues", new String[]{"java.lang.Class", "java.lang.Enum[]", "java.lang.String[]"}, new String[]{"<sample:0>", "<empty>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findUnwrappingNameTransformer", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findDeserializationConverter", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPropertyDefaultValue", "com.fasterxml.jackson.databind.introspect.Annotated", "<null>"}}), new String[][]{{"getContentInclusion", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("USE_DEFAULTS", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineDeserializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:10>", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findFormat", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>"}}), new String[][]{{"containedType", "int", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findDeserializationConverter", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationInclusion", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:4>", "<sample:3>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_EMPTY", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findFormat", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:10>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "resolveSetterConflict", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<null>", "<sample:1>", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findUnwrappingNameTransformer", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "allIntrospectors", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"clear", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "allIntrospectors", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findAutoDetectVisibility", "com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:3>", "<sample:1>"}}), new String[][]{{"listIterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationInclusion", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:10>", "<sample:7>"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_NULL", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findEnumValues", new String[]{"java.lang.Class", "java.lang.Enum[]", "java.lang.String[]"}, new String[]{"<empty>", "<sample:5>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "isTypeId", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<null>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSerializationKeyType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findDeserializationContentType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "refineDeserializationType", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:9>", "<sample:9>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findAutoDetectVisibility", "com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.introspect.VisibilityChecker", "<sample:3>", "<sample:5>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineSerializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPropertyTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:5>", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", actual.getClass().getName());
  assertEquals("[resolved recursive type -> null] {getErasedSignature=!NullPointerException, getGenericSignature=!NullPointerException, getTypeName=[resolved recursive type -> null], hasGenericTypes=false, hasValueHa...#433#1682370604", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineSerializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:0>", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findNameForDeserialization", "com.fasterxml.jackson.databind.introspect.Annotated", "<null>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findEnumValues", "java.lang.Class,java.lang.Enum[],java.lang.String[]", "<sample:3>", "<sample:2>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "resolveSetterConflict", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:9>", "<sample:2>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSubtypes", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:9>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineDeserializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:7>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findEnumValue", "java.lang.Enum", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<[resolved recursive type -> null]>] {getErasedSignatu...#652#-990335633", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineDeserializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:6>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findEnumValues", "java.lang.Class,java.lang.Enum[],java.lang.String[]", "<sample:0>", "<null>", "<sample:0>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findClassDescription", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [resolved recursive type -> null] -> [resolved recursive type -> null]] {getErasedSignature=Lgenerated/algorithm/Se...#624#2135585449", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findDeserializationType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findContentDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findEnumValues", new String[]{"java.lang.Class", "java.lang.Enum[]", "java.lang.String[]"}, new String[]{"<sample:5>", "<sample:2>", "<sample:2>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "nopInstance", new String[]{}, new String[]{}, true), new String[][]{{"allIntrospectors", "java.util.Collection", "6"}, {"addAll", "int,java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "hasIgnoreMarker", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "resolveSetterConflict", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:5>", "<sample:9>", "<sample:10>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findEnumValues", new String[]{"java.lang.Class", "java.lang.Enum[]", "java.lang.String[]"}, new String[]{"<null>", "<sample:3>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "allIntrospectors", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "allIntrospectors", "java.util.Collection", "<null>"}}), new String[][]{{"get", "int", "3"}, {"findNameForDeserialization", "com.fasterxml.jackson.databind.introspect.Annotated", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineSerializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:11>", "<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findEnumValues", "java.lang.Class,java.lang.Enum[],java.lang.String[]", "<sample:5>", "<sample:2>", "<sample:1>"}}), new String[][]{{"useStaticType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationInclusionForContent", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.annotation.JsonInclude$Include"}, new String[]{"<sample:10>", "<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findFormat", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_NULL", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findFilterId", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findDeserializationKeyType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:1>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findClassDescription", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_findAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:14>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findViews", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "allIntrospectors", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 6, new String[][]{}), new String[][]{{"retainAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "nopInstance", new String[]{}, new String[]{}, true), new String[][]{{"hasCreatorAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "hasAnyGetterAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPropertyDescription", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findDeserializationContentType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:10>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findContentDeserializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:12>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_hasOneOf", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class[]"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "nopInstance", new String[]{}, new String[]{}, true), new String[][]{{"findSerializationInclusion", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.annotation.JsonInclude$Include", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Include", actual.getClass().getName());
  assertEquals("NON_DEFAULT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "nopInstance", new String[]{}, new String[]{}, true), new String[][]{{"findObjectReferenceInfo", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.ObjectIdInfo", actual.getClass().getName());
  assertEquals("ObjectIdInfo: propName=a, scope=java.util.Map, generatorType=java.lang.Comparable, alwaysAsId=true {getAlwaysAsId=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_findAnnotation", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Class"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPropertyTypeResolver", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:7>", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPOJOBuilder", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineSerializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:2>", "<sample:9>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "allIntrospectors", "java.util.Collection", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineSerializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:2>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSerializationType", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>"}}, 2), new String[][]{{"withTypeHandler", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive type -> null]] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffoldi...#598#-1202175670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findTypeResolver", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:7>", "<sample:7>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineSerializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:1>", "<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findFilterId", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericS.., getGenericSignature=Lgenerated/al...#593#-256315419", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findEnumValue", new String[]{"java.lang.Enum"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findEnumValues", "java.lang.Class,java.lang.Enum[],java.lang.String[]", "<sample:0>", "<sample:1>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPropertyInclusion", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonInclude$Value", actual.getClass().getName());
  assertEquals("[value=USE_DEFAULTS,content=USE_DEFAULTS] {getContentInclusion=USE_DEFAULTS, getValueInclusion=USE_DEFAULTS}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findNamingStrategy", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findTypeName", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:3>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findNullSerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineDeserializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:1>", "<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "hasAnyGetterAnnotation", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, contains [resolved recursive type -> null]] {getErasedSignature=Lgenerated/algorithm/SearchInputFactory_scaffoldi...#598#-1202175670", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findRootName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findRootName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPropertyDefaultValue", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationKeyType", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "hasAnySetterAnnotation", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:8>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "pair", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:2>", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findImplicitPropertyName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:9>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "hasCreatorAnnotation", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "version", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSerializer", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:10>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSerializationSortAlphabetically", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:0>"}}), new String[][]{{"toFullString", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core/jackson-databind/2.7.5-SNAPSHOT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "pair", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:5>", "<sample:0>"}, true), new String[][]{{"findSerializationInclusion", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.annotation.JsonInclude$Include", "3"}, {"findAutoDetectVisibility", "com.fasterxml.jackson.databind.introspect.AnnotatedClass,com.fasterxml.jackson.databind.introspect.VisibilityChecker", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findPropertyAccess", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findClassDescription", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonProperty$Access", actual.getClass().getName());
  assertEquals("AUTO", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findAutoDetectVisibility", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:1>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findDeserializationType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:6>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "refineDeserializationType", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:4>", "<sample:2>"}}, 1), new String[][]{{"withGetterVisibility", "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility", "5"}, {"isIsGetterVisible", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "nopInstance", new String[]{}, new String[]{}, true, 0, null, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findEnumValues", new String[]{"java.lang.Class", "java.lang.Enum[]", "java.lang.String[]"}, new String[]{"<sample:2>", "<sample:2>", "<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineSerializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<null>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findFilterId", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:1>"}}), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "3"}, {"toCanonical", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub,generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algo...#311#-1255643758", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findFormat", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "hasRequiredMarker", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findSerializationType", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:5>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "isIgnorableType", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:8>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findObjectIdInfo", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineSerializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:4>", "<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findCreatorBinding", "com.fasterxml.jackson.databind.introspect.Annotated", "<null>"}}), new String[][]{{"getSuperClass", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findContentDeserializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPropertiesToIgnore", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>"}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findAndAddVirtualProperties", "com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.AnnotatedClass,java.util.List", "<sample:3>", "<sample:6>", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "refineDeserializationType", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:2>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findRootName", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "nopInstance", new String[]{}, new String[]{}, true), new String[][]{{"findEnumValue", "java.lang.Enum", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findNamingStrategy", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "hasRequiredMarker", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findObjectReferenceInfo", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.introspect.ObjectIdInfo", "<sample:9>", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "pair", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:8>", "<sample:5>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findAndAddVirtualProperties", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "java.util.List"}, new String[]{"<sample:6>", "<sample:5>", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findDeserializationKeyType", "com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:6>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findEnumValues", new String[]{"java.lang.Class", "java.lang.Enum[]", "java.lang.String[]"}, new String[]{"<sample:3>", "<empty>", "<sample:4>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[a, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findDeserializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:10>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "isAnnotationBundle", "java.lang.annotation.Annotation", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "allIntrospectors", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findDeserializationContentConverter", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:5>"}}, 3), new String[][]{{"removeAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "allIntrospectors", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findPropertiesToIgnore", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findAutoDetectVisibility", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedClass", "com.fasterxml.jackson.databind.introspect.VisibilityChecker"}, new String[]{"<sample:8>", "<sample:1>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findSerializationContentConverter", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "allIntrospectors", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "allIntrospectors", ""}, {"com.fasterxml.jackson.databind.AnnotationIntrospector", "findDeserializationContentConverter", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:5>"}}), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findEnumValues", new String[]{"java.lang.Class", "java.lang.Enum[]", "java.lang.String[]"}, new String[]{"<sample:0>", "<empty>", "<sample:1>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findContentDeserializer", new String[]{"com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:11>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findValueInstantiator", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findAndAddVirtualProperties", new String[]{"com.fasterxml.jackson.databind.cfg.MapperConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "java.util.List"}, new String[]{"<sample:6>", "<sample:1>", "<empty>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findEnumValue", new String[]{"java.lang.Enum"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "findEnumValues", new String[]{"java.lang.Class", "java.lang.Enum[]", "java.lang.String[]"}, new String[]{"<sample:0>", "<empty>", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.AnnotationIntrospector", "findFilterId", "com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Ljava.lang.String;", actual.getClass().getName());
  assertEquals("[, a]", SearchInputFactory_scaffolding.observe(actual));
 }
}
