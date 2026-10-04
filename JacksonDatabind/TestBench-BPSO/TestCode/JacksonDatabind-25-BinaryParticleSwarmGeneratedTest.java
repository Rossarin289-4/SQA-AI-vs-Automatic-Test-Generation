package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentConstructor", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "boolean", "boolean"}, new String[]{"<sample:1>", "<sample:6>", "<sample:6>", "<sample:10>", "<sample:7>", "<sample:3>", "true", "false"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findValueInstantiator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:7>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerConstructors", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:3>", "<sample:5>", "<sample:2>", "<sample:2>", "<sample:8>", "<empty>"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_valueInstantiatorInstance", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<null>", "<sample:5>", "<i:-2147483648>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapLikeDeserializer", "com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:5>", "<sample:0>", "<sample:9>", "<sample:2>", "<null>", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerFactoryMethods", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:8>", "<sample:0>", "<sample:3>", "<sample:4>", "<sample:1>", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findValueInstantiator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:4>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:3>", "<sample:3>", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_hasExplicitParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:7>", "<sample:7>"}}), new String[][]{{"deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_constructDefaultValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:3>", "<sample:3>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>", "<sample:11>", "<sample:6>", "<null>", "<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>", "<sample:2>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAbstractTypeResolver", "com.fasterxml.jackson.databind.AbstractTypeResolver", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentFactory", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "boolean"}, new String[]{"<sample:7>", "<sample:3>", "<sample:0>", "<sample:3>", "<sample:8>", "<sample:1>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionLikeDeserializer", "com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>", "<sample:14>", "<sample:7>", "<sample:8>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createBuilderBasedDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,java.lang.Class", "<sample:11>", "<sample:7>", "<sample:7>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:8>", "<sample:0>", "<sample:8>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:7>", "<sample:9>", "<sample:5>", "<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findJsonValueFor", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:9>"}}), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerConstructors", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:0>", "<sample:4>", "<sample:6>", "<sample:11>", "<sample:5>", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:6>", "<sample:0>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:8>", "<sample:10>", "<i:-2147483648>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>"}}), new String[][]{{"init", "com.fasterxml.jackson.databind.JavaType", "0"}, {"idFromValue", "java.lang.Object", "1"}, {"idFromBaseType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomArrayDeserializer", "com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<null>", "<sample:4>", "<sample:6>", "<sample:6>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapDeserializer", "com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>", "<sample:5>", "<sample:3>", "<sample:3>", "<sample:9>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "addMapping", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "resolveAbstractType", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:13>", "<sample:5>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerFactoryMethods", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:8>", "<sample:8>", "<sample:5>", "<sample:3>", "<sample:5>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "hasValueDeserializerFor", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:16>", "<sample:9>", "<sample:6>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_constructDefaultValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:8>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "resolveType", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:10>", "<sample:6>", "<sample:7>", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "addMapping", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:1>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "findTypeMapping", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:14>", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCreatorsFromProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:8>", "<sample:8>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withDeserializerModifier", "com.fasterxml.jackson.databind.deser.BeanDeserializerModifier", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentFactory", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "boolean"}, new String[]{"<sample:7>", "<sample:0>", "<sample:3>", "<sample:1>", "<null>", "<sample:7>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findOptionalStdDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<null>", "<sample:8>", "<sample:12>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:1>", "<sample:2>", "<sample:5>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBuilderBasedDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "java.lang.Class"}, new String[]{"<sample:13>", "<sample:0>", "<null>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:9>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "resolveType", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:6>", "<sample:1>", "<sample:12>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>", "<sample:5>", "<sample:9>", "<sample:0>", "<sample:7>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:1>", "<sample:0>", "<sample:1>"}}), new String[][]{{"getDelegatee", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerConstructors", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:1>", "<sample:8>", "<sample:6>", "<sample:1>", "<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findImplicitParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>", "<sample:9>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCreatorsFromProperties", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_checkIfCreatorPropertyBased", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition"}, new String[]{"<sample:2>", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionDeserializer", "com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<null>", "<sample:4>", "<sample:13>", "<sample:3>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findJsonValueFor", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_constructDefaultValueInstantiator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<sample:19>", "1c5", "<sample:4>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#254#-1924922323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createCollectionLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:16>", "<sample:8>", "<sample:16>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:16>", "<sample:13>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_mapAbstractCollectionType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.DeserializationConfig", "<sample:14>", "<sample:10>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:2>", "<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_hasExplicitParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<null>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:1>", "<sample:8>", "<sample:13>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:3>", "<sample:10>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomArrayDeserializer", "com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:2>", "<sample:11>", "<sample:11>", "<sample:5>", "<sample:10>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_constructDefaultValueInstantiator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<null>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:20>", "<sample:5>", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withConfig", new String[]{"com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapDeserializer", "com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>", "<sample:5>", "<sample:9>", "<sample:9>", "<sample:2>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:9>", "<sample:12>", "<sample:3>", "<sample:0>", "<sample:2>", "<sample:0>"}}), new String[][]{{"findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_mapAbstractCollectionType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAbstractTypeResolver", "com.fasterxml.jackson.databind.AbstractTypeResolver", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findExplicitParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:4>", "<null>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withConfig", new String[]{"com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:4>", "<sample:4>"}}), new String[][]{{"createMapDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_checkIfCreatorPropertyBased", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition"}, new String[]{"<sample:2>", "<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findValueInstantiator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:6>", "<sample:9>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.PropertyName,int,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,java.lang.Object", "<sample:10>", "<sample:12>", "<sample:7>", "2147418112", "<sample:6>", "<s:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomTreeNodeDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:9>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:1>", "<empty>"}}), new String[][]{{"createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "writeReplace", ""}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "findConvertingDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>", "<sample:5>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:10>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<sample:2>", "<sample:10>", "<sample:13>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownKeyDeserializer", "com.fasterxml.jackson.databind.JavaType", "<sample:10>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findParamName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<null>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:18>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentFactory", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "boolean"}, new String[]{"<sample:10>", "<sample:10>", "<sample:4>", "<sample:0>", "<sample:10>", "<sample:5>", "true"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "resolveType", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:7>", "<sample:8>", "<sample:10>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCacheValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:13>", "<sample:4>", "<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:13>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "findKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:16>", "<sample:6>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentConstructor", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "boolean", "boolean"}, new String[]{"<sample:9>", "<sample:0>", "<sample:4>", "<sample:4>", "<sample:1>", "<sample:3>", "false", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_handleSingleArgumentFactory", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,boolean", "<sample:10>", "<sample:6>", "<sample:7>", "<sample:6>", "<sample:10>", "<sample:3>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:0>", "<sample:8>", "<sample:9>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:10>", "<sample:5>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findExplicitParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:2>", "<sample:1>"}}, 1), new String[][]{{"isCachable", "", "1"}, {"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "addMapping", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "addMapping", "java.lang.Class,java.lang.Class", "<sample:0>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:4>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findExplicitParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<null>", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:4>", "<s:>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "writeReplace", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findConvertingDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:10>", "<sample:8>", "<null>"}}), new String[][]{{"flushCachedDeserializers", "", "7"}, {"cachedDeserializersCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createEnumDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyContentTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>", "<sample:11>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAdditionalDeserializers", new String[]{"com.fasterxml.jackson.databind.deser.Deserializers"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_hasExplicitParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:9>", "<null>"}}), new String[][]{{"createTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:8>", "<sample:7>", "<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructEnumResolver", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:3>", "<sample:14>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findJsonValueFor", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:9>"}}), new String[][]{{"getDelegatee", "", "5"}, {"unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withConfig", new String[]{"com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_hasExplicitParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>", "<sample:7>"}}, 1), new String[][]{{"createCollectionDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.BeanDescription", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:8>", "<sample:9>", "<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_handleSingleArgumentConstructor", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.introspect.AnnotatedConstructor,boolean,boolean", "<sample:8>", "<sample:7>", "<sample:4>", "<sample:10>", "<sample:0>", "<sample:8>", "true", "true"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_checkImplicitlyNamedConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.List", "<sample:12>", "<sample:1>", "<sample:0>", "<sample:11>", "<sample:2>", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StringDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:15>", "<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:5>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_valueInstantiatorInstance", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:12>", "<sample:5>", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAdditionalDeserializers", new String[]{"com.fasterxml.jackson.databind.deser.Deserializers"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionLikeDeserializer", "com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>", "<sample:1>", "<sample:6>", "<sample:0>", "<sample:5>"}}, 1), new String[][]{{"createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "1"}, {"isCachable", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomEnumDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<null>", "<sample:9>", "<sample:18>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionLikeDeserializer", "com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:3>", "<sample:13>", "<sample:12>", "<sample:8>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createArrayDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription", "<sample:14>", "<sample:11>", "<sample:16>"}}), new String[][]{{"getValueClass", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.util.concurrent.atomic.AtomicBoolean {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.concurrent.atomic.AtomicBoolean, getClasses=[], getConstructors=[public java.ut...#782#-1311598367", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:14>", "<sample:8>", "<sample:18>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownKeyDeserializer", "com.fasterxml.jackson.databind.JavaType", "<sample:11>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:11>", "<sample:10>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentFactory", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "<sample:4>", "<sample:2>", "<sample:8>", "<sample:1>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_handleSingleArgumentFactory", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,boolean", "<sample:11>", "<sample:0>", "<null>", "<sample:7>", "<sample:6>", "<sample:5>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<sample:10>", "<sample:4>", "<sample:9>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalKeyDeserializers", "com.fasterxml.jackson.databind.deser.KeyDeserializers", "<sample:7>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_handleSingleArgumentFactory", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.introspect.AnnotatedMethod,boolean", "<sample:2>", "<sample:1>", "<sample:2>", "<sample:7>", "<sample:1>", "<sample:3>", "true"}}, 2), new String[][]{{"getDelegatee", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createTreeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionDeserializer", "com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:7>", "<sample:3>", "<sample:5>", "<sample:8>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:4>", "<sample:8>", "<sample:15>"}}, 1), new String[][]{{"findBackReference", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructEnumResolver", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<null>", "<sample:6>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findImplicitParamName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>", "<sample:9>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createCollectionLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:4>", "<sample:0>"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeInclusion", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>", "<sample:9>", "<sample:4>", "<sample:1>", "<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_hasExplicitParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:0>", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAdditionalDeserializers", new String[]{"com.fasterxml.jackson.databind.deser.Deserializers"}, new String[]{"<sample:6>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCacheValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:6>", "<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCache2", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:3>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:0>", "<sample:1>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:4>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:3>", "<sample:2>", "<i:-55>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "", "<sample:1>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_checkIfCreatorPropertyBased", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition"}, new String[]{"<sample:7>", "<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalDeserializers", "com.fasterxml.jackson.databind.deser.Deserializers", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_mapAbstractCollectionType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.DeserializationConfig", "<sample:5>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findRemappedType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "java.lang.Class"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findParamName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:3>", "<sample:3>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_constructDefaultValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:0>", "<sample:9>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_constructDefaultValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<sample:11>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCreatorsFromProperties", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:8>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomTreeNodeDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<null>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:8>", "<sample:0>", "<sample:7>", "<sample:3>", "<sample:8>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomArrayDeserializer", "com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<null>", "<sample:9>", "<sample:5>", "<sample:12>", "<sample:11>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>", "<sample:1>", "<sample:9>", "<sample:1>", "<sample:10>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_valueInstantiatorInstance", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<sample:9>", "<sample:2>", "<s:a>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.PropertyName,int,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,java.lang.Object", "<null>", "<sample:13>", "<sample:5>", "4", "<sample:10>", "<s:b>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:11>", "<sample:5>", "<sample:8>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findConverter", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:7>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentFactory", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "boolean"}, new String[]{"<sample:2>", "<sample:6>", "<sample:0>", "<sample:10>", "<sample:6>", "<null>", "false"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerConstructors", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:2>", "<sample:3>", "<sample:4>", "<sample:1>", "<sample:5>", "<sample:2>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:8>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:11>", "<sample:0>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:7>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerFactoryMethods", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:11>", "<sample:11>", "<sample:3>", "<sample:11>", "<sample:1>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<sample:6>", "<sample:5>", "<sample:3>", "<sample:0>", "<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:2>", "<null>"}}, 1), new String[][]{{"findBackReference", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>", "<sample:1>", "<sample:11>", "<sample:7>", "<sample:5>", "<sample:8>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:14>", "<sample:6>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withDeserializerModifier", "com.fasterxml.jackson.databind.deser.BeanDeserializerModifier", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffoldi...#305#1589346632", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getTypeInclusion", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.String", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffoldi...#305#1589346632", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:0>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "-1.5i1.5d", "<sample:7>", "<sample:5>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_checkIfCreatorPropertyBased", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition"}, new String[]{"<sample:3>", "<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_handleSingleArgumentConstructor", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,com.fasterxml.jackson.databind.introspect.AnnotatedConstructor,boolean,boolean", "<sample:5>", "<sample:11>", "<sample:5>", "<sample:11>", "<sample:3>", "<sample:3>", "false", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.reflect.GenericSignatureFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerConstructors", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<null>", "<sample:4>", "<sample:1>", "<sample:6>", "<sample:3>", "<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createCollectionDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.BeanDescription", "<sample:13>", "<sample:6>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createCollectionLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findImplicitParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:2>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "findTypeMapping", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:5>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<null>", "http://example.com/a?b=c"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>", "<sample:3>"}}, 1), new String[][]{{"idFromValue", "java.lang.Object", "0"}, {"getMechanism", "", "3"}, {"idFromBaseType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerConstructors", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:3>", "<sample:10>", "<sample:6>", "<sample:0>", "<sample:5>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.PropertyName,int,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,java.lang.Object", "<sample:11>", "<sample:2>", "<sample:6>", "2147483647", "<null>", "<i:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:0>", "<sample:9>", "<sample:11>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructCreatorProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.PropertyName", "int", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "java.lang.Object"}, new String[]{"<sample:12>", "<sample:4>", "<sample:1>", "-2147418112", "<sample:2>", "<d:57.5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_findCachedDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<sample:3>", "<sample:9>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomEnumDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:0>", "<sample:8>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomTreeNodeDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<null>", "<sample:6>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:0>", "<sample:2>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_checkImplicitlyNamedConstructors", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.List"}, new String[]{"<sample:4>", "<sample:13>", "<sample:2>", "<sample:11>", "<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createBuilderBasedDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription,java.lang.Class", "<sample:12>", "<sample:6>", "<sample:13>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "resolveType", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:2>", "<sample:13>", "<sample:8>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "getFactoryConfig", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findJsonValueFor", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerFactoryMethods", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:12>", "<sample:0>", "<sample:6>", "<sample:9>", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAbstractTypeResolver", "com.fasterxml.jackson.databind.AbstractTypeResolver", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:8>", "<sample:1>", "<sample:1>", "<sample:6>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:8>", "<sample:9>", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findParamName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalKeyDeserializers", "com.fasterxml.jackson.databind.deser.KeyDeserializers", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "resolveAbstractType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "resolveAbstractType", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:14>", "<sample:5>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:3>", "<sample:15>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_checkImplicitlyNamedConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.List", "<sample:11>", "<sample:12>", "<sample:7>", "<sample:11>", "<sample:4>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#254#-1924922323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "addMapping", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:0>", "<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "findTypeMapping", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:10>", "<sample:6>"}, {"com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "addMapping", "java.lang.Class,java.lang.Class", "<sample:3>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:5>", "<sample:4>", "<s:'b>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]; id-resolver: GeneratedTestInputPro...#203#697337899", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]; id-resolver: GeneratedTestInputPro...#255#424439370", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_mapAbstractCollectionType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:6>", "<sample:13>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerFactoryMethods", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:8>", "<sample:11>", "<sample:6>", "<sample:2>", "<sample:2>", "<sample:8>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findExplicitParamName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>", "<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_valueInstantiatorInstance", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.Annotated,java.lang.Object", "<sample:7>", "<sample:1>", "<i:0>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:15>", "<sample:3>", "<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:8>", "<sample:5>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:10>", "<null>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownValueDeserializer", "com.fasterxml.jackson.databind.JavaType", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>", "<sample:10>", "<sample:3>", "<null>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findJsonValueFor", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:16>", "<sample:11>", "<sample:10>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerFactoryMethods", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:8>", "<sample:11>", "<sample:7>", "<sample:5>", "<sample:7>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StringDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCreatorsFromProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:12>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "getFactoryConfig", ""}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.PropertyName,int,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,java.lang.Object", "<sample:15>", "<sample:4>", "<sample:8>", "2147483640", "<sample:7>", "<i:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCreatorsFromProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:11>", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_constructDefaultValueInstantiator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:8>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerFactoryMethods", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:1>", "<sample:10>", "<sample:0>", "<sample:8>", "<sample:9>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.PropertyName,int,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,java.lang.Object", "<sample:3>", "<sample:6>", "<sample:2>", "13", "<sample:11>", "<s:?>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "baseTypeName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:4>", "<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:8>", "<sample:17>", "<sample:3>", "<sample:0>", "<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomEnumDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:11>", "<sample:8>"}}, 1), new String[][]{{"unwrappingDeserializer", "com.fasterxml.jackson.databind.util.NameTransformer", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:14>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "flushCachedDeserializers", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:0>", "<sample:11>"}, false, 0, null, 2), new String[][]{{"getEmptyValue", "com.fasterxml.jackson.databind.DeserializationContext", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:8>", "<s:kEUy>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructEnumResolver", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:3>", "<sample:0>", "<sample:8>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructCreatorProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.PropertyName", "int", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "java.lang.Object"}, new String[]{"<sample:8>", "<sample:4>", "<sample:5>", "3", "<sample:4>", "<i:-65519>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomTreeNodeDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:0>", "<sample:2>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:9>", "<sample:2>", "<sample:2>", "<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalKeyDeserializers", "com.fasterxml.jackson.databind.deser.KeyDeserializers", "<sample:11>"}}, 2), new String[][]{{"getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object", "<sample:4>", "<sample:3>", "<s:af>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findExplicitParamName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:5>", "<sample:9>"}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeInclusion", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromScalar", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>", "<sample:2>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.annotation.JsonTypeInfo$As", actual.getClass().getName());
  assertEquals("WRAPPER_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findExplicitParamName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findDeserializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>", "<sample:8>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findJsonValueFor", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:1>", "<sample:4>", "<sample:7>", "<sample:8>", "<sample:4>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Class"}, new String[]{"<sample:7>", "<sample:2>", "<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:5>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:5>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentFactory", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "boolean"}, new String[]{"<sample:10>", "<sample:6>", "<null>", "<sample:6>", "<sample:4>", "<sample:3>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:9>", "<sample:3>", "<sample:6>", "<sample:2>", "<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalDeserializers", "com.fasterxml.jackson.databind.deser.Deserializers", "<sample:8>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:9>", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_handleUnknownTypeId", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "com.fasterxml.jackson.databind.jsontype.TypeIdResolver", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "AnnotionIntrospector.", "<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createCollectionLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:5>", "<sample:2>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:3>", "<sample:2>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAbstractTypeResolver", new String[]{"com.fasterxml.jackson.databind.AbstractTypeResolver"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<null>", "<sample:0>", "<i:-131039>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:8>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription", "<sample:6>", "<sample:6>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_valueInstantiatorInstance", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.introspect.Annotated", "java.lang.Object"}, new String[]{"<null>", "<sample:7>", "<i:-1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:11>", "<sample:3>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findImplicitParamName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:4>", "<sample:8>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findParamName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:7>", "<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCreatorsFromProperties", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:3>", "<sample:5>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "hasValueDeserializerFor", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>", "<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "flushCachedDeserializers", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createTreeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "modifyTypeByAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:7>", "<sample:5>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findExplicitParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:1>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCacheValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:9>", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "findConverter", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:2>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCreatorsFromProperties", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withValueInstantiators", "com.fasterxml.jackson.databind.deser.ValueInstantiators", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDefaultImplDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findJsonValueFor", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:12>", "<sample:3>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructCreatorProperty", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.PropertyName", "int", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:11>", "<sample:4>", "-2147418112", "<sample:4>", "<s:uq>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_mapAbstractCollectionType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<sample:4>", "<sample:8>"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:0>", "<sample:2>", "<sample:0>", "<sample:7>", "<sample:9>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:3>", "<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_hasExplicitParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:6>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerConstructors", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:7>", "<null>", "<sample:7>", "<sample:7>", "<sample:6>", "<sample:4>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:12>", "<sample:8>", "<sample:6>", "<sample:7>", "<sample:4>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findPropertyTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:11>", "<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withAdditionalKeyDeserializers", "com.fasterxml.jackson.databind.deser.KeyDeserializers", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_checkIfCreatorPropertyBased", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition"}, new String[]{"<sample:6>", "<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyContentTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:6>", "<sample:5>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findValueDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:4>", "<sample:3>", "<sample:3>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomTreeNodeDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:0>", "<sample:12>", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromScalar", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:10>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:0>", "<sample:5>", "<sample:7>", "<sample:7>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_handleUnknownTypeId", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String", "com.fasterxml.jackson.databind.jsontype.TypeIdResolver", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>", "1/xFFFFFFFF", "<sample:6>", "<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_findDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "java.lang.String"}, new String[]{"<sample:4>", "Conflict: parameter #true"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<sample:10>", "<sample:1>", "<sample:2>", "<sample:7>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "findTypeMapping", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:4>"}, false, 2, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findRemappedType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "java.lang.Class"}, new String[]{"<sample:0>", "<empty>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_constructDefaultValueInstantiator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:11>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:0>", "<sample:1>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:4>", "<sample:7>", "<sample:2>", "<sample:9>", "<sample:2>"}, false), new String[][]{{"getObjectIdReader", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findOptionalStdDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:9>", "<sample:3>", "<sample:13>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:7>", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerFactoryMethods", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:7>", "<sample:5>", "<sample:0>", "<sample:10>", "<sample:7>", "<sample:5>"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<null>", "<sample:9>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:6>", "<sample:11>"}, false), new String[][]{{"getEmptyValue", "", "4"}, {"getEmptyValue", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:7>", "<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerFactoryMethods", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:1>", "<sample:10>", "<sample:4>", "<sample:11>", "<sample:3>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findKeyDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:5>", "<sample:3>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentFactory", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "boolean"}, new String[]{"<sample:4>", "<sample:9>", "<sample:0>", "<sample:4>", "<sample:8>", "<sample:1>", "true"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_hasExplicitParamName", new String[]{"com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "com.fasterxml.jackson.databind.AnnotationIntrospector"}, new String[]{"<sample:2>", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomTreeNodeDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:1>", "<sample:4>", "<sample:13>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withConfig", new String[]{"com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:5>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_checkImplicitlyNamedConstructors", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.List"}, new String[]{"<sample:11>", "<sample:3>", "<sample:2>", "<sample:7>", "<sample:4>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>", "<sample:1>", "<sample:10>", "<sample:3>", "<sample:1>", "<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findImplicitParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:3>", "<sample:3>"}}), new String[][]{{"deserializeWithType", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:0>", "<sample:6>", "<sample:8>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>", "<sample:10>", "<sample:2>", "<sample:6>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_checkIfCreatorPropertyBased", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition"}, new String[]{"<sample:10>", "<sample:1>", "<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:5>", "<sample:5>", "<sample:4>", "<sample:5>", "<sample:3>", "<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_mapAbstractCollectionType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.DeserializationConfig", "<null>", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAdditionalDeserializers", new String[]{"com.fasterxml.jackson.databind.deser.Deserializers"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_mapAbstractCollectionType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.DeserializationConfig", "<sample:2>", "<sample:8>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:6>"}}), new String[][]{{"mapAbstractType", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.SimpleType", actual.getClass().getName());
  assertEquals("[simple type, class java.lang.Object] {getErasedSignature=Ljava/lang/Object;, getGenericSignature=Ljava/lang/Object;, getTypeName=[simple type, class java.lang.Object], hasGenericTypes=false, hasValue...#434#-668094697", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "flushCachedDeserializers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findConverter", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:8>", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<null>", "<sample:14>", "<sample:6>", "<sample:9>", "<sample:9>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAbstractTypeResolver", new String[]{"com.fasterxml.jackson.databind.AbstractTypeResolver"}, new String[]{"<sample:6>"}, false), new String[][]{{"buildThrowableDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCache2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:6>", "<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findConvertingDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:1>", "<null>", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomEnumDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:3>", "<sample:10>", "<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createMapDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.BeanDescription", "<sample:11>", "<sample:7>", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "writeReplace", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownKeyDeserializer", "com.fasterxml.jackson.databind.JavaType", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.DeserializerCache", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructEnumResolver", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<null>", "<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createTreeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:11>", "<sample:3>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:0>", "<null>"}}), new String[][]{{"deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:5>", "<sample:4>", "<sample:4>"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromObject", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:4>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findPropertyContentTypeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:6>", "<null>", "<sample:8>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "findTypeMapping", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:10>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "addMapping", "java.lang.Class,java.lang.Class", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "findTypeMapping", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "getFactoryConfig", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", actual.getClass().getName());
  assertEquals("{hasAbstractTypeResolvers=true, hasDeserializerModifiers=true, hasDeserializers=true, hasKeyDeserializers=true, hasValueInstantiators=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("generated.algorithm.SearchInputFactory_scaffolding$GenericSub", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<null>", "<sample:2>", "<sample:5>", "<sample:1>", "<sample:8>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerFactoryMethods", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:2>", "<sample:1>", "<sample:4>", "<sample:8>", "<sample:7>", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.KeyDeserializer", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>", "<sample:5>", "<sample:4>", "<sample:3>", "<sample:1>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyContentTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:0>", "<sample:0>", "<sample:9>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:9>", "<sample:0>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:6>", "<sample:8>", "<null>", "<sample:6>", "<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findOptionalStdDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:2>", "<sample:2>", "<sample:6>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:17>", "<sample:8>"}}), new String[][]{{"deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=, getTypeInclusion=WRAPPE...#208#-641838908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_checkIfCreatorPropertyBased", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition"}, new String[]{"<null>", "<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "resolveType", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:4>", "<sample:1>", "<sample:4>", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:13>", "<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructEnumResolver", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:0>", "<sample:9>", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withValueInstantiators", new String[]{"com.fasterxml.jackson.databind.deser.ValueInstantiators"}, new String[]{"<sample:6>"}, false, 6, new String[][]{}), new String[][]{{"createArrayDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createTreeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:15>", "<sample:7>", "<sample:9>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerFactoryMethods", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:3>", "<sample:11>", "<sample:0>", "<sample:9>", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "addMapping", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:5>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findJsonValueFor", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:7>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:13>", "<sample:4>", "<sample:10>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#202#1727789454", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromObject", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:8>"}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffoldi...#254#649024675", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffoldi...#305#1589346632", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withConfig", new String[]{"com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_checkIfCreatorPropertyBased", "com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.introspect.AnnotatedWithParams,com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition", "<sample:9>", "<sample:5>", "<sample:0>"}}), new String[][]{{"createCollectionLikeDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.CollectionLikeType,com.fasterxml.jackson.databind.BeanDescription", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomTreeNodeDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:0>", "<sample:6>", "<sample:5>"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:1>", "<sample:16>", "<sample:5>", "<null>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyContentTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:14>", "<sample:10>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.PropertyName,int,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,java.lang.Object", "<null>", "<sample:1>", "<sample:0>", "0", "<sample:4>", "<s:q>"}}), new String[][]{{"getNullValue", "com.fasterxml.jackson.databind.DeserializationContext", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomEnumDeserializer", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:3>", "<sample:10>", "<sample:10>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findConvertingDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:8>", "<sample:0>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "forProperty", "com.fasterxml.jackson.databind.BeanProperty", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.List {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.List, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDeclared...#548#-367284043", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffoldi...#305#1589346632", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:9>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:1>", "<sample:6>"}}), new String[][]{{"getTypeIdResolver", "", "5"}, {"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "3"}, {"containedTypeCount", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffoldi...#305#1589346632", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "writeReplace", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "findValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:11>", "<sample:7>", "<sample:8>"}}), new String[][]{{"hasValueDeserializerFor", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:1>", "<sample:6>", "<sample:11>", "<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "withDeserializerModifier", "com.fasterxml.jackson.databind.deser.BeanDeserializerModifier", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:3>", "<sample:2>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructCreatorProperty", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.PropertyName,int,com.fasterxml.jackson.databind.introspect.AnnotatedParameter,java.lang.Object", "<sample:10>", "<sample:13>", "<sample:1>", "-2147418111", "<sample:6>", "<s:8>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.StringDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "addMapping", new String[]{"java.lang.Class", "java.lang.Class"}, new String[]{"<sample:0>", "<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBuilderBasedDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:10>", "<sample:0>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomCollectionDeserializer", "com.fasterxml.jackson.databind.type.CollectionType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>", "<sample:3>", "<sample:1>", "<sample:8>", "<sample:2>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:9>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "findDeserializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:4>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCache2", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<null>", "<sample:2>", "<null>"}, {"com.fasterxml.jackson.databind.deser.DeserializerCache", "_createAndCacheValueDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.deser.DeserializerFactory,com.fasterxml.jackson.databind.JavaType", "<sample:5>", "<sample:1>", "<sample:12>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createCollectionLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.CollectionLikeType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<null>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "modifyTypeByAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:6>", "<sample:2>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeIfNatural", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:2>", "<sample:5>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromArray", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:6>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "constructEnumResolver", new String[]{"java.lang.Class", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.introspect.AnnotatedMethod"}, new String[]{"<sample:0>", "<sample:8>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapDeserializer", "com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:6>", "<sample:8>", "<sample:13>", "<sample:0>", "<sample:5>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromAny", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String", "<sample:8>", "1.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "baseTypeName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializeWithNativeTypeId", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("java.lang.Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.MapType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:12>", "<null>", "<sample:8>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_constructDefaultValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<null>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createEnumDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:0>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "resolveAbstractType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:13>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "resolveAbstractType", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "<sample:2>", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "resolveAbstractType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "addMapping", "java.lang.Class,java.lang.Class", "<sample:0>", "<empty>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "forProperty", new String[]{"com.fasterxml.jackson.databind.BeanProperty"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}), new String[][]{{"getTypeIdResolver", "", "1"}, {"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.MapLikeType", actual.getClass().getName());
  assertEquals("[map-like type; class generated.algorithm.SearchInputFactory_scaffolding$GenericSub, [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub] -> [simple type, class generated...#761#2136709350", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[collection type; class java.lang.String, contains [simple type, class generated.algorithm.SearchInputFactory_scaffoldi...#305#1589346632", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:9>", "<sample:0>", "<sample:13>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class [Ljava.lang.String; {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.String[], getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[], getDe...#561#1252099664", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "_deserializeWithNativeTypeId", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext", "java.lang.Object"}, new String[]{"<sample:7>", "<sample:14>", "<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "resolveType", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.introspect.AnnotatedMember"}, new String[]{"<sample:15>", "<sample:4>", "<sample:2>", "<sample:8>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:13>", "<sample:0>", "<sample:13>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_checkImplicitlyNamedConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.List", "<sample:11>", "<sample:5>", "<sample:1>", "<sample:6>", "<sample:0>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_findDefaultImplDeserializer", "com.fasterxml.jackson.databind.DeserializationContext", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_mapAbstractCollectionType", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig"}, new String[]{"<null>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapDeserializer", "com.fasterxml.jackson.databind.type.MapType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<sample:0>", "<sample:7>", "<null>", "<sample:2>", "<sample:1>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerConstructors", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:9>", "<sample:6>", "<sample:3>", "<sample:2>", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:16>", "<sample:12>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomCollectionDeserializer", new String[]{"com.fasterxml.jackson.databind.type.CollectionType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:7>", "<sample:5>", "<sample:6>", "<sample:2>", "<sample:9>"}, false), new String[][]{{"getValueClass", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class java.lang.Object {getAnnotatedInterfaces=[], getAnnotations=[], getCanonicalName=java.lang.Object, getClasses=[], getConstructors=[public java.lang.Object()], getDeclaredAnnotations=[], getDecla...#543#-946457427", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<sample:1>", "<sample:13>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createKeyDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType", "<sample:3>", "<sample:8>"}}), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_checkIfCreatorPropertyBased", new String[]{"com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition"}, new String[]{"<sample:5>", "<sample:2>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.reflect.GenericSignatureFormatError", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:2>", "<sample:4>", "<sample:8>", "<sample:10>", "<sample:5>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.databind.JsonMappingException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "toString", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_handleUnknownTypeId", "com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType", "<sample:0>", "2020-01-1", "<sample:3>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:9>", "<sample:15>", "<sample:11>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyContentTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:10>", "<sample:8>", "<sample:7>"}}), new String[][]{{"getObjectIdReader", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "withAdditionalDeserializers", new String[]{"com.fasterxml.jackson.databind.deser.Deserializers"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomMapLikeDeserializer", "com.fasterxml.jackson.databind.type.MapLikeType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.KeyDeserializer,com.fasterxml.jackson.databind.jsontype.TypeDeserializer,com.fasterxml.jackson.databind.JsonDeserializer", "<null>", "<sample:2>", "<sample:11>", "<sample:4>", "<sample:1>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_addDeserializerFactoryMethods", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.Map", "<sample:8>", "<sample:4>", "<sample:9>", "<sample:2>", "<sample:3>", "<sample:3>"}}), new String[][]{{"findTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_createDeserializer2", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.deser.DeserializerFactory", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:11>", "<sample:10>", "<sample:3>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createEnumDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:7>", "<sample:7>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomTreeNodeDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:4>", "<sample:7>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_mapAbstractCollectionType", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.DeserializationConfig", "<sample:1>", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findRemappedType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "java.lang.Class"}, new String[]{"<sample:13>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDefaultDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:8>", "<sample:8>", "<sample:8>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "modifyTypeByAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:6>", "<sample:8>", "<sample:11>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findOptionalStdDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:12>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_handleSingleArgumentConstructor", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor", "boolean", "boolean"}, new String[]{"<sample:3>", "<sample:12>", "<sample:0>", "<sample:9>", "<sample:2>", "<sample:6>", "true", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findValueInstantiator", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription", "<sample:8>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_checkImplicitlyNamedConstructors", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.List"}, new String[]{"<sample:0>", "<sample:5>", "<sample:6>", "<sample:0>", "<sample:6>", "<empty>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:1>", "<sample:7>", "<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomTreeNodeDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomEnumDeserializer", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:3>", "<sample:5>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomBeanDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:2>", "<sample:6>", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "constructEnumResolver", "java.lang.Class,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "<sample:5>", "<sample:7>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer", actual.getClass().getName());
  assertEquals("{isCachable=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromAny", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:3>", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.Collection {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.Collection, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[],...#556#1623681001", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericBase]; id-resolver: GeneratedTestInputPro...#255#424439370", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findCustomArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.jsontype.TypeDeserializer", "com.fasterxml.jackson.databind.JsonDeserializer"}, new String[]{"<sample:3>", "<sample:7>", "<sample:15>", "<sample:5>", "<sample:3>"}, false), new String[][]{{"replaceDelegatee", "com.fasterxml.jackson.databind.JsonDeserializer", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:4>", "<sample:8>", "<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyContentTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:2>", "<sample:9>", "<sample:9>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:5>", "<sample:11>", "<sample:12>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findDefaultDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:9>", "<null>", "<sample:11>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findCustomBeanDeserializer", "com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.BeanDescription", "<sample:13>", "<sample:11>", "<sample:4>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_checkImplicitlyNamedConstructors", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.BeanDescription,com.fasterxml.jackson.databind.introspect.VisibilityChecker,com.fasterxml.jackson.databind.AnnotationIntrospector,com.fasterxml.jackson.databind.deser.impl.CreatorCollector,java.util.List", "<sample:10>", "<null>", "<sample:3>", "<sample:6>", "<sample:0>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:0>", "<sample:1>", "<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_addDeserializerFactoryMethods", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription", "com.fasterxml.jackson.databind.introspect.VisibilityChecker", "com.fasterxml.jackson.databind.AnnotationIntrospector", "com.fasterxml.jackson.databind.deser.impl.CreatorCollector", "java.util.Map"}, new String[]{"<sample:5>", "<sample:5>", "<sample:5>", "<sample:7>", "<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findPropertyContentTypeDeserializer", "com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.introspect.AnnotatedMember", "<sample:11>", "<sample:3>", "<sample:1>"}, {"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "findDeserializerFromAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated", "<sample:15>", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "cachedDeserializersCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_findCachedDeserializer", "com.fasterxml.jackson.databind.JavaType", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getDefaultImpl", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("interface java.util.Collection {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=java.util.Collection, getClasses=[], getConstructors=[], getDeclaredAnnotations=[], getDeclaredClasses=[],...#556#1623681001", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: GeneratedTestInputProxy] {getPropertyName=0, getTypeInclusion=WRAPP...#209#1102548678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getTypeIdResolver", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getDefaultImpl", ""}, {"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "deserializeTypedFromArray", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:2>", "<sample:7>"}}), new String[][]{{"typeFromId", "com.fasterxml.jackson.databind.DatabindContext,java.lang.String", "6"}, {"withStaticTyping", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.type.ArrayType", actual.getClass().getName());
  assertEquals("[array type, component type: [simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]] {getErasedSignature=[Lgenerated/algorithm/SearchInputFactory_scaffolding$Generic.., get...#619#1263198518", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findJsonValueFor", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "com.fasterxml.jackson.databind.JavaType"}, new String[]{"<sample:13>", "<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_constructDefaultValueInstantiator", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "findDeserializerFromAnnotation", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.introspect.Annotated"}, new String[]{"<sample:6>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findRemappedType", "com.fasterxml.jackson.databind.DeserializationConfig,java.lang.Class", "<sample:7>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "deserializeTypedFromAny", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownValueDeserializer", new String[]{"com.fasterxml.jackson.databind.JavaType"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.DeserializerCache", "_handleUnknownKeyDeserializer", "com.fasterxml.jackson.databind.JavaType", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "_findRemappedType", new String[]{"com.fasterxml.jackson.databind.DeserializationConfig", "java.lang.Class"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "_findImplicitParamName", "com.fasterxml.jackson.databind.introspect.AnnotatedParameter,com.fasterxml.jackson.databind.AnnotationIntrospector", "<sample:8>", "<sample:9>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createBuilderBasedDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.JavaType", "com.fasterxml.jackson.databind.BeanDescription", "java.lang.Class"}, new String[]{"<sample:5>", "<sample:0>", "<null>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createBeanDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.BeanDescription", "<sample:8>", "<sample:0>", "<sample:15>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createArrayDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.ArrayType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:13>", "<sample:7>", "<sample:13>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "createArrayDeserializer", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.type.ArrayType,com.fasterxml.jackson.databind.BeanDescription", "<sample:11>", "<sample:3>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer", "getPropertyName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "getPropertyName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class generated.algorithm.SearchInputFactory_scaffolding$GenericSub]; id-resolver: GeneratedTestInputProx...#253#-878046595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.DeserializerCache", "com.fasterxml.jackson.databind.deser.DeserializerCache", "writeReplace", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"flushCachedDeserializers", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.deser.DeserializerCache", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", "createMapLikeDeserializer", new String[]{"com.fasterxml.jackson.databind.DeserializationContext", "com.fasterxml.jackson.databind.type.MapLikeType", "com.fasterxml.jackson.databind.BeanDescription"}, new String[]{"<sample:6>", "<sample:1>", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", "modifyTypeByAnnotation", "com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType", "<sample:10>", "<sample:2>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
}
