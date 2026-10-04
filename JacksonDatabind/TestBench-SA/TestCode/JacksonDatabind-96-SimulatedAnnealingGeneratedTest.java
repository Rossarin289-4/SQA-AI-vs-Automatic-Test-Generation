package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findKeyDeserializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:11>", "<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "mapAbstractType", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findJsonValueFor", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:7>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>", "<sample:3>", "<sample:9>", "<sample:6>", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionLikeDeserializer", "com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:2>", "<sample:5>", "<sample:5>", "<sample:4>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructEnumResolver", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>", "<sample:6>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addExplicitDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCandidate"}, new String[]{"<sample:3>", "<sample:6>", "<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_mapAbstractCollectionType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.DeserializationConfig", "<sample:0>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomReferenceDeserializer", "com.fasterxml.jackson.databind.type.ReferenceType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:8>", "<sample:7>", "<sample:1>", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapLikeDeserializer", "com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>", "<sample:4>", "<sample:5>", "<sample:2>", "<null>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomReferenceDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>", "<sample:6>", "<sample:5>", "<sample:0>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<sample:7>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomArrayDeserializer", "com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>", "<sample:7>", "<sample:6>", "<sample:1>", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findJsonValueFor", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "getFactoryConfig", ""}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructEnumResolver", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>", "<sample:4>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "mapAbstractType", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCreatorsFromProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:6>", "<sample:9>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalDeserializers", "com.fasterxml.jackson.databind.deser.Deserializers", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createCollectionDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.BeanDescription", "<sample:8>", "<sample:5>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:3>", "<sample:0>", "<sample:8>", "<sample:6>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:2>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCreatorsFromProperties", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:5>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createEnumDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomArrayDeserializer", "com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:5>", "<sample:3>", "<sample:1>", "<sample:4>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalKeyDeserializers", "com.fasterxml.jackson.databind.deser.KeyDeserializers", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAdditionalKeyDeserializers", new String[]{"com.fasterxml.jackson.databind.deser.KeyDeserializers"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapDeserializer", "com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:4>", "<sample:4>", "<sample:8>", "<sample:5>", "<sample:0>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAbstractTypeResolver", new String[]{"com.fasterxml.jackson.databind.AbstractTypeResolver"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:4>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:7>", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyContentTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:2>", "<sample:0>", "<sample:5>"}}), new String[][]{{"createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAbstractTypeResolver", new String[]{"com.fasterxml.jackson.databind.AbstractTypeResolver"}, new String[]{"<sample:4>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createArrayDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:7>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>", "<sample:1>", "<sample:1>"}}), new String[][]{{"withValueInstantiators", "com.fasterxml.jackson.databind.deser.ValueInstantiators", "6"}, {"createCollectionLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.BeanDescription", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "resolveMemberAndTypeAnnotations", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionDeserializer", "com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:2>", "<sample:0>", "<sample:2>", "<sample:5>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_handleSingleArgumentCreator", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,boolean", "<sample:7>", "<sample:7>", "false", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findPropertyTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:7>", "<null>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_hasCreatorAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:3>", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_handleSingleArgumentCreator", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,boolean", "<sample:1>", "<sample:2>", "false", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:2>", "<sample:6>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_handleSingleArgumentCreator", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,boolean", "<sample:6>", "<sample:3>", "false", "true"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:9>", "<sample:7>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<sample:0>", "<sample:13>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_handleSingleArgumentCreator", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,boolean", "<sample:4>", "<sample:3>", "true", "false"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:7>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "resolveType", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:7>", "<sample:4>", "<null>", "<sample:6>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addExplicitAnyCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<null>", "<sample:0>", "<sample:2>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findOptionalStdDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<null>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "modifyTypeByAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createCollectionLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.BeanDescription", "<sample:9>", "<null>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_reportUnwrappedCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:4>", "<sample:0>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:3>", "<sample:4>", "<sample:3>", "<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findContentDeserializerFromAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>", "<sample:5>"}}), new String[][]{{"getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentCreator", new String[]{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "boolean"}, new String[]{"<null>", "<sample:7>", "true", "false"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:8>", "<sample:8>", "<null>", "<sample:6>", "<sample:0>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.PropertyName,int,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.annotation.JacksonInject$Value", "<sample:7>", "<sample:8>", "<sample:1>", "2147483633", "<sample:9>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createCollectionDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.BeanDescription", "<sample:9>", "<sample:3>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentCreator", new String[]{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "boolean"}, new String[]{"<sample:5>", "<sample:7>", "false", "false"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerFactoryMethods", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:0>", "<sample:1>", "<sample:3>", "<sample:2>", "<sample:0>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:8>", "<sample:8>", "<null>", "<sample:6>", "<sample:5>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.PropertyName,int,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.annotation.JacksonInject$Value", "<sample:7>", "<sample:8>", "<sample:4>", "2147483633", "<sample:9>", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentCreator", new String[]{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "boolean"}, new String[]{"<sample:8>", "<sample:2>", "true", "false"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:5>", "<sample:8>", "<sample:6>", "<sample:7>", "<sample:3>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.PropertyName,int,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.annotation.JacksonInject$Value", "<sample:7>", "<sample:5>", "<sample:1>", "-536870855", "<sample:5>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:7>", "<sample:13>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.reflect.GenericSignatureFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAdditionalDeserializers", new String[]{"com.fasterxml.jackson.databind.deser.Deserializers"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionLikeDeserializer", "com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:5>", "<sample:7>", "<sample:1>", "<sample:6>", "<sample:2>"}}), new String[][]{{"createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:5>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createReferenceDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ReferenceType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:0>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createCollectionLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:4>", "<sample:1>"}}), new String[][]{{"getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findPropertyTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:3>", "<sample:5>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addExplicitPropertyCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:1>", "<sample:8>", "<sample:2>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:7>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomBeanDeserializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:6>", "<sample:2>", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createTreeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<sample:5>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createReferenceDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ReferenceType,com.fasterxml.jackson.databind.BeanDescription", "<null>", "<sample:1>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionDeserializer", "com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>", "<sample:5>", "<sample:7>", "<sample:7>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:4>", "<sample:2>", "<sample:1>", "<sample:4>", "<sample:6>", "<sample:2>"}}), new String[][]{{"deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:11>", "<sample:3>", "<sample:7>", "<sample:4>", "<sample:5>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDeserializerFromAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDeserializerFromAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:0>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:0>", "<sample:0>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "mapAbstractType", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructEnumResolver", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<null>", "<sample:4>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<sample:2>", "<sample:4>"}}, 2), new String[][]{{"handledType", "", "1"}, {"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentCreator", new String[]{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "boolean"}, new String[]{"<sample:3>", "<sample:3>", "false", "false"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAdditionalDeserializers", new String[]{"com.fasterxml.jackson.databind.deser.Deserializers"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:6>", "<sample:4>"}}), new String[][]{{"_valueInstantiatorInstance", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_valueInstantiatorInstance", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<null>", "<null>", "<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.PropertyName,int,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.annotation.JacksonInject$Value", "<sample:3>", "<sample:4>", "<sample:7>", "-1", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:5>", "<sample:5>", "<sample:1>", "<sample:13>", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerFactoryMethods", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:0>", "<sample:8>", "<sample:5>", "<sample:1>", "<sample:4>", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findKeyDeserializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withValueInstantiators", "com.fasterxml.jackson.databind.deser.ValueInstantiators", "<sample:6>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findKeyDeserializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:8>", "<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "mapAbstractType", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomEnumDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:4>", "<null>"}}, 1), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBuilderBasedDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:4>", "<null>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addExplicitDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCandidate"}, new String[]{"<sample:3>", "<sample:6>", "<sample:4>", "<sample:1>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomReferenceDeserializer", "com.fasterxml.jackson.databind.type.ReferenceType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>", "<sample:7>", "<sample:0>", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapLikeDeserializer", "com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>", "<sample:4>", "<sample:5>", "<sample:2>", "<null>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addExplicitDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCandidate"}, new String[]{"<sample:3>", "<sample:6>", "<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomReferenceDeserializer", "com.fasterxml.jackson.databind.type.ReferenceType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:8>", "<sample:7>", "<sample:0>", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapLikeDeserializer", "com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>", "<sample:4>", "<sample:5>", "<sample:2>", "<null>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addExplicitDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCandidate"}, new String[]{"<sample:3>", "<sample:6>", "<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomReferenceDeserializer", "com.fasterxml.jackson.databind.type.ReferenceType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:8>", "<sample:7>", "<sample:1>", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapLikeDeserializer", "com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>", "<sample:4>", "<sample:5>", "<sample:2>", "<null>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<sample:1>", "<sample:0>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomArrayDeserializer", "com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>", "<sample:7>", "<sample:6>", "<sample:1>", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:7>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomArrayDeserializer", "com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>", "<sample:7>", "<sample:6>", "<sample:1>", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<sample:7>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomArrayDeserializer", "com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:1>", "<sample:7>", "<sample:6>", "<sample:1>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructEnumResolver", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<null>", "<sample:6>", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalKeyDeserializers", "com.fasterxml.jackson.databind.deser.KeyDeserializers", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addExplicitPropertyCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:7>", "<sample:2>", "<sample:4>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "mapAbstractType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, null, 3), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [array type, component type: $0]] {getErasedSignature=[[$0, getGenericSignature=[[$0, getTypeName=[array type, component type: [array type, component type: $0.., hasConten...#452#-2144035260", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "mapAbstractType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCreatorsFromProperties", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:2>"}}, 3), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [array type, component type: $0]] {getErasedSignature=[[$0, getGenericSignature=[[$0, getTypeName=[array type, component type: [array type, component type: $0.., hasConten...#452#-2144035260", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "mapAbstractType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCreatorsFromProperties", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:1>"}}, 3), new String[][]{{"toCanonical", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "mapAbstractType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCreatorsFromProperties", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:0>"}}, 3), new String[][]{{"toCanonical", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "mapAbstractType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCreatorsFromProperties", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "resolveType", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:5>", "<sample:7>", "<sample:0>", "<sample:6>"}}, 3), new String[][]{{"useStaticType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findJsonValueFor", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "getFactoryConfig", ""}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructEnumResolver", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>", "<sample:4>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findJsonValueFor", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "getFactoryConfig", ""}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructEnumResolver", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>", "<sample:4>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "mapAbstractType", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findJsonValueFor", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructEnumResolver", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:0>", "<sample:5>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "mapAbstractType", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAbstractTypeResolver", "com.fasterxml.jackson.databind.AbstractTypeResolver", "<sample:6>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:1>", "<sample:9>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withValueInstantiators", "com.fasterxml.jackson.databind.deser.ValueInstantiators", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAbstractTypeResolver", "com.fasterxml.jackson.databind.AbstractTypeResolver", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:3>", "<sample:5>", "<null>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCreatorsFromProperties", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalKeyDeserializers", "com.fasterxml.jackson.databind.deser.KeyDeserializers", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:1>", "<sample:1>", "<null>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCreatorsFromProperties", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalKeyDeserializers", "com.fasterxml.jackson.databind.deser.KeyDeserializers", "<null>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addExplicitPropertyCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:3>", "<sample:8>", "<sample:5>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:1>", "<sample:0>", "<sample:7>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCreatorsFromProperties", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalKeyDeserializers", "com.fasterxml.jackson.databind.deser.KeyDeserializers", "<null>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addExplicitPropertyCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:3>", "<sample:8>", "<sample:5>", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>", "<sample:2>", "<sample:0>", "<sample:7>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCreatorsFromProperties", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalKeyDeserializers", "com.fasterxml.jackson.databind.deser.KeyDeserializers", "<null>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addExplicitPropertyCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:3>", "<sample:8>", "<sample:5>", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>", "<sample:2>", "<sample:4>", "<sample:2>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalKeyDeserializers", "com.fasterxml.jackson.databind.deser.KeyDeserializers", "<null>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerFactoryMethods", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<null>", "<null>", "<null>", "<sample:5>", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addExplicitPropertyCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:3>", "<sample:8>", "<sample:5>", "<sample:5>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:2>", "<sample:3>", "<sample:7>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalKeyDeserializers", "com.fasterxml.jackson.databind.deser.KeyDeserializers", "<null>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addExplicitPropertyCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:4>", "<sample:8>", "<sample:5>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=CONSTANT, getNullAccessPattern=ALWAYS_NULL, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:9>", "<sample:1>", "<sample:0>", "<sample:8>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addExplicitPropertyCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:4>", "<sample:4>", "<sample:5>", "<sample:3>"}}, 1), new String[][]{{"getEmptyAccessPattern", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("CONSTANT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:9>", "<sample:1>", "<sample:0>", "<sample:8>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addExplicitPropertyCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:4>", "<sample:4>", "<sample:5>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:3>", "<sample:4>"}}, 1), new String[][]{{"getEmptyAccessPattern", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("CONSTANT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>", "<sample:1>", "<sample:0>", "<sample:8>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCreatorsFromProperties", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:3>", "<sample:0>", "<sample:8>", "<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:2>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCreatorsFromProperties", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=CONSTANT, getNullAccessPattern=ALWAYS_NULL, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>", "<sample:3>", "<sample:2>", "<sample:1>", "<sample:0>"}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:4>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCreatorsFromProperties", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:5>"}}, 1), new String[][]{{"getValueClass", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class generated.algorithm.SearchInputFactory_scaffolding$GenericBase {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=generated.algorithm.SearchInputFactory_scaffolding.GenericBa.., get...#765#-1415182251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>", "<sample:2>", "<sample:1>", "<sample:3>", "<null>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:4>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCreatorsFromProperties", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.EnumDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=CONSTANT, getNullAccessPattern=ALWAYS_NULL, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>", "<sample:3>", "<sample:4>", "<sample:1>", "<sample:1>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<null>", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findKeyDeserializerFromAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:5>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.EnumDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=CONSTANT, getNullAccessPattern=ALWAYS_NULL, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAbstractTypeResolver", new String[]{"com.fasterxml.jackson.databind.AbstractTypeResolver"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionDeserializer", "com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:5>", "<sample:5>", "<sample:0>", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyContentTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:2>", "<sample:2>", "<sample:2>"}}, 1), new String[][]{{"createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAbstractTypeResolver", new String[]{"com.fasterxml.jackson.databind.AbstractTypeResolver"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findValueInstantiator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyContentTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:2>", "<sample:0>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:0>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalDeserializers", "com.fasterxml.jackson.databind.deser.Deserializers", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAbstractTypeResolver", new String[]{"com.fasterxml.jackson.databind.AbstractTypeResolver"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:4>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:7>", "<sample:1>", "<sample:4>"}}, 3), new String[][]{{"_valueInstantiatorInstance", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAbstractTypeResolver", new String[]{"com.fasterxml.jackson.databind.AbstractTypeResolver"}, new String[]{"<sample:1>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:4>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createArrayDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:7>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>", "<sample:2>", "<sample:4>"}}, 2), new String[][]{{"_valueInstantiatorInstance", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAbstractTypeResolver", new String[]{"com.fasterxml.jackson.databind.AbstractTypeResolver"}, new String[]{"<sample:3>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createArrayDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:7>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>", "<sample:2>", "<sample:4>"}}, 1), new String[][]{{"_valueInstantiatorInstance", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAbstractTypeResolver", new String[]{"com.fasterxml.jackson.databind.AbstractTypeResolver"}, new String[]{"<sample:2>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createArrayDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription", "<sample:6>", "<sample:7>", "<sample:9>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>", "<sample:1>", "<sample:3>"}}, 1), new String[][]{{"withValueInstantiators", "com.fasterxml.jackson.databind.deser.ValueInstantiators", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAbstractTypeResolver", new String[]{"com.fasterxml.jackson.databind.AbstractTypeResolver"}, new String[]{"<sample:2>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:9>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createArrayDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription", "<sample:6>", "<sample:7>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>", "<sample:3>", "<sample:4>"}}, 3), new String[][]{{"withValueInstantiators", "com.fasterxml.jackson.databind.deser.ValueInstantiators", "5"}, {"createCollectionLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.BeanDescription", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAbstractTypeResolver", new String[]{"com.fasterxml.jackson.databind.AbstractTypeResolver"}, new String[]{"<sample:0>"}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:9>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createArrayDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription", "<sample:6>", "<sample:7>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>", "<sample:3>", "<sample:3>"}}, 2), new String[][]{{"withValueInstantiators", "com.fasterxml.jackson.databind.deser.ValueInstantiators", "5"}, {"createCollectionLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.BeanDescription", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAbstractTypeResolver", new String[]{"com.fasterxml.jackson.databind.AbstractTypeResolver"}, new String[]{"<sample:8>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:9>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createArrayDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:7>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>", "<sample:3>", "<sample:6>"}}, 1), new String[][]{{"withValueInstantiators", "com.fasterxml.jackson.databind.deser.ValueInstantiators", "5"}, {"findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:2>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomReferenceDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>", "<sample:3>", "<sample:2>", "<null>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "modifyTypeByAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:4>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerFactoryMethods", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:8>", "<sample:0>", "<sample:0>", "<null>", "<sample:5>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomReferenceDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>", "<sample:3>", "<sample:9>", "<null>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "modifyTypeByAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:3>", "<sample:2>"}}, 3), new String[][]{{"getNullValue", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCreatorsFromProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.PropertyName,int,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.annotation.JacksonInject$Value", "<sample:4>", "<null>", "<sample:7>", "2147483647", "<null>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:3>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCreatorsFromProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.PropertyName,int,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.annotation.JacksonInject$Value", "<sample:4>", "<null>", "<sample:7>", "2147483647", "<null>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:3>", "<sample:0>"}}, 1), new String[][]{{"clear", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCreatorsFromProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.PropertyName,int,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.annotation.JacksonInject$Value", "<sample:4>", "<null>", "<sample:7>", "2147483647", "<null>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomReferenceDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:4>", "<sample:12>", "<sample:2>", "<sample:1>"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomReferenceDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:4>", "<sample:12>", "<sample:2>", "<sample:1>"}, false, 10, new String[][]{}, 1), new String[][]{{"getObjectIdReader", "", "6"}, {"supportsUpdate", "com.fasterxml.jackson.databind.DeserializationConfig", "3"}, {"getEmptyValue", "", "3"}, {"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:0>", "<sample:6>", "<sample:1>", "<sample:1>", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "modifyTypeByAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.PropertyName,int,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.annotation.JacksonInject$Value", "<sample:7>", "<sample:4>", "<sample:6>", "-2147483648", "<sample:3>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCreatorsFromProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:8>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addExplicitPropertyCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:7>", "<sample:6>", "<sample:1>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findValueInstantiator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:1>", "<sample:1>"}}, 2), new String[][]{{"remove", "java.lang.Object", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_hasCreatorAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:9>", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", actual.getClass().getName());
  assertEquals("{hasAbstractTypeResolvers=true, hasDeserializerModifiers=true, hasDeserializers=true, hasKeyDeserializers=true, hasValueInstantiators=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"hasValueInstantiators", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_constructDefaultValueInstantiator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<sample:3>"}}, 2), new String[][]{{"hasValueInstantiators", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_constructDefaultValueInstantiator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<sample:0>"}}, 2), new String[][]{{"abstractTypeResolvers", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ArrayIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_constructDefaultValueInstantiator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<sample:0>"}}, 2), new String[][]{{"abstractTypeResolvers", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ArrayIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerConstructors", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:8>", "<sample:3>", "<sample:4>", "<sample:1>", "<sample:0>", "<empty>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerConstructors", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:9>", "<sample:8>", "<sample:4>", "<sample:3>", "<sample:5>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomTreeNodeDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:4>", "<sample:6>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapLikeDeserializer", "com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>", "<sample:0>", "<sample:2>", "<sample:5>", "<null>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createArrayDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:0>", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addExplicitPropertyCreator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCandidate"}, new String[]{"<sample:1>", "<sample:6>", "<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyContentTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:1>", "<sample:7>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_hasCreatorAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:5>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createCollectionLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.BeanDescription", "<null>", "<sample:0>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addExplicitPropertyCreator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCandidate"}, new String[]{"<sample:2>", "<sample:5>", "<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyContentTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:1>", "<sample:7>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createCollectionLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.BeanDescription", "<null>", "<sample:6>", "<sample:9>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:5>", "<sample:9>"}, false, 0, null, 3), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerFactoryMethods", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:2>", "<sample:5>", "<sample:5>", "<null>", "<sample:10>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCreatorsFromProperties", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomBeanDeserializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:4>", "<sample:3>", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerFactoryMethods", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:2>", "<sample:8>", "<sample:1>", "<sample:5>", "<sample:8>", "<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerFactoryMethods", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:3>", "<sample:1>", "<sample:1>", "<sample:1>", "<sample:0>", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerFactoryMethods", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:2>", "<sample:10>", "<sample:1>", "<sample:5>", "<sample:6>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerFactoryMethods", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:3>", "<sample:1>", "<sample:1>", "<sample:1>", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomEnumDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<empty>", "<sample:7>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:0>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_handleSingleArgumentCreator", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,boolean", "<sample:4>", "<sample:2>", "false", "true"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:7>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapDeserializer", "com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>", "<sample:6>", "<sample:1>", "<sample:0>", "<sample:3>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:8>", "<sample:7>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_handleSingleArgumentCreator", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,boolean", "<sample:3>", "<sample:2>", "true", "true"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:4>", "<sample:7>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapDeserializer", "com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:5>", "<sample:5>", "<sample:1>", "<sample:0>", "<sample:0>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentCreator", new String[]{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "boolean"}, new String[]{"<sample:4>", "<sample:4>", "false", "true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerConstructors", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:0>", "<sample:6>", "<sample:5>", "<sample:5>", "<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomEnumDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:5>", "<sample:13>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createCollectionLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:9>", "<sample:7>", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_hasCreatorAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:1>", "<sample:3>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDeserializerFromAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomReferenceDeserializer", "com.fasterxml.jackson.databind.type.ReferenceType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>", "<sample:0>", "<sample:9>", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAbstractTypeResolver", "com.fasterxml.jackson.databind.AbstractTypeResolver", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withConfig", "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionDeserializer", "com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:4>", "<sample:0>", "<sample:7>", "<sample:2>", "<sample:4>"}}, 3), new String[][]{{"valueInstantiators", "", "2"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findKeyDeserializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withValueInstantiators", "com.fasterxml.jackson.databind.deser.ValueInstantiators", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findKeyDeserializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withValueInstantiators", "com.fasterxml.jackson.databind.deser.ValueInstantiators", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findKeyDeserializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:8>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "mapAbstractType", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomEnumDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:4>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomEnumDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:4>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomEnumDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:4>", "<null>"}}), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomEnumDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:4>", "<sample:3>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:4>", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomEnumDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:4>", "<null>"}}), new String[][]{{"getNullAccessPattern", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("CONSTANT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addExplicitAnyCreator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCandidate"}, new String[]{"<sample:2>", "<sample:6>", "<sample:2>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:6>", "<null>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findJsonValueFor", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBuilderBasedDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:4>", "<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:3>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:2>", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findValueInstantiator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>", "<sample:3>", "<null>", "<sample:6>", "<sample:5>", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>", "<sample:3>", "<sample:6>", "<sample:4>", "<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructEnumResolver", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:2>", "<sample:6>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<null>", "<sample:1>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>", "<sample:3>", "<sample:9>", "<sample:6>", "<sample:3>", "<sample:5>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionLikeDeserializer", "com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:2>", "<sample:5>", "<sample:5>", "<sample:4>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findOptionalStdDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<null>", "<sample:7>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructEnumResolver", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>", "<sample:6>", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructCreatorProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.PropertyName", "int", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.annotation.JacksonInject$Value"}, new String[]{"<sample:0>", "<sample:3>", "<sample:6>", "10", "<sample:0>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapLikeDeserializer", "com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:1>", "<sample:4>", "<sample:2>", "<sample:6>", "<sample:6>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapDeserializer", "com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:5>", "<sample:3>", "<sample:0>", "<sample:1>", "<sample:0>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>", "<sample:3>", "<sample:8>", "<sample:6>", "<sample:6>", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionLikeDeserializer", "com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:2>", "<sample:5>", "<sample:5>", "<sample:3>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findOptionalStdDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<null>", "<sample:7>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructEnumResolver", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>", "<sample:2>", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=CONSTANT, getNullAccessPattern=ALWAYS_NULL, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>", "<null>", "<sample:10>", "<sample:6>", "<sample:6>", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionLikeDeserializer", "com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:2>", "<sample:5>", "<sample:5>", "<sample:3>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructEnumResolver", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:2>", "<sample:2>", "<sample:5>"}}), new String[][]{{"getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "0"}, {"deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addExplicitDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCandidate"}, new String[]{"<null>", "<sample:3>", "<sample:2>", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomReferenceDeserializer", "com.fasterxml.jackson.databind.type.ReferenceType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>", "<sample:7>", "<sample:2>", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapLikeDeserializer", "com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>", "<sample:6>", "<sample:7>", "<sample:2>", "<null>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructEnumResolver", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:4>", "<sample:3>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addExplicitDelegatingCreator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCandidate"}, new String[]{"<sample:3>", "<sample:6>", "<sample:4>", "<sample:1>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomReferenceDeserializer", "com.fasterxml.jackson.databind.type.ReferenceType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>", "<sample:7>", "<sample:1>", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapLikeDeserializer", "com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>", "<sample:4>", "<sample:5>", "<sample:2>", "<null>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addExplicitPropertyCreator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCandidate"}, new String[]{"<sample:7>", "<sample:7>", "<sample:4>", "<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findJsonValueFor", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentCreator", new String[]{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "false", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findContentDeserializerFromAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:1>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findContentDeserializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:8>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createEnumDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:2>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findOptionalStdDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:3>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createCollectionLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:4>", "<sample:9>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerConstructors", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:4>", "<sample:1>", "<sample:5>", "<sample:0>", "<sample:1>", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomReferenceDeserializer", "com.fasterxml.jackson.databind.type.ReferenceType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>", "<sample:6>", "<sample:4>", "<sample:2>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "resolveMemberAndTypeAnnotations", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:2>", "<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.PlaceholderForType", actual.getClass().getName());
  assertEquals("$0 {getErasedSignature=$0, getGenericSignature=$0, getTypeName=$0, hasContentType=true, hasGenericTypes=false, hasHandlers=false, hasValueHandler=false, isAbstract=false, isArrayType=false, isCollecti...#332#-877153026", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<null>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findContentDeserializerFromAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<null>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withDeserializerModifier", new String[]{"com.fasterxml.jackson.databind.deser.BeanDeserializerModifier"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<sample:1>", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<sample:1>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=EXTERNAL_PROPERTY}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:3>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "mapAbstractType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.Object, contains $0] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<$0>;, getTypeName=[collection type; class java.lang.Object, contain...#470#342480638", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "mapAbstractType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:2>"}, false), new String[][]{{"useStaticType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "mapAbstractType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:0>"}, false), new String[][]{{"withContentType", "com.fasterxml.jackson.databind.JavaType", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [array type, component type: $0]] {getErasedSignature=[[$0, getGenericSignature=[[$0, getTypeName=[array type, component type: [array type, component type: $0.., hasConten...#452#-2144035260", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findJsonValueFor", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createArrayDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:0>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_constructDefaultValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findJsonValueFor", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructEnumResolver", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:0>", "<sample:4>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "mapAbstractType", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAbstractTypeResolver", "com.fasterxml.jackson.databind.AbstractTypeResolver", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCreatorsFromProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:6>", "<sample:9>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createCollectionDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.BeanDescription", "<sample:8>", "<sample:5>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCreatorsFromProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:6>", "<sample:9>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalDeserializers", "com.fasterxml.jackson.databind.deser.Deserializers", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createCollectionDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.BeanDescription", "<sample:8>", "<sample:5>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCreatorsFromProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:6>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalDeserializers", "com.fasterxml.jackson.databind.deser.Deserializers", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createCollectionDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.BeanDescription", "<sample:8>", "<sample:5>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCreatorsFromProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:6>", "<sample:9>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalDeserializers", "com.fasterxml.jackson.databind.deser.Deserializers", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createCollectionDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.BeanDescription", "<sample:8>", "<sample:5>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:3>", "<sample:6>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:0>", "<null>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomEnumDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:7>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withValueInstantiators", "com.fasterxml.jackson.databind.deser.ValueInstantiators", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:0>", "<null>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomEnumDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:7>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withValueInstantiators", "com.fasterxml.jackson.databind.deser.ValueInstantiators", "<sample:2>"}}), new String[][]{{"getKnownPropertyNames", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createReferenceDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:6>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createReferenceDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:0>", "<sample:2>", "<sample:6>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:6>", "<sample:0>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_constructDefaultValueInstantiator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<null>", "<sample:2>", "<sample:1>", "<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findContentDeserializerFromAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<null>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<null>", "<sample:2>", "<sample:1>", "<sample:0>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findContentDeserializerFromAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<null>", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:0>", "<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomTreeNodeDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:1>", "<sample:4>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "resolveMemberAndTypeAnnotations", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:1>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:3>", "<sample:5>", "<null>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCreatorsFromProperties", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<null>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalKeyDeserializers", "com.fasterxml.jackson.databind.deser.KeyDeserializers", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:1>", "<sample:0>", "<sample:7>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCreatorsFromProperties", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<null>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalKeyDeserializers", "com.fasterxml.jackson.databind.deser.KeyDeserializers", "<null>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addExplicitPropertyCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:3>", "<sample:8>", "<sample:5>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:2>", "<sample:3>", "<sample:1>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalKeyDeserializers", "com.fasterxml.jackson.databind.deser.KeyDeserializers", "<null>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addExplicitPropertyCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:4>", "<sample:8>", "<sample:5>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=CONSTANT, getNullAccessPattern=ALWAYS_NULL, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:0>", "<sample:3>", "<sample:8>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addExplicitPropertyCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:4>", "<sample:8>", "<sample:5>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findOptionalStdDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:4>", "<sample:2>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_valueInstantiatorInstance", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:5>", "<sample:5>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=CONSTANT, getNullAccessPattern=ALWAYS_NULL, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_hasCreatorAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createReferenceDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ReferenceType,com.fasterxml.jackson.databind.BeanDescription", "<sample:6>", "<sample:7>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.BeanDescription", "<sample:1>", "<sample:1>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAdditionalDeserializers", new String[]{"com.fasterxml.jackson.databind.deser.Deserializers"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>", "<sample:2>", "<sample:4>", "<sample:1>", "<sample:1>"}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.EnumDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=CONSTANT, getNullAccessPattern=ALWAYS_NULL, isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAbstractTypeResolver", new String[]{"com.fasterxml.jackson.databind.AbstractTypeResolver"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionDeserializer", "com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:5>", "<sample:5>", "<sample:0>", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyContentTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:6>", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAbstractTypeResolver", new String[]{"com.fasterxml.jackson.databind.AbstractTypeResolver"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionDeserializer", "com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:5>", "<sample:5>", "<sample:0>", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyContentTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:2>", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAbstractTypeResolver", new String[]{"com.fasterxml.jackson.databind.AbstractTypeResolver"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionDeserializer", "com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:5>", "<sample:5>", "<sample:0>", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyContentTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:2>", "<sample:2>", "<sample:2>"}}), new String[][]{{"createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findDeserializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:3>", "<sample:3>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomTreeNodeDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:6>", "<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomReferenceDeserializer", "com.fasterxml.jackson.databind.type.ReferenceType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:8>", "<sample:3>", "<sample:3>", "<sample:5>", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAbstractTypeResolver", new String[]{"com.fasterxml.jackson.databind.AbstractTypeResolver"}, new String[]{"<null>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:6>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyContentTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:1>", "<sample:0>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAbstractTypeResolver", new String[]{"com.fasterxml.jackson.databind.AbstractTypeResolver"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:4>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:7>", "<sample:1>", "<sample:4>"}}), new String[][]{{"_valueInstantiatorInstance", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAbstractTypeResolver", new String[]{"com.fasterxml.jackson.databind.AbstractTypeResolver"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:4>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createArrayDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:7>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:7>", "<sample:2>", "<sample:4>"}}), new String[][]{{"_valueInstantiatorInstance", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "resolveType", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<null>", "<sample:7>", "<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomReferenceDeserializer", "com.fasterxml.jackson.databind.type.ReferenceType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:8>", "<sample:5>", "<sample:2>", "<sample:5>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findPropertyContentTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:2>", "<sample:3>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer; base-type:null; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=EXTERNAL_PROPERTY}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "modifyTypeByAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:2>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:8>", "<sample:4>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "resolveMemberAndTypeAnnotations", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:6>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerConstructors", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:3>", "<sample:3>", "<sample:1>", "<sample:4>", "<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addExplicitAnyCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:1>", "<sample:3>", "<sample:2>", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "mapAbstractType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withConfig", "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class java.lang.Object, $0 -> $0] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<$0$0>;, getTypeName=[map-like type; class java.lang.Object, $0 -> $0], h...#463#-1745081143", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findPropertyTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:5>", "<null>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_mapAbstractCollectionType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.DeserializationConfig", "<sample:4>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findValueInstantiator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:1>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<null>", "<sample:0>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withConfig", new String[]{"com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findJsonValueFor", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:6>", "<sample:1>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findPropertyContentTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:3>", "<sample:5>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:3>", "<null>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_reportUnwrappedCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<null>", "<sample:6>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructEnumResolver", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:0>", "<sample:6>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "mapAbstractType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:4>"}, false), new String[][]{{"findTypeParameters", "java.lang.Class", "7"}});
  assertNotNull(actual);
  assertEquals("[Lcom.fasterxml.jackson.databind.JavaType;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "mapAbstractType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "mapAbstractType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:3>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createCollectionLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:1>", "<sample:6>"}}), new String[][]{{"containedTypeCount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "mapAbstractType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:7>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createCollectionLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:1>", "<sample:6>"}}), new String[][]{{"containedTypeOrUnknown", "int", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasContentType=false, hasGeneri...#435#1544055253", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:2>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_valueInstantiatorInstance", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:5>", "<s:b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createArrayDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<sample:4>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_mapAbstractCollectionType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_constructDefaultValueInstantiator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapDeserializer", "com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>", "<sample:0>", "<sample:3>", "<sample:0>", "<sample:7>", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomReferenceDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>", "<sample:3>", "<sample:2>", "<null>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "modifyTypeByAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:4>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomReferenceDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<sample:3>", "<sample:8>", "<sample:6>", "<sample:7>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_valueInstantiatorInstance", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:2>", "<sample:2>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomTreeNodeDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:1>", "<sample:3>", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:3>", "<sample:0>", "<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addExplicitDelegatingCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:1>", "<sample:4>", "<sample:0>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAdditionalDeserializers", new String[]{"com.fasterxml.jackson.databind.deser.Deserializers"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerFactoryMethods", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:3>", "<sample:2>", "<sample:3>", "<sample:5>", "<sample:7>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_constructDefaultValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:8>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:4>", "<sample:2>", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createTreeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<null>", "<sample:7>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<null>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findOptionalStdDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:3>", "<sample:6>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findPropertyTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:7>", "<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_hasCreatorAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer; base-type:$0; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=EXTERNAL_PROPERTY}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findPropertyTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:9>", "<sample:8>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addExplicitPropertyCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:0>", "<sample:1>", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_hasCreatorAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:6>", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:0>", "<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_handleSingleArgumentCreator", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,boolean", "<sample:1>", "<sample:2>", "true", "true"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_handleSingleArgumentCreator", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,boolean", "<sample:2>", "<null>", "false", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createTreeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:3>", "<sample:4>", "<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapLikeDeserializer", "com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:3>", "<sample:6>", "<sample:5>", "<sample:4>", "<sample:4>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:1>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_handleSingleArgumentCreator", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,boolean,boolean", "<sample:4>", "<sample:2>", "false", "true"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:7>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapDeserializer", "com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>", "<sample:6>", "<sample:1>", "<sample:0>", "<sample:3>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:0>", "<sample:3>", "<sample:9>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_valueInstantiatorInstance", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:5>", "<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomTreeNodeDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:3>", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomReferenceDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:6>", "<sample:5>", "<sample:0>", "<sample:0>"}, false), new String[][]{{"isCachable", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:0>", "<null>", "<sample:8>", "<sample:4>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>", "<sample:7>", "<sample:5>", "<sample:1>", "<sample:7>", "<sample:5>"}, false), new String[][]{{"getEmptyAccessPattern", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("DYNAMIC", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findDeserializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:1>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "mapAbstractType", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_valueInstantiatorInstance", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:7>", "<sample:7>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", actual.getClass().getName());
  assertEquals("{hasAbstractTypeResolvers=true, hasDeserializerModifiers=true, hasDeserializers=true, hasKeyDeserializers=true, hasValueInstantiators=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapLikeDeserializer", "com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>", "<sample:4>", "<sample:1>", "<sample:2>", "<sample:8>", "<sample:7>"}}), new String[][]{{"deserializers", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ArrayIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapLikeDeserializer", "com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>", "<sample:4>", "<sample:1>", "<sample:2>", "<sample:8>", "<sample:7>"}}), new String[][]{{"deserializers", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ArrayIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 11, new String[][]{}), new String[][]{{"valueInstantiators", "", "2"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:7>", "<sample:0>"}}), new String[][]{{"valueInstantiators", "", "2"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withConfig", "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionDeserializer", "com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:4>", "<sample:0>", "<sample:7>", "<sample:2>", "<sample:4>"}}, 3), new String[][]{{"valueInstantiators", "", "2"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:6>"}, false), new String[][]{{"createReferenceDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ReferenceType,com.fasterxml.jackson.databind.BeanDescription", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:3>", "<sample:13>", "<sample:0>", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:2>", "<sample:2>", "<sample:5>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findPropertyTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:2>", "<sample:2>", "<sample:7>"}, false, 0, null, 3), new String[][]{{"getDefaultImpl", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findPropertyTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:2>", "<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addExplicitDelegatingCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:9>", "<sample:9>", "<sample:5>", "<sample:1>"}}, 3), new String[][]{{"deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findPropertyTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:2>", "<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addExplicitDelegatingCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:9>", "<sample:9>", "<sample:5>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_mapAbstractCollectionType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.DeserializationConfig", "<sample:0>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer; base-type:null; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=EXTERNAL_PROPERTY}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addExplicitAnyCreator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCandidate"}, new String[]{"<sample:0>", "<null>", "<sample:2>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomReferenceDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>", "<sample:6>", "<sample:4>", "<sample:2>", "<sample:1>"}, false, 0, null, 2), new String[][]{{"getDelegatee", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<null>", "<sample:1>", "<sample:0>", "<sample:6>", "<sample:0>"}, false), new String[][]{{"getKnownPropertyNames", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_mapAbstractCollectionType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCreatorsFromProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:13>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCreatorsFromProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:7>"}, false), new String[][]{{"put", "java.lang.Object,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomEnumDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:4>", "<sample:13>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomBeanDeserializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:4>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findValueInstantiator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<null>", "<sample:13>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=CONSTANT, getNullAccessPattern=ALWAYS_NULL, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:7>", "<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findValueInstantiator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:13>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "resolveMemberAndTypeAnnotations", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:0>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentCreator", new String[]{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "boolean"}, new String[]{"<sample:7>", "<sample:2>", "false", "true"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapLikeDeserializer", "com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:4>", "<sample:4>", "<sample:0>", "<sample:3>", "<sample:4>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:1>", "<sample:0>", "<sample:3>", "<sample:3>", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentCreator", new String[]{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "true", "true"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapLikeDeserializer", "com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:4>", "<sample:6>", "<sample:0>", "<sample:3>", "<sample:4>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:1>", "<sample:0>", "<sample:3>", "<sample:3>", "<sample:2>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.reflect.GenericSignatureFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerConstructors", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:9>", "<sample:15>", "<sample:0>", "<null>", "<sample:0>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyContentTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:3>", "<sample:4>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAdditionalDeserializers", new String[]{"com.fasterxml.jackson.databind.deser.Deserializers"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionLikeDeserializer", "com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:5>", "<sample:7>", "<sample:1>", "<sample:6>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerConstructors", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:7>", "<sample:13>", "<sample:5>", "<sample:0>", "<sample:7>", "<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomArrayDeserializer", "com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:1>", "<sample:2>", "<sample:2>", "<sample:6>", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_reportUnwrappedCreatorProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter"}, new String[]{"<sample:0>", "<sample:3>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "getFactoryConfig", ""}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_hasCreatorAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:8>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAbstractTypeResolver", new String[]{"com.fasterxml.jackson.databind.AbstractTypeResolver"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withConfig", new String[]{"com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"}, new String[]{"<sample:4>"}, false), new String[][]{{"createKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerConstructors", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:1>", "<sample:4>", "<null>", "<sample:7>", "<sample:4>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:8>", "<sample:6>", "<sample:11>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomEnumDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:6>", "<sample:3>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription", "<sample:1>", "<sample:1>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addExplicitAnyCreator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.deser.impl.CreatorCandidate"}, new String[]{"<sample:3>", "<sample:9>", "<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionLikeDeserializer", "com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:1>", "<null>", "<sample:5>", "<sample:8>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withConfig", "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "mapAbstractType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCreatorsFromProperties", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:9>", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.PlaceholderForType", actual.getClass().getName());
  assertEquals("$0 {getErasedSignature=$0, getGenericSignature=$0, getTypeName=$0, hasContentType=true, hasGenericTypes=false, hasHandlers=false, hasValueHandler=false, isAbstract=false, isArrayType=false, isCollecti...#332#-877153026", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomTreeNodeDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:3>", "<sample:1>", "<null>"}, false), new String[][]{{"getEmptyAccessPattern", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.AccessPattern", actual.getClass().getName());
  assertEquals("DYNAMIC", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<sample:4>", "<sample:1>", "<sample:5>", "<sample:7>", "<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<sample:4>", "<sample:1>", "<sample:5>", "<sample:7>", "<sample:4>"}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=CONSTANT, getNullAccessPattern=ALWAYS_NULL, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<sample:3>", "<sample:1>", "<sample:5>", "<sample:7>", "<sample:4>"}, false, 8, new String[][]{}, 3), new String[][]{{"getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>", "<sample:7>", "<sample:5>", "<sample:6>", "<sample:6>"}, false), new String[][]{{"deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<null>", "<sample:12>", "<sample:5>", "<null>", "<sample:0>"}, false, 0, null, 3), new String[][]{{"deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<null>", "<sample:15>", "<sample:2>", "<null>", "<sample:0>"}, false, 0, null, 1), new String[][]{{"deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:15>", "<sample:2>", "<null>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:6>", "<sample:3>", "<sample:12>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomTreeNodeDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<sample:6>", "<sample:13>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createBuilderBasedDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,java.lang.Class", "<sample:7>", "<sample:3>", "<sample:3>", "<null>"}}), new String[][]{{"deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomTreeNodeDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<sample:3>", "<sample:13>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:4>", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createBuilderBasedDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,java.lang.Class", "<sample:6>", "<sample:4>", "<sample:3>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_reportUnwrappedCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<sample:9>", "<sample:4>", "<sample:7>"}}, 1), new String[][]{{"deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomTreeNodeDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:3>", "<sample:3>", "<sample:11>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createBuilderBasedDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,java.lang.Class", "<sample:6>", "<sample:4>", "<sample:3>", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<null>", "<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:0>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomEnumDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<null>", "<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomReferenceDeserializer", "com.fasterxml.jackson.databind.type.ReferenceType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>", "<sample:3>", "<sample:7>", "<sample:6>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:2>", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "resolveMemberAndTypeAnnotations", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:6>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withConfig", new String[]{"com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<null>", "<null>"}}, 2), new String[][]{{"withAbstractTypeResolver", "com.fasterxml.jackson.databind.AbstractTypeResolver", "5"}, {"findValueInstantiator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withConfig", new String[]{"com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<null>", "<null>"}}, 2), new String[][]{{"withAbstractTypeResolver", "com.fasterxml.jackson.databind.AbstractTypeResolver", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<null>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalKeyDeserializers", "com.fasterxml.jackson.databind.deser.KeyDeserializers", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapLikeDeserializer", "com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:1>", "<null>", "<sample:13>", "<sample:5>", "<sample:8>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:2>", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:2>", "<empty>"}}, 2), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NoClassDefFoundError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCreatorsFromProperties", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<sample:7>", "<sample:3>", "<sample:3>", "<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:2>", "<sample:5>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addExplicitDelegatingCreator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.deser.impl.CreatorCandidate", "<sample:4>", "<sample:1>", "<sample:2>", "<sample:6>"}}), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "resolveMemberAndTypeAnnotations", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<null>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDeserializerFromAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:5>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withConfig", new String[]{"com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:4>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:9>", "<sample:4>", "<sample:13>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createReferenceDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.ReferenceType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:1>", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "resolveType", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:3>", "<sample:8>", "<sample:1>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionLikeType", actual.getClass().getName());
  assertEquals("[collection-like type; class java.lang.Object, contains $0] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object<$0>;, getTypeName=[collection-like type; class java.lang.Objec...#480#-45775080", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomArrayDeserializer", "com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<null>", "<sample:2>", "<sample:1>", "<sample:6>", "<sample:0>"}}, 2), new String[][]{{"createReferenceDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ReferenceType,com.fasterxml.jackson.databind.BeanDescription", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_valueInstantiatorInstance", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:1>", "<d:-8.7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCreatorsFromProperties", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>", "<sample:0>", "<sample:7>", "<sample:2>", "<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructEnumResolver", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:3>", "<null>", "<sample:2>"}}), new String[][]{{"findBackReference", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:3>", "<sample:2>", "<sample:4>", "<sample:8>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructEnumResolver", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:3>", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomEnumDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:0>", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:3>", "<sample:2>", "<sample:4>", "<sample:8>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructEnumResolver", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:3>", "<null>", "<sample:2>"}}, 2), new String[][]{{"findBackReference", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentCreator", new String[]{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "boolean"}, new String[]{"<sample:7>", "<sample:4>", "true", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:4>", "<sample:8>", "<null>", "<sample:6>", "<sample:0>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.PropertyName,int,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.annotation.JacksonInject$Value", "<sample:7>", "<sample:1>", "<sample:1>", "2147483633", "<sample:6>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createCollectionDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.BeanDescription", "<sample:9>", "<sample:3>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createEnumDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<null>", "<sample:6>", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findOptionalStdDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<null>", "<sample:9>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentCreator", new String[]{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "boolean"}, new String[]{"<sample:7>", "<sample:7>", "true", "true"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:8>", "<sample:8>", "<sample:3>", "<sample:8>", "<sample:2>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.PropertyName,int,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.annotation.JacksonInject$Value", "<sample:7>", "<sample:8>", "<sample:7>", "2147483633", "<sample:11>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentCreator", new String[]{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "boolean"}, new String[]{"<null>", "<sample:7>", "false", "false"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:8>", "<sample:8>", "<sample:4>", "<sample:9>", "<sample:2>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.PropertyName,int,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.annotation.JacksonInject$Value", "<sample:7>", "<sample:7>", "<sample:5>", "1073741816", "<sample:0>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>", "<sample:7>", "<sample:3>", "<null>", "<sample:6>"}, false), new String[][]{{"deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentCreator", new String[]{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "false", "true"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:8>", "<sample:8>", "<sample:5>", "<sample:8>", "<sample:2>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.PropertyName,int,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.annotation.JacksonInject$Value", "<sample:7>", "<sample:7>", "<sample:5>", "1073741816", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:8>", "<sample:5>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:1>", "<sample:13>", "<sample:7>", "<sample:5>"}, false, 0, null, 3), new String[][]{{"getKnownPropertyNames", "", "3"}, {"getKnownPropertyNames", "", "3"}, {"handledType", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentCreator", new String[]{"com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "boolean", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "true", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:8>", "<sample:8>", "<sample:5>", "<sample:8>", "<sample:2>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.PropertyName,int,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.annotation.JacksonInject$Value", "<sample:7>", "<sample:7>", "<sample:5>", "1073741816", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:8>", "<sample:5>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.reflect.GenericSignatureFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createCollectionLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:9>", "<sample:2>", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findRemappedType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_reportUnwrappedCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "<null>", "<sample:1>", "<sample:9>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findRemappedType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "java.lang.Class"}, new String[]{"<null>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAdditionalDeserializers", new String[]{"com.fasterxml.jackson.databind.deser.Deserializers"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findContentDeserializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>", "<sample:4>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomEnumDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<null>", "<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer", actual.getClass().getName());
  assertEquals("{getEmptyAccessPattern=DYNAMIC, getNullAccessPattern=CONSTANT, isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
}
