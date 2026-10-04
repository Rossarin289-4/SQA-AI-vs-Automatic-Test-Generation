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
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCreatorsFromProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:4>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyContentTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:2>", "<sample:7>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:1>", "<sample:2>", "<null>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomBeanDeserializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<null>", "<sample:1>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createEnumDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:3>", "<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAbstractTypeResolver", new String[]{"com.fasterxml.jackson.databind.AbstractTypeResolver"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:6>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "resolveType", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:3>", "<sample:2>", "<sample:3>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:5>", "<sample:7>", "<sample:2>", "<null>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerConstructors", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:5>", "<sample:5>", "<sample:7>", "<null>", "<null>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_handleSingleArgumentFactory", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,boolean", "<sample:4>", "<sample:6>", "<sample:3>", "<sample:4>", "<sample:1>", "<null>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "findTypeMapping", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "addMapping", "java.lang.Class,java.lang.Class", "<empty>", "<empty>"}, {"com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "resolveAbstractType", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:4>", "<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownKeyDeserializer", "com.fasterxml.jackson.databind.JavaType", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerFactoryMethods", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:1>", "<sample:6>", "<sample:1>", "<sample:5>", "<null>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_checkIfCreatorPropertyBased", "com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "<sample:0>", "<sample:0>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<sample:0>", "<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_findCachedDeserializer", "com.fasterxml.jackson.databind.JavaType", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCache2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:2>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "writeReplace", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>", "<sample:3>", "<sample:1>", "<sample:1>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "mapAbstractType", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "hasValueDeserializerFor", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:6>", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:0>", "<sample:7>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "findKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:5>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findPropertyTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:10>", "<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:2>", "<sample:4>", "<sample:4>", "<sample:7>", "<sample:7>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_handleSingleArgumentConstructor", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.introspect.AnnotatedConstructor,boolean,boolean", "<sample:8>", "<sample:2>", "<null>", "<sample:0>", "<sample:0>", "<sample:1>", "true", "false"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapLikeDeserializer", "com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>", "<sample:4>", "<sample:0>", "<sample:0>", "<sample:3>", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findPropertyTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<null>", "<sample:3>", "<sample:0>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomBeanDeserializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:10>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructCreatorProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.PropertyName", "int", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:6>", "<sample:2>", "1", "<sample:2>", "<s:a>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_handleSingleArgumentFactory", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,boolean", "<sample:1>", "<sample:3>", "<sample:1>", "<sample:3>", "<sample:5>", "<sample:4>", "true"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionLikeDeserializer", "com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:4>", "<sample:1>", "<sample:0>", "<null>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "resolveType", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:3>", "<sample:0>", "<sample:1>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "findTypeMapping", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "addMapping", "java.lang.Class,java.lang.Class", "<sample:3>", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_mapAbstractCollectionType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_constructDefaultValueInstantiator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomTreeNodeDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:1>", "<sample:3>", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findParamName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<null>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findImplicitParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>", "<sample:6>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "resolveType", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:0>", "<sample:6>", "<sample:4>", "<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withValueInstantiators", "com.fasterxml.jackson.databind.deser.ValueInstantiators", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<sample:6>", "<sample:2>", "<sample:1>", "<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findExplicitParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<sample:6>", "<sample:2>", "<sample:1>", "<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:1>", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionDeserializer", "com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:4>", "<sample:0>", "<sample:4>", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:8>", "<sample:0>", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:1>", "<sample:2>", "<d:1.5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}}, 1), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "5"}, {"isJavaLangObject", "", "3"}, {"useStaticType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]; id-resolver: GeneratedTestInputPro...#255#424439370", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructEnumResolver", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<null>", "<sample:2>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 35, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:3>"}}, 3), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava...#597#-1446704358", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection-like type; class java.util.List, contains [simple type, class generated.algorithm.SearchInputFactory_scaffo...#310#735925094", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "addMapping", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:1>"}, false, 10, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findJsonValueFor", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_handleSingleArgumentFactory", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,boolean", "<sample:6>", "<sample:8>", "<sample:0>", "<sample:2>", "<sample:6>", "<sample:4>", "true"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<null>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_handleSingleArgumentFactory", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,boolean", "<sample:10>", "<sample:6>", "<sample:4>", "<null>", "<sample:4>", "<sample:3>", "true"}}), new String[][]{{"getEmptyValue", "", "4"}, {"getObjectIdReader", "", "5"}, {"unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:3>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:9>", "<sample:2>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCacheValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:6>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "cachedDeserializersCount", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_valueInstantiatorInstance", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:2>", "<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:0>", "<sample:7>", "<sample:4>", "<sample:4>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_valueInstantiatorInstance", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:7>", "<null>", "<i:0>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findImplicitParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<null>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createCollectionLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<sample:6>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.ByteBufferDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findRemappedType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalKeyDeserializers", "com.fasterxml.jackson.databind.deser.KeyDeserializers", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_hasExplicitParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<null>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCreatorsFromProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<null>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:0>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findExplicitParamName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:2>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:2>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription", "<sample:4>", "<sample:5>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<null>", "<sample:2>", "<s:j>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "0xvD", "<sample:4>", "<null>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericBase", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]; id-resolver: GeneratedTestInputPro...#254#1275949248", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructCreatorProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.PropertyName", "int", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "java.lang.Object"}, new String[]{"<sample:4>", "<sample:1>", "<sample:3>", "-1", "<sample:6>", "<s:key>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_handleSingleArgumentFactory", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,boolean", "<sample:2>", "<sample:6>", "<sample:2>", "<sample:2>", "<sample:3>", "<sample:3>", "false"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:10>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructCreatorProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.PropertyName", "int", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:6>", "<sample:4>", "-27", "<sample:6>", "<b:true>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_handleSingleArgumentFactory", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,boolean", "<sample:10>", "<sample:6>", "<sample:2>", "<sample:2>", "<sample:3>", "<sample:5>", "false"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:16>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructCreatorProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.PropertyName", "int", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:1>", "<sample:3>", "-56", "<sample:7>", "<i:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findJsonValueFor", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_handleSingleArgumentFactory", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,boolean", "<sample:9>", "<sample:6>", "<sample:7>", "<sample:2>", "<sample:4>", "<sample:5>", "true"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withDeserializerModifier", "com.fasterxml.jackson.databind.deser.BeanDeserializerModifier", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAdditionalDeserializers", new String[]{"com.fasterxml.jackson.databind.deser.Deserializers"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_checkImplicitlyNamedConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.List", "<sample:3>", "<sample:7>", "<sample:2>", "<sample:6>", "<sample:6>", "<empty>"}}), new String[][]{{"createMapDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:0>", "<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "0)", "<sample:3>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "hasValueDeserializerFor", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:0>", "<sample:1>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:8>", "<sample:7>", "<sample:10>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "findConverter", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<null>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_checkIfCreatorPropertyBased", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition"}, new String[]{"<sample:7>", "<sample:11>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "mapAbstractType", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.PropertyName,int,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,java.lang.Object", "<null>", "<null>", "<sample:2>", "2147483647", "<sample:1>", "<s:ekey>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "hasValueDeserializerFor", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>", "<sample:7>", "<null>"}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownValueDeserializer", "com.fasterxml.jackson.databind.JavaType", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "flushCachedDeserializers", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_checkIfCreatorPropertyBased", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition"}, new String[]{"<sample:1>", "<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_handleSingleArgumentConstructor", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.introspect.AnnotatedConstructor,boolean,boolean", "<sample:7>", "<sample:0>", "<sample:6>", "<sample:6>", "<sample:1>", "<sample:7>", "false", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withConfig", new String[]{"com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.BeanDescription", "<null>", "<sample:5>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_mapAbstractCollectionType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.DeserializationConfig", "<sample:7>", "<sample:16>"}}), new String[][]{{"findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_checkIfCreatorPropertyBased", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition"}, new String[]{"<sample:8>", "<sample:11>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:5>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:8>", "<sample:7>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_handleSingleArgumentConstructor", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.introspect.AnnotatedConstructor,boolean,boolean", "<sample:2>", "<sample:6>", "<sample:1>", "<sample:4>", "<sample:4>", "<sample:3>", "false", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withConfig", new String[]{"com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"}, new String[]{"<sample:1>"}, false), new String[][]{{"createCollectionDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.BeanDescription", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentConstructor", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "boolean", "boolean"}, new String[]{"<sample:2>", "<sample:4>", "<sample:2>", "<sample:5>", "<sample:0>", "<sample:7>", "true", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomArrayDeserializer", "com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:3>", "<sample:0>", "<sample:0>", "<sample:0>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionLikeDeserializer", "com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:4>", "<sample:5>", "<sample:5>", "<sample:5>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentConstructor", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "boolean", "boolean"}, new String[]{"<sample:3>", "<sample:4>", "<sample:4>", "<sample:1>", "<sample:1>", "<sample:1>", "true", "false"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_hasExplicitParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:5>", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createEnumDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:8>", "<sample:8>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findOptionalStdDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:3>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_hasExplicitParamName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>", "<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_handleSingleArgumentFactory", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,boolean", "<sample:8>", "<sample:5>", "<sample:4>", "<sample:5>", "<sample:7>", "<sample:3>", "false"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createCollectionLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:8>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentFactory", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "boolean"}, new String[]{"<sample:16>", "<sample:1>", "<sample:0>", "<sample:6>", "<sample:0>", "<sample:7>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.PropertyName,int,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,java.lang.Object", "<sample:3>", "<sample:4>", "<sample:5>", "2147483647", "<null>", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentFactory", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "boolean"}, new String[]{"<sample:16>", "<sample:1>", "<sample:0>", "<sample:5>", "<sample:0>", "<sample:7>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.PropertyName,int,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,java.lang.Object", "<sample:3>", "<sample:4>", "<sample:5>", "2147483647", "<null>", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:8>", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDeserializerFromAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalKeyDeserializers", "com.fasterxml.jackson.databind.deser.KeyDeserializers", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findExplicitParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<null>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:2>", "<sample:8>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructEnumResolver", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:2>", "<sample:10>", "<sample:6>"}}), new String[][]{{"getNullValue", "", "2"}, {"getKnownPropertyNames", "", "1"}, {"findBackReference", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createArrayDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription", "<sample:1>", "<sample:7>", "<null>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomTreeNodeDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:7>", "<sample:6>"}}), new String[][]{{"createKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:10>", "<sample:9>", "<sample:5>", "<sample:8>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:7>", "<sample:10>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCacheValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:7>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "hasValueDeserializerFor", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:8>", "<sample:11>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomEnumDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<null>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomEnumDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createCollectionLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.BeanDescription", "<sample:4>", "<sample:0>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<null>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:4>"}, false, 15, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:4>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAdditionalDeserializers", new String[]{"com.fasterxml.jackson.databind.deser.Deserializers"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:2>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseTypeName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:2>", "<sample:3>"}, false, 0, null, 3), new String[][]{{"isCachable", "", "2"}, {"getDelegatee", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:4>"}, false, 10, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:8>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", " "}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentFactory", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "boolean"}, new String[]{"<sample:6>", "<sample:4>", "<sample:4>", "<sample:0>", "<sample:6>", "<sample:6>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "resolveType", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:5>", "<sample:5>", "<sample:3>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_hasExplicitParamName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findExplicitParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:7>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:7>", "<sample:0>", "<sample:1>", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:0>", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findPropertyTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:10>", "<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:2>", "<sample:6>", "<sample:4>", "<sample:7>", "<sample:7>", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findPropertyTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:10>", "<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:2>", "<sample:6>", "<sample:4>", "<sample:7>", "<sample:7>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_handleSingleArgumentConstructor", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.introspect.AnnotatedConstructor,boolean,boolean", "<sample:8>", "<sample:2>", "<sample:4>", "<sample:0>", "<sample:0>", "<sample:1>", "false", "false"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:3>", "<i:-1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructCreatorProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.PropertyName", "int", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "java.lang.Object"}, new String[]{"<sample:1>", "<null>", "<sample:3>", "2147483647", "<sample:2>", "<s:a>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:0>", "<sample:3>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:4>", "<sample:9>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<sample:4>", "<sample:9>"}, false, 6, new String[][]{}, 1), new String[][]{{"unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Integer", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Integer", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection-like type; class java.lang.Integer, contains [simple type, class generated.algorithm.SearchInputFactory_sca...#311#-465951005", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "resolveType", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:8>", "<sample:3>", "<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.BeanDescription", "<null>", "<sample:0>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionDeserializer", "com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>", "<sample:2>", "<sample:0>", "<sample:2>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromAny", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:9>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:3>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createCollectionLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:6>", "<null>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "mapAbstractType", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_mapAbstractCollectionType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_constructDefaultValueInstantiator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:4>", "<sample:8>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_mapAbstractCollectionType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:4>", "<sample:7>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomTreeNodeDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "modifyTypeByAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:0>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:3>", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_mapAbstractCollectionType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<null>", "<sample:5>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomTreeNodeDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:4>", "<sample:3>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_mapAbstractCollectionType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:1>", "<sample:7>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomTreeNodeDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:4>", "<sample:3>", "<sample:7>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAbstractTypeResolver", new String[]{"com.fasterxml.jackson.databind.AbstractTypeResolver"}, new String[]{"<sample:4>"}, false, 0, null, 2), new String[][]{{"findValueInstantiator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAbstractTypeResolver", new String[]{"com.fasterxml.jackson.databind.AbstractTypeResolver"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:7>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:8>", "<s:key>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:8>", "b"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "AnnotationIntrospector."}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:5>"}}, 1), new String[][]{{"init", "com.fasterxml.jackson.databind.JavaType", "4"}, {"typeFromId", "java.lang.String", "3"}, {"serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:5>"}}, 2), new String[][]{{"init", "com.fasterxml.jackson.databind.JavaType", "4"}, {"typeFromId", "java.lang.String", "3"}, {"serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:5>"}}, 2), new String[][]{{"typeFromId", "java.lang.String", "4"}, {"isAbstract", "", "3"}, {"narrowKey", "java.lang.Class", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:3>"}}, 3), new String[][]{{"typeFromId", "java.lang.String", "4"}, {"isJavaLangObject", "", "3"}, {"isEnumType", "", "5"}, {"isInterface", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#254#-1924922323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:3>"}}, 3), new String[][]{{"typeFromId", "java.lang.String", "4"}, {"isJavaLangObject", "", "3"}, {"isEnumType", "", "5"}, {"isInterface", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:3>"}}, 3), new String[][]{{"typeFromId", "java.lang.String", "4"}, {"isJavaLangObject", "", "3"}, {"isEnumType", "", "5"}, {"isInterface", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<sample:2>", "<d:1.5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}}, 1), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "5"}, {"isJavaLangObject", "", "3"}, {"useStaticType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<sample:2>", "<d:1.5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:6>"}}, 1), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "5"}, {"isJavaLangObject", "", "3"}, {"toCanonical", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericLeaf<generated.algorithm.SearchInputFactory_scaffolding$GenericSub>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<sample:2>", "<d:1.5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:5>"}}, 1), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "5"}, {"isJavaLangObject", "", "3"}, {"serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:5>"}}, 1), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "5"}, {"isJavaLangObject", "", "3"}, {"useStaticType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:8>"}}, 3), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "5"}, {"isJavaLangObject", "", "4"}, {"useStaticType", "", "5"}, {"withContentTypeHandler", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=[Lgenerated/algorithm/SearchInputFactory_scaffolding$Generic.., get...#619#1263198518", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:8>"}}, 3), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "5"}, {"isJavaLangObject", "", "4"}, {"toCanonical", "", "5"}, {"widenContentsBy", "java.lang.Class", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.String, contains [simple type, class java.util.List]] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String<Ljava/util/List;>;, getTypeName=[c...#524#-1050755005", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:8>"}}, 3), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "5"}, {"isJavaLangObject", "", "4"}, {"toCanonical", "", "5"}, {"widenContentsBy", "java.lang.Class", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.String, contains [simple type, class java.util.List]] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava/lang/String<Ljava/util/List;>;, getTypeName=[c...#524#-1050755005", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection-like type; class java.lang.Integer, contains [simple type, class generated.algorithm.SearchInputFactory_sca...#311#-465951005", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:8>"}}, 3), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "5"}, {"isJavaLangObject", "", "4"}, {"serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:6>"}}, 3), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "5"}, {"isJavaLangObject", "", "4"}, {"useStaticType", "", "5"}, {"withContentTypeHandler", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:6>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:6>"}}, 3), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "5"}, {"getGenericSignature", "java.lang.StringBuilder", "1"}, {"append", "java.lang.String", "5"}, {"append", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.StringBuilder", actual.getClass().getName());
  assertEquals("Ljava/lang/String<Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;Lgenerated/algorithm/SearchInputFactory_scaffolding$GenericSub;>;a3", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[map-like type; class java.lang.Integer, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$Generic...#382#2064309981", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findImplicitParamName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>", "<sample:3>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>", "<sample:4>", "<sample:1>", "<sample:4>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomEnumDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:1>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findImplicitParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:0>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 35, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:3>"}}, 1), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.CollectionType", actual.getClass().getName());
  assertEquals("[collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=Ljava/lang/String;, getGenericSignature=Ljava...#597#-1446704358", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection-like type; class java.util.List, contains [simple type, class generated.algorithm.SearchInputFactory_scaffo...#310#735925094", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 36, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:3>"}}, 1), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.lang.String, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] -> [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericS...#667#-278115368", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.util.List]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPER_...#206#1932028185", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 37, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:2>"}}, 1), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapType", actual.getClass().getName());
  assertEquals("[map type; class java.lang.String, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] -> [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericS...#667#-278115368", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[map-like type; class java.util.List, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBas...#380#-2054712135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 38, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:7>"}}, 1), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.util.List] {getErasedSignature=Ljava/util/List;, getGenericSignature=Ljava/util/List;, getTypeName=[simple type, class java.util.List], hasGenericTypes=false, hasValueHandler=...#425#-781665190", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.util.List]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPPER...#207#-711950063", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseTypeName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:7>", "a,b+sc"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<null>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffoldi...#305#1589346632", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#254#-1924922323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:12>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffoldi...#305#1589346632", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:12>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#254#-1924922323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDefaultImplDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:10>", "<sample:8>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:0>", "<sample:3>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:5>", "<sample:1>", "<sample:0>", "<sample:5>", "<sample:3>", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDefaultImplDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<null>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:0>", "<i:-2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDefaultImplDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:1>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "\u00ea", "<sample:0>", "<sample:3>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentConstructor", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "boolean", "boolean"}, new String[]{"<sample:1>", "<sample:0>", "<sample:7>", "<sample:5>", "<sample:1>", "<sample:5>", "false", "false"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_hasExplicitParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:7>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:3>", "<sample:2>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_findCachedDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:7>", "<sample:8>", "<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "resolveType", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:0>", "<sample:5>", "<sample:2>", "<sample:7>"}}, 3), new String[][]{{"getKnownPropertyNames", "", "6"}, {"getEmptyValue", "", "2"}, {"getValueClass", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<null>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:3>", "<sample:1>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCreatorsFromProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomEnumDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<null>", "<null>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<null>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomEnumDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:7>", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<null>", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomEnumDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<null>", "<sample:2>"}}), new String[][]{{"findBackReference", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyContentTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:2>", "<sample:7>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:3>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<null>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:2>", "<sample:1>", "<d:1.5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<null>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "cachedDeserializersCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findConvertingDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>", "<sample:2>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<null>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findPropertyContentTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:2>", "<sample:3>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withDeserializerModifier", "com.fasterxml.jackson.databind.deser.BeanDeserializerModifier", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:1>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAdditionalDeserializers", new String[]{"com.fasterxml.jackson.databind.deser.Deserializers"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructEnumResolver", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:0>", "<sample:4>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findOptionalStdDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<sample:1>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findImplicitParamName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:0>", "<sample:4>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createCollectionLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<null>", "<sample:2>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>", "<sample:1>", "<sample:2>", "<sample:7>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withValueInstantiators", "com.fasterxml.jackson.databind.deser.ValueInstantiators", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAbstractTypeResolver", "com.fasterxml.jackson.databind.AbstractTypeResolver", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.PropertyName,int,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,java.lang.Object", "<sample:8>", "<sample:4>", "<sample:6>", "2147483647", "<null>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", actual.getClass().getName());
  assertEquals("{hasAbstractTypeResolvers=true, hasDeserializerModifiers=true, hasDeserializers=true, hasKeyDeserializers=true, hasValueInstantiators=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAdditionalDeserializers", new String[]{"com.fasterxml.jackson.databind.deser.Deserializers"}, new String[]{"<sample:6>"}, false), new String[][]{{"withConfig", "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "7"}, {"withValueInstantiators", "com.fasterxml.jackson.databind.deser.ValueInstantiators", "6"}, {"createCollectionLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.BeanDescription", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_mapAbstractCollectionType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:2>", "<sample:2>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCache2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<null>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findConvertingDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JsonDeserializer", "<null>", "<sample:3>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:7>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCacheValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:0>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findConverter", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:5>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCache2", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<null>", "<null>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withConfig", new String[]{"com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", actual.getClass().getName());
  assertEquals("{hasAbstractTypeResolvers=true, hasDeserializerModifiers=true, hasDeserializers=true, hasKeyDeserializers=true, hasValueInstantiators=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBuilderBasedDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:3>", "<sample:4>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withConfig", "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromAny", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<sample:8>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findExplicitParamName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomEnumDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:5>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createCollectionDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:2>", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findJsonValueFor", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "hasValueDeserializerFor", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "hasValueDeserializerFor", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:0>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>", "<sample:5>", "<sample:1>", "<null>", "<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentFactory", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "boolean"}, new String[]{"<sample:1>", "<sample:3>", "<sample:6>", "<sample:5>", "<sample:4>", "<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomTreeNodeDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<empty>", "<sample:0>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_handleUnknownTypeId", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "com.fasterxml.jackson.databind.jsontype.TypeIdResolver", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "1L", "<null>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<sample:1>", "<sample:3>", "<sample:2>", "<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "getFactoryConfig", ""}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:4>", "<sample:4>", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAdditionalKeyDeserializers", new String[]{"com.fasterxml.jackson.databind.deser.KeyDeserializers"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findJsonValueFor", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:3>", "<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionLikeDeserializer", "com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<null>", "<sample:4>", "<sample:2>", "<sample:7>", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_checkImplicitlyNamedConstructors", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.List"}, new String[]{"<sample:2>", "<sample:1>", "<sample:1>", "<sample:4>", "<null>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCreatorsFromProperties", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:8>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findJsonValueFor", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_findCachedDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructCreatorProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.PropertyName", "int", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "java.lang.Object"}, new String[]{"<sample:8>", "<sample:1>", "<sample:7>", "-1", "<sample:1>", "<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "mapAbstractType", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findDeserializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownValueDeserializer", "com.fasterxml.jackson.databind.JavaType", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findDeserializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:7>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<null>", "<sample:3>", "<sample:7>", "<sample:6>", "<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalKeyDeserializers", "com.fasterxml.jackson.databind.deser.KeyDeserializers", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:2>", "<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:2>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDefaultImplDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_hasExplicitParamName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:3>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "writeReplace", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:1>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.DeserializerCache", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentConstructor", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "boolean", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "<sample:2>", "<sample:2>", "<sample:0>", "<sample:6>", "true", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findRemappedType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:2>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withDeserializerModifier", new String[]{"com.fasterxml.jackson.databind.deser.BeanDeserializerModifier"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_constructDefaultValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<sample:4>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_findCachedDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCacheValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:6>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentConstructor", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "boolean", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "<sample:2>", "<sample:0>", "<sample:1>", "<sample:3>", "true", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:6>", "<sample:6>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:1>", "@JsonUnwrapped"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findPropertyTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:3>", "<sample:2>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findPropertyTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:10>", "<sample:2>", "<sample:3>"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:1>", "<sample:3>", "<sample:6>", "<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createBuilderBasedDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,java.lang.Class", "<sample:1>", "<sample:6>", "<null>", "<empty>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withConfig", "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", "<sample:1>"}}), new String[][]{{"findBackReference", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:4>", "<sample:3>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:2>", "<sample:3>", "<d:1.5>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<null>", "<sample:6>", "<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_checkIfCreatorPropertyBased", "com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "<sample:0>", "<sample:0>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<null>", "<sample:6>", "<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_checkIfCreatorPropertyBased", "com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "<sample:0>", "<sample:0>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:6>", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_checkIfCreatorPropertyBased", "com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "<sample:0>", "<sample:0>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<sample:6>", "<sample:7>"}, false, 6, new String[][]{}), new String[][]{{"getValueType", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<sample:6>", "<sample:7>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:7>", "<sample:4>"}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createCollectionLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:1>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:5>", "<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "modifyTypeByAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:7>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:2>", "<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "modifyTypeByAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:7>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StringDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:5>", "<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "modifyTypeByAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:4>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffoldi...#305#1589346632", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffoldi...#306#1549823682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[map type; class java.lang.String, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] -...#375#1763175432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAdditionalKeyDeserializers", new String[]{"com.fasterxml.jackson.databind.deser.KeyDeserializers"}, new String[]{"<sample:6>"}, false), new String[][]{{"createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "modifyTypeByAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:4>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findOptionalStdDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:0>", "<sample:0>", "<sample:6>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_mapAbstractCollectionType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<null>", "<sample:6>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomTreeNodeDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:3>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "modifyTypeByAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:0>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:3>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<sample:6>", "<sample:1>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createTreeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:0>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAbstractTypeResolver", new String[]{"com.fasterxml.jackson.databind.AbstractTypeResolver"}, new String[]{"<sample:1>"}, false), new String[][]{{"findValueInstantiator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAdditionalDeserializers", new String[]{"com.fasterxml.jackson.databind.deser.Deserializers"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:6>", "<sample:8>", "<s:key>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:2>", "a"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:0>", "123456789012345678901234567890"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<sample:6>", "<sample:2>", "<sample:1>", "<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:1>", "<sample:4>", "<sample:3>"}}), new String[][]{{"getObjectIdReader", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<sample:6>", "<sample:2>", "<sample:1>", "<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:1>", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionDeserializer", "com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:5>", "<sample:0>", "<sample:4>", "<sample:2>", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "java."}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffoldi...#305#1589346632", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "java."}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:0>"}}), new String[][]{{"init", "com.fasterxml.jackson.databind.JavaType", "4"}, {"typeFromId", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] -> [simple type, class generated...#761#2136709350", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "java."}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:0>"}}), new String[][]{{"init", "com.fasterxml.jackson.databind.JavaType", "4"}, {"typeFromId", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<[simple type, class generated.algorithm.SearchInputFa...#740#277535774", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#254#-1924922323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "AnnotationIntrospector."}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:0>"}}), new String[][]{{"init", "com.fasterxml.jackson.databind.JavaType", "4"}, {"typeFromId", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ReferenceType", actual.getClass().getName());
  assertEquals("[reference type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub<generated.algorithm.SearchInputFactory_scaffolding$GenericSub<[simple type, class generated.algorithm.SearchInputFa...#740#277535774", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "AnnotationIntrospector."}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:0>"}}), new String[][]{{"init", "com.fasterxml.jackson.databind.JavaType", "4"}, {"typeFromId", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=[Lgenerated/algorithm/SearchInputFactory_scaffolding$Generic.., get...#619#1263198518", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "AnnotationIntrospector."}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:0>"}}), new String[][]{{"init", "com.fasterxml.jackson.databind.JavaType", "4"}, {"typeFromId", "java.lang.String", "3"}, {"widenBy", "java.lang.Class", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=[Lgenerated/algorithm/SearchInputFactory_scaffolding$Generic.., get...#619#1263198518", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "AnnotationIntrospector."}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:0>"}}), new String[][]{{"init", "com.fasterxml.jackson.databind.JavaType", "4"}, {"typeFromId", "java.lang.String", "3"}, {"useStaticType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]; id-resolver: GeneratedTestInputPro...#255#424439370", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "AnnotationIntrospector."}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:0>"}}), new String[][]{{"init", "com.fasterxml.jackson.databind.JavaType", "4"}, {"typeFromId", "java.lang.String", "3"}, {"serialize", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:7>", "AnnotationIntrospector."}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:5>"}}), new String[][]{{"init", "com.fasterxml.jackson.databind.JavaType", "4"}, {"typeFromId", "java.lang.String", "3"}, {"narrowKey", "java.lang.Class", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeInclusion", ""}}), new String[][]{{"typeFromId", "java.lang.String", "4"}, {"isAbstract", "", "3"}, {"isEnumType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection-like type; class java.lang.Integer, contains [simple type, class generated.algorithm.SearchInputFactory_sca...#311#-465951005", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#254#-1924922323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 27, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:3>"}}), new String[][]{{"typeFromId", "java.lang.String", "4"}, {"isAbstract", "", "3"}, {"isEnumType", "", "5"}, {"isInterface", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructEnumResolver", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:0>", "<sample:0>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomTreeNodeDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<null>", "<sample:1>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "mapAbstractType", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:10>", "<sample:7>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:5>"}}), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "5"}, {"isJavaLangObject", "", "3"}, {"serializeWithType", "com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "resolveAbstractType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "findTypeMapping", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:4>"}, {"com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "addMapping", "java.lang.Class,java.lang.Class", "<sample:1>", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAdditionalKeyDeserializers", new String[]{"com.fasterxml.jackson.databind.deser.KeyDeserializers"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:4>", "<sample:2>"}}), new String[][]{{"getFactoryConfig", "", "2"}, {"hasDeserializerModifiers", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createTreeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:0>", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapDeserializer", "com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>", "<sample:3>", "<sample:4>", "<sample:1>", "<sample:4>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findParamName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>", "<sample:6>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffoldi...#305#1589346632", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#254#-1924922323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<sample:4>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "addMapping", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "findTypeMapping", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "addMapping", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "mapAbstractType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomEnumDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<empty>", "<sample:3>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=[Lgenerated/algorithm/SearchInputFactory_scaffolding$Generic.., get...#619#1263198518", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findDeserializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<null>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "flushCachedDeserializers", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "mapAbstractType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:1>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructEnumResolver", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:0>", "<sample:3>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=[Lgenerated/algorithm/SearchInputFactory_scaffolding$Generic.., get...#619#1263198518", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:5>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeIdResolver", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffoldi...#254#649024675", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffoldi...#305#1589346632", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<null>", "<sample:5>", "<sample:7>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_handleSingleArgumentConstructor", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.introspect.AnnotatedConstructor,boolean,boolean", "<sample:7>", "<sample:3>", "<sample:6>", "<sample:2>", "<sample:2>", "<sample:5>", "true", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:1>"}}), new String[][]{{"getTypeInclusion", "", "1"}, {"getTypeInclusion", "", "2"}, {"getTypeIdResolver", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentConstructor", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "boolean", "boolean"}, new String[]{"<sample:4>", "<sample:3>", "<sample:6>", "<sample:1>", "<null>", "<sample:3>", "false", "false"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findJsonValueFor", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.PropertyName,int,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,java.lang.Object", "<sample:1>", "<sample:1>", "<null>", "2147483647", "<sample:4>", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_checkIfCreatorPropertyBased", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition"}, new String[]{"<sample:2>", "<sample:5>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createCollectionLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.BeanDescription", "<sample:8>", "<sample:4>", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructEnumResolver", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:2>", "<sample:2>", "<sample:1>"}}), new String[][]{{"deserializerModifiers", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.ArrayIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createTreeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:0>", "<sample:4>"}, false), new String[][]{{"getObjectIdReader", "", "6"}, {"deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:0>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_valueInstantiatorInstance", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:4>", "<i:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_checkImplicitlyNamedConstructors", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.List"}, new String[]{"<sample:3>", "<sample:1>", "<sample:0>", "<sample:5>", "<sample:3>", "<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAbstractTypeResolver", "com.fasterxml.jackson.databind.AbstractTypeResolver", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "findTypeMapping", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:4>"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "resolveAbstractType", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:5>"}, {"com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "addMapping", "java.lang.Class,java.lang.Class", "<null>", "<empty>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findConverter", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "flushCachedDeserializers", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAdditionalDeserializers", new String[]{"com.fasterxml.jackson.databind.deser.Deserializers"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_checkImplicitlyNamedConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.List", "<sample:7>", "<null>", "<sample:4>", "<sample:3>", "<sample:3>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomTreeNodeDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<null>", "<sample:0>", "<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findExplicitParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:7>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalKeyDeserializers", "com.fasterxml.jackson.databind.deser.KeyDeserializers", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#202#1727789454", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createEnumDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:0>", "<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:10>", "<sample:10>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:5>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createTreeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<null>", "<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:1>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findOptionalStdDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:6>", "<sample:0>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>", "<sample:2>", "<sample:5>", "<sample:4>", "<sample:3>", "<sample:3>"}, false, 0, null, 1), new String[][]{{"getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "6"}, {"findBackReference", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>", "<sample:2>", "<sample:5>", "<sample:4>", "<sample:3>", "<sample:3>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<null>", "+1", "<null>", "<sample:6>"}}), new String[][]{{"forProperty", "com.fasterxml.jackson.databind.BeanProperty", "3"}, {"deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "resolveAbstractType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:7>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_constructDefaultValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_constructDefaultValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_valueInstantiatorInstance", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:7>", "<sample:4>", "<s:kkey>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_findCachedDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, false, 8, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAdditionalKeyDeserializers", new String[]{"com.fasterxml.jackson.databind.deser.KeyDeserializers"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_checkImplicitlyNamedConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.List", "<sample:8>", "<sample:5>", "<sample:7>", "<sample:6>", "<sample:4>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createBuilderBasedDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,java.lang.Class", "<sample:7>", "<sample:1>", "<sample:8>", "<empty>"}}), new String[][]{{"findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAdditionalKeyDeserializers", new String[]{"com.fasterxml.jackson.databind.deser.KeyDeserializers"}, new String[]{"<sample:4>"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createBuilderBasedDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,java.lang.Class", "<sample:7>", "<sample:1>", "<sample:8>", "<empty>"}}, 2), new String[][]{{"findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAdditionalKeyDeserializers", new String[]{"com.fasterxml.jackson.databind.deser.KeyDeserializers"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomBeanDeserializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:7>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAdditionalKeyDeserializers", new String[]{"com.fasterxml.jackson.databind.deser.KeyDeserializers"}, new String[]{"<sample:3>"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:6>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomBeanDeserializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:4>", "<sample:3>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createBuilderBasedDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,java.lang.Class", "<sample:7>", "<sample:1>", "<sample:5>", "<sample:2>"}}, 2), new String[][]{{"findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "4"}, {"buildThrowableDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
